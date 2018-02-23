package com.example.user.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Coleentang on 1/30/2018.
 */

public class FragmentResult extends Fragment
{
    View v;
    private RecyclerView myrecyclerview;
    private List<Result> lstResult;

    public FragmentResult()
    {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        v = inflater.inflate(R.layout.result_fragment,container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.result_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstResult);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstResult = new ArrayList<>();
        lstResult.add(new Result("Bianca","09123456789",R.drawable.bianca));
    }
}
