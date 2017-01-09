package mobi.xiaowu.qyer;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.qyer.ui.activity.BaseActivity;
import mobi.xiaowu.qyer.ui.fragment.DestinationFragment;
import mobi.xiaowu.qyer.ui.fragment.HomeFragment;
import mobi.xiaowu.qyer.ui.fragment.MyFragment;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {
    @BindView(R.id.main_rg)
    public RadioGroup mRadioGroup;
    private FragmentManager mManager;
    private HomeFragment mHomeFragment;
    private DestinationFragment mDestinationFragment;
    private MyFragment mMyFragment;
    private long currentTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        init();
    }

    @Override
    public int layoutID() {
        return R.layout.activity_main;
    }

    private void init() {
        mManager = getSupportFragmentManager();
        FragmentTransaction ft = mManager.beginTransaction();
        mHomeFragment = new HomeFragment();
        mDestinationFragment = new DestinationFragment();
        mMyFragment = new MyFragment();
        ft.add(R.id.main_fragment_container, mHomeFragment);
        ft.commit();
        mRadioGroup.check(R.id.main_rb_home);
        mRadioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentTransaction ft = mManager.beginTransaction();
        switch (group.getCheckedRadioButtonId()) {
            case R.id.main_rb_home:
                ft.replace(R.id.main_fragment_container,mHomeFragment);
                break;
            case R.id.main_rb_destination:
                ft.replace(R.id.main_fragment_container,mDestinationFragment);
                break;
            case R.id.main_rb_my:
                ft.replace(R.id.main_fragment_container,mMyFragment);
                break;
        }
        ft.commit();
    }

    @Override
    public void onBackPressed() {
        long l = System.currentTimeMillis();
        if (l - currentTime < 3000) {
            super.onBackPressed();
        }else {
            Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
            currentTime = l;
        }
    }
}
