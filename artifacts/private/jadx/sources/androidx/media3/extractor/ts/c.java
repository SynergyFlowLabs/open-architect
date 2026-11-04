package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.extractor.u0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c implements m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f68992o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f68993p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f68994q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f68995r = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.common.util.n0 f68996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f68997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f68998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f68999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f69000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f69001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u0 f69002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f69006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.media3.common.w f69007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f69009n;

    public c(String str) {
        this(null, 0, str);
    }

    private boolean f(androidx.media3.common.util.o0 o0Var, byte[] bArr, int i10) {
        int iMin = Math.min(o0Var.a(), i10 - this.f69004i);
        o0Var.n(bArr, this.f69004i, iMin);
        int i11 = this.f69004i + iMin;
        this.f69004i = i11;
        return i11 == i10;
    }

    @il.m({"output"})
    private void g() {
        this.f68996a.q(0);
        androidx.media3.extractor.b.C0602b c0602bF = androidx.media3.extractor.b.f(this.f68996a);
        androidx.media3.common.w wVar = this.f69007l;
        if (wVar == null || c0602bF.f67138d != wVar.E || c0602bF.f67137c != wVar.F || !Objects.equals(c0602bF.f67135a, wVar.f61761o)) {
            androidx.media3.common.w.b bVarP0 = new androidx.media3.common.w.b().f0(this.f69001f).U(this.f69000e).u0(c0602bF.f67135a).R(c0602bF.f67138d).v0(c0602bF.f67137c).j0(this.f68998c).s0(this.f68999d).p0(c0602bF.f67141g);
            if ("audio/ac3".equals(c0602bF.f67135a)) {
                bVarP0.Q(c0602bF.f67141g);
            }
            androidx.media3.common.w wVarN = bVarP0.N();
            this.f69007l = wVarN;
            this.f69002g.e(wVarN);
        }
        this.f69008m = c0602bF.f67139e;
        this.f69006k = (((long) c0602bF.f67140f) * 1000000) / ((long) this.f69007l.F);
    }

    private boolean h(androidx.media3.common.util.o0 o0Var) {
        while (true) {
            if (o0Var.a() <= 0) {
                return false;
            }
            if (this.f69005j) {
                int iL = o0Var.L();
                if (iL == 119) {
                    this.f69005j = false;
                    return true;
                }
                this.f69005j = iL == 11;
            } else {
                this.f69005j = o0Var.L() == 11;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        this.f69003h = 0;
        this.f69004i = 0;
        this.f69005j = false;
        this.f69009n = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) {
        androidx.media3.common.util.a.k(this.f69002g);
        while (o0Var.a() > 0) {
            int i10 = this.f69003h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(o0Var.a(), this.f69008m - this.f69004i);
                        this.f69002g.b(o0Var, iMin);
                        int i11 = this.f69004i + iMin;
                        this.f69004i = i11;
                        if (i11 == this.f69008m) {
                            androidx.media3.common.util.a.i(this.f69009n != -9223372036854775807L);
                            this.f69002g.g(this.f69009n, 1, this.f69008m, 0, null);
                            this.f69009n += this.f69006k;
                            this.f69003h = 0;
                        }
                    }
                } else if (f(o0Var, this.f68997b.e(), 128)) {
                    g();
                    this.f68997b.a0(0);
                    this.f69002g.b(this.f68997b, 128);
                    this.f69003h = 2;
                }
            } else if (h(o0Var)) {
                this.f69003h = 1;
                this.f68997b.e()[0] = 11;
                this.f68997b.e()[1] = 119;
                this.f69004i = 2;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        this.f69009n = j10;
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        eVar.a();
        this.f69001f = eVar.b();
        this.f69002g = tVar.a(eVar.c(), 1);
    }

    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
    }

    public c(@androidx.annotation.p0 String str, int i10, String str2) {
        androidx.media3.common.util.n0 n0Var = new androidx.media3.common.util.n0(new byte[128]);
        this.f68996a = n0Var;
        this.f68997b = new androidx.media3.common.util.o0(n0Var.f61581a);
        this.f69003h = 0;
        this.f69009n = -9223372036854775807L;
        this.f68998c = str;
        this.f68999d = i10;
        this.f69000e = str2;
    }
}
