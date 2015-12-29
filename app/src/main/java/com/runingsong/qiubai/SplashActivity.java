package com.runingsong.qiubai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1);
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
