package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.common.v0;
import androidx.media3.extractor.u0;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class s implements m {
    private static final int A = 3;
    private static final int B = 1024;
    private static final int C = 86;
    private static final int D = 224;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f69422x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f69423y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f69424z = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f69425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.common.util.n0 f69429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u0 f69430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f69431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.media3.common.w f69432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f69435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f69436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f69437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f69438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f69439o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f69440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f69441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f69442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f69443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f69444t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f69445u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f69446v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private String f69447w;

    public s(@androidx.annotation.p0 String str, int i10, String str2) {
        this.f69425a = str;
        this.f69426b = i10;
        this.f69427c = str2;
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(1024);
        this.f69428d = o0Var;
        this.f69429e = new androidx.media3.common.util.n0(o0Var.e());
        this.f69437m = -9223372036854775807L;
    }

    private static long f(androidx.media3.common.util.n0 n0Var) {
        return n0Var.h((n0Var.h(2) + 1) * 8);
    }

    @il.m({"output"})
    private void g(androidx.media3.common.util.n0 n0Var) throws v0 {
        if (n0Var.g()) {
            if (this.f69438n) {
            }
        } else {
            this.f69438n = true;
            l(n0Var);
        }
        if (this.f69439o != 0) {
            throw v0.a(null, null);
        }
        if (this.f69440p != 0) {
            throw v0.a(null, null);
        }
        k(n0Var, j(n0Var));
        if (this.f69442r) {
            n0Var.s((int) this.f69443s);
        }
    }

    private int h(androidx.media3.common.util.n0 n0Var) throws v0 {
        int iB = n0Var.b();
        androidx.media3.extractor.a.c cVarE = androidx.media3.extractor.a.e(n0Var, true);
        this.f69447w = cVarE.f67009c;
        this.f69444t = cVarE.f67007a;
        this.f69446v = cVarE.f67008b;
        return iB - n0Var.b();
    }

    private void i(androidx.media3.common.util.n0 n0Var) {
        int iH = n0Var.h(3);
        this.f69441q = iH;
        if (iH == 0) {
            n0Var.s(8);
            return;
        }
        if (iH == 1) {
            n0Var.s(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            n0Var.s(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            n0Var.s(1);
        }
    }

    private int j(androidx.media3.common.util.n0 n0Var) throws v0 {
        int iH;
        if (this.f69441q != 0) {
            throw v0.a(null, null);
        }
        int i10 = 0;
        do {
            iH = n0Var.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    @il.m({"output"})
    private void k(androidx.media3.common.util.n0 n0Var, int i10) {
        int iE = n0Var.e();
        if ((iE & 7) == 0) {
            this.f69428d.a0(iE >> 3);
        } else {
            n0Var.i(this.f69428d.e(), 0, i10 * 8);
            this.f69428d.a0(0);
        }
        this.f69430f.b(this.f69428d, i10);
        androidx.media3.common.util.a.i(this.f69437m != -9223372036854775807L);
        this.f69430f.g(this.f69437m, 1, i10, 0, null);
        this.f69437m += this.f69445u;
    }

    @il.m({"output"})
    private void l(androidx.media3.common.util.n0 n0Var) throws v0 {
        boolean zG;
        int iH = n0Var.h(1);
        int iH2 = iH == 1 ? n0Var.h(1) : 0;
        this.f69439o = iH2;
        if (iH2 != 0) {
            throw v0.a(null, null);
        }
        if (iH == 1) {
            f(n0Var);
        }
        if (!n0Var.g()) {
            throw v0.a(null, null);
        }
        this.f69440p = n0Var.h(6);
        int i10 = 3 | 4;
        int iH3 = n0Var.h(4);
        int iH4 = n0Var.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw v0.a(null, null);
        }
        if (iH == 0) {
            int iE = n0Var.e();
            int iH5 = h(n0Var);
            n0Var.q(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            n0Var.i(bArr, 0, iH5);
            androidx.media3.common.w wVarN = new androidx.media3.common.w.b().f0(this.f69431g).U(this.f69427c).u0("audio/mp4a-latm").S(this.f69447w).R(this.f69446v).v0(this.f69444t).g0(Collections.singletonList(bArr)).j0(this.f69425a).s0(this.f69426b).N();
            if (!wVarN.equals(this.f69432h)) {
                this.f69432h = wVarN;
                this.f69445u = 1024000000 / ((long) wVarN.F);
                this.f69430f.e(wVarN);
            }
        } else {
            n0Var.s(((int) f(n0Var)) - h(n0Var));
        }
        i(n0Var);
        boolean zG2 = n0Var.g();
        this.f69442r = zG2;
        this.f69443s = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f69443s = f(n0Var);
            } else {
                do {
                    zG = n0Var.g();
                    this.f69443s = (this.f69443s << 8) + ((long) n0Var.h(8));
                } while (zG);
            }
        }
        if (n0Var.g()) {
            n0Var.s(8);
        }
    }

    private void m(int i10) {
        this.f69428d.W(i10);
        this.f69429e.o(this.f69428d.e());
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        this.f69433i = 0;
        this.f69437m = -9223372036854775807L;
        this.f69438n = false;
    }

    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) throws v0 {
        androidx.media3.common.util.a.k(this.f69430f);
        while (o0Var.a() > 0) {
            int i10 = this.f69433i;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iL = o0Var.L();
                    if ((iL & 224) == 224) {
                        this.f69436l = iL;
                        this.f69433i = 2;
                    } else if (iL != 86) {
                        this.f69433i = 0;
                    }
                } else if (i10 == 2) {
                    int iL2 = ((this.f69436l & (-225)) << 8) | o0Var.L();
                    this.f69435k = iL2;
                    if (iL2 > this.f69428d.e().length) {
                        m(this.f69435k);
                    }
                    this.f69434j = 0;
                    this.f69433i = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(o0Var.a(), this.f69435k - this.f69434j);
                    o0Var.n(this.f69429e.f61581a, this.f69434j, iMin);
                    int i11 = this.f69434j + iMin;
                    this.f69434j = i11;
                    if (i11 == this.f69435k) {
                        this.f69429e.q(0);
                        g(this.f69429e);
                        this.f69433i = 0;
                    }
                }
            } else if (o0Var.L() == 86) {
                this.f69433i = 1;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        this.f69437m = j10;
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        eVar.a();
        this.f69430f = tVar.a(eVar.c(), 1);
        this.f69431g = eVar.b();
    }

    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
    }
}
