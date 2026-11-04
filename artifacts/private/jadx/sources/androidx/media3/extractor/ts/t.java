package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.extractor.u0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class t implements m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f69448o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f69449p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f69450q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f69451r = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.extractor.k0.a f69453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f69454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f69455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f69456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u0 f69457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f69458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f69462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f69463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f69465n;

    public t(String str) {
        this(null, 0, str);
    }

    private void f(androidx.media3.common.util.o0 o0Var) {
        byte[] bArrE = o0Var.e();
        int iG = o0Var.g();
        for (int iF = o0Var.f(); iF < iG; iF++) {
            byte b10 = bArrE[iF];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f69462k && (b10 & org.msgpack.core.h.a.K) == 224;
            this.f69462k = z10;
            if (z11) {
                o0Var.a0(iF + 1);
                this.f69462k = false;
                this.f69452a.e()[1] = bArrE[iF];
                this.f69460i = 2;
                this.f69459h = 1;
                return;
            }
        }
        o0Var.a0(iG);
    }

    @il.m({"output"})
    private void g(androidx.media3.common.util.o0 o0Var) {
        int iMin = Math.min(o0Var.a(), this.f69464m - this.f69460i);
        this.f69457f.b(o0Var, iMin);
        int i10 = this.f69460i + iMin;
        this.f69460i = i10;
        if (i10 < this.f69464m) {
            return;
        }
        androidx.media3.common.util.a.i(this.f69465n != -9223372036854775807L);
        this.f69457f.g(this.f69465n, 1, this.f69464m, 0, null);
        this.f69465n += this.f69463l;
        this.f69460i = 0;
        this.f69459h = 0;
    }

    @il.m({"output"})
    private void h(androidx.media3.common.util.o0 o0Var) {
        int iMin = Math.min(o0Var.a(), 4 - this.f69460i);
        o0Var.n(this.f69452a.e(), this.f69460i, iMin);
        int i10 = this.f69460i + iMin;
        this.f69460i = i10;
        if (i10 < 4) {
            return;
        }
        this.f69452a.a0(0);
        if (!this.f69453b.a(this.f69452a.s())) {
            this.f69460i = 0;
            this.f69459h = 1;
            return;
        }
        androidx.media3.extractor.k0.a aVar = this.f69453b;
        this.f69464m = aVar.f67438c;
        if (!this.f69461j) {
            this.f69463l = (((long) aVar.f67442g) * 1000000) / ((long) aVar.f67439d);
            this.f69457f.e(new androidx.media3.common.w.b().f0(this.f69458g).U(this.f69456e).u0(this.f69453b.f67437b).k0(4096).R(this.f69453b.f67440e).v0(this.f69453b.f67439d).j0(this.f69454c).s0(this.f69455d).N());
            this.f69461j = true;
        }
        this.f69452a.a0(0);
        this.f69457f.b(this.f69452a, 4);
        this.f69459h = 2;
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        this.f69459h = 0;
        this.f69460i = 0;
        this.f69462k = false;
        this.f69465n = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) {
        androidx.media3.common.util.a.k(this.f69457f);
        while (o0Var.a() > 0) {
            int i10 = this.f69459h;
            if (i10 == 0) {
                f(o0Var);
            } else if (i10 == 1) {
                h(o0Var);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                g(o0Var);
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        this.f69465n = j10;
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        eVar.a();
        this.f69458g = eVar.b();
        this.f69457f = tVar.a(eVar.c(), 1);
    }

    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
    }

    public t(@androidx.annotation.p0 String str, int i10, String str2) {
        this.f69459h = 0;
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(4);
        this.f69452a = o0Var;
        o0Var.e()[0] = -1;
        this.f69453b = new androidx.media3.extractor.k0.a();
        this.f69465n = -9223372036854775807L;
        this.f69454c = str;
        this.f69455d = i10;
        this.f69456e = str2;
    }
}
