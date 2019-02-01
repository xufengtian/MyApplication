package com.example.mrxu.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mrxu.myapplication.BaseFragment;
import com.example.mrxu.myapplication.R;

public class MyFragment2 extends BaseFragment {



    @Override
    public void onCreateChildView(Bundle savedInstanceState) {

    }

    @Override
    public int getLayoutId() {
        return R.layout.my_fragment2;
    }

    @Override
    public String getTitleText() {
        return "";
    }


}
