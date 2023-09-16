package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {

    Button select_button1;
    Button select_button2;
    Button select_button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        select_button1=(Button)findViewById(R.id.select_button1);
        select_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SelectActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        select_button2=(Button)findViewById(R.id.select_button2);
        select_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SelectActivity.this,AboutDisease.class);
                startActivity(intent);
            }
        });
        select_button3=(Button)findViewById(R.id.select_button3);
        select_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SelectActivity.this,FindDoctorActivity.class);
                startActivity(intent);
            }
        });

    }
}