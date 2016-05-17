package com.ddmeng.dagger2sample.utils;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * FileUtils is inject by add @Inject on its constructor, no need to add provideXX() method in a Module
 * annotated with @Singleton on its class name, which means it only has one instance, every inject should return the instance.
 */
@Singleton
public class FileUtils {

    @Inject
    public FileUtils() {
        Log.i(LogUtils.TAG, "new FileUtils: " + hashCode());
    }

    public void doSomething() {
        Log.i(LogUtils.TAG, "do sth with FileUtils " + hashCode());
    }
}
