package com.example.airlineapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.ActionBar;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.lang.Class.forName;

public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;

    Button searchFlight;
    ImageView dropdown;
    LinearLayout l1;
    LinearLayout l2;
    LinearLayout L3;
    LinearLayout L4;
    LinearLayout L5;
    Spinner spin;
    Spinner spin2;
    TextView text;
    private Object ClassNotFoundException;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mf = getMenuInflater();
        mf.inflate(R.menu.mainmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchFlight = findViewById(R.id.button);
        dropdown = findViewById(R.id.dropdown);
        l1 = findViewById(R.id.l1);
        L3 = findViewById(R.id.L3);
        L4 = findViewById(R.id.L4);
        toolbar = findViewById(R.id.app_bar);

        searchFlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Sflight.class);
                startActivity(i);
            }
        });

        l1 = findViewById(R.id.l1);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SearchFrom.class);
                startActivity(i);
            }
        });

        TextView mys, blr;

        blr = findViewById(R.id.blr);
        mys = findViewById(R.id.mys);
        Intent i = getIntent();
        String str = i.getStringExtra("mys");
        String string = i.getStringExtra("blr");
        mys.setText(str);
        blr.setText(string);

        l2 = findViewById(R.id.l2);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SearchFrom.class);
                startActivity(i);
            }
        });


        L3 = findViewById(R.id.L3);
        L4 = findViewById(R.id.L4);

        TextView date, date2;
        date = findViewById(R.id.date);
        date2 = findViewById(R.id.date2);


        L3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int mYear = calendar.get(Calendar.YEAR);
                int mMonth = calendar.get(Calendar.MONTH);
                int mDay = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        date.setText("" + dayOfMonth + "." + "" + (month + 1) + "." + "" + year);
                    }
                }, mYear, mMonth, mDay);

                datePickerDialog.show();
            }
        });


        L4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int mYear = calendar.get(Calendar.YEAR);
                int mMonth = calendar.get(Calendar.MONTH);
                int mDay = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        date2.setText("" + dayOfMonth + "." + "" + (month + 1) + "." + "" + year);
                    }
                }, mYear, mMonth, mDay);

                datePickerDialog.show();
            }

        });

        L5 = findViewById(R.id.L5);
       TextView count =(TextView) findViewById(R.id.count);
        L5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SelectClassAndTravellers.class);
                i.putExtra("L5", "Adult");
                startActivity(i);
            }
        });

//        Intent intent = getIntent();
//        String s = intent.getStringExtra("count");
//        count.setText(s);
//        spin=findViewById(R.id.spin);
//
//        text=findViewById(R.id.text1);
//
//        ArrayList<String> list=new ArrayList<>();
//        list.add("DEL");
//        list.add("MYQ");
//        list.add("BLR");
//        list.add("MAA");
//        list.add("GOA");
//        list.add("SAC");
//        list.add("USA");
//        spin.setAdapter(new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,list));
//        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                if(i==0){
//                    text.setText("");
//                }else{
//                    String s=adapterView.getItemAtPosition(i).toString();
//                    text.setText(s);
//                }
//            }
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });

        searchFlight.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                new Async().execute();

            }
        });

    }


    class Async extends AsyncTask<Void, Void, Void> {

        String records = "",error="";

        @Override

        protected Void doInBackground(Void... voids) {

            try

            {

                Class.forName("com.mysql.jdbc.Driver");

                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/android", "root", "root");

                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery("SELECT * FROM airport");

                while(resultSet.next()) {

                    records += resultSet.getString(1) + " " + resultSet.getString(2) + "\n";

                }

            }

            catch(Exception e)

            {

                error = e.toString();

            }

            return null;

        }



        @Override

        protected void onPostExecute(Void aVoid) {

            text.setText(records);

            if(error != "")



            super.onPostExecute(aVoid);

        }

    }
}



