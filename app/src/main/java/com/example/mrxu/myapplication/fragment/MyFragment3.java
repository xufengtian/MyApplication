package com.example.mrxu.myapplication.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mrxu.myapplication.R;
import com.example.mrxu.myapplication.utils.ImageLoaderUtils;
import com.example.mrxu.myapplication.vo.DataBean;
import com.example.mrxu.myapplication.weight.banner.Banner;
import com.example.mrxu.myapplication.weight.banner.callback.BindViewCallBack;
import com.example.mrxu.myapplication.weight.banner.callback.OnClickBannerListener;

import java.util.ArrayList;
import java.util.List;

public class MyFragment3 extends Fragment {

    private Banner banner;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.my_fragment, null);
        banner = rootView.findViewById(R.id.banner);

        List<DataBean> tempList = new ArrayList<>();
        DataBean bean = new DataBean();
        bean.setId(R.color.colorAccent);
        DataBean bean1 = new DataBean();
        bean1.setId(R.color.gray1);
        DataBean bean2 = new DataBean();
        bean2.setId(R.color.gray1);
        tempList.add(bean);
        tempList.add(bean1);
        tempList.add(bean2);
        setBanner(tempList);


        return rootView;
    }


    private void setBanner(final List<DataBean> result) {

        List<DataBean> tempList = new ArrayList<>();
        tempList.addAll(result);
        tempList.addAll(result);
        tempList.addAll(result);

        if (banner == null) {
            return;
        }
        banner.setOrientation(Banner.VERTICAL);
        banner.setLoop(true);
        banner.setPageTransformer(new ViewPager.PageTransformer() {
            @Override
            public void transformPage(View view, float position) {

                float transX = view.getWidth() * -position;
                view.setTranslationX(transX);
                float transY = position * view.getHeight();
                view.setTranslationY(transY);
            }
        });
        banner.bindView(new BindViewCallBack() {
            @Override
            public void bindView(View view, Object data, int position) {
                ((ImageView) view).setImageResource(((DataBean) data).getId());
                ImageLoaderUtils.display(getContext(),(ImageView) view,"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533297132072&di=81442222eec917709fc9ebdb9530e35b&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F13%2F68%2F96%2F68x58PICrws_1024.jpg");

            }
        })
                .setOnClickBannerListener(new OnClickBannerListener<View, DataBean>() {
                    @Override
                    public void onClickBanner(View view, DataBean data, int position) {
                        Toast.makeText(getContext(), "单击事件", Toast.LENGTH_LONG).show();
                    }
                })
                //填充数据
                .execute(tempList);
    }


}
