package com.example.zhangfan.tourguide.data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zhangfan.tourguide.R;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

/**
 * Created by Harold on 2017/8/22.
 */

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder> {
    private ArrayList<City> mCityData;

    public CityAdapter(ArrayList<City> list) {
        mCityData = list;
    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.desc_item, parent, false);
        return new CityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CityViewHolder holder, int position) {
        City city = mCityData.get(position);
        holder.mCityImageView.setImageResource(city.getImageSourceId());
        holder.mCityTitle.setText(city.getTitle());
        holder.mCityDesc.setText(city.getDescription());
    }

    @Override
    public int getItemCount() {
        if (mCityData != null) {
            return mCityData.size();
        }
        return 0;
    }

    public class CityViewHolder extends RecyclerView.ViewHolder {

        public final ImageView mCityImageView;
        public final TextView mCityTitle;
        public final TextView mCityDesc;

        public CityViewHolder(View itemView) {
            super(itemView);
            mCityImageView = (ImageView) itemView.findViewById(R.id.city_img);
            mCityTitle = (TextView) itemView.findViewById(R.id.city_title);
            mCityDesc = (TextView) itemView.findViewById(R.id.city_descption);
        }

    }
}
