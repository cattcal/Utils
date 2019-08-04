package cn.hujw.utils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import cn.hujw.utils.library.GlobalUtils;

public class MainActivity extends AppCompatActivity {

    private String appPackage;
    private String appName;
    private String appVersionName;
    private int appVersionCode;
    private String string;
    private int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appPackage = GlobalUtils.getAppPackage();
        appName = GlobalUtils.getAppName();
        appVersionName = GlobalUtils.getAppVersionName();
        appVersionCode = GlobalUtils.getAppVersionCode();
        string = GlobalUtils.getString(R.string.app_name);
        color = GlobalUtils.getColor(R.color.colorAccent);

        Log.d("appPackage", appPackage);
        Log.d("appName", appName);
        Log.d("appVersionName", appVersionName);
        Log.d("appVersionCode", String.valueOf(appVersionCode));
        Log.d("string", string);
        Log.d("color", String.valueOf(color));
    }
}
