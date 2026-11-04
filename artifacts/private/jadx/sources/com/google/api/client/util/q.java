package com.google.api.client.util;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class q implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f116130l = 500;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final double f116131m = 0.5d;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final double f116132n = 1.5d;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f116133o = 60000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f116134p = 900000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f116135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f116136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f116137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f116138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f116139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f116140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f116141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c0 f116142k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f116143a = 500;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f116144b = 0.5d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f116145c = 1.5d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f116146d = 60000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116147e = 900000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        c0 f116148f = c0.f116050a;

        public q a() {
            return new q(this);
        }

        public final int b() {
            return this.f116143a;
        }

        public final int c() {
            return this.f116147e;
        }

        public final int d() {
            return this.f116146d;
        }

        public final double e() {
            return this.f116145c;
        }

        public final c0 f() {
            return this.f116148f;
        }

        public final double g() {
            return this.f116144b;
        }

        public a h(int i10) {
            this.f116143a = i10;
            return this;
        }

        public a i(int i10) {
            this.f116147e = i10;
            return this;
        }

        public a j(int i10) {
            this.f116146d = i10;
            return this;
        }

        public a k(double d10) {
            this.f116145c = d10;
            return this;
        }

        public a l(c0 c0Var) {
            this.f116148f = (c0) h0.d(c0Var);
            return this;
        }

        public a m(double d10) {
            this.f116144b = d10;
            return this;
        }
    }

    public q() {
        this(new a());
    }

    static int h(double d10, double d11, int i10) {
        double d12 = i10;
        double d13 = d10 * d12;
        double d14 = d12 - d13;
        return (int) (d14 + (d11 * (((d12 + d13) - d14) + 1.0d)));
    }

    private void j() {
        int i10 = this.f116135d;
        double d10 = i10;
        int i11 = this.f116139h;
        double d11 = this.f116138g;
        if (d10 >= ((double) i11) / d11) {
            this.f116135d = i11;
        } else {
            this.f116135d = (int) (((double) i10) * d11);
        }
    }

    @Override // com.google.api.client.util.c
    public long a() throws IOException {
        if (c() > this.f116141j) {
            return -1L;
        }
        int iH = h(this.f116137f, Math.random(), this.f116135d);
        j();
        return iH;
    }

    public final int b() {
        return this.f116135d;
    }

    public final long c() {
        return (this.f116142k.a() - this.f116140i) / 1000000;
    }

    public final int d() {
        return this.f116136e;
    }

    public final int e() {
        return this.f116141j;
    }

    public final int f() {
        return this.f116139h;
    }

    public final double g() {
        return this.f116138g;
    }

    public final double i() {
        return this.f116137f;
    }

    @Override // com.google.api.client.util.c
    public final void reset() {
        this.f116135d = this.f116136e;
        this.f116140i = this.f116142k.a();
    }

    protected q(a aVar) {
        int i10 = aVar.f116143a;
        this.f116136e = i10;
        double d10 = aVar.f116144b;
        this.f116137f = d10;
        double d11 = aVar.f116145c;
        this.f116138g = d11;
        int i11 = aVar.f116146d;
        this.f116139h = i11;
        int i12 = aVar.f116147e;
        this.f116141j = i12;
        this.f116142k = aVar.f116148f;
        h0.a(i10 > 0);
        h0.a(0.0d <= d10 && d10 < 1.0d);
        h0.a(d11 >= 1.0d);
        h0.a(i11 >= i10);
        h0.a(i12 > 0);
        reset();
    }
}
