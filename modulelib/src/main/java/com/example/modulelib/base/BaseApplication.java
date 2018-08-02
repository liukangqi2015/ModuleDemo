package com.example.modulelib.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class BaseApplication extends Application{
    private final boolean isDebug=true;

    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebug){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
