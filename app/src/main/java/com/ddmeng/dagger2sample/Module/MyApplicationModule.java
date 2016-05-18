package com.ddmeng.dagger2sample.module;

import android.util.Log;

import com.ddmeng.dagger2sample.network.HttpUtil;
import com.ddmeng.dagger2sample.network.MyHttpUtil;
import com.ddmeng.dagger2sample.utils.LogUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class MyApplicationModule {


    // Inject interface, return implementation class instance
    @Provides
    public HttpUtil provideHttpUtil() {
        Log.i(LogUtils.TAG, "provideHttpUtil");
        return new MyHttpUtil();
    }
}
