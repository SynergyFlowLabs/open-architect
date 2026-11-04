package org.apache.commons.codec.binary;

import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g implements nk.b, nk.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f335185g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f335186h = 76;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f335187i = 64;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f335188j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f335189k = 8192;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final int f335190l = 255;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final byte f335191m = 61;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final byte f335192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final byte f335193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f335194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f335195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f335196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f335197f;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f335198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f335199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte[] f335200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f335201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f335202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f335203f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f335204g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f335205h;

        a() {
        }

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.f335200c), Integer.valueOf(this.f335204g), Boolean.valueOf(this.f335203f), Integer.valueOf(this.f335198a), Long.valueOf(this.f335199b), Integer.valueOf(this.f335205h), Integer.valueOf(this.f335201d), Integer.valueOf(this.f335202e));
        }
    }

    protected g(int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13, (byte) 61);
    }

    protected static boolean v(byte b10) {
        return b10 == 9 || b10 == 10 || b10 == 13 || b10 == 32;
    }

    private byte[] x(a aVar) {
        byte[] bArr = aVar.f335200c;
        if (bArr == null) {
            aVar.f335200c = new byte[p()];
            aVar.f335201d = 0;
            aVar.f335202e = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            aVar.f335200c = bArr2;
        }
        return aVar.f335200c;
    }

    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        if (obj instanceof byte[]) {
            return e((byte[]) obj);
        }
        throw new nk.h("Parameter supplied to Base-N encode is not a byte[]");
    }

    @Override // nk.e
    public Object b(Object obj) throws nk.f {
        if (obj instanceof byte[]) {
            return d((byte[]) obj);
        }
        if (obj instanceof String) {
            return j((String) obj);
        }
        throw new nk.f("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    @Override // nk.a
    public byte[] d(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            a aVar = new a();
            int i10 = 6 | 0;
            i(bArr, 0, bArr.length, aVar);
            i(bArr, 0, -1, aVar);
            int i11 = aVar.f335201d;
            byte[] bArr2 = new byte[i11];
            w(bArr2, 0, i11, aVar);
            return bArr2;
        }
        return bArr;
    }

    @Override // nk.b
    public byte[] e(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return l(bArr, 0, bArr.length);
        }
        return bArr;
    }

    int g(a aVar) {
        if (aVar.f335200c != null) {
            return aVar.f335201d - aVar.f335202e;
        }
        return 0;
    }

    protected boolean h(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b10 : bArr) {
            if (this.f335193b == b10 || s(b10)) {
                return true;
            }
        }
        return false;
    }

    abstract void i(byte[] bArr, int i10, int i11, a aVar);

    public byte[] j(String str) {
        return d(m.k(str));
    }

    abstract void k(byte[] bArr, int i10, int i11, a aVar);

    public byte[] l(byte[] bArr, int i10, int i11) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        k(bArr, i10, i11, aVar);
        k(bArr, i10, -1, aVar);
        int i12 = aVar.f335201d - aVar.f335202e;
        byte[] bArr2 = new byte[i12];
        w(bArr2, 0, i12, aVar);
        return bArr2;
    }

    public String m(byte[] bArr) {
        return m.t(e(bArr));
    }

    public String n(byte[] bArr) {
        return m.t(e(bArr));
    }

    protected byte[] o(int i10, a aVar) {
        byte[] bArr = aVar.f335200c;
        return (bArr == null || bArr.length < aVar.f335201d + i10) ? x(aVar) : bArr;
    }

    protected int p() {
        return 8192;
    }

    public long q(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f335194c;
        long j10 = ((long) (((length + i10) - 1) / i10)) * ((long) this.f335195d);
        int i11 = this.f335196e;
        return i11 > 0 ? j10 + ((((((long) i11) + j10) - 1) / ((long) i11)) * ((long) this.f335197f)) : j10;
    }

    boolean r(a aVar) {
        return aVar.f335200c != null;
    }

    protected abstract boolean s(byte b10);

    public boolean t(String str) {
        return u(m.k(str), true);
    }

    public boolean u(byte[] bArr, boolean z10) {
        for (byte b10 : bArr) {
            if (!s(b10) && (!z10 || (b10 != this.f335193b && !v(b10)))) {
                return false;
            }
        }
        return true;
    }

    int w(byte[] bArr, int i10, int i11, a aVar) {
        if (aVar.f335200c == null) {
            return aVar.f335203f ? -1 : 0;
        }
        int iMin = Math.min(g(aVar), i11);
        System.arraycopy(aVar.f335200c, aVar.f335202e, bArr, i10, iMin);
        int i12 = aVar.f335202e + iMin;
        aVar.f335202e = i12;
        if (i12 >= aVar.f335201d) {
            int i13 = 6 >> 0;
            aVar.f335200c = null;
        }
        return iMin;
    }

    protected g(int i10, int i11, int i12, int i13, byte b10) {
        this.f335192a = (byte) 61;
        this.f335194c = i10;
        this.f335195d = i11;
        this.f335196e = (i12 <= 0 || i13 <= 0) ? 0 : (i12 / i11) * i11;
        this.f335197f = i13;
        this.f335193b = b10;
    }
}
