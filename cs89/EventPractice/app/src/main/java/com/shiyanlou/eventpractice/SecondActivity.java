package com.shiyanlou.eventpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {

    private TextView textView_message;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView_message = (TextView) findViewById(R.id.textView_message);

        Intent intent = getIntent();

        message = intent.getExtras().getString("mA", "null");
    }

    public void onShowMessage(View view) {
        if (message != null) {
            textView_message.setText(message);
        }
    }
}
