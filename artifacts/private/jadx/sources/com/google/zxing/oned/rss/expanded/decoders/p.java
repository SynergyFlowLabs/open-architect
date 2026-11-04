package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes5.dex */
final class p extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f130712d = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130714c;

    p(int i10, int i11, int i12) throws com.google.zxing.h {
        super(i10);
        if (i11 < 0 || i11 > 10 || i12 < 0 || i12 > 10) {
            throw com.google.zxing.h.a();
        }
        this.f130713b = i11;
        this.f130714c = i12;
    }

    int b() {
        return this.f130713b;
    }

    int c() {
        return this.f130714c;
    }

    int d() {
        return (this.f130713b * 10) + this.f130714c;
    }

    boolean e() {
        return this.f130713b == 10 || this.f130714c == 10;
    }

    boolean f() {
        return this.f130713b == 10;
    }

    boolean g() {
        return this.f130714c == 10;
    }
}
