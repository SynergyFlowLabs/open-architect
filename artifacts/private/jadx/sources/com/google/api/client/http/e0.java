package com.google.api.client.http;

import com.google.api.client.util.m0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f115595a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f115596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f115597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m0 f115598d;

    public abstract void a(String str, String str2) throws IOException;

    public abstract f0 b() throws IOException;

    public final String c() {
        return this.f115596b;
    }

    public final long d() {
        return this.f115595a;
    }

    public final String e() {
        return this.f115597c;
    }

    public final m0 f() {
        return this.f115598d;
    }

    public final void g(String str) throws IOException {
        this.f115596b = str;
    }

    public final void h(long j10) throws IOException {
        this.f115595a = j10;
    }

    public final void i(String str) throws IOException {
        this.f115597c = str;
    }

    public final void j(m0 m0Var) throws IOException {
        this.f115598d = m0Var;
    }

    public void k(int i10, int i11) throws IOException {
    }
}
