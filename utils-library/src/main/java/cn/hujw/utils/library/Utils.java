package cn.hujw.utils.library;

import android.annotation.SuppressLint;
import android.content.Context;

/**
 * @author: hujw
 * @date: 2019/8/4
 * @description:
 * @email: hujw_android@163.com
 */
public class Utils {

    @SuppressLint("StaticFieldLeak")
    private static Context context;

    public static void initialize(Context c) {
        context = c;
    }

    public static Context getContext() {
        return context;
    }

    /**
     * 返回当前应用的包名。
     */
    public static String getPackageName() {
        return context.getPackageName();
    }
}
