package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.v0;
import androidx.media3.extractor.u0;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class i implements m {
    private static final int A = 2;
    private static final int B = 3;
    private static final int C = 4;
    private static final int D = 5;
    private static final int E = 2;
    private static final int F = 8;
    private static final int G = 256;
    private static final int H = 512;
    private static final int I = 768;
    private static final int J = 1024;
    private static final int K = 10;
    private static final int L = 6;
    private static final byte[] M = {73, 68, 51};
    private static final int N = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f69105x = "AdtsReader";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f69106y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f69107z = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f69108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.common.util.n0 f69109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f69111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f69112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f69113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f69114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u0 f69115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u0 f69116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f69118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f69119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f69120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f69121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f69122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f69123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f69124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f69125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f69126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f69127t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f69128u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private u0 f69129v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f69130w;

    public i(boolean z10, String str) {
        this(z10, null, 0, str);
    }

    @il.d({"output", "currentOutput", "id3Output"})
    private void f() {
        androidx.media3.common.util.a.g(this.f69115h);
        k1.o(this.f69129v);
        k1.o(this.f69116i);
    }

    private void g(androidx.media3.common.util.o0 o0Var) {
        if (o0Var.a() == 0) {
            return;
        }
        this.f69109b.f61581a[0] = o0Var.e()[o0Var.f()];
        int i10 = 2 << 2;
        this.f69109b.q(2);
        int iH = this.f69109b.h(4);
        int i11 = this.f69123p;
        if (i11 != -1 && iH != i11) {
            q();
            return;
        }
        if (!this.f69121n) {
            this.f69121n = true;
            this.f69122o = this.f69124q;
            this.f69123p = iH;
        }
        t();
    }

    private boolean h(androidx.media3.common.util.o0 o0Var, int i10) {
        o0Var.a0(i10 + 1);
        if (!w(o0Var, this.f69109b.f61581a, 1)) {
            return false;
        }
        this.f69109b.q(4);
        int iH = this.f69109b.h(1);
        int i11 = this.f69122o;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f69123p != -1) {
            if (!w(o0Var, this.f69109b.f61581a, 1)) {
                return true;
            }
            this.f69109b.q(2);
            if (this.f69109b.h(4) != this.f69123p) {
                return false;
            }
            o0Var.a0(i10 + 2);
        }
        if (!w(o0Var, this.f69109b.f61581a, 4)) {
            return true;
        }
        this.f69109b.q(14);
        int iH2 = this.f69109b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrE = o0Var.e();
        int iG = o0Var.g();
        int i12 = i10 + iH2;
        if (i12 >= iG) {
            return true;
        }
        byte b10 = bArrE[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iG) {
                return true;
            }
            return l((byte) -1, bArrE[i13]) && ((bArrE[i13] & 8) >> 3) == iH;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iG) {
            return true;
        }
        if (bArrE[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iG || bArrE[i15] == 51;
    }

    private boolean i(androidx.media3.common.util.o0 o0Var, byte[] bArr, int i10) {
        int iMin = Math.min(o0Var.a(), i10 - this.f69118k);
        o0Var.n(bArr, this.f69118k, iMin);
        int i11 = this.f69118k + iMin;
        this.f69118k = i11;
        return i11 == i10;
    }

    private void j(androidx.media3.common.util.o0 o0Var) {
        byte[] bArrE = o0Var.e();
        int iF = o0Var.f();
        int iG = o0Var.g();
        while (iF < iG) {
            int i10 = iF + 1;
            byte b10 = bArrE[iF];
            int i11 = b10 & 255;
            if (this.f69119l == 512 && l((byte) -1, (byte) i11) && (this.f69121n || h(o0Var, iF - 1))) {
                this.f69124q = (b10 & 8) >> 3;
                this.f69120m = (b10 & 1) == 0;
                if (this.f69121n) {
                    t();
                } else {
                    r();
                }
                o0Var.a0(i10);
                return;
            }
            int i12 = this.f69119l;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f69119l = 768;
            } else if (i13 == 511) {
                this.f69119l = 512;
            } else if (i13 == 836) {
                this.f69119l = 1024;
            } else if (i13 == 1075) {
                u();
                o0Var.a0(i10);
                return;
            } else if (i12 != 256) {
                this.f69119l = 256;
            }
            iF = i10;
        }
        o0Var.a0(iF);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    @il.m({"output"})
    private void n() throws v0 {
        this.f69109b.q(0);
        if (this.f69125r) {
            this.f69109b.s(10);
        } else {
            int i10 = 2;
            int iH = this.f69109b.h(2) + 1;
            if (iH != 2) {
                androidx.media3.common.util.z.n(f69105x, "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i10 = iH;
            }
            this.f69109b.s(5);
            byte[] bArrB = androidx.media3.extractor.a.b(i10, this.f69123p, this.f69109b.h(3));
            androidx.media3.extractor.a.c cVarF = androidx.media3.extractor.a.f(bArrB);
            androidx.media3.common.w wVarN = new androidx.media3.common.w.b().f0(this.f69114g).U(this.f69113f).u0("audio/mp4a-latm").S(cVarF.f67009c).R(cVarF.f67008b).v0(cVarF.f67007a).g0(Collections.singletonList(bArrB)).j0(this.f69111d).s0(this.f69112e).N();
            this.f69126s = 1024000000 / ((long) wVarN.F);
            this.f69115h.e(wVarN);
            this.f69125r = true;
        }
        this.f69109b.s(4);
        int iH2 = this.f69109b.h(13);
        int i11 = iH2 - 7;
        if (this.f69120m) {
            i11 = iH2 - 9;
        }
        v(this.f69115h, this.f69126s, 0, i11);
    }

    @il.m({"id3Output"})
    private void o() {
        this.f69116i.b(this.f69110c, 10);
        this.f69110c.a0(6);
        v(this.f69116i, 0L, 10, this.f69110c.K() + 10);
    }

    @il.m({"currentOutput"})
    private void p(androidx.media3.common.util.o0 o0Var) {
        int iMin = Math.min(o0Var.a(), this.f69127t - this.f69118k);
        this.f69129v.b(o0Var, iMin);
        int i10 = this.f69118k + iMin;
        this.f69118k = i10;
        if (i10 == this.f69127t) {
            androidx.media3.common.util.a.i(this.f69128u != -9223372036854775807L);
            int i11 = 4 << 1;
            this.f69129v.g(this.f69128u, 1, this.f69127t, 0, null);
            this.f69128u += this.f69130w;
            s();
        }
    }

    private void q() {
        this.f69121n = false;
        s();
    }

    private void r() {
        this.f69117j = 1;
        this.f69118k = 0;
    }

    private void s() {
        this.f69117j = 0;
        this.f69118k = 0;
        this.f69119l = 256;
    }

    private void t() {
        this.f69117j = 3;
        this.f69118k = 0;
    }

    private void u() {
        this.f69117j = 2;
        this.f69118k = M.length;
        this.f69127t = 0;
        this.f69110c.a0(0);
    }

    private void v(u0 u0Var, long j10, int i10, int i11) {
        this.f69117j = 4;
        this.f69118k = i10;
        this.f69129v = u0Var;
        this.f69130w = j10;
        this.f69127t = i11;
    }

    private boolean w(androidx.media3.common.util.o0 o0Var, byte[] bArr, int i10) {
        if (o0Var.a() < i10) {
            return false;
        }
        o0Var.n(bArr, 0, i10);
        return true;
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        this.f69128u = -9223372036854775807L;
        q();
    }

    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) throws v0 {
        f();
        while (o0Var.a() > 0) {
            int i10 = this.f69117j;
            if (i10 == 0) {
                j(o0Var);
            } else if (i10 == 1) {
                g(o0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(o0Var, this.f69109b.f61581a, this.f69120m ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    p(o0Var);
                }
            } else if (i(o0Var, this.f69110c.e(), 10)) {
                o();
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        this.f69128u = j10;
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        eVar.a();
        this.f69114g = eVar.b();
        u0 u0VarA = tVar.a(eVar.c(), 1);
        this.f69115h = u0VarA;
        this.f69129v = u0VarA;
        if (!this.f69108a) {
            this.f69116i = new androidx.media3.extractor.m();
            return;
        }
        eVar.a();
        u0 u0VarA2 = tVar.a(eVar.c(), 5);
        this.f69116i = u0VarA2;
        u0VarA2.e(new androidx.media3.common.w.b().f0(eVar.b()).U(this.f69113f).u0("application/id3").N());
    }

    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
    }

    public long k() {
        return this.f69126s;
    }

    public i(boolean z10, @androidx.annotation.p0 String str, int i10, String str2) {
        this.f69109b = new androidx.media3.common.util.n0(new byte[7]);
        this.f69110c = new androidx.media3.common.util.o0(Arrays.copyOf(M, 10));
        this.f69122o = -1;
        this.f69123p = -1;
        this.f69126s = -9223372036854775807L;
        this.f69128u = -9223372036854775807L;
        this.f69108a = z10;
        this.f69111d = str;
        this.f69112e = i10;
        this.f69113f = str2;
        s();
    }
}
