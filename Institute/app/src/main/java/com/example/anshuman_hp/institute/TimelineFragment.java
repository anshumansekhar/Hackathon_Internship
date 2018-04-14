package com.example.anshuman_hp.institute;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimelineFragment extends Fragment {
    RecyclerView TimelineRecycler;


    public TimelineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view=inflater.inflate(R.layout.fragment_timeline, container, false);
        Log.e("sg","OKAY Fragment");
        TimelineRecycler=(RecyclerView)view.findViewById(R.id.timelineRecycler);
        TimelineRecyclerAdapter adapter=new TimelineRecyclerAdapter();
        TimelineRecycler.setAdapter(adapter);
        TimelineRecycler.setLayoutManager(new LinearLayoutManager(TimelineRecycler.getContext()));
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("df","OKAt on view");

    }
}
