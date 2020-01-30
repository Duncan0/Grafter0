package com.example.grafter;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler splashHandler = new Handler();
        splashHandler.postDelayed(this,2000);
    }
    @Override
    public void run(){
        Intent intent = new Intent( SplashActivity.this, MainActivity.class );
        startActivity(intent);
        finish();
    }
}
