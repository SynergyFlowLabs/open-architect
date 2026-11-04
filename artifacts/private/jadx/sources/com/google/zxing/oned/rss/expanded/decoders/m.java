package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes5.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f130701a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f130702b = a.NUMERIC;

    private enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    m() {
    }

    int a() {
        return this.f130701a;
    }

    void b(int i10) {
        this.f130701a += i10;
    }

    boolean c() {
        return this.f130702b == a.ALPHA;
    }

    boolean d() {
        return this.f130702b == a.ISO_IEC_646;
    }

    boolean e() {
        return this.f130702b == a.NUMERIC;
    }

    void f() {
        this.f130702b = a.ALPHA;
    }

    void g() {
        this.f130702b = a.ISO_IEC_646;
    }

    void h() {
        this.f130702b = a.NUMERIC;
    }

    void i(int i10) {
        this.f130701a = i10;
    }
}
