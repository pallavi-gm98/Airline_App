package com.example.airlineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class flightSummary extends AppCompatActivity {
    TextView flightdetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flight_summary);

        flightdetails=findViewById(R.id.flightdetails);

        flightdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(flightSummary.this,booking_details.class);
                startActivity(i);
            }
        });
    }
}