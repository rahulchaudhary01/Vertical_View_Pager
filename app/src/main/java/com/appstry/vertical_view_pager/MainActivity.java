package com.appstry.vertical_view_pager;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    VerticalPageAdapter mAdapter;
    VerticalViewPager mPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new VerticalPageAdapter(getSupportFragmentManager());
        mPager = (VerticalViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);
       // mPager.setPageTransformer(true, new DepthPageTransformer());
    }
}
