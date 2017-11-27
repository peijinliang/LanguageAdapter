package com.languageadapter.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.languageadapter.R;
import com.languageadapter.com.BaseActivity;
import com.languageadapter.utils.LocaleManager;

/**
 * Created by  Marlon on 11/27/2017.
 * Describe
 */
public class LanguageSettingActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languagesetting);
        findViewById(R.id.tvChinese).setOnClickListener(this);
        findViewById(R.id.tvEnglish).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvChinese:
                LocaleManager.setNewLocale(this, LocaleManager.LANGUAGE_CHINESE);
                break;
            case R.id.tvEnglish:
                LocaleManager.setNewLocale(this, LocaleManager.LANGUAGE_ENGLISH);
                break;
        }
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
        finish();
    }
}
