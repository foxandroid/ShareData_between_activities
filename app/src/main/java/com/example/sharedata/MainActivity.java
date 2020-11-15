package com.example.sharedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText data1,data2,data3;
    Button passdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data1 = findViewById(R.id.data1);
        data2 = findViewById(R.id.data2);
        data3 = findViewById(R.id.data3);
        passdata = findViewById(R.id.passData);

        passdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Data1 = data1.getText().toString();
                String Data2 = data2.getText().toString();
                String Data3 = data3.getText().toString();

                Intent i = new Intent(MainActivity.this,Activity2.class);
                i.putExtra("Data1",Data1);
                i.putExtra("Data2",Data2);
                i.putExtra("Data3",Data3);
                startActivity(i);
                finish();

            }
        });
    }
}