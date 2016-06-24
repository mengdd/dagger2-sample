package com.ddmeng.dagger2sample.utils;

import javax.inject.Inject;

/**
 * This is a tool returned by Component method which has no arguments.
 * Every class could get it from Component.
 */
public class GlobalTools {

    public static final String TAG = "Dagger2";

    private LogUtils logUtils;
    private FileUtils fileUtils;

    // The @Inject annotation on Constructor will have two effects:
    // 1. inject the parameters
    // 2. add this class itself to dependencies graph
    @Inject
    public GlobalTools(LogUtils logUtils, FileUtils fileUtils) {
        this.logUtils = logUtils;
        this.fileUtils = fileUtils;

        this.logUtils.i(TAG, "GlobalTools: " + hashCode());
        this.fileUtils.doSomething();
    }

    public void doSth() {
        logUtils.i(TAG, "Global tools do sth");
    }
}
