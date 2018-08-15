package com.example.mrxu.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;

import com.example.mrxu.myapplication.utils.PxToDp;
import com.example.mrxu.myapplication.weight.TitleActionBar;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Fragment基类
 */
public abstract class BaseFragment extends Fragment implements View.OnClickListener {

    public BaseActivity mActivity;

    private TitleActionBar titleActionBar;
    private LinearLayout layout_container;
    private View layout_loading;
    protected View layoutView = null;
    private Unbinder unbinder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (BaseActivity) getActivity();
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser && isVisible()) {
            startLoad();
            userVisibleHint();
        }
    }


    /**
     * 多次执行
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layoutViewAll = inflater.inflate(R.layout.fragment_container, null);
        titleActionBar = ButterKnife.findById(layoutViewAll, R.id.bar_title);
        layout_container = ButterKnife.findById(layoutViewAll, R.id.layout_container);
        layout_loading = ButterKnife.findById(layoutViewAll, R.id.layout_loading);
        layoutView = inflater.inflate(getLayoutId(), null);

        layout_container.addView(layoutView, LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);

        titleActionBar.setVisibility(isActionBarVisible() ? View.VISIBLE : View.GONE);
        titleActionBar.setTitle(getTitleText());
        titleActionBar.setBackViewShow(false);

        unbinder = ButterKnife.bind(this, layoutViewAll);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && isImmerseVisible()) {
            titleActionBar.getStatus_bar().getLayoutParams().height = PxToDp.getStatusBarHeight(getActivity());
        } else {
            titleActionBar.setTitleBackgroundColor(R.color.white_default);
        }
        onCreateChildView(savedInstanceState);
        return layoutViewAll;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getUserVisibleHint()) {
            startLoad();
        }
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    public TitleActionBar getTitleActionBar() {
        return titleActionBar;
    }


    /**
     * 是否为第一次加载
     */
    private boolean isFirstInitLoad = true;

    /**
     * 重置第一次加载状态
     */
    public void resetInitLoadState() {
        isFirstInitLoad = true;
    }

    /**
     * 开始加载
     */
    private final void startLoad() {
        if (isFirstInitLoad) {
            isFirstInitLoad = false;
            onFirstAccessToLoad();
        }
    }


    /**
     * 只有第一次加载这个界面才会调用该方法,可调用resetInitLoadState()进行重置
     */
    public void onFirstAccessToLoad() {
        // TODO: 需要子类复写
    }

    /**
     * 只要该界面用户可见，就会进入
     */
    public void userVisibleHint() {

    }

    public void hidnLoadingView() {
        if (layout_loading != null) {
            layout_loading.setVisibility(View.GONE);
        }
    }

    public void showLoadingView() {
        if (layout_loading != null) {
            layout_loading.setVisibility(View.VISIBLE);
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
     * 沉浸
     *
     * @return
     */
    public boolean isImmerseVisible() {
        return false;
    }

    public abstract void onCreateChildView(Bundle savedInstanceState);

    public abstract int getLayoutId();

    /**
     * 头标题
     *
     * @return
     */
    public abstract String getTitleText();
}