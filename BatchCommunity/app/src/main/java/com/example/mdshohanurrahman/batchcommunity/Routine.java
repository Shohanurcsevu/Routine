package com.example.mdshohanurrahman.batchcommunity;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Routine extends AppCompatActivity {

    private TabLayout tablayout;
    private AppBarLayout appbar;
    private ViewPager vpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);

        tablayout=(TabLayout)findViewById(R.id.tabid);
        appbar=(AppBarLayout)findViewById(R.id.appbarid);
        vpager=(ViewPager)findViewById(R.id.viewpagerid);

        ViewPageAdapter adapter=new ViewPageAdapter(getSupportFragmentManager());

        adapter.AddFragment( new SundayFragment(),"Sunday");
        adapter.AddFragment(new MondayFragment(),"Monday");
        adapter.AddFragment(new TuesdayFragmnent(),"Tuesday");
        adapter.AddFragment(new WednesdayFragment(),"WednesDay");
        adapter.AddFragment(new ThursdayFragment(),"Thursday");

        vpager.setAdapter(adapter);
        tablayout.setupWithViewPager(vpager);
    }
}
