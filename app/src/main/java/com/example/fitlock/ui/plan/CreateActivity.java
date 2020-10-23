package com.example.fitlock.ui.plan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fitlock.MainActivity;
import com.example.fitlock.R;
import com.example.fitlock.ui.home.Connect1Activity;
import com.example.fitlock.ui.home.Connect2Activity;

public class CreateActivity extends AppCompatActivity {
    Button btnConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

    btnConfirm = (Button)findViewById(R.id.confirm);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(CreateActivity.this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
        }
    });
    }
}