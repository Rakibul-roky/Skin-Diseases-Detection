package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class ClickDoc3 extends AppCompatActivity {

    private String[][] doctor_details3 =
            {
                    {"Doctor Name : Dr.Yasmin Joardar", "Hospital Address : Dhanmondi, Dhaka", "Exp : 6yrs", "Mobile No: 01758642651", "400" }
            };

    Button appoint3,dr_appoint3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_doc3);


        appoint3=findViewById(R.id.appoint3);

        appoint3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8809610010615"));
                startActivity(intent);
            }
        });

        dr_appoint3=findViewById(R.id.dr_appoint3);
        dr_appoint3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(ClickDoc3.this,BookAppointmentActivity.class);
                intent.putExtra("doctorDetails", doctor_details3);
                startActivity(intent);

            }
        });

    }
}