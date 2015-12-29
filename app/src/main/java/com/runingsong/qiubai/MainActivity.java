package com.runingsong.qiubai;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.runingsong.qiubai.adapters.MyAdapter;
import com.runingsong.qiubai.fragments.BlankFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, TabLayout.OnTabSelectedListener {
    private ViewPager viewPager;
    private SlidingPaneLayout slidingPaneLayout;
    private NavigationView navigationView;
    private List<String> items;
    private TabLayout tabLayout;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager =(ViewPager)findViewById(R.id.pager);
        slidingPaneLayout = (SlidingPaneLayout)findViewById(R.id.sliding);
        navigationView = (NavigationView)findViewById(R.id.menu);
        navigationView.setNavigationItemSelectedListener(this);
        tabLayout = (TabLayout)findViewById(R.id.tab);
        items = new ArrayList<>();
        items.add("糗事");
        items.add("视频");
        items.add("图片");
        items.add("文字");
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(),items);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
//        tabLayout.setTabsFromPagerAdapter(adapter);
        tabLayout.setOnTabSelectedListener(this);
    }
    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        switch (itemId){
            case R.id.item_1:
                viewPager.setCurrentItem(0);
                menuItem.setChecked(true);
                break;
            case R.id.item_2:
                viewPager.setCurrentItem(1);
                menuItem.setChecked(true);
                break;
            case R.id.item_3:
                viewPager.setCurrentItem(2);
                menuItem.setChecked(true);
                break;
            case R.id.item_4:
                viewPager.setCurrentItem(3);
                menuItem.setChecked(true);
                break;
        }
        slidingPaneLayout.closePane();
        return true;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        int position = tab.getPosition();
        Log.d("MainActivity", "onTabSelected() returned: " + position);
        switch (position){
            case 0:
                viewPager.setCurrentItem(0);
                break;
            case 1:
                viewPager.setCurrentItem(1);
                break;
            case 2:
                viewPager.setCurrentItem(2);
                break;
            case 3:
                viewPager.setCurrentItem(3);
                break;
        }
    }
    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
