package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zhangfan.tourguide.R;
import com.example.zhangfan.tourguide.data.City;
import com.example.zhangfan.tourguide.data.CityAdapter;
import com.example.zhangfan.tourguide.data.CityUtility;

import java.util.ArrayList;


public class YiChangFragment extends Fragment {

    public YiChangFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_yi_chang, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.yichang_list);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        CityAdapter adapter = new CityAdapter((ArrayList<City>) CityUtility.getYichang());

        recyclerView.setAdapter(adapter);

        return view;
    }
}
