package com.google.zxing.common.reedsolomon;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f130353h = new a(4201, 4096, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f130354i = new a(androidx.media3.exoplayer.analytics.b.f62824m0, 1024, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f130355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f130356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f130357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f130358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f130359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f130360o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f130361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f130362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f130363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f130364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f130365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f130366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f130367g;

    static {
        a aVar = new a(67, 64, 1);
        f130355j = aVar;
        f130356k = new a(19, 16, 1);
        f130357l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f130358m = aVar2;
        f130359n = aVar2;
        f130360o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f130366f = i10;
        this.f130365e = i11;
        this.f130367g = i12;
        this.f130361a = new int[i11];
        this.f130362b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f130361a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f130362b[this.f130361a[i15]] = i15;
        }
        this.f130363c = new b(this, new int[]{0});
        this.f130364d = new b(this, new int[]{1});
    }

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f130363c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    int c(int i10) {
        return this.f130361a[i10];
    }

    public int d() {
        return this.f130367g;
    }

    b e() {
        return this.f130364d;
    }

    public int f() {
        return this.f130365e;
    }

    b g() {
        return this.f130363c;
    }

    int h(int i10) {
        if (i10 != 0) {
            return this.f130361a[(this.f130365e - this.f130362b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    int i(int i10) {
        if (i10 != 0) {
            return this.f130362b[i10];
        }
        throw new IllegalArgumentException();
    }

    int j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f130361a;
        int[] iArr2 = this.f130362b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f130365e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f130366f) + AbstractJsonLexerKt.COMMA + this.f130365e + ')';
    }
}
