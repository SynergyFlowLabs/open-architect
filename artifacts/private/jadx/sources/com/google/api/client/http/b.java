package com.google.api.client.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f115582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f115583b = true;

    public b(String str) {
        f(str);
    }

    public final boolean b() {
        return this.f115583b;
    }

    @Override // com.google.api.client.http.m
    public String c() {
        return this.f115582a;
    }

    public abstract InputStream d() throws IOException;

    public b e(boolean z10) {
        this.f115583b = z10;
        return this;
    }

    public b f(String str) {
        this.f115582a = str;
        return this;
    }

    @Override // com.google.api.client.http.m, com.google.api.client.util.m0
    public void writeTo(OutputStream outputStream) throws IOException {
        com.google.api.client.util.t.c(d(), outputStream, this.f115583b);
        outputStream.flush();
    }
}
