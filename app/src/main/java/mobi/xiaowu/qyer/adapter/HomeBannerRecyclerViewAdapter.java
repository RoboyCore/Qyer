package mobi.xiaowu.qyer.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.qyer.R;
import mobi.xiaowu.qyer.model.bean.Home;

/**
 * Created by xiaowu on 2017/1/8.
 */

public class HomeBannerRecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Object> mList;
    private Context mContext;
    private RecyclerView mRecyclerView;
    private LayoutInflater mInflater;
    private static final int TYPE_HEAD_SLIDE = 0;
    private static final int TYPE_HEAD_BAR = 1;

    public HomeBannerRecyclerViewAdapter(Context context, List<Object> list) {
        mContext = context;
        mList = list;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder ret = null;
        switch (viewType) {
            case TYPE_HEAD_SLIDE://轮滑页
                View view = mInflater.inflate(R.layout.activity_main, parent, false);
                ret = new SlideHolder(view);
                break;
            case TYPE_HEAD_BAR://BAR
                break;
        }
        return ret ;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Object o = mList.get(position);
        if (o instanceof Home.DataBean.HeadSlideBean) {
            SlideHolder slideHolder = (SlideHolder) holder;

            List<Home.DataBean.HeadSlideBean.SlideDataBean> bannerItem = new ArrayList<>();
            List<ImageView> list = new ArrayList<>();//存放轮播图片
            bannerItem.addAll(((Home.DataBean.HeadSlideBean) o).getSlideData());
            for (int i = 0; i < bannerItem.size(); i++) {
                //画点
                View view = new View(mContext);
                view.setLayoutParams(new ViewGroup.LayoutParams(15, 15));
                view.setBackgroundResource(R.drawable.icon_dot_selector);
                slideHolder.ll.addView(view);
                //添加图片
                ImageView iv = new ImageView(mContext);
                iv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                Glide.with(mContext).load(bannerItem.get(i).getCover()).into(iv);
                iv.setScaleType(ImageView.ScaleType.FIT_XY);
                list.add(iv);
            }
            ViewPagerDeadAdapter pagerAdapter = new ViewPagerDeadAdapter(list);
            slideHolder.vp.setAdapter(pagerAdapter);
        }

    }
    /**
     * 配置recyclerView头部轮播
     */
    private void setupRecyclerViewHeader(ViewPager banner) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (mList.get(position) instanceof Home.DataBean.SlideBean) {
            return TYPE_HEAD_SLIDE;
        }
        return 0;

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        mRecyclerView = recyclerView;
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        mRecyclerView = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public static class SlideHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.home_slide_vp)
        public ViewPager vp;
        @BindView(R.id.home_slide_ll)
        public LinearLayout ll;
        public SlideHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

    }
}
