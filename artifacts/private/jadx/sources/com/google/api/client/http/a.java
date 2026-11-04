package com.google.api.client.http;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f115546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f115547b;

    protected a(String str) {
        this(str == null ? null : new s(str));
    }

    public static long d(m mVar) throws IOException {
        if (mVar.a()) {
            return com.google.api.client.util.t.a(mVar);
        }
        return -1L;
    }

    @Override // com.google.api.client.http.m
    public boolean a() {
        return true;
    }

    protected long b() throws IOException {
        return d(this);
    }

    @Override // com.google.api.client.http.m
    public String c() {
        s sVar = this.f115546a;
        if (sVar == null) {
            return null;
        }
        return sVar.a();
    }

    protected final Charset e() {
        s sVar = this.f115546a;
        return (sVar == null || sVar.f() == null) ? com.google.api.client.util.j.f116086a : this.f115546a.f();
    }

    public final s f() {
        return this.f115546a;
    }

    public a g(s sVar) {
        this.f115546a = sVar;
        return this;
    }

    @Override // com.google.api.client.http.m
    public long getLength() throws IOException {
        if (this.f115547b == -1) {
            this.f115547b = b();
        }
        return this.f115547b;
    }

    protected a(s sVar) {
        this.f115547b = -1L;
        this.f115546a = sVar;
    }
}
