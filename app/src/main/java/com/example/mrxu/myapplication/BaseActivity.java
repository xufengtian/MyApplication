package com.example.mrxu.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.LinearLayout;

import com.example.mrxu.myapplication.weight.TitleActionBar;

import butterknife.ButterKnife;

public abstract class BaseActivity extends FragmentActivity implements View.OnClickListener {

    // 标题栏
    private TitleActionBar titleActionBar;
    private View layout_loading = null;
    private LinearLayout layout_container = null;
    public BaseApplication mApp;
    private FragmentTransaction mFragementTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApp = (BaseApplication) getApplication();
        BaseAppManager.getInstance().addActivity(this);
        setContentView(R.layout.activity_base);

        layout_loading = ButterKnife.findById(this, R.id.layout_loading);
        layout_container = ButterKnife.findById(this, R.id.layout_container);
        layout_container.addView(getLayoutInflater().inflate(getLayoutId(), null), LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        titleActionBar = ButterKnife.findById(this, R.id.bar_title);

        ButterKnife.bind(this);
        // setTranslucentStatus();
        titleActionBar.setVisibility(isActionBarVisible() ? View.VISIBLE : View.GONE);
        titleActionBar.setTitle(getTitleText());
        titleActionBar.addLeftButtonAction(new TitleActionBar.Action() {

            @Override
            public void action(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BaseAppManager.getInstance().removeActivity(this);
    }

    public TitleActionBar getTitleActionBar() {
        return titleActionBar;
    }

    @Override
    public void onClick(View v) {

    }


    /**
     * Fragment跳转
     *
     * @param fromFragment
     * @param toFragment
     * @param tag
     */
    public Fragment turnToFragment(Fragment fromFragment, Fragment toFragment, String tag) {
        mFragementTransaction = getSupportFragmentManager().beginTransaction();
        /**
         * 如果要切换到的Fragment没有被Fragment事务添加，则隐藏被切换的Fragment，添加要切换的Fragment 否则，则隐藏被切换的Fragment，显示要切换的Fragment
         */
        if (!toFragment.isAdded()) {
            if (fromFragment != null) {
                mFragementTransaction.hide(fromFragment);
            }
            mFragementTransaction.add(R.id.content, toFragment, tag);
        } else {
            mFragementTransaction.hide(fromFragment).show(toFragment);
        }
        mFragementTransaction.commit();

        return toFragment;
    }

    /**
     * 移除栈里所有的历史fragment
     */
    public void removeAllFragment() {
        int count = getFragmentManager().getBackStackEntryCount();
        for (int i = 0; i < count; i++) {
            getFragmentManager().popBackStack();
        }
    }

    /**
     * 设置是否显示actionBar ，default:显示
     *
     * @param isShow
     */
    public void setTitleActionBarShow(boolean isShow) {
        if (titleActionBar != null) {
            titleActionBar.setVisibility(View.GONE);
        }
    }

    /**
     * ActionBar是否可见
     *
     * @return
     */
    public boolean isActionBarVisible() {
        return true;
    }

    /**
     * 头标题
     *
     * @return
     */
    public abstract String getTitleText();

    public abstract int getLayoutId();
}
