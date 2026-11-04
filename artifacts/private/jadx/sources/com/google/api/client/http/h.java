package com.google.api.client.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f115612c;

    public h(String str, File file) {
        super(str);
        this.f115612c = (File) com.google.api.client.util.h0.d(file);
    }

    @Override // com.google.api.client.http.m
    public boolean a() {
        return true;
    }

    @Override // com.google.api.client.http.b
    public InputStream d() throws FileNotFoundException {
        return new FileInputStream(this.f115612c);
    }

    public File g() {
        return this.f115612c;
    }

    @Override // com.google.api.client.http.m
    public long getLength() {
        return this.f115612c.length();
    }

    @Override // com.google.api.client.http.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public h e(boolean z10) {
        return (h) super.e(z10);
    }

    @Override // com.google.api.client.http.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public h f(String str) {
        return (h) super.f(str);
    }
}
