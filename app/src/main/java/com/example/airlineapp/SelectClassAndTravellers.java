package com.example.airlineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SelectClassAndTravellers extends AppCompatActivity {

    TextView add,sub,num,pass,add2,sub2,num2,pass2,add3,sub3,num3,pass3;
    String v;
    int n,i,j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_class_and_travellers);
        pass=findViewById(R.id.passtext);
        v=getIntent().getStringExtra("L5");
        pass.setText(v.toString());

        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        num=findViewById(R.id.number);
        n=Integer.parseInt(num.getText().toString());
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n++;
                String k=Integer.toString(n);
                //String k=String.valueof(n);
                num.setText(k.toString());
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n!=1){
                    n--;
                    String k=Integer.toString(n);
                    //String k=String.valueof(n);
                    num.setText(k.toString());
                }
                else {
                    Toast.makeText(SelectClassAndTravellers.this, "this is the minimum value", Toast.LENGTH_SHORT).show();
                }

            }
        });

        pass2=findViewById(R.id.pass2);



        add2=findViewById(R.id.add2);
        sub2=findViewById(R.id.sub2);
        num2=findViewById(R.id.number2);
        i=Integer.parseInt(num2.getText().toString());
        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                String k=Integer.toString(i);
                //String k=String.valueof(i);
                num2.setText(k.toString());
            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i!=1){
                    i--;
                    String k=Integer.toString(i);
                    //String k=String.valueof(n);
                    num2.setText(k.toString());
                }
                else {
                    Toast.makeText(SelectClassAndTravellers.this, "this is the minimum value", Toast.LENGTH_SHORT).show();
                }

            }
        });

        pass2=findViewById(R.id.pass2);



        add3=findViewById(R.id.add3);
        sub3=findViewById(R.id.sub3);
        num3=findViewById(R.id.number3);
        j=Integer.parseInt(num3.getText().toString());
        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j++;
                String k=Integer.toString(j);
                //String k=String.valueof(j);
                num3.setText(k.toString());
            }
        });
        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(j!=1){
                    j--;
                    String k=Integer.toString(j);
                    //String k=String.valueof(j);
                    num3.setText(k.toString());
                }
                else {
                    Toast.makeText(SelectClassAndTravellers.this, "this is the minimum value", Toast.LENGTH_SHORT).show();
                }

            }
        });


        Button done;
        done = findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectClassAndTravellers.this,MainActivity.class);
//                intent.putExtra("count",num.getText().toString());
//                intent.putExtra("count",num2.getText().toString());
//                intent.putExtra("count",num3.getText().toString());

                startActivity(intent);
            }
        });

    }
}

