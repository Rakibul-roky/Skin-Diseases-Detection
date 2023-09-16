package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FindDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);

        CardView pathologists = findViewById(R.id.cardFDPathologists);
        pathologists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorList.class);
                //it.putExtra("title", "Pathologists");
                startActivity(it);
            }
        });

        CardView pediatric = findViewById(R.id.cardFDPediatric);
        pediatric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorList2.class);
               // it.putExtra("title", "Pediatric");
                startActivity(it);
            }
        });

        CardView immuno = findViewById(R.id.cardFDImmuno);
        immuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorList.class);
                it.putExtra("title", "Immuno");
                startActivity(it);
            }
        });

        CardView cosmetic = findViewById(R.id.cardFDCosmetic);
        cosmetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorList2.class);
                it.putExtra("title", "Cosmetic");
                startActivity(it);
            }
        });
    }
}