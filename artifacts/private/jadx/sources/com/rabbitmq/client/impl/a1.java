package com.rabbitmq.client.impl;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f265122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f265123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f265124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f265125d;

    public a1(k2 k2Var) {
        this.f265122a = k2Var;
        c();
    }

    private final void a() throws IOException {
        if (this.f265123b) {
            this.f265122a.j(this.f265124c);
            c();
        }
    }

    private void c() {
        this.f265123b = false;
        this.f265124c = (byte) 0;
        this.f265125d = 1;
    }

    public void b() throws IOException {
        a();
        this.f265122a.b();
    }

    public final void d(boolean z10) throws IOException {
        if (this.f265125d > 128) {
            a();
        }
        if (z10) {
            this.f265124c = (byte) (this.f265124c | this.f265125d);
        }
        this.f265125d <<= 1;
        this.f265123b = true;
    }

    public final void e(int i10) throws IOException {
        a();
        this.f265122a.f(i10);
    }

    public final void f(long j10) throws IOException {
        a();
        this.f265122a.g(j10);
    }

    public final void g(com.rabbitmq.client.k0 k0Var) throws IOException {
        a();
        this.f265122a.h(k0Var);
    }

    public final void h(String str) throws IOException {
        a();
        this.f265122a.i(str);
    }

    public final void i(byte b10) throws IOException {
        a();
        this.f265122a.j(b10);
    }

    public final void j(int i10) throws IOException {
        a();
        this.f265122a.k(i10);
    }

    public final void k(int i10) throws IOException {
        a();
        this.f265122a.l(i10);
    }

    public final void l(String str) throws IOException {
        a();
        this.f265122a.m(str);
    }

    public final void m(Map<String, Object> map) throws IOException {
        a();
        this.f265122a.n(map);
    }

    public final void n(Date date) throws IOException {
        a();
        this.f265122a.o(date);
    }
}
