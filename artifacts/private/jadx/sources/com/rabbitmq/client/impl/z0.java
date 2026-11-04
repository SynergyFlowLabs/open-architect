package com.rabbitmq.client.impl;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2 f265945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f265946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f265947c;

    public z0(j2 j2Var) {
        this.f265945a = j2Var;
        a();
    }

    private void a() {
        this.f265946b = 0;
        this.f265947c = 256;
    }

    public final boolean b() throws IOException {
        if (this.f265947c > 128) {
            this.f265946b = this.f265945a.h();
            this.f265947c = 1;
        }
        int i10 = this.f265946b;
        int i11 = this.f265947c;
        boolean z10 = (i10 & i11) != 0;
        this.f265947c = i11 << 1;
        return z10;
    }

    public final int c() throws IOException {
        a();
        return this.f265945a.d();
    }

    public final long d() throws IOException {
        a();
        return this.f265945a.e();
    }

    public final com.rabbitmq.client.k0 e() throws IOException {
        a();
        return this.f265945a.f();
    }

    public final int f() throws IOException {
        a();
        return this.f265945a.h();
    }

    public final int g() throws IOException {
        a();
        return this.f265945a.i();
    }

    public final String h() throws IOException {
        a();
        return this.f265945a.j();
    }

    public final Map<String, Object> i() throws IOException {
        a();
        return this.f265945a.l();
    }

    public final Date j() throws IOException {
        a();
        return this.f265945a.n();
    }
}
