package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.v0;
import androidx.media3.extractor.u0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class k implements m {
    static final int A = 5408;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f69152r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f69153s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f69154t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f69155u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f69156v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f69157w = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f69158x = 6;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f69159y = 18;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f69160z = 4096;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69161a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f69163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f69164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f69165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f69166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u0 f69167g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f69171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.media3.common.w f69172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f69174n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69168h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f69177q = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f69162b = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f69175o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f69176p = -1;

    public k(@androidx.annotation.p0 String str, int i10, int i11, String str2) {
        this.f69161a = new androidx.media3.common.util.o0(new byte[i11]);
        this.f69163c = str;
        this.f69164d = i10;
        this.f69165e = str2;
    }

    private boolean f(androidx.media3.common.util.o0 o0Var, byte[] bArr, int i10) {
        int iMin = Math.min(o0Var.a(), i10 - this.f69169i);
        o0Var.n(bArr, this.f69169i, iMin);
        int i11 = this.f69169i + iMin;
        this.f69169i = i11;
        if (i11 != i10) {
            return false;
        }
        boolean z10 = true & true;
        return true;
    }

    @il.m({"output"})
    private void g() {
        byte[] bArrE = this.f69161a.e();
        if (this.f69172l == null) {
            androidx.media3.common.w wVarH = androidx.media3.extractor.o.h(bArrE, this.f69166f, this.f69163c, this.f69164d, this.f69165e, null);
            this.f69172l = wVarH;
            this.f69167g.e(wVarH);
        }
        this.f69173m = androidx.media3.extractor.o.b(bArrE);
        this.f69171k = com.google.common.primitives.l.e(k1.W1(androidx.media3.extractor.o.g(bArrE), this.f69172l.F));
    }

    @il.m({"output"})
    private void h() throws v0 {
        androidx.media3.extractor.o.c cVarI = androidx.media3.extractor.o.i(this.f69161a.e());
        k(cVarI);
        this.f69173m = cVarI.f68189d;
        long j10 = cVarI.f68190e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f69171k = j10;
    }

    @il.m({"output"})
    private void i() throws v0 {
        androidx.media3.extractor.o.c cVarK = androidx.media3.extractor.o.k(this.f69161a.e(), this.f69162b);
        if (this.f69174n == 3) {
            k(cVarK);
        }
        this.f69173m = cVarK.f68189d;
        long j10 = cVarK.f68190e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f69171k = j10;
    }

    private boolean j(androidx.media3.common.util.o0 o0Var) {
        while (o0Var.a() > 0) {
            int i10 = this.f69170j << 8;
            this.f69170j = i10;
            int iL = i10 | o0Var.L();
            this.f69170j = iL;
            int iC = androidx.media3.extractor.o.c(iL);
            this.f69174n = iC;
            if (iC != 0) {
                byte[] bArrE = this.f69161a.e();
                int i11 = this.f69170j;
                bArrE[0] = (byte) ((i11 >> 24) & 255);
                bArrE[1] = (byte) ((i11 >> 16) & 255);
                bArrE[2] = (byte) ((i11 >> 8) & 255);
                bArrE[3] = (byte) (i11 & 255);
                this.f69169i = 4;
                this.f69170j = 0;
                return true;
            }
        }
        return false;
    }

    @il.m({"output"})
    private void k(androidx.media3.extractor.o.c cVar) {
        int i10;
        int i11 = cVar.f68187b;
        if (i11 == -2147483647 || (i10 = cVar.f68188c) == -1) {
            return;
        }
        androidx.media3.common.w wVar = this.f69172l;
        if (wVar != null && i10 == wVar.E && i11 == wVar.F && Objects.equals(cVar.f68186a, wVar.f61761o)) {
            return;
        }
        androidx.media3.common.w wVar2 = this.f69172l;
        androidx.media3.common.w wVarN = (wVar2 == null ? new androidx.media3.common.w.b() : wVar2.b()).f0(this.f69166f).U(this.f69165e).u0(cVar.f68186a).R(cVar.f68188c).v0(cVar.f68187b).j0(this.f69163c).s0(this.f69164d).N();
        this.f69172l = wVarN;
        this.f69167g.e(wVarN);
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        this.f69168h = 0;
        this.f69169i = 0;
        this.f69170j = 0;
        this.f69177q = -9223372036854775807L;
        this.f69162b.set(0);
    }

    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) throws v0 {
        androidx.media3.common.util.a.k(this.f69167g);
        while (o0Var.a() > 0) {
            switch (this.f69168h) {
                case 0:
                    if (j(o0Var)) {
                        int i10 = this.f69174n;
                        if (i10 == 3 || i10 == 4) {
                            this.f69168h = 4;
                        } else if (i10 != 1) {
                            this.f69168h = 2;
                        } else {
                            this.f69168h = 1;
                        }
                    }
                    break;
                case 1:
                    if (f(o0Var, this.f69161a.e(), 18)) {
                        g();
                        this.f69161a.a0(0);
                        this.f69167g.b(this.f69161a, 18);
                        this.f69168h = 6;
                    }
                    break;
                case 2:
                    if (f(o0Var, this.f69161a.e(), 7)) {
                        this.f69175o = androidx.media3.extractor.o.j(this.f69161a.e());
                        this.f69168h = 3;
                    }
                    break;
                case 3:
                    if (f(o0Var, this.f69161a.e(), this.f69175o)) {
                        h();
                        this.f69161a.a0(0);
                        this.f69167g.b(this.f69161a, this.f69175o);
                        this.f69168h = 6;
                    }
                    break;
                case 4:
                    if (f(o0Var, this.f69161a.e(), 6)) {
                        int iL = androidx.media3.extractor.o.l(this.f69161a.e());
                        this.f69176p = iL;
                        int i11 = this.f69169i;
                        if (i11 > iL) {
                            int i12 = i11 - iL;
                            this.f69169i = i11 - i12;
                            o0Var.a0(o0Var.f() - i12);
                        }
                        this.f69168h = 5;
                    }
                    break;
                case 5:
                    if (f(o0Var, this.f69161a.e(), this.f69176p)) {
                        i();
                        this.f69161a.a0(0);
                        this.f69167g.b(this.f69161a, this.f69176p);
                        this.f69168h = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(o0Var.a(), this.f69173m - this.f69169i);
                    this.f69167g.b(o0Var, iMin);
                    int i13 = this.f69169i + iMin;
                    this.f69169i = i13;
                    if (i13 == this.f69173m) {
                        androidx.media3.common.util.a.i(this.f69177q != -9223372036854775807L);
                        this.f69167g.g(this.f69177q, this.f69174n == 4 ? 0 : 1, this.f69173m, 0, null);
                        this.f69177q += this.f69171k;
                        this.f69168h = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        this.f69177q = j10;
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        eVar.a();
        this.f69166f = eVar.b();
        this.f69167g = tVar.a(eVar.c(), 1);
    }

    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
    }
}
