package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.extractor.u0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class f implements m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f69058p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f69059q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f69060r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.common.util.n0 f69061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f69063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f69064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f69065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f69066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u0 f69067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f69071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f69072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.media3.common.w f69073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f69074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f69075o;

    public f(String str) {
        this(null, 0, str);
    }

    private boolean f(androidx.media3.common.util.o0 o0Var, byte[] bArr, int i10) {
        int iMin = Math.min(o0Var.a(), i10 - this.f69069i);
        o0Var.n(bArr, this.f69069i, iMin);
        int i11 = this.f69069i + iMin;
        this.f69069i = i11;
        return i11 == i10;
    }

    @il.m({"output"})
    private void g() {
        this.f69061a.q(0);
        androidx.media3.extractor.c.C0603c c0603cF = androidx.media3.extractor.c.f(this.f69061a);
        androidx.media3.common.w wVar = this.f69073m;
        if (wVar == null || c0603cF.f67178c != wVar.E || c0603cF.f67177b != wVar.F || !"audio/ac4".equals(wVar.f61761o)) {
            androidx.media3.common.w wVarN = new androidx.media3.common.w.b().f0(this.f69066f).U(this.f69065e).u0("audio/ac4").R(c0603cF.f67178c).v0(c0603cF.f67177b).j0(this.f69063c).s0(this.f69064d).N();
            this.f69073m = wVarN;
            this.f69067g.e(wVarN);
        }
        this.f69074n = c0603cF.f67179d;
        this.f69072l = (((long) c0603cF.f67180e) * 1000000) / ((long) this.f69073m.F);
    }

    private boolean h(androidx.media3.common.util.o0 o0Var) {
        while (true) {
            if (o0Var.a() <= 0) {
                return false;
            }
            if (this.f69070j) {
                int iL = o0Var.L();
                this.f69070j = iL == 172;
                if (iL == 64 || iL == 65) {
                    this.f69071k = iL == 65;
                    return true;
                }
            } else {
                this.f69070j = o0Var.L() == 172;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        this.f69068h = 0;
        this.f69069i = 0;
        this.f69070j = false;
        this.f69071k = false;
        this.f69075o = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) {
        androidx.media3.common.util.a.k(this.f69067g);
        while (o0Var.a() > 0) {
            int i10 = this.f69068h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(o0Var.a(), this.f69074n - this.f69069i);
                        this.f69067g.b(o0Var, iMin);
                        int i11 = this.f69069i + iMin;
                        this.f69069i = i11;
                        if (i11 == this.f69074n) {
                            androidx.media3.common.util.a.i(this.f69075o != -9223372036854775807L);
                            this.f69067g.g(this.f69075o, 1, this.f69074n, 0, null);
                            this.f69075o += this.f69072l;
                            this.f69068h = 0;
                        }
                    }
                } else if (f(o0Var, this.f69062b.e(), 16)) {
                    g();
                    this.f69062b.a0(0);
                    this.f69067g.b(this.f69062b, 16);
                    this.f69068h = 2;
                }
            } else if (h(o0Var)) {
                this.f69068h = 1;
                this.f69062b.e()[0] = -84;
                this.f69062b.e()[1] = (byte) (this.f69071k ? 65 : 64);
                this.f69069i = 2;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        this.f69075o = j10;
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        eVar.a();
        this.f69066f = eVar.b();
        this.f69067g = tVar.a(eVar.c(), 1);
    }

    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
    }

    public f(@androidx.annotation.p0 String str, int i10, String str2) {
        androidx.media3.common.util.n0 n0Var = new androidx.media3.common.util.n0(new byte[16]);
        this.f69061a = n0Var;
        this.f69062b = new androidx.media3.common.util.o0(n0Var.f61581a);
        this.f69068h = 0;
        this.f69069i = 0;
        this.f69070j = false;
        this.f69071k = false;
        this.f69075o = -9223372036854775807L;
        this.f69063c = str;
        this.f69064d = i10;
        this.f69065e = str2;
    }
}
