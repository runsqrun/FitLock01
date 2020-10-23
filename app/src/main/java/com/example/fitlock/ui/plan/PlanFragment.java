package com.example.fitlock.ui.plan;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.fitlock.R;
import com.example.fitlock.ui.home.Connect1Activity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PlanFragment extends Fragment {

    private PlanViewModel planViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        planViewModel =
//                ViewModelProviders.of(this).get(PlanViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_plan, container, false);
//        final TextView textView = root.findViewById(R.id.text_dashboard);
//        planViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;

        View view1 = inflater.inflate(R.layout.fragment_plan, container, false);
        Button btn = view1.findViewById(R.id.create_plan);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CreateActivity.class);
                startActivity(intent);
            }
        });
        return view1;
    }
}

