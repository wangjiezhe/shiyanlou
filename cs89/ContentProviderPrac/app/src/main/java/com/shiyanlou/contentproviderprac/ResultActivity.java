package com.shiyanlou.contentproviderprac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

public class ResultActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        listView = (ListView) findViewById(R.id.listView_result);

        Intent intent = getIntent();
        Bundle data = intent.getExtras();

        @SuppressWarnings("unchecked")
        List<Map<String, String>> list =
                (List<Map<String, String>>) data.getSerializable("data");

        SimpleAdapter adapter = new SimpleAdapter(ResultActivity.this, list, R.layout.item,
                new String[]{"student", "information"}, new int[]{R.id.editText_item_student, R.id.editText_item_information});

        listView.setAdapter(adapter);
    }
}
