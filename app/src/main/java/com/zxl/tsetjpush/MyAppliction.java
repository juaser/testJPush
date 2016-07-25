package com.zxl.tsetjpush;

import android.app.Application;
import android.util.Log;

import cn.jpush.android.api.JPushInterface;

/**
 * @类说明：
 * @author：zxl
 * @CreateTime 2016/7/25.
 */
public class MyAppliction extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(getClass().getName(), "MyAppliction初始化");
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
