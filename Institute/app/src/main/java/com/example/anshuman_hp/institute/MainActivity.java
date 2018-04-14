package com.example.anshuman_hp.institute;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;
    TabLayout tabLayout;
    pagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager=(ViewPager)findViewById(R.id.viewPager);
        pagerAdapter=new pagerAdapter(getSupportFragmentManager());
        pagerAdapter.add(new TimelineFragment());
        pagerAdapter.add(new About_institute());
        pager.setAdapter(pagerAdapter);
        tabLayout=(TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);
    }
}
