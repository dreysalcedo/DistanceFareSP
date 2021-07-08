package com.example.thesisproject;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Page2Adapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public Page2Adapter(FragmentManager fm, Context context, int totalTabs) {
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public int getCount(){

        return totalTabs;
    }

    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PassengerTabFragment passengerTabFragment = new PassengerTabFragment();
                return passengerTabFragment;

            case 1:
                DriverTabFragment driverTabFragment = new DriverTabFragment();
                return driverTabFragment;

             default:
                 return null;
        }
    }
}
