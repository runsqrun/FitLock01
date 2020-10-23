package com.example.fitlock.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fitlock.R;
import com.example.fitlock.ui.home.FoodlistAdapter;
import com.example.fitlock.ui.plan.OngoingActivity;

import static java.security.AccessController.getContext;

public class LockDetail extends AppCompatActivity {


    private void initFoodlist(){
        RecyclerView myRecyclerView = (RecyclerView)findViewById(R.id.recycleview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(layoutManager);
        myRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        String[] data = { "Burger", "Cheesecake", "Ice-cream"};
        RecyclerView.Adapter myAdapter = new FoodlistAdapter(data);
        myRecyclerView.setAdapter(myAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lockdetail_detail);

        initFoodlist();

        CardView dCardView = (CardView)findViewById(R.id.ongoing);
        dCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LockDetail.this, OngoingActivity.class);
                startActivity(intent);
            }
        });
    }
}