package com.qiniu.pili.droid.shortvideo.demo;

import android.app.Application;
import android.support.multidex.MultiDexApplication;

import com.faceunity.FUConfig;
import com.faceunity.nama.FURenderer;
import com.faceunity.nama.utils.FuDeviceUtils;
import com.qiniu.pili.droid.shortvideo.PLShortVideoEnv;

public class ShortVideoApplication extends MultiDexApplication {

    private static ShortVideoApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        // init resources needed by short video sdk
        PLShortVideoEnv.init(getApplicationContext());
        FURenderer.getInstance().setup(this);
        FUConfig.DEVICE_LEVEL = FuDeviceUtils.judgeDeviceLevel(this);
    }

    public static ShortVideoApplication getInstance(){
        return sInstance;
    }

}
