package com.ddmeng.dagger2sample;

import android.app.Application;

import com.ddmeng.dagger2sample.component.DaggerMyApplicationComponent;
import com.ddmeng.dagger2sample.component.MyApplicationComponent;

public class SampleApplication extends Application {

    private MyApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerMyApplicationComponent.builder().build();

    }

    public MyApplicationComponent getComponent() {
        return component;
    }
}
