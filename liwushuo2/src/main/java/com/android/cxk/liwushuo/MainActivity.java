package com.android.cxk.liwushuo;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.viewpagerindicator.TitlePageIndicator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TitlePageIndicator mIndicator;
    private ViewPager mViewPager;
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIndicator = (TitlePageIndicator) findViewById(R.id.main_indicator);
        mViewPager = (ViewPager) findViewById(R.id.main_pager);
        initDatas();
        myAdapter = new MyAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(myAdapter);
        mIndicator.setViewPager(mViewPager);
        mIndicator.setSelectedColor(Color.RED);
    }
    private void initDatas() {
            titles.add("精选");
            titles.add("送女票");
            titles.add("海淘");
            titles.add("创意生活");
            titles.add("科技范");
            titles.add("送爸妈");
            titles.add("送基友");
            titles.add("送闺蜜");
            titles.add("送同事");
            titles.add("送宝贝");
            titles.add("设计感");
            titles.add("文艺风");
            titles.add("奇葩搞怪");
            titles.add("萌萌哒");
        for (int i = 0; i < 14; i++) {
            fragments.add(MyFragment.newInstance());
        }
    }
    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments == null ? 0 : fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);
        }
    }
}
