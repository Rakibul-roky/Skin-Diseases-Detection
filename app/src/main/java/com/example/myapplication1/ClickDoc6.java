package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClickDoc6 extends AppCompatActivity {

    private String[][] doctor_details6 =
            {
                    {"Doctor Name : Dr.Abdul Mannan", "Hospital Address : Dhanmondi, Dhaka", "Exp : 6yrs", "Mobile No: 01758642651", "400" }
            };
    Button appoint6,dr_appoint6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_doc6);

        appoint6=findViewById(R.id.appoint6);

        appoint6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8809610010615"));
                startActivity(intent);
            }
        });

        dr_appoint6=findViewById(R.id.dr_appoint6);
        dr_appoint6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(ClickDoc6.this,BookAppointmentActivity.class);
                intent.putExtra("doctorDetails", doctor_details6);
                startActivity(intent);

            }
        });

    }
}