package com.shiyanlou.broadcastpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBroadcastIntent(View view) {
        Intent intent = new Intent();
        intent.setAction("com.shiyanlou.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
