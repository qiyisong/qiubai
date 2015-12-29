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
    private List<String> items;

    public MyAdapter(FragmentManager fm, List<String> items) {
        super(fm);
        this.items = items;
    }
    @Override
    public Fragment getItem(int position) {
        String s = items.get(position);
        BlankFragment blankFragment = BlankFragment.newInstance(s);
        return blankFragment;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return items.get(position);
    }
}
