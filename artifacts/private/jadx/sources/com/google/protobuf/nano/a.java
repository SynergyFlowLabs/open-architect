package com.google.protobuf.nano;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f126136k = 64;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f126137l = 67108864;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f126138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f126139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f126140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f126141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f126142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f126143f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f126145h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f126144g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f126146i = 64;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f126147j = 67108864;

    private a(byte[] bArr, int i10, int i11) {
        this.f126138a = bArr;
        this.f126139b = i10;
        this.f126140c = i11 + i10;
        this.f126142e = i10;
    }

    private void L() {
        int i10 = this.f126140c + this.f126141d;
        this.f126140c = i10;
        int i11 = this.f126144g;
        if (i10 <= i11) {
            this.f126141d = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f126141d = i12;
        this.f126140c = i10 - i12;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static a h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static a i(byte[] bArr, int i10, int i11) {
        return new a(bArr, i10, i11);
    }

    public long A() throws IOException {
        byte bX = x();
        return ((((long) x()) & 255) << 8) | (((long) bX) & 255) | ((((long) x()) & 255) << 16) | ((((long) x()) & 255) << 24) | ((((long) x()) & 255) << 32) | ((((long) x()) & 255) << 40) | ((((long) x()) & 255) << 48) | ((((long) x()) & 255) << 56);
    }

    public int B() throws IOException {
        int i10;
        byte bX = x();
        if (bX >= 0) {
            return bX;
        }
        int i11 = bX & 127;
        byte bX2 = x();
        if (bX2 >= 0) {
            i10 = bX2 << 7;
        } else {
            i11 |= (bX2 & 127) << 7;
            byte bX3 = x();
            if (bX3 >= 0) {
                i10 = bX3 << com.google.common.base.c.f116463p;
            } else {
                i11 |= (bX3 & 127) << 14;
                byte bX4 = x();
                if (bX4 < 0) {
                    int i12 = i11 | ((bX4 & 127) << 21);
                    byte bX5 = x();
                    int i13 = i12 | (bX5 << com.google.common.base.c.F);
                    if (bX5 < 0) {
                        for (int i14 = 0; i14 < 5; i14++) {
                            if (x() < 0) {
                            }
                        }
                        throw h.d();
                    }
                    return i13;
                }
                i10 = bX4 << com.google.common.base.c.f116472y;
            }
        }
        return i10 | i11;
    }

    public long C() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bX = x();
            j10 |= ((long) (bX & 127)) << i10;
            if ((bX & 128) == 0) {
                return j10;
            }
        }
        throw h.d();
    }

    public int D() throws IOException {
        return z();
    }

    public long E() throws IOException {
        return A();
    }

    public int F() throws IOException {
        return b(B());
    }

    public long G() throws IOException {
        return c(C());
    }

    public String H() throws IOException {
        int iB = B();
        int i10 = this.f126140c;
        int i11 = this.f126142e;
        if (iB > i10 - i11 || iB <= 0) {
            return new String(y(iB), g.f126204s);
        }
        String str = new String(this.f126138a, i11, iB, g.f126204s);
        this.f126142e += iB;
        return str;
    }

    public int I() throws IOException {
        if (g()) {
            this.f126143f = 0;
            return 0;
        }
        int iB = B();
        this.f126143f = iB;
        if (iB != 0) {
            return iB;
        }
        throw h.b();
    }

    public int J() throws IOException {
        return B();
    }

    public long K() throws IOException {
        return C();
    }

    public void M() {
    }

    public void N(int i10) {
        int i11 = this.f126142e;
        int i12 = this.f126139b;
        if (i10 > i11 - i12) {
            throw new IllegalArgumentException("Position " + i10 + " is beyond current " + (this.f126142e - this.f126139b));
        }
        if (i10 >= 0) {
            this.f126142e = i12 + i10;
            return;
        }
        throw new IllegalArgumentException("Bad position " + i10);
    }

    public int O(int i10) {
        if (i10 >= 0) {
            int i11 = this.f126146i;
            this.f126146i = i10;
            return i11;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i10);
    }

    public int P(int i10) {
        if (i10 >= 0) {
            int i11 = this.f126147j;
            this.f126147j = i10;
            return i11;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i10);
    }

    public boolean Q(int i10) throws IOException {
        int iC = m.c(i10);
        if (iC == 0) {
            t();
            return true;
        }
        if (iC == 1) {
            A();
            return true;
        }
        if (iC == 2) {
            S(B());
            return true;
        }
        if (iC == 3) {
            R();
            a(m.d(m.b(i10), 4));
            return true;
        }
        if (iC == 4) {
            return false;
        }
        if (iC != 5) {
            throw h.c();
        }
        z();
        return true;
    }

    public void R() throws IOException {
        int I;
        do {
            I = I();
            if (I == 0) {
                return;
            }
        } while (Q(I));
    }

    public void S(int i10) throws IOException {
        if (i10 < 0) {
            throw h.e();
        }
        int i11 = this.f126142e;
        int i12 = i11 + i10;
        int i13 = this.f126144g;
        if (i12 > i13) {
            S(i13 - i11);
            throw h.h();
        }
        if (i10 > this.f126140c - i11) {
            throw h.h();
        }
        this.f126142e = i11 + i10;
    }

    public void a(int i10) throws h {
        if (this.f126143f != i10) {
            throw h.a();
        }
    }

    public int d() {
        int i10 = this.f126144g;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - this.f126142e;
    }

    public byte[] e(int i10, int i11) {
        if (i11 == 0) {
            return m.f126229p;
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f126138a, this.f126139b + i10, bArr, 0, i11);
        return bArr;
    }

    public int f() {
        return this.f126142e - this.f126139b;
    }

    public boolean g() {
        return this.f126142e == this.f126140c;
    }

    public void j(int i10) {
        this.f126144g = i10;
        L();
    }

    public int k(int i10) throws h {
        if (i10 < 0) {
            throw h.e();
        }
        int i11 = i10 + this.f126142e;
        int i12 = this.f126144g;
        if (i11 > i12) {
            throw h.h();
        }
        this.f126144g = i11;
        L();
        return i12;
    }

    public boolean l() throws IOException {
        return B() != 0;
    }

    public byte[] m() throws IOException {
        int iB = B();
        int i10 = this.f126140c;
        int i11 = this.f126142e;
        if (iB > i10 - i11 || iB <= 0) {
            return iB == 0 ? m.f126229p : y(iB);
        }
        byte[] bArr = new byte[iB];
        int i12 = 7 & 0;
        System.arraycopy(this.f126138a, i11, bArr, 0, iB);
        this.f126142e += iB;
        return bArr;
    }

    public double n() throws IOException {
        return Double.longBitsToDouble(A());
    }

    public int o() throws IOException {
        return B();
    }

    public int p() throws IOException {
        return z();
    }

    public long q() throws IOException {
        return A();
    }

    public float r() throws IOException {
        return Float.intBitsToFloat(z());
    }

    public void s(j jVar, int i10) throws IOException {
        int i11 = this.f126145h;
        if (i11 >= this.f126146i) {
            throw h.f();
        }
        this.f126145h = i11 + 1;
        jVar.e(this);
        int i12 = 2 & 4;
        a(m.d(i10, 4));
        this.f126145h--;
    }

    public int t() throws IOException {
        return B();
    }

    public long u() throws IOException {
        return C();
    }

    public void v(j jVar) throws IOException {
        int iB = B();
        if (this.f126145h >= this.f126146i) {
            throw h.f();
        }
        int iK = k(iB);
        this.f126145h++;
        jVar.e(this);
        a(0);
        this.f126145h--;
        j(iK);
    }

    Object w(int i10) throws IOException {
        switch (i10) {
            case 1:
                return Double.valueOf(n());
            case 2:
                return Float.valueOf(r());
            case 3:
                return Long.valueOf(u());
            case 4:
                return Long.valueOf(K());
            case 5:
                return Integer.valueOf(t());
            case 6:
                return Long.valueOf(q());
            case 7:
                return Integer.valueOf(p());
            case 8:
                return Boolean.valueOf(l());
            case 9:
                return H();
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException("Unknown type " + i10);
            case 12:
                return m();
            case 13:
                return Integer.valueOf(J());
            case 14:
                return Integer.valueOf(o());
            case 15:
                return Integer.valueOf(D());
            case 16:
                return Long.valueOf(E());
            case 17:
                return Integer.valueOf(F());
            case 18:
                return Long.valueOf(G());
        }
    }

    public byte x() throws IOException {
        int i10 = this.f126142e;
        if (i10 == this.f126140c) {
            throw h.h();
        }
        byte[] bArr = this.f126138a;
        this.f126142e = i10 + 1;
        return bArr[i10];
    }

    public byte[] y(int i10) throws IOException {
        if (i10 < 0) {
            throw h.e();
        }
        int i11 = this.f126142e;
        int i12 = i11 + i10;
        int i13 = this.f126144g;
        if (i12 > i13) {
            S(i13 - i11);
            throw h.h();
        }
        if (i10 > this.f126140c - i11) {
            throw h.h();
        }
        byte[] bArr = new byte[i10];
        int i14 = 6 & 0;
        System.arraycopy(this.f126138a, i11, bArr, 0, i10);
        this.f126142e += i10;
        return bArr;
    }

    public int z() throws IOException {
        byte bX = x();
        byte bX2 = x();
        byte bX3 = x();
        return ((x() & 255) << 24) | (bX & 255) | ((bX2 & 255) << 8) | ((bX3 & 255) << 16);
    }
}
