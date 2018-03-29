package ptv.zohar.mvpdemo.activity;

import android.os.Bundle;
import android.view.View;

import ptv.zohar.mvpdemo.R;
import ptv.zohar.mvpdemo.utils.StartActivityUtils;

public class StartActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void enterApp(View view) {
        StartActivityUtils.startActivity(this, MovieActivity.class);
    }
}
