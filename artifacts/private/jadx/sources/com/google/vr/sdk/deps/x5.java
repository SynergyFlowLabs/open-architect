package com.google.vr.sdk.deps;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class x5 implements r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f129686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    s2 f129688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f129689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f129690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f129691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f129692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f129693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f129694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f129695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f129696k;

    private x5() {
        this.f129687b = 100;
    }

    private void g() throws IOException {
        if (this.f129691f - this.f129693h >= 10) {
            h();
        } else {
            i();
        }
    }

    private void h() throws IOException {
        for (int i10 = 0; i10 < 10; i10++) {
            byte[] bArr = this.f129689d;
            int i11 = this.f129693h;
            this.f129693h = i11 + 1;
            if (bArr[i11] >= 0) {
                return;
            }
        }
        throw v3.c();
    }

    private void i() throws IOException {
        for (int i10 = 0; i10 < 10; i10++) {
            if (f() >= 0) {
                return;
            }
        }
        throw v3.c();
    }

    private void j() {
        int i10 = this.f129691f + this.f129692g;
        this.f129691f = i10;
        int i11 = i10 - this.f129694i;
        int i12 = this.f129696k;
        if (i11 <= i12) {
            this.f129692g = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f129692g = i13;
        this.f129691f = i10 - i13;
    }

    public static long k(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static x5 m(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    public static x5 n(byte[] bArr, int i10, int i11) {
        return o(bArr, i10, i11, false);
    }

    static x5 o(byte[] bArr, int i10, int i11, boolean z10) {
        x5 x5Var = new x5(bArr, i10, i11, z10, (byte) 0);
        try {
            x5Var.t(i11);
            return x5Var;
        } catch (v3 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int z(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public long A() throws IOException {
        return a();
    }

    public long B() throws IOException {
        return a();
    }

    public byte[] C(int i10) throws IOException {
        if (i10 > 0) {
            int i11 = this.f129691f;
            int i12 = this.f129693h;
            if (i10 <= i11 - i12) {
                int i13 = i10 + i12;
                this.f129693h = i13;
                return Arrays.copyOfRange(this.f129689d, i12, i13);
            }
        }
        if (i10 > 0) {
            throw v3.a();
        }
        if (i10 == 0) {
            return k3.f129469b;
        }
        throw v3.b();
    }

    public int D() throws IOException {
        return U();
    }

    public long E() throws IOException {
        return e();
    }

    public int F() throws IOException {
        return d();
    }

    public boolean G() throws IOException {
        return a() != 0;
    }

    public String H() throws IOException {
        int iU = U();
        if (iU > 0) {
            int i10 = this.f129691f;
            int i11 = this.f129693h;
            if (iU <= i10 - i11) {
                String str = new String(this.f129689d, i11, iU, k3.f129468a);
                this.f129693h += iU;
                return str;
            }
        }
        if (iU == 0) {
            return "";
        }
        if (iU < 0) {
            throw v3.b();
        }
        throw v3.a();
    }

    public String I() throws IOException {
        int iU = U();
        if (iU > 0) {
            int i10 = this.f129691f;
            int i11 = this.f129693h;
            if (iU <= i10 - i11) {
                String strL = i6.l(this.f129689d, i11, iU);
                this.f129693h += iU;
                return strL;
            }
        }
        if (iU == 0) {
            return "";
        }
        if (iU <= 0) {
            throw v3.b();
        }
        throw v3.a();
    }

    public k2 J() throws IOException {
        int iU = U();
        if (iU > 0) {
            int i10 = this.f129691f;
            int i11 = this.f129693h;
            if (iU <= i10 - i11) {
                k2 k2VarN = k2.n(this.f129689d, i11, iU);
                this.f129693h += iU;
                return k2VarN;
            }
        }
        return iU == 0 ? k2.f129465b : k2.m(C(iU));
    }

    public int K() throws IOException {
        return U();
    }

    public int L() throws IOException {
        return U();
    }

    public int M() throws IOException {
        return d();
    }

    public long N() throws IOException {
        return e();
    }

    public int O() throws IOException {
        return z(U());
    }

    public long P() throws IOException {
        return k(a());
    }

    long Q() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bF = f();
            j10 |= ((long) (bF & 127)) << i10;
            if ((bF & 128) == 0) {
                return j10;
            }
        }
        throw v3.c();
    }

    public boolean R() throws IOException {
        return this.f129693h == this.f129691f;
    }

    public int S() {
        return this.f129693h - this.f129694i;
    }

    public void T() throws IOException {
        int iS;
        do {
            iS = s();
            if (iS == 0) {
                return;
            }
        } while (q(iS));
    }

    public int U() throws IOException {
        int i10;
        int i11 = this.f129693h;
        int i12 = this.f129691f;
        if (i12 != i11) {
            byte[] bArr = this.f129689d;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f129693h = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << com.google.common.base.c.f116463p) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << com.google.common.base.c.f116472y);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << com.google.common.base.c.F)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f129693h = i14;
                return i10;
            }
        }
        return (int) Q();
    }

    public long a() throws IOException {
        long j10;
        long j11;
        long j12;
        int i10 = this.f129693h;
        int i11 = this.f129691f;
        if (i11 != i10) {
            byte[] bArr = this.f129689d;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f129693h = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << com.google.common.base.c.f116463p) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << com.google.common.base.c.f116472y);
                        if (i18 < 0) {
                            long j13 = (-2080896) ^ i18;
                            i13 = i17;
                            j10 = j13;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (((long) bArr[i17]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                int i19 = i10 + 6;
                                long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (((long) bArr[i19]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i19 = i10 + 8;
                                        j16 = j15 ^ (((long) bArr[i13]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i20;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j10 = j16 ^ j11;
                                i13 = i19;
                            }
                            j10 = j15 ^ j12;
                        }
                    }
                }
                this.f129693h = i13;
                return j10;
            }
        }
        return Q();
    }

    @Override // com.google.vr.sdk.deps.r4
    public final boolean b() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.vr.sdk.deps.r4
    public final t4 c() {
        throw new NoSuchMethodError();
    }

    public int d() throws IOException {
        int i10 = this.f129693h;
        if (this.f129691f - i10 < 4) {
            throw v3.a();
        }
        byte[] bArr = this.f129689d;
        this.f129693h = i10 + 4;
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24);
    }

    public long e() throws IOException {
        int i10 = this.f129693h;
        if (this.f129691f - i10 < 8) {
            throw v3.a();
        }
        byte[] bArr = this.f129689d;
        this.f129693h = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public byte f() throws IOException {
        int i10 = this.f129693h;
        if (i10 == this.f129691f) {
            throw v3.a();
        }
        byte[] bArr = this.f129689d;
        this.f129693h = i10 + 1;
        return bArr[i10];
    }

    public <T extends t4> T l(c5<T> c5Var, x2 x2Var) throws IOException {
        int iU = U();
        if (this.f129686a >= this.f129687b) {
            throw v3.f();
        }
        int iT = t(iU);
        this.f129686a++;
        T tA = c5Var.a(this, x2Var);
        p(0);
        this.f129686a--;
        v(iT);
        return tA;
    }

    public void p(int i10) throws v3 {
        if (this.f129695j != i10) {
            throw v3.d();
        }
    }

    public boolean q(int i10) throws IOException {
        int i11 = i10 & 7;
        if (i11 == 0) {
            g();
            return true;
        }
        if (i11 == 1) {
            x(8);
            return true;
        }
        if (i11 == 2) {
            x(U());
            return true;
        }
        if (i11 == 3) {
            T();
            p(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        if (i11 != 5) {
            throw v3.e();
        }
        x(4);
        return true;
    }

    public int r(int i10) {
        if (i10 >= 0) {
            int i11 = this.f129687b;
            this.f129687b = i10;
            return i11;
        }
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("Recursion limit cannot be negative: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int s() throws IOException {
        if (R()) {
            this.f129695j = 0;
            return 0;
        }
        int iU = U();
        this.f129695j = iU;
        if ((iU >>> 3) != 0) {
            return iU;
        }
        throw new v3("Protocol message contained an invalid tag (zero).");
    }

    public int t(int i10) throws v3 {
        if (i10 < 0) {
            throw v3.b();
        }
        int iS = i10 + S();
        int i11 = this.f129696k;
        if (iS > i11) {
            throw v3.a();
        }
        this.f129696k = iS;
        j();
        return i11;
    }

    public double u() throws IOException {
        return Double.longBitsToDouble(e());
    }

    public void v(int i10) {
        this.f129696k = i10;
        j();
    }

    public float w() throws IOException {
        return Float.intBitsToFloat(d());
    }

    public void x(int i10) throws IOException {
        if (i10 >= 0) {
            int i11 = this.f129691f;
            int i12 = this.f129693h;
            if (i10 <= i11 - i12) {
                this.f129693h = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw v3.a();
        }
        throw v3.b();
    }

    @Override // com.google.vr.sdk.deps.r4
    public final int y() {
        throw new NoSuchMethodError();
    }

    private x5(byte[] bArr, int i10, int i11, boolean z10) {
        this();
        this.f129696k = Integer.MAX_VALUE;
        this.f129689d = bArr;
        this.f129691f = i11 + i10;
        this.f129693h = i10;
        this.f129694i = i10;
        this.f129690e = z10;
    }

    /* synthetic */ x5(byte[] bArr, int i10, int i11, boolean z10, byte b10) {
        this(bArr, i10, i11, z10);
    }
}
