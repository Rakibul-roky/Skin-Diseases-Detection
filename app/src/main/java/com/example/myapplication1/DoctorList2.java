package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorList2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list2);

        CardView doc_button4 = findViewById(R.id.doc_button4);
        doc_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DoctorList2.this,ClickDoc4.class);
                startActivity(it);
            }
        });

        CardView doc_button5 = findViewById(R.id.doc_button5);
        doc_button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DoctorList2.this,ClickDoc5.class);
                startActivity(it);
            }
        });

        CardView doc_button6 = findViewById(R.id.doc_button6);
        doc_button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DoctorList2.this,ClickDoc6.class);
                startActivity(it);
            }
        });

    }
}