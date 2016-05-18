package com.ddmeng.dagger2sample;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ddmeng.dagger2sample.network.HttpUtil;
import com.ddmeng.dagger2sample.utils.FileUtils;
import com.ddmeng.dagger2sample.utils.LogUtils;

import java.io.IOException;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    LogUtils logUtils;

    @Inject
    FileUtils fileUtils;

    @Inject
    HttpUtil httpUtil;

    @Inject
    ConnectivityManager connectivityManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((SampleApplication) getApplication()).getComponent().inject(this);
        logUtils.i(LogUtils.TAG, "hi, I'm an instance of LogUtils " + logUtils.hashCode());
        fileUtils.doSomething();

        ((SampleApplication) getApplication()).getComponent().inject(this);
        logUtils.i(LogUtils.TAG, "hi, I'm another instance of LogUtils " + logUtils.hashCode());
        fileUtils.doSomething();

        try {
            httpUtil.get("get test");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 可以观察到调用inject方法后,字段是按照在类中声明的顺序注入的

        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

    }
}
