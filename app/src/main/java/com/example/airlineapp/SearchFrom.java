package com.example.airlineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SearchFrom extends AppCompatActivity {

    EditText edit1,edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_from);

        edit1=findViewById(R.id.edit1);
        edit2=findViewById(R.id.edit2);

        Button button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SearchFrom.this,MainActivity.class);
//                intent.putExtra("mys",edit1.getText().toString());
//                intent.putExtra("blr",edit2.getText().toString());
//                startActivity(intent);
//
//            }
//        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("blr", edit2.getText().toString());
                intent.putExtra("mys", edit1.getText().toString());
                startActivity(intent);
            }
        });
    }
}
