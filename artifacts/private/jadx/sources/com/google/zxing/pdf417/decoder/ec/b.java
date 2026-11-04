package com.google.zxing.pdf417.decoder.ec;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f130800f = new b(aa.a.f563a, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f130801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f130802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f130803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f130804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f130805e;

    private b(int i10, int i11) {
        this.f130805e = i10;
        this.f130801a = new int[i10];
        this.f130802b = new int[i10];
        int i12 = 4 ^ 1;
        int i13 = 1;
        for (int i14 = 0; i14 < i10; i14++) {
            this.f130801a[i14] = i13;
            i13 = (i13 * i11) % i10;
        }
        for (int i15 = 0; i15 < i10 - 1; i15++) {
            this.f130802b[this.f130801a[i15]] = i15;
        }
        this.f130803c = new c(this, new int[]{0});
        this.f130804d = new c(this, new int[]{1});
    }

    int a(int i10, int i11) {
        return (i10 + i11) % this.f130805e;
    }

    c b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f130803c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new c(this, iArr);
    }

    int c(int i10) {
        return this.f130801a[i10];
    }

    c d() {
        return this.f130804d;
    }

    int e() {
        return this.f130805e;
    }

    c f() {
        return this.f130803c;
    }

    int g(int i10) {
        if (i10 != 0) {
            return this.f130801a[(this.f130805e - this.f130802b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    int h(int i10) {
        if (i10 != 0) {
            return this.f130802b[i10];
        }
        throw new IllegalArgumentException();
    }

    int i(int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            int[] iArr = this.f130801a;
            int[] iArr2 = this.f130802b;
            return iArr[(iArr2[i10] + iArr2[i11]) % (this.f130805e - 1)];
        }
        return 0;
    }

    int j(int i10, int i11) {
        int i12 = this.f130805e;
        return ((i10 + i12) - i11) % i12;
    }
}
