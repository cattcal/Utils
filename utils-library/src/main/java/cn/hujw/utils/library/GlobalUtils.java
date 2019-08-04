package cn.hujw.utils.library;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author: hujw
 * @date: 2019/8/4
 * @description: 应用程序全局的通用工具类，功能比较单一，经常被复用的功能，应该封装到此工具类当中，从而给全局代码提供方面的操作。
 * @email: hujw_android@163.com
 */
public final class GlobalUtils {

    private String TAG = "GlobalUtils";

    /**
     * 获取当前应用程序的包名。
     *
     * @return
     */
    public static String getAppPackage() {
        return Utils.getContext().getPackageName();
    }

    /**
     * 获取当前应用程序的名称。
     *
     * @param
     * @return
     */
    public static String getAppName() {
        return Utils.getContext().getResources().getString(Utils.getContext().getApplicationInfo().labelRes);
    }

    public static String getAppVersionName() {
        String versionName = "";
        try {
            versionName = Utils.getContext().getPackageManager().getPackageInfo(getAppPackage(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionName;
    }

    /**
     * 获取当前应用程序的版本号。
     *
     * @param
     * @return
     */
    public static int getAppVersionCode() {
        int versionCode = 0;
        try {
            versionCode = Utils.getContext().getPackageManager().getPackageInfo(getAppPackage(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionCode;
    }

    /**
     * 获取当前时间的字符串，格式为yyyyMMddHHmmss。
     *
     * @return
     */
    public static String getCurrentDateString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        return sdf.format(new Date());
    }

    /**
     * 获取资源文件中定义的字符串。
     *
     * @param id
     * @return
     */
    public static String getString(@StringRes int id) {
        return Utils.getContext().getResources().getString(id);
    }

    /**
     * 获取指定资源名的资源id。
     *
     * @param name 资源名
     * @param type 资源类型
     * @return 指定资源名的资源id。
     */
    public static int getResourceId(String name, String type) {
        return Utils.getContext().getResources().getIdentifier(name, type, getAppPackage());
    }

    /**
     * 获取资源文件中定义的颜色。
     *
     * @param id
     * @return
     */
    public static int getColor(@ColorRes int id) {
        return ContextCompat.getColor(Utils.getContext(), id);
    }


}
