package com.ddmeng.dagger2sample.network;

import java.io.IOException;

public class MyHttpUtil implements HttpUtil {
    @Override
    public HttpResponse get(String url) throws IOException {
        return new MyHttpResponse();
    }

    @Override
    public HttpResponse post(String url, String data) throws IOException {
        return new MyHttpResponse();
    }
}
