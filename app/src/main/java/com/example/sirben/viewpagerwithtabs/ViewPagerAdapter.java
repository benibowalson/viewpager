package com.example.sirben.viewpagerwithtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final int numberOfTabs = 3;

    public ViewPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int tabIndex) {
        DemoFragment demoFragment = new DemoFragment();
        tabIndex++;
        Bundle bundle = new Bundle();
        bundle.putString("message", "Fragment number: " + tabIndex);
        demoFragment.setArguments(bundle);
        return demoFragment;
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
