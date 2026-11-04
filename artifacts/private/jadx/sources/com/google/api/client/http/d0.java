package com.google.api.client.http;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f115589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f115590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InputStream f115591e;

    public d0(String str, InputStream inputStream) {
        super(str);
        this.f115589c = -1L;
        this.f115591e = (InputStream) com.google.api.client.util.h0.d(inputStream);
    }

    @Override // com.google.api.client.http.m
    public boolean a() {
        return this.f115590d;
    }

    @Override // com.google.api.client.http.b
    public InputStream d() {
        return this.f115591e;
    }

    @Override // com.google.api.client.http.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d0 e(boolean z10) {
        return (d0) super.e(z10);
    }

    @Override // com.google.api.client.http.m
    public long getLength() {
        return this.f115589c;
    }

    public d0 h(long j10) {
        this.f115589c = j10;
        return this;
    }

    public d0 i(boolean z10) {
        this.f115590d = z10;
        return this;
    }

    @Override // com.google.api.client.http.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public d0 f(String str) {
        return (d0) super.f(str);
    }
}
