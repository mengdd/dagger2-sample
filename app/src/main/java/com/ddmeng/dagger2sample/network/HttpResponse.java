package com.ddmeng.dagger2sample.network;

import java.io.IOException;
import java.io.Reader;

public interface HttpResponse {
    boolean isSuccessful();

    int getCode();

    Reader getCharStream() throws IOException;
}
