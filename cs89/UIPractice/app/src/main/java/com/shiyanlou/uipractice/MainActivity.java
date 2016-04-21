package com.shiyanlou.uipractice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText_name;
    private Button button_showName;
    private TextView textView_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_name = (EditText) findViewById(R.id.editText_name);
        button_showName = (Button) findViewById(R.id.button_showName);
        textView_content = (TextView) findViewById(R.id.textView_content);

        button_showName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText_name.getText().toString();
                textView_content.setText(name);
                textView_content.setTextColor(Color.RED);
            }
        });

    }
}
