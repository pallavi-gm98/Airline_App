package com.example.airlineapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{
    private ArrayList<SflightEncap> sflightEncaps;
    public RecyclerAdapter(ArrayList<SflightEncap> sflightEncaps){
        this.sflightEncaps =sflightEncaps;
    }

    public RecyclerAdapter(List<SflightEncap> sflightEncaps) {

    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView flight;
        private View fromAirport;
        private View toAirport;
        private View deparTime;
        private View arrTime;
        private String airlineCode;
        private View airlineName;
        private View duration;
        private View price;
        private ImageView flightImageView;

        public MyViewHolder( View view) {
            super((view));
            flight =view.findViewById(R.id.flight);
            airlineName = view.findViewById(R.id.flight);
            fromAirport = view.findViewById(R.id.frCode);
            toAirport = view.findViewById(R.id.tCode);
            deparTime = view.findViewById(R.id.deptTime);
            arrTime = view.findViewById(R.id.arrTime);
            duration = view.findViewById(R.id.hrs);
            price = view.findViewById(R.id.price);
            flightImageView = view.findViewById(R.id.flightImage);



        }
    }
    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false);
        return new MyViewHolder(itemview);
    }
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        String name=sflightEncaps.get(position).getFromAirport();
        holder.flight.setText(name);
//        holder.airlineCode.setText(sflightEncaps.get(position).getAirlineCode());
//        holder.fromAirport.setText(sflightEncaps.get(position).getFromAirport());
//        holder.toAirport.setText(sflightEncaps.get(position).getToAirport());
//        holder.deparTime.setText(sflightEncaps.get(position).getDeparTime());
//        holder.arrTime.setText(sflightEncaps.get(position).getArrTime());
//        holder.airlineName.setText(sflightEncaps.get(position).getAirlineName());
//        holder.price.setText(sflightEncaps.get(position).getPrice());
//        holder.duration.setText(sflightEncaps.get(position).getDuration());
//        holder.flightImageView.setImageResource(sflightEncaps.get(position).getFlightImage());
    }
    @Override
    public int getItemCount() {
        return sflightEncaps.size();
    }
}
