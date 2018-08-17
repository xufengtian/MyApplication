package com.example.mrxu.myapplication.fragment;

import android.os.Bundle;

import com.example.mrxu.myapplication.BaseFragment;
import com.example.mrxu.myapplication.R;
import com.orhanobut.logger.Logger;

public class MyFragment1 extends BaseFragment {


    @Override
    public void onCreateChildView(Bundle savedInstanceState) {

        Logger.d("11");
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
