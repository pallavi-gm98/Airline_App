package com.example.airlineapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class searchRecyclerAdapter extends RecyclerView.Adapter<searchRecyclerAdapter.RecyclerViewHolder>   {

    //search variable for airline
    private List<searchModule> msearchmodule;

    //pass the information to constructor
    public searchRecyclerAdapter(List<searchModule> search) {
        msearchmodule=search;
    }

    @NonNull
    @Override
    public searchRecyclerAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context=parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        //inflate the custom layout
        View searchView =inflater.inflate(R.layout.activity_search_from,parent,false);

        //Return a new holder instance
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(searchView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull searchRecyclerAdapter.RecyclerViewHolder holder, int position) {

        //get the data model based on position
        searchModule search = msearchmodule.get(position);

        //set items view based on your views and data model
        EditText editText1 = holder.airportCode;
        editText1.setText(search.getAirportCode());
        EditText editText2 = holder.airportName;
        editText2.setText(search.getAirportName());



    }

    @Override
    public int getItemCount() {
        return msearchmodule.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        public EditText airportCode,airportName;

        public RecyclerViewHolder(@NonNull View itemView)
        {
            super(itemView);
            airportCode=itemView.findViewById(R.id.edit1);
            airportName=itemView.findViewById(R.id.edit2);
        }
    }
}
