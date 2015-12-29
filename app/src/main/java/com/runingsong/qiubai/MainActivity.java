package com.runingsong.qiubai;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.runingsong.qiubai.adapters.MyAdapter;
import com.runingsong.qiubai.fragments.BetterFragment;
import com.runingsong.qiubai.fragments.BlankFragment;
import com.runingsong.qiubai.fragments.MediaFragment;
import com.runingsong.qiubai.fragments.PictureFragment;
import com.runingsong.qiubai.fragments.SelfFragment;
import com.runingsong.qiubai.fragments.TextFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ViewPager viewPager;
    private DrawerLayout slidingPaneLayout;
    private NavigationView navigationView;
    private List<String> titles;
    private List<Fragment> fragments;
    private TabLayout tabLayout;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager =(ViewPager)findViewById(R.id.pager);
        slidingPaneLayout = (DrawerLayout)findViewById(R.id.sliding);
        navigationView = (NavigationView)findViewById(R.id.menu);
        navigationView.setNavigationItemSelectedListener(this);
        tabLayout = (TabLayout)findViewById(R.id.tab);
        fragments = new ArrayList<>();
        titles = new ArrayList<>();
        titles.add("专享");
        titles.add("视频");
        titles.add("纯文");
        titles.add("纯图");
        titles.add("精华");
        SelfFragment selfFragment = new SelfFragment();
        fragments.add(selfFragment);
        MediaFragment mediaFragment = new MediaFragment();
        fragments.add(mediaFragment);
        TextFragment textFragment = new TextFragment();
        fragments.add(textFragment);
        PictureFragment pictureFragment = new PictureFragment();
        fragments.add(pictureFragment);
        BetterFragment betterFragment = new BetterFragment();
        fragments.add(betterFragment);
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(),fragments,titles);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        switch (itemId){
            case R.id.item_1:
//                viewPager.setCurrentItem(0);
//                menuItem.setChecked(true);
                break;
            case R.id.item_2:
//                viewPager.setCurrentItem(1);
//                menuItem.setChecked(true);
                break;
            case R.id.item_3:
//                viewPager.setCurrentItem(2);
//                menuItem.setChecked(true);
                break;
            case R.id.item_4:
//                viewPager.setCurrentItem(3);
//                menuItem.setChecked(true);
                break;
        }
        slidingPaneLayout.closeDrawer(navigationView);
        return true;
    }
}
