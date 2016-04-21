package com.shiyanlou.contentproviderprac;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    MyDatabaseHelper dbHelper;

    Button button_insert;
    Button button_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new MyDatabaseHelper(this, "myStudent.db", 1);

        button_insert = (Button) findViewById(R.id.button_insert);
        button_search = (Button) findViewById(R.id.button_search);

        button_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String student = ((EditText) findViewById(R.id.editText_student)).getText().toString();
                String information = ((EditText) findViewById(R.id.editText_information)).getText().toString();

                insertData(dbHelper.getReadableDatabase(), student, information);

                Toast.makeText(MainActivity.this, "Add student successfully", Toast.LENGTH_LONG).show();
            }
        });

        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key = ((EditText) findViewById(R.id.editText_keyword)).getText().toString();

                Cursor cursor = dbHelper.getReadableDatabase()
                        .rawQuery("select * from students where student like ? or information like ?",
                                new String[]{"%" + key + "%", "%" + key + "%"});

                Bundle data = new Bundle();
                data.putSerializable("data", CursorConverToList(cursor));

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtras(data);
                startActivity(intent);
            }
        });
    }

    private void insertData(SQLiteDatabase db, String student, String information) {
        db.execSQL("insert into students values(null, ? , ?)", new String[] {student, information});
    }

    protected ArrayList<Map<String, String>> CursorConverToList(Cursor cursor) {

        ArrayList<Map<String, String>> result = new ArrayList<>();

        while (cursor.moveToNext()) {
            Map<String, String> map = new HashMap<>();
            map.put("student", cursor.getString(1));
            map.put("information", cursor.getString(2));
            result.add(map);
        }

        return result;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (dbHelper != null) {
            dbHelper.close();
        }
    }
}
