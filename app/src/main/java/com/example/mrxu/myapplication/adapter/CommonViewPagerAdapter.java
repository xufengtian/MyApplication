package com.example.mrxu.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by hongfan on 2017/10/31.
 */

public class CommonViewPagerAdapter extends FragmentPagerAdapter {
    private List<? extends Fragment> fragmentList;
    private List<String> mTitles;
    private int count;
    private boolean isLoop;

    public CommonViewPagerAdapter(FragmentManager fm,
                                  List<? extends Fragment> fragmentList, boolean isLoop) {
        super(fm);
        this.fragmentList = fragmentList;
        count = fragmentList.size();
        this.isLoop = isLoop;
    }

    public CommonViewPagerAdapter(FragmentManager fm,
                                  List<? extends Fragment> fragmentList, List<String> mTitles) {
        super(fm);
        this.fragmentList = fragmentList;
        count = fragmentList.size();
        this.mTitles = mTitles;
        this.isLoop = false;
    }

    public CommonViewPagerAdapter(FragmentManager fm,
                                  List<? extends Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
        count = fragmentList.size();
        isLoop = false;
    }

    /**
     * 得到每个页面
     */
    @Override
    public Fragment getItem(int position) {
        if (!isLoop) {
            return fragmentList.get(position);
        }
        if (position >= count) {
            position = position % count;
        }
        return (fragmentList == null || fragmentList.size() == 0) ? null
                : fragmentList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (mTitles != null && mTitles.size() == count) {
            return mTitles.get(position);
        } else {
            return super.getPageTitle(position);
        }
    }

    @Override
    public long getItemId(int position) {
        if (!isLoop) {
            return position;
        }
        if (position >= count) {
            position = position % count;
        }
        return position;
    }

    /**
     * 页面的总个数
     */
    @Override
    public int getCount() {
        if (!isLoop) {
            return fragmentList.size();
        }
        return fragmentList == null ? 0 : (isLoop ? Integer.MAX_VALUE : fragmentList.size());
    }

}
