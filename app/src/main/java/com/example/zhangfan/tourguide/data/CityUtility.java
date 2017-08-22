package com.example.zhangfan.tourguide.data;

import android.content.Context;

import com.example.zhangfan.tourguide.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harold on 2017/8/22.
 */

public class CityUtility {

    private Context mContext;

    public CityUtility(Context context) {
        mContext = context;
    }

    public List<City> getWuhan() {

        List<City> wuhan = new ArrayList<City>() {
            {
                add(new City(mContext.getString(R.string.wuhan_scene),
                        mContext.getString(R.string.wuhan_scene_desc),
                        R.drawable.huanghelou));
                add(new City(mContext.getString(R.string.wuhan_restaurant),
                        mContext.getString(R.string.wuhan_restaurant_desc),
                        R.drawable.hubuxiang));
                add(new City(mContext.getString(R.string.wuhan_playground),
                        mContext.getString(R.string.wuhan_playground_desc),
                        R.drawable.donghu));
            }
        };
        return wuhan;

    }

    public List<City> getYichang() {

        List<City> yichang = new ArrayList<City>() {
            {
                add(new City(mContext.getString(R.string.yichang_scene),
                        mContext.getString(R.string.yichang_scene_desc),
                        R.drawable.sanxiadaba));
                add(new City(mContext.getString(R.string.yichang_restaurant),
                        mContext.getString(R.string.yichang_restaurant_desc),
                        R.drawable.chexi));
                add(new City(mContext.getString(R.string.yichang_playground),
                        mContext.getString(R.string.yichang_playground_desc),
                        R.drawable.chaotianhou));
            }
        };
        return yichang;
    }

    public List<City> getEnshi() {
        List<City> enshi = new ArrayList<City>() {
            {
                add(new City(mContext.getString(R.string.enshi_scene),
                        mContext.getString(R.string.enshi_scene_desc),
                        R.drawable.longchuanshuixiang));
                add(new City(mContext.getString(R.string.enshi_restaurant),
                        mContext.getString(R.string.enshi_restaurant_desc),
                        R.drawable.guanggu));
                add(new City(mContext.getString(R.string.enshi_playground),
                        mContext.getString(R.string.enshi_playground_desc),
                        R.drawable.tenglongdong));
            }
        };
        return enshi;
    }

    public List<City> getShanghai() {
        List<City> shanghai = new ArrayList<City>() {
            {
                add(new City(mContext.getString(R.string.shanghai_scene),
                        mContext.getString(R.string.shanghai_scene_desc),
                        R.drawable.yuyuan));
                add(new City(mContext.getString(R.string.shanghai_restaurant),
                        mContext.getString(R.string.shanghai_restaurant_desc),
                        R.drawable.shanghailaojie));
                add(new City(mContext.getString(R.string.shanghai_playground),
                        mContext.getString(R.string.shanghai_playground_desc),
                        R.drawable.waitan));
            }
        };
        return shanghai;
    }
}
