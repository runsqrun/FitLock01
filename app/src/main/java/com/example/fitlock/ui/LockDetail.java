package com.example.fitlock.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fitlock.R;
import com.example.fitlock.ui.home.FoodlistAdapter;

import static java.security.AccessController.getContext;

public class LockDetail extends AppCompatActivity {


    private void initAskOrderBook(){
        RecyclerView myRecyclerView = (RecyclerView)findViewById(R.id.recycleview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(layoutManager);
       // myRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinerLayoutManager.HORIZONTAL));
        myRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        String[] data = { "aaa", "bbb", "ccc"};
        RecyclerView.Adapter myAdapter = new FoodlistAdapter(data);
        myRecyclerView.setAdapter(myAdapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lockdetail_detail);

        initAskOrderBook();
    }
}