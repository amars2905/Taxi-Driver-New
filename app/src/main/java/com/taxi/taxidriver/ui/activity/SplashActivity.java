package com.taxi.taxidriver.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.taxi.taxidriver.R;
import com.taxi.taxidriver.utils.BaseActivity;


public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
