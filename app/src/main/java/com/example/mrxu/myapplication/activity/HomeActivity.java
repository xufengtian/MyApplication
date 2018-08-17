package com.example.mrxu.myapplication.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mrxu.myapplication.BaseActivity;
import com.example.mrxu.myapplication.BaseAppManager;
import com.example.mrxu.myapplication.R;
import com.example.mrxu.myapplication.fragment.MyFragment1;
import com.example.mrxu.myapplication.fragment.MyFragment2;
import com.example.mrxu.myapplication.fragment.MyFragment3;
import com.example.mrxu.myapplication.fragment.MyFragment4;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 首页
 * activity嵌套fragment
 * from：天天
 */
public class HomeActivity extends BaseActivity {

    private static final String TAG_1 = "tag_1";
    private static final String TAG_2 = "tag_2";
    private static final String TAG_3 = "tag_3";
    private static final String TAG_4 = "tag_4";

    public Fragment f1;
    public Fragment f2;
    public Fragment f3;
    public Fragment f4;

    @BindView(R.id.tvTab1)
    TextView tvTab1;
    @BindView(R.id.tvTab2)
    TextView tvTab2;
    @BindView(R.id.tvTab3)
    TextView tvTab3;
    @BindView(R.id.tvTab4)
    TextView tvTab4;
    private int currentIndex = 0;//当前选中的模块
    private Fragment currentFragment;//当前选中的Fragment


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTabSelection(0);

    }

    @OnClick(R.id.llTab1)
    public void llTabMeet() {
        if (currentIndex != 0) {
            setTabSelection(0);
        }
    }

    @OnClick(R.id.llTab2)
    void llTabDate() {
        if (currentIndex != 1) {
            setTabSelection(1);
        }
    }

    @OnClick(R.id.llTab3)
    void llTabCommunity() {
        if (currentIndex != 2) {
            setTabSelection(2);
        }
    }

    @OnClick(R.id.llTab4)
    void llTabMine() {
        if (currentIndex != 3) {
            setTabSelection(3);
        }
    }


    /**
     * 根据传入的index参数来设置选中的tab页。
     */
    @SuppressLint("CommitTransaction")
    private void setTabSelection(int index) {
        switch (index) {
            case 0:
                currentIndex = index;
                hideFragments(getSupportFragmentManager().beginTransaction());
                clearSelection();
                tvTab1.setTextColor(getResources().getColor(R.color.themeColor));
                tvTab1.getPaint().setFakeBoldText(true);
                if (f1 == null) {
                    f1 = new MyFragment1();
                }
                currentFragment = turnToFragment(currentFragment, f1, TAG_1);
                break;
            case 1:
                currentIndex = index;
                hideFragments(getSupportFragmentManager().beginTransaction());
                clearSelection();
                tvTab2.setTextColor(getResources().getColor(R.color.themeColor));
                tvTab2.getPaint().setFakeBoldText(true);
                if (f2 == null) {
                    f2 = new MyFragment2();
                }
                currentFragment = turnToFragment(currentFragment, f2, TAG_2);
                break;
            case 2:
                currentIndex = index;
                hideFragments(getSupportFragmentManager().beginTransaction());
                clearSelection();
                tvTab3.setTextColor(getResources().getColor(R.color.themeColor));
                tvTab3.getPaint().setFakeBoldText(true);
                if (f3 == null) {
                    f3 = new MyFragment3();
                }
                currentFragment = turnToFragment(currentFragment, f3, TAG_3);
                break;
            case 3:
                currentIndex = index;
                hideFragments(getSupportFragmentManager().beginTransaction());
                clearSelection();
                tvTab4.setTextColor(getResources().getColor(R.color.themeColor));
                tvTab4.getPaint().setFakeBoldText(true);
                if (f4 == null) {
                    f4 = new MyFragment4();
                }
                currentFragment = turnToFragment(currentFragment, f4, TAG_4);
                break;
        }
    }

    /**
     * 清除掉所有的选中状态。
     */
    private void clearSelection() {
        tvTab1.setTextColor(getResources().getColor(R.color.gray1));
        tvTab1.getPaint().setFakeBoldText(false);
        tvTab2.setTextColor(getResources().getColor(R.color.gray1));
        tvTab2.getPaint().setFakeBoldText(false);
        tvTab3.setTextColor(getResources().getColor(R.color.gray1));
        tvTab3.getPaint().setFakeBoldText(false);
        tvTab4.setTextColor(getResources().getColor(R.color.gray1));
        tvTab4.getPaint().setFakeBoldText(false);
    }

    /**
     * 将所有的Fragment都置为隐藏状态。
     *
     * @param transaction 用于对Fragment执行操作的事务
     */
    private void hideFragments(FragmentTransaction transaction) {
        if (f2 != null) {
            transaction.hide(f2);
        }
        if (f4 != null) {
            transaction.hide(f4);
        }
//        transaction.commit();
        // 解决java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState
        transaction.commitAllowingStateLoss();
    }

    /**
     * 显示首页界面的第一个tab
     */
    public void showHomePage() {
        if (currentIndex != 0) {
            setTabSelection(0);
        }
    }

    private long mExitTime;

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                Toast.makeText(this, "再按一次退出app", Toast.LENGTH_SHORT).show();
                mExitTime = System.currentTimeMillis();
            } else {
                BaseAppManager.getInstance().clear();
                System.gc();
//                finish();
            }
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }

    @Override
    public boolean isActionBarVisible() {
        return false;
    }

    @Override
    public String getTitleText() {
        return null;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_home;
    }
}
