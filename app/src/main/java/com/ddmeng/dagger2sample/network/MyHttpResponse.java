package com.ddmeng.dagger2sample.network;

import android.util.Log;

import com.ddmeng.dagger2sample.utils.LogUtils;

import java.io.IOException;
import java.io.Reader;

public class MyHttpResponse implements HttpResponse {

    public MyHttpResponse() {
        Log.i(LogUtils.TAG, "MyHttpResponse constructor");
    }

    @Override
    public boolean isSuccessful() {
        return false;
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public Reader getCharStream() throws IOException {
        return null;
    }
}
