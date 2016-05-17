package com.ddmeng.dagger2sample.utils;

import android.util.Log;

import javax.inject.Inject;

public class LogUtils {

    public static final String TAG = "Dagger2";


    // Use @Inject to annotate the constructor that Dagger should use to create instances of a class.
    // When a new instance is requested, Dagger will obtain the required parameters values and invoke this constructor.

    @Inject
    public LogUtils() {
        Log.i(TAG, "constructor " + hashCode());
    }

    public void i(String tag, String info) {
        Log.i(tag, info);
    }

}
