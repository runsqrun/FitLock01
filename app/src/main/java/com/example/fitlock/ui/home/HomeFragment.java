package com.example.fitlock.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.fitlock.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class HomeFragment extends Fragment {

    public CardView mCardView;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //       homeViewModel =
        //      ViewModelProviders.of(this).get(HomeViewModel.class);
        //      View root = inflater.inflate(R.layout.fragment_home, container, false);

        //      return root;

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mCardView = view.findViewById(R.id.c1);
        mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LockDetail.class);
                startActivity(intent);
            }
        });

        FloatingActionButton fab = view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Connect1Activity.class);
                startActivity(intent);
            }
        });

        return view;


    }



}

