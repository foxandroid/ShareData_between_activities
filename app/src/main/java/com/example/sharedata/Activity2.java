package com.example.sharedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView data1,data2,data3;
    Button activity1btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //Refer to textview
        data1 = findViewById(R.id.data1txtview);
        data2 = findViewById(R.id.data2txtview);
        data3 = findViewById(R.id.data3txtview);
        activity1btn = findViewById(R.id.activity1btn);

        //Get data from Activity 1
        String Data1 = "Data1: " + getIntent().getExtras().getString("Data1");
        String Data2 = "Data2: " + getIntent().getExtras().getString("Data2");
        String Data3 = "Data3: " + getIntent().getExtras().getString("Data3");

        //Set data to text view
        data1.setText(Data1);
        data2.setText(Data2);
        data3.setText(Data3);

        activity1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Activity2.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }
}