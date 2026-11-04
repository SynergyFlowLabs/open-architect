package com.google.zxing.pdf417.decoder;

/* JADX INFO: loaded from: classes5.dex */
final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130759f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f130760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f130763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f130764e = -1;

    d(int i10, int i11, int i12, int i13) {
        this.f130760a = i10;
        this.f130761b = i11;
        this.f130762c = i12;
        this.f130763d = i13;
    }

    int a() {
        return this.f130762c;
    }

    int b() {
        return this.f130761b;
    }

    int c() {
        return this.f130764e;
    }

    int d() {
        return this.f130760a;
    }

    int e() {
        return this.f130763d;
    }

    int f() {
        return this.f130761b - this.f130760a;
    }

    boolean g() {
        return h(this.f130764e);
    }

    boolean h(int i10) {
        return i10 != -1 && this.f130762c == (i10 % 3) * 3;
    }

    void i(int i10) {
        this.f130764e = i10;
    }

    void j() {
        this.f130764e = ((this.f130763d / 30) * 3) + (this.f130762c / 3);
    }

    public String toString() {
        return this.f130764e + "|" + this.f130763d;
    }
}
