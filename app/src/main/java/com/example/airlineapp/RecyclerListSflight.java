//package com.example.airlineapp;
//
//import android.os.Bundle;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.DefaultItemAnimator;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class RecyclerListSflight extends AppCompatActivity {
//    private List<SflightEncap> list;
//
//    private RecyclerView recyclerView;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sflight);
//
//        recyclerView=findViewById(R.id.recycleView);
//        recyclerView.setHasFixedSize(true);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//
//        list = new ArrayList<>();
//        String airlineName;
//        String deparTime;
//        String arrTime;
//        String duration;
//        String fromAirport;
//        String toAirport;
//        String price;
//        int imageres = 0;
//
//        RecyclerAdapter adapter=new RecyclerAdapter(list);
//        recyclerView.setAdapter(adapter);
//    }
//}
