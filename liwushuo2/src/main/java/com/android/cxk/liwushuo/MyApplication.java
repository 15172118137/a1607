package com.android.cxk.liwushuo;

import android.app.Application;

/**
 * Created by Administrator on 2016/11/6.
 */
public class MyApplication extends Application {
    private static MyApplication instance;

    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.instance = this;
    }
}
