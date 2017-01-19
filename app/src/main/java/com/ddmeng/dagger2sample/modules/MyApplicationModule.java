package com.ddmeng.dagger2sample.modules;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

import com.ddmeng.dagger2sample.network.HttpUtil;
import com.ddmeng.dagger2sample.network.MyHttpUtil;
import com.ddmeng.dagger2sample.utils.LogUtils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyApplicationModule {

    private Context context;

    public MyApplicationModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context providesContext() {
        return context;
    }

    // Inject interface, return implementation class instance
    @Provides
    public HttpUtil provideHttpUtil() {
        Log.i(LogUtils.TAG, "provideHttpUtil");
        return new MyHttpUtil();
    }

    // Inject class from third-party, or Android framework service
    // This provide method need a parameter, Dagger will obtain the parameter value (injected it)
    // If the parameter is not injectable, then compilation failed
    @Provides
    @Singleton
    ConnectivityManager provideConnectivityManager(Context context) {
        return (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }
}
