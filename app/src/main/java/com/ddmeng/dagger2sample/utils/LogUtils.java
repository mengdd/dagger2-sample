package com.ddmeng.dagger2sample.utils;

import android.util.Log;

import javax.inject.Inject;

/**
 * LogUtils is a simple tool, with @Inject on its constructor, no need to add provideXX() method in a Module
 * This class is NOT a Singleton, which means every inject create a new instance of it.
 */
public class LogUtils {

    public static final String TAG = "Dagger2";


    // Use @Inject to annotate the constructor that Dagger should use to create instances of a class.
    // When a new instance is requested, Dagger will obtain the required parameters values and invoke this constructor.

    @Inject
    public LogUtils() {
        Log.i(TAG, "LogUtils constructor " + hashCode());
    }

    public void i(String tag, String info) {
        Log.i(tag, info);
    }

}
