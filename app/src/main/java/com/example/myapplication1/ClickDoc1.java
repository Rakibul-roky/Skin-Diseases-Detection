package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import java.util.HashMap;

public class ClickDoc1 extends AppCompatActivity {

    private String[][] doctor_details1 =
            {
                    {"Doctor Name : Dr.Asif Imran", "Hospital Address : Mirpur DOHS, Dhaka", "Exp : 6yrs", "Mobile No: 01758642651", "500" }
            };


    //String[][] doctor_details = {};


    Button appoint1,appoint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_doc1);


        appoint1=findViewById(R.id.appoint1);
        appoint1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801793256600"));
                startActivity(intent);
            }
        });
        appoint=findViewById(R.id.appoint);
        appoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(ClickDoc1.this,BookAppointmentActivity.class);
                intent.putExtra("doctorDetails", doctor_details1);
                startActivity(intent);

            }
        });

    }
}