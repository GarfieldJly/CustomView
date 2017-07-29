package com.hadarui.customview;

import android.app.Application;

/**
 * Created by jly on 2017/7/28.
 */

public class MyApplication extends Application {
    private static MyApplication instance;

    public static MyApplication getInstance() {
        return instance;
    }


    public MyApplication() {
        this.instance = this;
    }

}
