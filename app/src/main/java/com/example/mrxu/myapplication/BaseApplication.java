package com.example.mrxu.myapplication;


import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;


/**
 * 项目application
 */
public class BaseApplication extends Application {

    private static Context context;
    private static BaseApplication baseApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        baseApplication = this;
        initLoger();
    }

    private void initLoger() {

        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  //（可选）是否显示线程信息。 默认值为true
                .tag("mine")   //（可选）每个日志的全局标记。 默认PRETTY_LOGGER
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));

//        //项目上线前，可以实现以下方法，以保证上线后不输出日志。
//        Logger.addLogAdapter(new AndroidLogAdapter() {
//            @Override public boolean isLoggable(int priority, String tag) {
//                return BuildConfig.DEBUG;
//            }
//        });
    }


    /**
     * 获取全局Context
     */
    public static Context getContext() {
        return context;
    }

    public static BaseApplication getApplication() {
        return baseApplication;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        System.gc();
    }


}