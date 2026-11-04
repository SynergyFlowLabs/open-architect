package com.google.api.client.http;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class f implements m {
    @Override // com.google.api.client.http.m
    public boolean a() {
        return true;
    }

    @Override // com.google.api.client.http.m
    public String c() {
        return null;
    }

    @Override // com.google.api.client.http.m
    public long getLength() throws IOException {
        return 0L;
    }

    @Override // com.google.api.client.http.m, com.google.api.client.util.m0
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.flush();
    }
}
