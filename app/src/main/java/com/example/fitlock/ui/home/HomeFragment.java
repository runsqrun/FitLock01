package com.example.fitlock.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitlock.R;
import com.example.fitlock.ui.LockDetail;

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
        //ListView list = view.findViewById(R.id.foodlist);

        mCardView = view.findViewById(R.id.c1);
        mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LockDetail.class);
                startActivity(intent);
            }
        });

        return view;


    }



}

