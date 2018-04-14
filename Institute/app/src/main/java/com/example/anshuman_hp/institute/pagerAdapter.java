package com.example.anshuman_hp.institute;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Anshuman-HP on 28-03-2017.
 */

public class pagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> fragments=new ArrayList<>();
    public pagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
       return new TimelineFragment();

    }
    public void add(Fragment f)
    {
        fragments.add(f);

    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragments.get(position).toString();
    }
}

