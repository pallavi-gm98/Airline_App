package com.example.airlineapp;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class searchRecyclerAdapter extends RecyclerView.Adapter<searchRecyclerAdapter.RecyclerViewHolder>   {
    @NonNull
    @Override
    public searchRecyclerAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull searchRecyclerAdapter.RecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
