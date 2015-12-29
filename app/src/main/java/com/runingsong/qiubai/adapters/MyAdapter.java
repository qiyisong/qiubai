package com.runingsong.qiubai.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.runingsong.qiubai.fragments.BlankFragment;

import java.util.List;

/**
 * Created by Administrator on 15-12-28.
 */
public class MyAdapter extends FragmentPagerAdapter{
    private List<Fragment> fragments;
    private List<String> titles;
    public MyAdapter(FragmentManager fm, List<Fragment> fragments,List<String> title) {
        super(fm);
        this.fragments = fragments;
        this.titles = title;
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = fragments.get(position);
        return fragment;
    }
    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
