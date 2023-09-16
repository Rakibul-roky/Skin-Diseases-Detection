package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorList extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list);

        CardView doc_button1 = findViewById(R.id.doc_button1);
        doc_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DoctorList.this,ClickDoc1.class);
                startActivity(it);
            }
        });

        CardView doc_button2 = findViewById(R.id.doc_button2);
        doc_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DoctorList.this,ClickDoc2.class);
                startActivity(it);
            }
        });

        CardView doc_button3 = findViewById(R.id.doc_button3);
        doc_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DoctorList.this,ClickDoc3.class);
                startActivity(it);
            }
        });
    }
}