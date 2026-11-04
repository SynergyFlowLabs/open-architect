package com.google.vr.sdk.deps;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f129596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f129597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f129598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f129599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f129600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f129601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f129602g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f129604i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private x5 f129606k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f129603h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f129605j = 64;

    private t6(byte[] bArr, int i10, int i11) {
        this.f129596a = bArr;
        this.f129597b = i10;
        int i12 = i11 + i10;
        this.f129599d = i12;
        this.f129598c = i12;
        this.f129601f = i10;
    }

    public static t6 c(byte[] bArr, int i10, int i11) {
        return new t6(bArr, i10, i11);
    }

    private final void q(int i10) throws IOException {
        if (i10 < 0) {
            throw b7.b();
        }
        int i11 = this.f129601f;
        int i12 = i11 + i10;
        int i13 = this.f129603h;
        if (i12 > i13) {
            q(i13 - i11);
            throw b7.a();
        }
        if (i10 > this.f129599d - i11) {
            throw b7.a();
        }
        this.f129601f = i11 + i10;
    }

    private final x5 u() throws IOException {
        if (this.f129606k == null) {
            this.f129606k = x5.n(this.f129596a, this.f129597b, this.f129598c);
        }
        int iS = this.f129606k.S();
        int i10 = this.f129601f - this.f129597b;
        if (iS > i10) {
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", Integer.valueOf(iS), Integer.valueOf(i10)));
        }
        this.f129606k.x(i10 - iS);
        this.f129606k.r(this.f129605j - this.f129604i);
        return this.f129606k;
    }

    private final void v() {
        int i10 = this.f129599d + this.f129600e;
        this.f129599d = i10;
        int i11 = this.f129603h;
        if (i10 <= i11) {
            this.f129600e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f129600e = i12;
        this.f129599d = i10 - i12;
    }

    private final byte w() throws IOException {
        int i10 = this.f129601f;
        if (i10 == this.f129599d) {
            throw b7.a();
        }
        byte[] bArr = this.f129596a;
        this.f129601f = i10 + 1;
        return bArr[i10];
    }

    public final int a() throws IOException {
        if (this.f129601f == this.f129599d) {
            this.f129602g = 0;
            return 0;
        }
        int iN = n();
        this.f129602g = iN;
        if (iN != 0) {
            return iN;
        }
        throw new b7("Protocol message contained an invalid tag (zero).");
    }

    public final <T extends i3<T, ?>> T b(c5<T> c5Var) throws IOException {
        try {
            T t10 = (T) u().l(c5Var, x2.c());
            i(this.f129602g);
            return t10;
        } catch (v3 e10) {
            throw new b7("", e10);
        }
    }

    public final void d(int i10) throws b7 {
        if (this.f129602g != i10) {
            throw new b7("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void e(c7 c7Var) throws IOException {
        int iN = n();
        if (this.f129604i >= this.f129605j) {
            throw b7.d();
        }
        int iJ = j(iN);
        this.f129604i++;
        c7Var.e(this);
        d(0);
        this.f129604i--;
        m(iJ);
    }

    public final byte[] f(int i10, int i11) {
        if (i11 == 0) {
            return e7.f129363d;
        }
        byte[] bArr = new byte[i11];
        int i12 = 4 << 0;
        System.arraycopy(this.f129596a, this.f129597b + i10, bArr, 0, i11);
        return bArr;
    }

    public final int g() throws IOException {
        return n();
    }

    final void h(int i10, int i11) {
        int i12 = this.f129601f;
        int i13 = this.f129597b;
        if (i10 > i12 - i13) {
            int i14 = this.f129601f - this.f129597b;
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Position ");
            sb2.append(i10);
            sb2.append(" is beyond current ");
            sb2.append(i14);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 >= 0) {
            this.f129601f = i13 + i10;
            this.f129602g = i11;
        } else {
            StringBuilder sb3 = new StringBuilder(24);
            sb3.append("Bad position ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public final boolean i(int i10) throws IOException {
        int iA;
        int i11 = i10 & 7;
        if (i11 == 0) {
            n();
            return true;
        }
        if (i11 == 1) {
            w();
            w();
            w();
            w();
            w();
            w();
            w();
            w();
            return true;
        }
        if (i11 == 2) {
            q(n());
            return true;
        }
        int i12 = 1 & 3;
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw new b7("Protocol message tag had invalid wire type.");
            }
            r();
            return true;
        }
        do {
            iA = a();
            if (iA == 0) {
                break;
            }
        } while (i(iA));
        d(((i10 >>> 3) << 3) | 4);
        return true;
    }

    public final int j(int i10) throws b7 {
        if (i10 < 0) {
            throw b7.b();
        }
        int i11 = i10 + this.f129601f;
        int i12 = this.f129603h;
        if (i11 > i12) {
            throw b7.a();
        }
        this.f129603h = i11;
        v();
        return i12;
    }

    public final boolean k() throws IOException {
        return n() != 0;
    }

    public final String l() throws IOException {
        int iN = n();
        if (iN < 0) {
            throw b7.b();
        }
        int i10 = this.f129599d;
        int i11 = this.f129601f;
        if (iN > i10 - i11) {
            throw b7.a();
        }
        String str = new String(this.f129596a, i11, iN, a7.f127703a);
        this.f129601f += iN;
        return str;
    }

    public final void m(int i10) {
        this.f129603h = i10;
        v();
    }

    public final int n() throws IOException {
        int i10;
        byte bW = w();
        if (bW >= 0) {
            return bW;
        }
        int i11 = bW & 127;
        byte bW2 = w();
        if (bW2 >= 0) {
            i10 = bW2 << 7;
        } else {
            i11 |= (bW2 & 127) << 7;
            byte bW3 = w();
            if (bW3 >= 0) {
                i10 = bW3 << com.google.common.base.c.f116463p;
            } else {
                i11 |= (bW3 & 127) << 14;
                byte bW4 = w();
                if (bW4 < 0) {
                    int i12 = i11 | ((bW4 & 127) << 21);
                    byte bW5 = w();
                    int i13 = i12 | (bW5 << com.google.common.base.c.F);
                    if (bW5 < 0) {
                        for (int i14 = 0; i14 < 5; i14++) {
                            if (w() < 0) {
                            }
                        }
                        throw b7.c();
                    }
                    return i13;
                }
                i10 = bW4 << com.google.common.base.c.f116472y;
            }
        }
        return i10 | i11;
    }

    public final void o(int i10) {
        h(i10, this.f129602g);
    }

    public final long p() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bW = w();
            j10 |= ((long) (bW & 127)) << i10;
            if ((bW & 128) == 0) {
                return j10;
            }
        }
        throw b7.c();
    }

    public final int r() throws IOException {
        byte bW = w();
        byte bW2 = w();
        byte bW3 = w();
        return ((w() & 255) << 24) | (bW & 255) | ((bW2 & 255) << 8) | ((bW3 & 255) << 16);
    }

    public final int s() {
        int i10 = this.f129603h;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - this.f129601f;
    }

    public final int t() {
        return this.f129601f - this.f129597b;
    }
}
