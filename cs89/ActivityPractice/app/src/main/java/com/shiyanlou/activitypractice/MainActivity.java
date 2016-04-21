package com.shiyanlou.activitypractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String msg = "Shiyanlou :";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The function onCreate() was called.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The function onStart() was called.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The function onResume() was called.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The function onResume() was called.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The function onStop() was called.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The function onDestroy() was called.");
    }
}
