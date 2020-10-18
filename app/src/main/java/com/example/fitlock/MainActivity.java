package com.example.fitlock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.fitlock.ui.LockDetail;
import com.example.fitlock.ui.TestActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity{

    public CardView mCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);



//       mCardView = (CardView) findViewById(R.id.c1);
//        mCardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //在按钮响应函数中添加如下两句话就ok了
//                Intent intent=new Intent(MainActivity.this,LockDetail.class);
//                startActivity(intent);
//
//            }
//        });
//        card1 = (CardView)findViewById(R.id.c1);
//        card2 = (CardView)findViewById(R.id.c2);
//
//        card1.setOnClickListener(this);
//        card2.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View view) {
//        Intent i;
//
//        switch(view.getId()){
//            case R.id.c1 :
//                i = new Intent(this, LockDetail.class);
//                startActivity(i);
//                break;
//            case  R.id.c2 :
//                i = new Intent(this, TestActivity.class);
//                startActivity(i);
//                break;
//
//        }
//    }
}