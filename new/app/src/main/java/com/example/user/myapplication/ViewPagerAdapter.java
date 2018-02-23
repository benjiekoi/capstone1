package com.example.user.myapplication;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Coleentang on 1/30/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter
{
    private final List<Fragment> lstFragment = new ArrayList<>();
    private final List<String> lstTitles = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position)
    {
        return lstFragment.get(position);
    }

    @Override
    public int getCount()
    {
        return lstFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return lstTitles.get(position);
    }

    public void AddFragment (Fragment fragment,String title)
    {
        lstFragment.add(fragment);
        lstTitles.add(title);

    }

}
