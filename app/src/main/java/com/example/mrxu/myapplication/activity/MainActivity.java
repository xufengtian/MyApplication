package com.example.mrxu.myapplication.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.mrxu.myapplication.weight.MyViewPager;
import com.example.mrxu.myapplication.R;
import com.example.mrxu.myapplication.adapter.CommonViewPagerAdapter;
import com.example.mrxu.myapplication.fragment.MyFragment1;
import com.example.mrxu.myapplication.fragment.MyFragment2;
import com.example.mrxu.myapplication.fragment.MyFragment3;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private MyViewPager mainViewpager;
    private Fragment f1;
    private Fragment f2;
    private Fragment f3;
    private ArrayList<android.support.v4.app.Fragment> mFragmentList = new ArrayList<>();
    private FragmentManager mFragmentManager;
    private CommonViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainViewpager = findViewById(R.id.main_viewpager);
        initViewPager();
    }

    private void initViewPager() {
        f1 = new MyFragment1();
        f2 = new MyFragment2();
        f3 = new MyFragment3();

        mFragmentList.add(f1);
        mFragmentList.add(f2);
        mFragmentList.add(f3);

        mFragmentManager = getSupportFragmentManager();
        mViewPagerAdapter = new CommonViewPagerAdapter(mFragmentManager, mFragmentList);
        mainViewpager.setAdapter(mViewPagerAdapter);
        mainViewpager.setOffscreenPageLimit(2);
    }
}
