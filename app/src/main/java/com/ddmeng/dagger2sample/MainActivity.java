package com.ddmeng.dagger2sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ddmeng.dagger2sample.utils.FileUtils;
import com.ddmeng.dagger2sample.utils.LogUtils;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    LogUtils logUtils;

    @Inject
    FileUtils fileUtils;


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
    }
}
