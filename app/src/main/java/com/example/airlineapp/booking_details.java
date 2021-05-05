package com.example.airlineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class booking_details extends AppCompatActivity {

    private TextView dateText;
    private TextView datedept;
    private View cardView;
    private ImageView airlineImage;
    private TextView airlineText;
    private TextView fromheading;
    private TextView frominfo;
    private TextView toheading;
    private TextView toinfo;
    private TextView deptheading;
    private TextView deptinfo;
    private TextView arrheading;
    private TextView arrinfo;
    private TextView passheading;
    private TextView passinfo;
    private TextView fareheading;
    private TextView fareinfo;

    private TextView priceperheadText;
    private TextView priceperhead;
    private TextView passNo;
    private TextView pass;
    private TextView totalText;
    private TextView fare;

    private Button bookbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_details);

        bookbtn=(Button)findViewById(R.id.bookbtn);

        bookbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(booking_details.this,booking.class);
                startActivity(i);

            }
        });
    }
}