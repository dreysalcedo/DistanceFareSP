package com.example.thesisproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DriverTabFragment extends Fragment {

    EditText Starting, Destination;
    TextView StartingLoc,DestinationLoc,Haversine,Fare;
    Button MarkIniLoc,MarkDesLoc,Compute;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.driver_tab_fragment, container, false);
        Starting = root.findViewById(R.id.startingLoc);
        Destination = root.findViewById(R.id.destination);
        StartingLoc =  root.findViewById(R.id.textView1);
        DestinationLoc =  root.findViewById(R.id.textView2);
        Haversine = root.findViewById(R.id.TextView3);
        Fare = root.findViewById(R.id.TextView4);
        MarkIniLoc = root.findViewById(R.id.markinitialloc);
        MarkDesLoc = root.findViewById(R.id.markdestination);
        Compute = root.findViewById(R.id.compute);


        Starting.setTranslationX(800);
        Destination.setTranslationX(800);
        StartingLoc.setTranslationX(800);
        DestinationLoc.setTranslationX(800);
        Haversine.setTranslationX(800);
        Fare.setTranslationX(800);
        MarkIniLoc.setTranslationX(800);
        MarkDesLoc.setTranslationX(800);
        Compute.setTranslationX(800);


        Starting.setAlpha(v);
        Destination.setAlpha(v);
        StartingLoc.setAlpha(v);
        DestinationLoc.setAlpha(v);
        Haversine.setAlpha(v);
        Fare.setAlpha(v);
        MarkIniLoc.setAlpha(v);
        MarkDesLoc.setAlpha(v);
        Compute.setAlpha(v);


        Starting.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        Destination.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        StartingLoc.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        DestinationLoc.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1000).start();
        Haversine.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1200).start();
        Fare.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1400).start();
        MarkIniLoc.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1600).start();
        MarkDesLoc.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1800).start();
        Compute.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(2000).start();

        return root;

    }
}
