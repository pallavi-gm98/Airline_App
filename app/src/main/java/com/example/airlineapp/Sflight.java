package com.example.airlineapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Sflight extends AppCompatActivity {

    private  CardView cardView;
    private CardView cardView2;
    private CardView cardView3;

    private ImageView flightImage;
    private TextView flight;
    private TextView deptTime;
    private ImageView arrow;
    private TextView arrTime;
    private TextView frCode;
    private TextView tCode;
    private TextView hrs;
    private TextView hrsText;
    private TextView price;

    private ImageView flightImage2;
    private TextView flight2;
    private TextView deptTime2;
    private ImageView arrow2;
    private TextView arrTime2;
    private TextView frCode2;
    private TextView tCode2;
    private TextView hrs2;
    private TextView hrsText2;
    private TextView price2;

    private ImageView flightImage3;
    private TextView flight3;
    private TextView deptTime3;
    private ImageView arrow3;
    private TextView arrTime3;
    private TextView frCode3;
    private TextView tCode3;
    private TextView hrs3;
    private TextView hrsText3;
    private TextView price3;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sflight);

        flight=(TextView)findViewById(R.id.flight);
        flightImage=(ImageView)findViewById(R.id.flightImage);
        deptTime=(TextView)findViewById(R.id.deptTime);
        arrow=(ImageView)findViewById(R.id.arrow);
        arrTime=(TextView)findViewById(R.id.arrTime);
        frCode=(TextView)findViewById(R.id.frCode);
        tCode=(TextView)findViewById(R.id.tCode);
        hrs=(TextView)findViewById(R.id.hrs);
        hrsText=(TextView)findViewById(R.id.hrsText);
        price=(TextView)findViewById(R.id.price);

        flight2=(TextView)findViewById(R.id.flight2);
        flightImage2=(ImageView)findViewById(R.id.flightImage2);
        deptTime2=(TextView)findViewById(R.id.deptTime3);
        arrow2=(ImageView)findViewById(R.id.arrow2);
        arrTime2=(TextView)findViewById(R.id.arrTime2);
        frCode2=(TextView)findViewById(R.id.frCode2);
        tCode2=(TextView)findViewById(R.id.tCode2);
        hrs2=(TextView)findViewById(R.id.hrs2);
        hrsText2=(TextView)findViewById(R.id.hrsText2);
        price2=(TextView)findViewById(R.id.price2);

        flight3=(TextView)findViewById(R.id.flight3);
        flightImage3=(ImageView)findViewById(R.id.flightImage3);
        deptTime3=(TextView)findViewById(R.id.deptTime3);
        arrow3=(ImageView)findViewById(R.id.arrow3);
        arrTime3=(TextView)findViewById(R.id.arrTime3);
        frCode3=(TextView)findViewById(R.id.frCode3);
        tCode3=(TextView)findViewById(R.id.tCode3);
        hrs3=(TextView)findViewById(R.id.hrs3);
        hrsText3=(TextView)findViewById(R.id.hrsText3);
        price3=(TextView)findViewById(R.id.price3);

        cardView=(CardView)findViewById(R.id.card1);
        cardView2=(CardView)findViewById(R.id.card2);
        cardView3=(CardView)findViewById(R.id.card3);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Sflight.this,flightSummary.class);
                startActivity(i);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Sflight.this,flightSummary.class);
                startActivity(i);
            }
        });








    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mf = getMenuInflater();
        mf.inflate(R.menu.mainmenu,menu);
        return true;
    }
}