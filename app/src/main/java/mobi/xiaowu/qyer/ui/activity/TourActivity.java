package mobi.xiaowu.qyer.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mobi.xiaowu.qyer.MainActivity;
import mobi.xiaowu.qyer.R;

public class TourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);
    }

    public void click(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
