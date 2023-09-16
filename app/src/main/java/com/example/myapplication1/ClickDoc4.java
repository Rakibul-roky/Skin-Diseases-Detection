package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClickDoc4 extends AppCompatActivity {

    private String[][] doctor_details4 =
            {
                    {"Doctor Name : Dr.Mujibul Haque", "Hospital Address : Dhanmondi, Dhaka", "Exp : 6yrs", "Mobile No: 01758642651", "400" }
            };

    Button appoint4,dr_appoint4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_doc4);

        appoint4=findViewById(R.id.appoint4);

        appoint4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8809610010615"));
                startActivity(intent);
            }
        });

        dr_appoint4=findViewById(R.id.dr_appoint4);
        dr_appoint4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(ClickDoc4.this,BookAppointmentActivity.class);
                intent.putExtra("doctorDetails", doctor_details4);
                startActivity(intent);

            }
        });

    }
}