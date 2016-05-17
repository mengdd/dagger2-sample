package com.ddmeng.dagger2sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ddmeng.dagger2sample.utils.LogUtils;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    LogUtils logUtils;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((SampleApplication) getApplication()).getComponent().inject(this);
        logUtils.i("tag", "hi, I'm an instance of LogUtils");
    }
}
