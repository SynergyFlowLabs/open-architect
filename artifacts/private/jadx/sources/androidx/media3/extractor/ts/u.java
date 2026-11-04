package androidx.media3.extractor.ts;

import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.v0;
import androidx.media3.extractor.u0;
import com.google.common.collect.l6;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class u implements m {
    private static final int A = 2;
    private static final int B = 15;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f69466w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f69467x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f69468y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f69469z = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69470a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f69475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u0 f69476g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69479j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f69481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69482m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f69484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f69485p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f69489t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f69491v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69474e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69471b = new androidx.media3.common.util.o0(new byte[15], 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.util.n0 f69472c = new androidx.media3.common.util.n0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69473d = new androidx.media3.common.util.o0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v.b f69486q = new v.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f69487r = androidx.media3.common.j.f60676f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f69488s = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f69490u = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f69480k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f69483n = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f69477h = -9.223372036854776E18d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f69478i = -9.223372036854776E18d;

    public u(String str) {
        this.f69470a = str;
    }

    private void f(androidx.media3.common.util.o0 o0Var, androidx.media3.common.util.o0 o0Var2, boolean z10) {
        int iF = o0Var.f();
        int iMin = Math.min(o0Var.a(), o0Var2.a());
        o0Var.n(o0Var2.e(), o0Var2.f(), iMin);
        o0Var2.b0(iMin);
        if (z10) {
            o0Var.a0(iF);
        }
    }

    @il.m({"output"})
    private void g() {
        int i10;
        if (this.f69491v) {
            this.f69480k = false;
            i10 = 1;
        } else {
            i10 = 0;
        }
        double d10 = (((double) (this.f69488s - this.f69489t)) * 1000000.0d) / ((double) this.f69487r);
        long jRound = Math.round(this.f69477h);
        if (this.f69479j) {
            this.f69479j = false;
            this.f69477h = this.f69478i;
        } else {
            this.f69477h += d10;
        }
        this.f69476g.g(jRound, i10, this.f69485p, 0, null);
        this.f69491v = false;
        this.f69489t = 0;
        this.f69485p = 0;
    }

    @il.m({"output"})
    private void h(androidx.media3.common.util.n0 n0Var) throws v0 {
        v.c cVarH = v.h(n0Var);
        this.f69487r = cVarH.f69518b;
        this.f69488s = cVarH.f69519c;
        long j10 = this.f69490u;
        long j11 = this.f69486q.f69515b;
        if (j10 != j11) {
            this.f69490u = j11;
            String str = "mhm1";
            if (cVarH.f69517a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(cVarH.f69517a));
            }
            byte[] bArr = cVarH.f69520d;
            this.f69476g.e(new androidx.media3.common.w.b().f0(this.f69475f).U(this.f69470a).u0(s0.O).v0(this.f69487r).S(str).g0((bArr == null || bArr.length <= 0) ? null : l6.J(k1.f61545f, bArr)).N());
        }
        this.f69491v = true;
    }

    private boolean i() throws v0 {
        int iG = this.f69471b.g();
        this.f69472c.p(this.f69471b.e(), iG);
        boolean zG = v.g(this.f69472c, this.f69486q);
        if (zG) {
            this.f69484o = 0;
            this.f69485p += this.f69486q.f69516c + iG;
        }
        return zG;
    }

    private boolean j(int i10) {
        return i10 == 1 || i10 == 17;
    }

    private boolean k(androidx.media3.common.util.o0 o0Var) {
        int i10 = this.f69481l;
        if ((i10 & 2) == 0) {
            o0Var.a0(o0Var.g());
            return false;
        }
        if ((i10 & 4) != 0) {
            return true;
        }
        while (o0Var.a() > 0) {
            int i11 = this.f69482m << 8;
            this.f69482m = i11;
            int iL = i11 | o0Var.L();
            this.f69482m = iL;
            if (v.e(iL)) {
                o0Var.a0(o0Var.f() - 3);
                this.f69482m = 0;
                return true;
            }
        }
        return false;
    }

    @il.m({"output"})
    private void l(androidx.media3.common.util.o0 o0Var) {
        int iMin = Math.min(o0Var.a(), this.f69486q.f69516c - this.f69484o);
        this.f69476g.b(o0Var, iMin);
        this.f69484o += iMin;
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        this.f69474e = 0;
        this.f69482m = 0;
        this.f69471b.W(2);
        this.f69484o = 0;
        this.f69485p = 0;
        this.f69487r = androidx.media3.common.j.f60676f;
        this.f69488s = -1;
        this.f69489t = 0;
        this.f69490u = -1L;
        this.f69491v = false;
        this.f69479j = false;
        this.f69483n = true;
        this.f69480k = true;
        this.f69477h = -9.223372036854776E18d;
        this.f69478i = -9.223372036854776E18d;
    }

    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) throws v0 {
        androidx.media3.common.util.a.k(this.f69476g);
        while (o0Var.a() > 0) {
            int i10 = this.f69474e;
            if (i10 != 0) {
                if (i10 == 1) {
                    f(o0Var, this.f69471b, false);
                    if (this.f69471b.a() != 0) {
                        this.f69483n = false;
                    } else if (i()) {
                        this.f69471b.a0(0);
                        u0 u0Var = this.f69476g;
                        androidx.media3.common.util.o0 o0Var2 = this.f69471b;
                        u0Var.b(o0Var2, o0Var2.g());
                        this.f69471b.W(2);
                        this.f69473d.W(this.f69486q.f69516c);
                        this.f69483n = true;
                        this.f69474e = 2;
                    } else if (this.f69471b.g() < 15) {
                        androidx.media3.common.util.o0 o0Var3 = this.f69471b;
                        o0Var3.Z(o0Var3.g() + 1);
                        this.f69483n = false;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.f69486q.f69514a)) {
                        f(o0Var, this.f69473d, true);
                    }
                    l(o0Var);
                    int i11 = this.f69484o;
                    v.b bVar = this.f69486q;
                    if (i11 == bVar.f69516c) {
                        int i12 = bVar.f69514a;
                        if (i12 == 1) {
                            h(new androidx.media3.common.util.n0(this.f69473d.e()));
                        } else if (i12 == 17) {
                            this.f69489t = v.f(new androidx.media3.common.util.n0(this.f69473d.e()));
                        } else if (i12 == 2) {
                            g();
                        }
                        this.f69474e = 1;
                    }
                }
            } else if (k(o0Var)) {
                this.f69474e = 1;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        this.f69481l = i10;
        if (!this.f69480k && (this.f69485p != 0 || !this.f69483n)) {
            this.f69479j = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f69479j) {
                this.f69478i = j10;
                return;
            }
            this.f69477h = j10;
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        eVar.a();
        this.f69475f = eVar.b();
        this.f69476g = tVar.a(eVar.c(), 1);
    }

    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
    }
}
