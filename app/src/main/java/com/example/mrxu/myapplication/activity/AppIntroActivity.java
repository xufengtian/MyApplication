package com.example.mrxu.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.mrxu.myapplication.R;
import com.example.mrxu.myapplication.fragment.appintro.AppIntro1Fragment;
import com.github.paolorotolo.appintro.AppIntro;
import com.orhanobut.logger.Logger;

/**
 * app介绍页
 * 引用 com.github.paolorotolo:appintro:3.4.0 框架
 * from：天天
 */
public class AppIntroActivity extends AppIntro {
    @Override
    public void init(@Nullable Bundle savedInstanceState) {


        addSlide(AppIntro1Fragment.newInstance(R.layout.appintro_1_fragment_layout));
        addSlide(AppIntro1Fragment.newInstance(R.layout.appintro_1_fragment_layout));
        addSlide(AppIntro1Fragment.newInstance(R.layout.appintro_1_fragment_layout));
        addSlide(AppIntro1Fragment.newInstance(R.layout.appintro_1_fragment_layout));
        setBarColor(getResources().getColor(R.color.themeColor));
//        setSeparatorColor(getResources().getColor(R.color.colorAccent));
        setSkipText("左侧按钮");
        setDoneText("完成");

    }

    @Override
    public void onSkipPressed() {
        Logger.d("onSkipPressed");
    }

    @Override
    public void onNextPressed() {
        Logger.d("onNextPressed");
    }

    @Override
    public void onDonePressed() {
        Logger.d("onDonePressed");
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

    @Override
    public void onSlideChanged() {
        Logger.d("onSlideChanged");
    }
}
