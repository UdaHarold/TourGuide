package com.example.zhangfan.tourguide;

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


    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new WuHanFragment();
            case 1:
                return new YiChangFragment();
            case 2:
                return new EnShiFragment();
            case 3:
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
            case 0:
                return "武汉";
            case 1:
                return "宜昌";
            case 2:
                return "恩施";
            case 3:
                return "上海";
            default:
                return "";
        }
    }
}
