package com.rayhung.mvvmtest_java;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.rayhung.mvvmtest_java.Internet.InternetStatus;

public class SplashActivity extends AppCompatActivity{

    private static final String TAG = SplashActivity.class.getSimpleName();

    private static long SPLASH_MILLIS = 1550;

    private TextView statusTxw;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initialView();
        checkStatus();
    }

    private void initialView(){
        statusTxw = findViewById(R.id.activity_splash_status_txw);
    }

    private void checkStatus(){
        if (InternetStatus.mInstance().checkInternetStatus(SplashActivity.this)) {
            statusTxw.setText(getString(R.string.splash_internet_success));
        }else {
            statusTxw.setText(getString(R.string.splash_internet_failure));
        }
        showSplashAndChangeToMainView();
    }

    private void showSplashAndChangeToMainView(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
            }
        }, SPLASH_MILLIS);
    }
}