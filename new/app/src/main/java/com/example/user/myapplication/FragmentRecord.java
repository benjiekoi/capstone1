package com.example.user.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.myapplication.R;

/**
 * Created by Coleentang on 1/30/2018.
 */

public class FragmentRecord extends Fragment
{
    View v;
    public FragmentRecord()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        v = inflater.inflate(R.layout.record_fragment,container,false);
        return v;
    }
}
