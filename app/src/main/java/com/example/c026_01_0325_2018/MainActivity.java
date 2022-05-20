package com.example.c026_01_0325_2018;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eName,eAge, eGender,eIDNumber,eCourse,eCounty,eUniversity;
    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eName = findViewById(R.id.name);
        eAge = findViewById(R.id.age);
        eGender = findViewById(R.id.gender);
        eIDNumber = findViewById(R.id.number);
        eCourse = findViewById(R.id.course);
        eCounty = findViewById(R.id.county);
        eUniversity = findViewById(R.id.university);
        btn_send = findViewById(R.id.button);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = eName.getText().toString();
                String age = eAge.getText().toString();
                String gender = eGender.getText().toString();
                String number = eIDNumber.getText().toString();
                String course = eCourse.getText().toString();
                String county = eCounty.getText().toString();
                String university = eUniversity.getText().toString();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("key1",name);
                intent.putExtra("key2",age);
                intent.putExtra("key3",gender);
                intent.putExtra("key4",number);
                intent.putExtra("key5",course);
                intent.putExtra("key6",county);
                intent.putExtra("key7",university);
                startActivity(intent);
                eName.setText("");
                eAge.setText("");
                eGender.setText("");
                eIDNumber.setText("");
                eCourse.setText("");
                eCounty.setText("");
                eUniversity.setText("");
            }
        });
    }
}