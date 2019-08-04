package cn.hujw.utils;

import android.app.Application;

import cn.hujw.utils.library.Utils;

/**
 * @author: hujw
 * @date: 2019/8/4
 * @description:
 * @email: hujw_android@163.com
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.initialize(this);
    }
}
