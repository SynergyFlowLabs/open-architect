package com.fasterxml.jackson.core.util;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102773c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102774d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f102775e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f102776f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f102777g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f102778h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f102779i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f102780j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f102781k = {8000, 8000, 2000, 2000};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f102782l = {4000, 4000, 200, 200};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final byte[][] f102783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final char[][] f102784b;

    public a() {
        this(4, 4);
    }

    public final byte[] a(int i10) {
        return b(i10, 0);
    }

    public byte[] b(int i10, int i11) {
        int iF = f(i10);
        if (i11 < iF) {
            i11 = iF;
        }
        byte[][] bArr = this.f102783a;
        byte[] bArr2 = bArr[i10];
        if (bArr2 == null || bArr2.length < i11) {
            return e(i11);
        }
        bArr[i10] = null;
        return bArr2;
    }

    public final char[] c(int i10) {
        return d(i10, 0);
    }

    public char[] d(int i10, int i11) {
        int iH = h(i10);
        if (i11 < iH) {
            i11 = iH;
        }
        char[][] cArr = this.f102784b;
        char[] cArr2 = cArr[i10];
        if (cArr2 != null && cArr2.length >= i11) {
            cArr[i10] = null;
            return cArr2;
        }
        return g(i11);
    }

    protected byte[] e(int i10) {
        return new byte[i10];
    }

    protected int f(int i10) {
        return f102781k[i10];
    }

    protected char[] g(int i10) {
        return new char[i10];
    }

    protected int h(int i10) {
        return f102782l[i10];
    }

    public void i(int i10, byte[] bArr) {
        this.f102783a[i10] = bArr;
    }

    public void j(int i10, char[] cArr) {
        this.f102784b[i10] = cArr;
    }

    protected a(int i10, int i11) {
        this.f102783a = new byte[i10][];
        this.f102784b = new char[i11][];
    }
}
