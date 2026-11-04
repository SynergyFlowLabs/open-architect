package com.google.api.client.http;

import com.google.api.client.util.m0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public interface m extends m0 {
    boolean a();

    String c();

    long getLength() throws IOException;

    @Override // com.google.api.client.util.m0
    void writeTo(OutputStream outputStream) throws IOException;
}
