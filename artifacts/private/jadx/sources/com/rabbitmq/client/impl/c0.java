package com.rabbitmq.client.impl;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f265135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f265136b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f265137c = 0;

    public c0(DataOutputStream dataOutputStream) {
        this.f265135a = new k2(dataOutputStream);
        int i10 = 2 ^ 0;
    }

    private void a(boolean z10) throws IOException {
        this.f265135a.l(z10 ? this.f265136b | 1 : this.f265136b);
        this.f265136b = 0;
        this.f265137c = 0;
    }

    public void b() throws IOException {
        a(false);
    }

    public void c(Integer num) throws IOException {
        this.f265135a.f(num.intValue());
    }

    public void d(Long l10) throws IOException {
        this.f265135a.g(l10.longValue());
    }

    public void e(com.rabbitmq.client.k0 k0Var) throws IOException {
        this.f265135a.h(k0Var);
    }

    public void f(String str) throws IOException {
        this.f265135a.i(str);
    }

    public void g(int i10) throws IOException {
        this.f265135a.k(i10);
    }

    public void h(Integer num) throws IOException {
        this.f265135a.k(num.intValue());
    }

    public void i(boolean z10) throws IOException {
        if (this.f265137c == 15) {
            a(true);
        }
        if (z10) {
            this.f265136b |= 1 << (15 - this.f265137c);
        }
        this.f265137c++;
    }

    public void j(Integer num) throws IOException {
        this.f265135a.l(num.intValue());
    }

    public void k(String str) throws IOException {
        this.f265135a.m(str);
    }

    public void l(Map<String, Object> map) throws IOException {
        this.f265135a.n(map);
    }

    public void m(Date date) throws IOException {
        this.f265135a.o(date);
    }
}
