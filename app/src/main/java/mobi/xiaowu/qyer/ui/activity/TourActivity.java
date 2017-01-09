package mobi.xiaowu.qyer.ui.activity;

import android.content.Intent;
import android.view.View;

import mobi.xiaowu.qyer.MainActivity;
import mobi.xiaowu.qyer.R;

public class TourActivity extends BaseActivity {


    @Override
    public int layoutID() {
        return R.layout.activity_tour;
    }

    public void click(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
