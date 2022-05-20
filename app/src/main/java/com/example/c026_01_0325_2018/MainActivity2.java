package com.example.c026_01_0325_2018;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tName,tAge, tGender,tIDNumber,tCourse,tCounty,tUniversity;
    Button btn_finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tName = findViewById(R.id.textview4);
        tAge = findViewById(R.id.textView5);
        tGender = findViewById(R.id.textView6);
        tIDNumber = findViewById(R.id.textView7);
        tCourse = findViewById(R.id.textView8);
        tCounty = findViewById(R.id.textView9);
        tUniversity = findViewById(R.id.textView10);
        btn_finish = findViewById(R.id.button2);

        Bundle extras = getIntent().getExtras();
        String name = extras.getString("key1");
        String age = extras.getString("key2");
        String gender = extras.getString("key3");
        String number = extras.getString("key4");
        String course = extras.getString("key5");
        String county = extras.getString("key6");
        String university = extras.getString("key7");

        tName.setText("NAME:" +name);
        tAge.setText("AGE:" +age);
        tGender.setText("GENDER:" +gender);
        tIDNumber.setText("ID NUMBER:" +number);
        tCourse.setText("COURSE:" +course);
        tCounty.setText("COUNTY:" +county);
        tUniversity.setText("UNIVERSITY:" +university);


        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}