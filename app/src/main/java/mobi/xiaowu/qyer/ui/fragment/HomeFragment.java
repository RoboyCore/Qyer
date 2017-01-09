package mobi.xiaowu.qyer.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.qyer.R;
import mobi.xiaowu.qyer.adapter.HomeBannerRecyclerViewAdapter;
import mobi.xiaowu.qyer.adapter.ViewPagerDeadAdapter;
import mobi.xiaowu.qyer.model.http.APIParam;
import mobi.xiaowu.qyer.model.http.APIs;
import mobi.xiaowu.qyer.model.http.HomeMsgService;
import mobi.xiaowu.qyer.model.bean.Home;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {

    @BindView(R.id.home_scan)
    public ImageView mScan;
    @BindView(R.id.home_message)
    public ImageView mMessage;
    @BindView(R.id.home_search)
    public TextView mSearch;


    @BindView(R.id.home_swipe_refresh)
    public SwipeRefreshLayout mRefreshLayout;
    @BindView(R.id.home_recyclerView)
    public RecyclerView mRecyclerView;


    @BindView(R.id.home_slide_vp)
    public ViewPager slideViewPager;
    @BindView(R.id.home_slide_ll)
    public LinearLayout slideDotContainer;
    private List<ImageView> mImageViewList;
    private ViewPagerDeadAdapter slideAdapter;


    private List<Object> mList;
    private HomeBannerRecyclerViewAdapter mHomeAdapter;
    private Subscription mSubscribe;

    public HomeFragment() {
        // Required empty public constructor
    }
//    public static HomeFragment getInstance(Bundle bundle){
//        HomeFragment homeFragment = new HomeFragment();
//        homeFragment.setArguments(bundle);
//        return homeFragment;
//    }

    @Override
    protected int layoutID() {
        return R.layout.fragment_home;
    }

    @Override
    public String getFragmentTitle() {
        return "";
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ButterKnife.bind(this, view);
        init();
        super.onViewCreated(view, savedInstanceState);
    }


    private void init() {
        initSlide();
        mList = new ArrayList<>();
        mRefreshLayout.setOnRefreshListener(this);
//        mHomeAdapter = new HomeBannerRecyclerViewAdapter(getContext(),mList);
//        LinearLayoutManager lm = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
//        mRecyclerView.setAdapter(mHomeAdapter);
//        mRecyclerView.setLayoutManager(lm);
    }

    /**
     * 初始化banner
     */
    private void initSlide() {
        mImageViewList = new ArrayList<>();
        slideAdapter = new ViewPagerDeadAdapter(mImageViewList);
        slideViewPager.setAdapter(slideAdapter);
    }

    @Override
    protected void loadData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIs.APP_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        HomeMsgService homeMsgService = retrofit.create(HomeMsgService.class);
        mSubscribe = homeMsgService.getHomeMsg(APIs.HOME_MAJOR_URL, APIParam.getDeviceType())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Home>() {
                    @Override
                    public void onCompleted() {
                        Log.i("Home", "loadCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        if (mRefreshLayout.isRefreshing()) {
                            mRefreshLayout.setRefreshing(false);
                            Toast.makeText(getContext(), "网络异常", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onNext(Home home) {
                        Home.DataBean data = home.getData();
                        for (int i = 0; i < data.getHeadSlide().getSlideData().size(); i++) {
                            //画点
                            View view = new View(getContext());
                            view.setLayoutParams(new ViewGroup.LayoutParams(15, 15));
                            view.setBackgroundResource(R.drawable.icon_dot_selector);
                            slideDotContainer.addView(view);
                            //添加图片
                            ImageView iv = new ImageView(getContext());
                            iv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                            Glide.with(getContext()).load(data.getHeadSlide().getSlideData().get(i).getCover()).into(iv);
                            iv.setScaleType(ImageView.ScaleType.FIT_XY);
                            mImageViewList.add(iv);
                        }
                        slideAdapter.notifyDataSetChanged();
                    }
                });

    }



    @Override
    public void onDestroy() {
        if (mSubscribe.isUnsubscribed()) {
            mSubscribe.unsubscribe();
        }
        super.onDestroy();
    }

    @Override
    public void onRefresh() {
        loadData();
    }
}
