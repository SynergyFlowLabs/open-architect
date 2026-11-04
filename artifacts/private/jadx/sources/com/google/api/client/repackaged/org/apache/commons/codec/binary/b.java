package com.google.api.client.repackaged.org.apache.commons.codec.binary;

import s7.d;
import s7.f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements s7.b, s7.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f115957l = 76;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f115958m = 64;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f115959n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f115960o = 8192;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected static final int f115961p = 255;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected static final byte f115962q = 61;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final byte f115963a = 61;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f115964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f115965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f115966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f115967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected byte[] f115968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f115969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f115970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f115971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f115972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f115973k;

    protected b(int i10, int i11, int i12, int i13) {
        this.f115964b = i10;
        this.f115965c = i11;
        this.f115966d = (i12 <= 0 || i13 <= 0) ? 0 : (i12 / i11) * i11;
        this.f115967e = i13;
    }

    protected static boolean s(byte b10) {
        return b10 == 9 || b10 == 10 || b10 == 13 || b10 == 32;
    }

    private void u() {
        this.f115968f = null;
        this.f115969g = 0;
        this.f115970h = 0;
        this.f115972j = 0;
        this.f115973k = 0;
        this.f115971i = false;
    }

    private void v() {
        byte[] bArr = this.f115968f;
        if (bArr == null) {
            this.f115968f = new byte[m()];
            this.f115969g = 0;
            this.f115970h = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f115968f = bArr2;
        }
    }

    @Override // s7.e
    public Object a(Object obj) throws f {
        if (obj instanceof byte[]) {
            return e((byte[]) obj);
        }
        throw new f("Parameter supplied to Base-N encode is not a byte[]");
    }

    @Override // s7.c
    public Object b(Object obj) throws d {
        if (obj instanceof byte[]) {
            return d((byte[]) obj);
        }
        if (obj instanceof String) {
            return h((String) obj);
        }
        throw new d("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    int c() {
        if (this.f115968f != null) {
            return this.f115969g - this.f115970h;
        }
        return 0;
    }

    @Override // s7.a
    public byte[] d(byte[] bArr) {
        u();
        if (bArr != null && bArr.length != 0) {
            g(bArr, 0, bArr.length);
            g(bArr, 0, -1);
            int i10 = this.f115969g;
            byte[] bArr2 = new byte[i10];
            t(bArr2, 0, i10);
            return bArr2;
        }
        return bArr;
    }

    @Override // s7.b
    public byte[] e(byte[] bArr) {
        u();
        if (bArr != null && bArr.length != 0) {
            i(bArr, 0, bArr.length);
            i(bArr, 0, -1);
            int i10 = this.f115969g - this.f115970h;
            byte[] bArr2 = new byte[i10];
            t(bArr2, 0, i10);
            return bArr2;
        }
        return bArr;
    }

    protected boolean f(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b10 : bArr) {
            if (61 == b10 || p(b10)) {
                return true;
            }
        }
        return false;
    }

    abstract void g(byte[] bArr, int i10, int i11);

    public byte[] h(String str) {
        return d(c.g(str));
    }

    abstract void i(byte[] bArr, int i10, int i11);

    public String j(byte[] bArr) {
        return c.o(e(bArr));
    }

    public String k(byte[] bArr) {
        return c.o(e(bArr));
    }

    protected void l(int i10) {
        byte[] bArr = this.f115968f;
        if (bArr == null || bArr.length < this.f115969g + i10) {
            v();
        }
    }

    protected int m() {
        return 8192;
    }

    public long n(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f115964b;
        long j10 = ((long) (((length + i10) - 1) / i10)) * ((long) this.f115965c);
        int i11 = this.f115966d;
        return i11 > 0 ? j10 + ((((((long) i11) + j10) - 1) / ((long) i11)) * ((long) this.f115967e)) : j10;
    }

    boolean o() {
        return this.f115968f != null;
    }

    protected abstract boolean p(byte b10);

    public boolean q(String str) {
        return r(c.g(str), true);
    }

    public boolean r(byte[] bArr, boolean z10) {
        byte b10;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!p(bArr[i10]) && (!z10 || ((b10 = bArr[i10]) != 61 && !s(b10)))) {
                return false;
            }
        }
        return true;
    }

    int t(byte[] bArr, int i10, int i11) {
        if (this.f115968f == null) {
            return this.f115971i ? -1 : 0;
        }
        int iMin = Math.min(c(), i11);
        System.arraycopy(this.f115968f, this.f115970h, bArr, i10, iMin);
        int i12 = this.f115970h + iMin;
        this.f115970h = i12;
        if (i12 >= this.f115969g) {
            this.f115968f = null;
        }
        return iMin;
    }
}
