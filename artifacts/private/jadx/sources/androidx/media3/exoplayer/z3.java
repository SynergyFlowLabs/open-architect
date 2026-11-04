package androidx.media3.exoplayer;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class z3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f66950r = "MediaPeriodHolder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.s0 f66951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f66952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.s1[] f66953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f66954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f66955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f66956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f66957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a4 f66958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f66959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean[] f66960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a5[] f66961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media3.exoplayer.trackselection.k0 f66962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r4 f66963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private z3 f66964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private androidx.media3.exoplayer.source.h2 f66965o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private androidx.media3.exoplayer.trackselection.l0 f66966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f66967q;

    interface a {
        z3 a(a4 a4Var, long j10);
    }

    public z3(a5[] a5VarArr, long j10, androidx.media3.exoplayer.trackselection.k0 k0Var, androidx.media3.exoplayer.upstream.b bVar, r4 r4Var, a4 a4Var, androidx.media3.exoplayer.trackselection.l0 l0Var, long j11) {
        this.f66961k = a5VarArr;
        this.f66967q = j10;
        this.f66962l = k0Var;
        this.f66963m = r4Var;
        androidx.media3.exoplayer.source.t0.b bVar2 = a4Var.f62779a;
        this.f66952b = bVar2.f65467a;
        this.f66958h = a4Var;
        this.f66954d = j11;
        this.f66965o = androidx.media3.exoplayer.source.h2.f65074e;
        this.f66966p = l0Var;
        this.f66953c = new androidx.media3.exoplayer.source.s1[a5VarArr.length];
        this.f66960j = new boolean[a5VarArr.length];
        this.f66951a = f(bVar2, r4Var, bVar, a4Var.f62780b, a4Var.f62782d, a4Var.f62784f);
    }

    private void c(androidx.media3.exoplayer.source.s1[] s1VarArr) {
        int i10 = 0;
        while (true) {
            a5[] a5VarArr = this.f66961k;
            if (i10 >= a5VarArr.length) {
                return;
            }
            if (a5VarArr[i10].f() == -2 && this.f66966p.c(i10)) {
                s1VarArr[i10] = new androidx.media3.exoplayer.source.w();
            }
            i10++;
        }
    }

    private static androidx.media3.exoplayer.source.s0 f(androidx.media3.exoplayer.source.t0.b bVar, r4 r4Var, androidx.media3.exoplayer.upstream.b bVar2, long j10, long j11, boolean z10) {
        androidx.media3.exoplayer.source.s0 s0VarI = r4Var.i(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new androidx.media3.exoplayer.source.e(s0VarI, !z10, 0L, j11) : s0VarI;
    }

    private void g() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            androidx.media3.exoplayer.trackselection.l0 l0Var = this.f66966p;
            if (i10 >= l0Var.f65718a) {
                return;
            }
            boolean zC = l0Var.c(i10);
            androidx.media3.exoplayer.trackselection.c0 c0Var = this.f66966p.f65720c[i10];
            if (zC && c0Var != null) {
                c0Var.d();
            }
            i10++;
        }
    }

    private void h(androidx.media3.exoplayer.source.s1[] s1VarArr) {
        int i10 = 0;
        while (true) {
            a5[] a5VarArr = this.f66961k;
            if (i10 >= a5VarArr.length) {
                return;
            }
            if (a5VarArr[i10].f() == -2) {
                s1VarArr[i10] = null;
            }
            i10++;
        }
    }

    private void i() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            androidx.media3.exoplayer.trackselection.l0 l0Var = this.f66966p;
            if (i10 >= l0Var.f65718a) {
                return;
            }
            boolean zC = l0Var.c(i10);
            androidx.media3.exoplayer.trackselection.c0 c0Var = this.f66966p.f65720c[i10];
            if (zC && c0Var != null) {
                c0Var.h();
            }
            i10++;
        }
    }

    private boolean u() {
        return this.f66964n == null;
    }

    private static void y(r4 r4Var, androidx.media3.exoplayer.source.s0 s0Var) {
        try {
            if (s0Var instanceof androidx.media3.exoplayer.source.e) {
                r4Var.B(((androidx.media3.exoplayer.source.e) s0Var).f64963a);
            } else {
                r4Var.B(s0Var);
            }
        } catch (RuntimeException e10) {
            androidx.media3.common.util.z.e(f66950r, "Period release failed.", e10);
        }
    }

    public void A(@androidx.annotation.p0 z3 z3Var) {
        if (z3Var == this.f66964n) {
            return;
        }
        g();
        this.f66964n = z3Var;
        i();
    }

    public void B(long j10) {
        this.f66967q = j10;
    }

    public long C(long j10) {
        return j10 - m();
    }

    public long D(long j10) {
        return j10 + m();
    }

    public void E() {
        androidx.media3.exoplayer.source.s0 s0Var = this.f66951a;
        if (s0Var instanceof androidx.media3.exoplayer.source.e) {
            long j10 = this.f66958h.f62782d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((androidx.media3.exoplayer.source.e) s0Var).w(0L, j10);
        }
    }

    public long a(androidx.media3.exoplayer.trackselection.l0 l0Var, long j10, boolean z10) {
        return b(l0Var, j10, z10, new boolean[this.f66961k.length]);
    }

    public long b(androidx.media3.exoplayer.trackselection.l0 l0Var, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= l0Var.f65718a) {
                break;
            }
            boolean[] zArr2 = this.f66960j;
            if (z10 || !l0Var.b(this.f66966p, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        h(this.f66953c);
        g();
        this.f66966p = l0Var;
        i();
        long jT = this.f66951a.t(l0Var.f65720c, this.f66960j, this.f66953c, zArr, j10);
        c(this.f66953c);
        this.f66957g = false;
        int i11 = 0;
        while (true) {
            androidx.media3.exoplayer.source.s1[] s1VarArr = this.f66953c;
            if (i11 >= s1VarArr.length) {
                return jT;
            }
            if (s1VarArr[i11] != null) {
                androidx.media3.common.util.a.i(l0Var.c(i11));
                if (this.f66961k[i11].f() != -2) {
                    this.f66957g = true;
                }
            } else {
                androidx.media3.common.util.a.i(l0Var.f65720c[i11] == null);
            }
            i11++;
        }
    }

    public boolean d(a4 a4Var) {
        if (c4.e(this.f66958h.f62783e, a4Var.f62783e)) {
            a4 a4Var2 = this.f66958h;
            if (a4Var2.f62780b == a4Var.f62780b && a4Var2.f62779a.equals(a4Var.f62779a)) {
                return true;
            }
        }
        return false;
    }

    public void e(t3 t3Var) {
        androidx.media3.common.util.a.i(u());
        this.f66951a.k(t3Var);
    }

    public long j() {
        if (!this.f66956f) {
            return this.f66958h.f62780b;
        }
        long jB = this.f66957g ? this.f66951a.b() : Long.MIN_VALUE;
        return jB == Long.MIN_VALUE ? this.f66958h.f62783e : jB;
    }

    @androidx.annotation.p0
    public z3 k() {
        return this.f66964n;
    }

    public long l() {
        if (this.f66956f) {
            return this.f66951a.e();
        }
        return 0L;
    }

    public long m() {
        return this.f66967q;
    }

    public long n() {
        return this.f66958h.f62780b + this.f66967q;
    }

    public androidx.media3.exoplayer.source.h2 o() {
        return this.f66965o;
    }

    public androidx.media3.exoplayer.trackselection.l0 p() {
        return this.f66966p;
    }

    public void q(float f10, androidx.media3.common.z3 z3Var, boolean z10) throws s0 {
        this.f66956f = true;
        this.f66965o = this.f66951a.m();
        androidx.media3.exoplayer.trackselection.l0 l0VarZ = z(f10, z3Var, z10);
        a4 a4Var = this.f66958h;
        long jMax = a4Var.f62780b;
        long j10 = a4Var.f62783e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(l0VarZ, jMax, false);
        long j11 = this.f66967q;
        a4 a4Var2 = this.f66958h;
        this.f66967q = j11 + (a4Var2.f62780b - jA);
        this.f66958h = a4Var2.b(jA);
    }

    public boolean r() {
        try {
            if (this.f66956f) {
                for (androidx.media3.exoplayer.source.s1 s1Var : this.f66953c) {
                    if (s1Var != null) {
                        s1Var.a();
                    }
                }
            } else {
                this.f66951a.o();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        return this.f66956f && (!this.f66957g || this.f66951a.b() == Long.MIN_VALUE);
    }

    public boolean t() {
        return this.f66956f && (s() || j() - this.f66958h.f62780b >= this.f66954d);
    }

    public void v(androidx.media3.exoplayer.source.s0.a aVar, long j10) {
        this.f66955e = true;
        this.f66951a.v(aVar, j10);
    }

    public void w(long j10) {
        androidx.media3.common.util.a.i(u());
        if (this.f66956f) {
            this.f66951a.c(C(j10));
        }
    }

    public void x() {
        g();
        y(this.f66963m, this.f66951a);
    }

    public androidx.media3.exoplayer.trackselection.l0 z(float f10, androidx.media3.common.z3 z3Var, boolean z10) throws s0 {
        androidx.media3.exoplayer.trackselection.l0 l0VarK = this.f66962l.k(this.f66961k, o(), this.f66958h.f62779a, z3Var);
        for (int i10 = 0; i10 < l0VarK.f65718a; i10++) {
            boolean z11 = true;
            if (l0VarK.c(i10)) {
                if (l0VarK.f65720c[i10] == null && this.f66961k[i10].f() != -2) {
                    z11 = false;
                }
                androidx.media3.common.util.a.i(z11);
            } else {
                if (l0VarK.f65720c[i10] != null) {
                    z11 = false;
                }
                androidx.media3.common.util.a.i(z11);
            }
        }
        for (androidx.media3.exoplayer.trackselection.c0 c0Var : l0VarK.f65720c) {
            if (c0Var != null) {
                c0Var.m(f10);
                c0Var.w(z10);
            }
        }
        return l0VarK;
    }
}
