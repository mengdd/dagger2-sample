package com.ddmeng.dagger2sample.network;

import java.io.IOException;

public interface HttpUtil {
    HttpResponse get(String url) throws IOException;

    HttpResponse post(String url, String data) throws IOException;
}
