package com.google.api.client.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
@Deprecated
public class g implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f115599c = 500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double f115600d = 0.5d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f115601e = 1.5d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f115602f = 60000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f115603g = 900000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.api.client.util.q f115604b;

    @com.google.api.client.util.f
    @Deprecated
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.api.client.util.q.a f115605a = new com.google.api.client.util.q.a();

        protected a() {
        }

        public g a() {
            return new g(this);
        }

        public final int b() {
            return this.f115605a.b();
        }

        public final int c() {
            return this.f115605a.c();
        }

        public final int d() {
            return this.f115605a.d();
        }

        public final double e() {
            return this.f115605a.e();
        }

        public final com.google.api.client.util.c0 f() {
            return this.f115605a.f();
        }

        public final double g() {
            return this.f115605a.g();
        }

        public a h(int i10) {
            this.f115605a.h(i10);
            return this;
        }

        public a i(int i10) {
            this.f115605a.i(i10);
            return this;
        }

        public a j(int i10) {
            this.f115605a.j(i10);
            return this;
        }

        public a k(double d10) {
            this.f115605a.k(d10);
            return this;
        }

        public a l(com.google.api.client.util.c0 c0Var) {
            this.f115605a.l(c0Var);
            return this;
        }

        public a m(double d10) {
            this.f115605a.m(d10);
            return this;
        }
    }

    public g() {
        this(new a());
    }

    public static a c() {
        return new a();
    }

    @Override // com.google.api.client.http.c
    public long a() throws IOException {
        return this.f115604b.a();
    }

    @Override // com.google.api.client.http.c
    public boolean b(int i10) {
        if (i10 == 500 || i10 == 503) {
            return true;
        }
        int i11 = 7 >> 0;
        return false;
    }

    public final int d() {
        return this.f115604b.b();
    }

    public final long e() {
        return this.f115604b.c();
    }

    public final int f() {
        return this.f115604b.d();
    }

    public final int g() {
        return this.f115604b.e();
    }

    public final int h() {
        return this.f115604b.f();
    }

    public final double i() {
        return this.f115604b.g();
    }

    public final double j() {
        return this.f115604b.i();
    }

    @Override // com.google.api.client.http.c
    public final void reset() {
        this.f115604b.reset();
    }

    protected g(a aVar) {
        this.f115604b = aVar.f115605a.a();
    }
}
