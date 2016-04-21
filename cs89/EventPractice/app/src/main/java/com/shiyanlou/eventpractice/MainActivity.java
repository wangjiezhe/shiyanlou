package com.shiyanlou.eventpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText editText_message;
    private Button button_sendMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_message = (EditText) findViewById(R.id.editText_mesage);
        button_sendMessage = (Button) findViewById(R.id.button_sendMessage);

        button_sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = new String();
                message = editText_message.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                Bundle data = new Bundle();
                data.putString("mA", message);
                intent.putExtras(data);
                startActivity(intent);
//                MainActivity.this.finish();
            }
        });
    }
}
