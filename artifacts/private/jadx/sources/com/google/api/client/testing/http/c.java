package com.google.api.client.testing.http;

import com.google.api.client.http.m;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class c implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f115980b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f115979a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f115981c = new byte[0];

    @Override // com.google.api.client.http.m
    public boolean a() {
        return true;
    }

    public final byte[] b() {
        return this.f115981c;
    }

    @Override // com.google.api.client.http.m
    public String c() {
        return this.f115980b;
    }

    public c d(byte[] bArr) {
        this.f115981c = (byte[]) h0.d(bArr);
        return this;
    }

    public c e(long j10) {
        h0.a(j10 >= -1);
        this.f115979a = j10;
        return this;
    }

    public c f(String str) {
        this.f115980b = str;
        return this;
    }

    @Override // com.google.api.client.http.m
    public long getLength() throws IOException {
        return this.f115979a;
    }

    @Override // com.google.api.client.http.m, com.google.api.client.util.m0
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f115981c);
        outputStream.flush();
    }
}
