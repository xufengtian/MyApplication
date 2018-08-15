package com.example.mrxu.myapplication.fragment;

import android.os.Bundle;

import com.example.mrxu.myapplication.BaseFragment;
import com.example.mrxu.myapplication.R;

public class MyFragment1 extends BaseFragment {


    @Override
    public void onCreateChildView(Bundle savedInstanceState) {



    }

    @Override
    public int getLayoutId() {
        return R.layout.my_fragment1;
    }

    @Override
    public String getTitleText() {
        return "tab1";
    }


}
