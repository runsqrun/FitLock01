package com.example.fitlock.ui.home;


import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.fitlock.R;

public class FoodlistAdapter extends RecyclerView.Adapter<FoodlistAdapter.MyViewHolder>  {

    private String[] myDataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView amount;

        public MyViewHolder(TextView amount){
            super(amount);
            this.amount = amount;
        }
    }

    public FoodlistAdapter(String[] myDataSet) {
        this.myDataSet = myDataSet;
    }

    /**
     * create list
     */
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView v = (TextView) (LayoutInflater.from(parent.getContext())
                .inflate(R.layout.foodlist_item_view, parent, false));
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    /**
     *show the data
     */
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.amount.setText(this.myDataSet[position]);
    }

    @Override
    public int getItemCount() {
        return myDataSet.length;
    }

}