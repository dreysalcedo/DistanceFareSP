package com.example.thesisproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class OnBoardingFragment2 extends Fragment {
    FloatingActionButton fab_next1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_on_boarding2, container, false);
        fab_next1 = root.findViewById(R.id.fab_next1);


        fab_next1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), shortestpath.class);
                startActivity(intent);
            }

        });


        return root;
    }
}
