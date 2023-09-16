package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClickDoc5 extends AppCompatActivity {

    private String[][] doctor_details5 =
            {
                    {"Doctor Name : Dr.asifuzzaman", "Hospital Address : Dhanmondi, Dhaka", "Exp : 6yrs", "Mobile No: 01758642651", "400" }
            };
    Button appoint5,dr_appoint5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_doc5);

        appoint5=findViewById(R.id.appoint5);

        appoint5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8809610010615"));
                startActivity(intent);
            }
        });

        dr_appoint5=findViewById(R.id.dr_appoint5);
        dr_appoint5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(ClickDoc5.this,BookAppointmentActivity.class);
                intent.putExtra("doctorDetails", doctor_details5);
                startActivity(intent);

            }
        });

    }
}