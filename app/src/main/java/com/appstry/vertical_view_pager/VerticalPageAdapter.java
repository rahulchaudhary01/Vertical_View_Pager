package com.appstry.vertical_view_pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by RAHUL CHAUDHARY on 11/6/2016.
 */

public class VerticalPageAdapter extends FragmentPagerAdapter {
    private int[] offerImages = {
            R.drawable.rujal_1,
            R.drawable.rujal_2,
            R.drawable.rujal_3,
            R.drawable.rujal_4,
            R.drawable.rujal_5,
            R.drawable.rujal_6,
            R.drawable.rujal_7,
            R.drawable.rujal_8
    };

    private int mCount = offerImages.length;

    public VerticalPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new TestFragment(offerImages[position]);
    }

    @Override
    public int getCount() {
        return mCount;
    }

    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            //           notifyDataSetChanged();
        }
    }
}