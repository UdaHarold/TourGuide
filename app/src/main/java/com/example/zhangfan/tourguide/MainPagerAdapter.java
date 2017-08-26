package com.example.zhangfan.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import layout.EnShiFragment;
import layout.ShangHaiFragment;
import layout.WuHanFragment;
import layout.YiChangFragment;

import static android.R.attr.cacheColorHint;
import static android.R.attr.y;

/**
 * Created by Harold on 2017/8/22.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private static final int TAB_0 = 0;
    private static final int TAB_1 = 1;
    private static final int TAB_2 = 2;
    private static final int TAB_3 = 3;

    public MainPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case TAB_0:
                return new WuHanFragment();
            case TAB_1:
                return new YiChangFragment();
            case TAB_2:
                return new EnShiFragment();
            case TAB_3:
                return new ShangHaiFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case TAB_0:
                return mContext.getString(R.string.tab_0);
            case TAB_1:
                return mContext.getString(R.string.tab_1);
            case TAB_2:
                return mContext.getString(R.string.tab_2);
            case TAB_3:
                return mContext.getString(R.string.tab_3);
            default:
                return "";
        }
    }
}
