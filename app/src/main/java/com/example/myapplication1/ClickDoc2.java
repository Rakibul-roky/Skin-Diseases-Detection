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

public class ClickDoc2 extends AppCompatActivity {

    private String[][] doctor_details2 =
            {
                    {"Doctor Name : Dr.M.U.Kabir", "Hospital Address : Panthapath,Dhaka", "Exp : 6yrs", "Mobile No: 01758642651", "500" }
            };

    Button appoint2,dr_appoint2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_doc2);


        appoint2=findViewById(R.id.appoint2);
        appoint2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+88029103130"));
                startActivity(intent);
            }
        });

        dr_appoint2=findViewById(R.id.dr_appoint2);
        dr_appoint2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ClickDoc2.this,BookAppointmentActivity.class);
                intent.putExtra("doctorDetails", doctor_details2);
                startActivity(intent);

            }
        });

    }
}