package com.languageadapter.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.languageadapter.R;
import com.languageadapter.com.BaseActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    TextView tvOpenTestOther;
    TextView tvOpenLanguageSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOpenTestOther = (TextView) findViewById(R.id.tvOpenTestOther);
        tvOpenTestOther.setOnClickListener(this);
        tvOpenLanguageSetting = (TextView) findViewById(R.id.tvOpenLanguageSetting);
        tvOpenLanguageSetting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvOpenTestOther:
                startActivity(new Intent(this, TestOtherActivity.class));
                break;
            case R.id.tvOpenLanguageSetting:
                startActivity(new Intent(this, LanguageSettingActivity.class));
                break;
        }

    }
}
