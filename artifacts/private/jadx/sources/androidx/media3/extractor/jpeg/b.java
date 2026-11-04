package androidx.media3.extractor.jpeg;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.o0;
import androidx.media3.common.w;
import androidx.media3.extractor.mp4.p;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class b implements r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f67385n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f67386o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f67387p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f67388q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f67389r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f67390s = 6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f67391t = 6;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f67392u = 1165519206;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f67393v = 65496;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f67394w = 65498;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f67395x = 65504;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f67396y = 65505;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f67397z = "http://ns.adobe.com/xap/1.0/";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t f67399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f67400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f67401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f67402h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private androidx.media3.extractor.metadata.mp4.a f67404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private s f67405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f67406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private p f67407m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f67398d = new o0(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f67403i = -1;

    private void d(s sVar) throws IOException {
        this.f67398d.W(2);
        sVar.i(this.f67398d.e(), 0, 2);
        sVar.n(this.f67398d.T() - 2);
    }

    private void e() {
        ((t) androidx.media3.common.util.a.g(this.f67399e)).l();
        this.f67399e.u(new androidx.media3.extractor.p0.b(-9223372036854775807L));
        int i10 = 5 ^ 6;
        this.f67400f = 6;
    }

    @p0
    private static androidx.media3.extractor.metadata.mp4.a i(String str, long j10) throws IOException {
        c cVarA;
        if (j10 != -1 && (cVarA = f.a(str)) != null) {
            return cVarA.a(j10);
        }
        return null;
    }

    private void j(androidx.media3.extractor.metadata.mp4.a aVar) {
        ((t) androidx.media3.common.util.a.g(this.f67399e)).a(1024, 4).e(new w.b().U("image/jpeg").n0(new r0(aVar)).N());
    }

    private int k(s sVar) throws IOException {
        this.f67398d.W(2);
        sVar.i(this.f67398d.e(), 0, 2);
        return this.f67398d.T();
    }

    private void l(s sVar) throws IOException {
        this.f67398d.W(2);
        sVar.readFully(this.f67398d.e(), 0, 2);
        int iT = this.f67398d.T();
        this.f67401g = iT;
        if (iT == f67394w) {
            if (this.f67403i != -1) {
                this.f67400f = 4;
                return;
            } else {
                e();
                return;
            }
        }
        if ((iT < 65488 || iT > 65497) && iT != 65281) {
            this.f67400f = 1;
        }
    }

    private void m(s sVar) throws IOException {
        String strF;
        if (this.f67401g == f67396y) {
            o0 o0Var = new o0(this.f67402h);
            sVar.readFully(o0Var.e(), 0, this.f67402h);
            if (this.f67404j == null && f67397z.equals(o0Var.F()) && (strF = o0Var.F()) != null) {
                androidx.media3.extractor.metadata.mp4.a aVarI = i(strF, sVar.getLength());
                this.f67404j = aVarI;
                if (aVarI != null) {
                    this.f67403i = aVarI.f67597d;
                }
            }
        } else {
            sVar.o(this.f67402h);
        }
        this.f67400f = 0;
    }

    private void n(s sVar) throws IOException {
        this.f67398d.W(2);
        sVar.readFully(this.f67398d.e(), 0, 2);
        this.f67402h = this.f67398d.T() - 2;
        this.f67400f = 2;
    }

    private void o(s sVar) throws IOException {
        if (!sVar.k(this.f67398d.e(), 0, 1, true)) {
            e();
            return;
        }
        sVar.l();
        if (this.f67407m == null) {
            this.f67407m = new p(androidx.media3.extractor.text.r.a.f68570a, 8);
        }
        d dVar = new d(sVar, this.f67403i);
        this.f67406l = dVar;
        if (!this.f67407m.g(dVar)) {
            e();
        } else {
            this.f67407m.h(new e(this.f67403i, (t) androidx.media3.common.util.a.g(this.f67399e)));
            p();
        }
    }

    private void p() {
        j((androidx.media3.extractor.metadata.mp4.a) androidx.media3.common.util.a.g(this.f67404j));
        this.f67400f = 5;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f67400f = 0;
            this.f67407m = null;
        } else if (this.f67400f == 5) {
            ((p) androidx.media3.common.util.a.g(this.f67407m)).a(j10, j11);
        }
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        int i10 = this.f67400f;
        if (i10 == 0) {
            l(sVar);
            return 0;
        }
        if (i10 == 1) {
            n(sVar);
            return 0;
        }
        if (i10 == 2) {
            m(sVar);
            return 0;
        }
        if (i10 == 4) {
            long position = sVar.getPosition();
            long j10 = this.f67403i;
            if (position != j10) {
                n0Var.f68159a = j10;
                return 1;
            }
            o(sVar);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f67406l == null || sVar != this.f67405k) {
            this.f67405k = sVar;
            this.f67406l = new d(sVar, this.f67403i);
        }
        int iF = ((p) androidx.media3.common.util.a.g(this.f67407m)).f(this.f67406l, n0Var);
        if (iF == 1) {
            n0Var.f68159a += this.f67403i;
        }
        return iF;
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        if (k(sVar) != f67393v) {
            return false;
        }
        int iK = k(sVar);
        this.f67401g = iK;
        if (iK == f67395x) {
            d(sVar);
            this.f67401g = k(sVar);
        }
        if (this.f67401g != f67396y) {
            return false;
        }
        sVar.n(2);
        this.f67398d.W(6);
        sVar.i(this.f67398d.e(), 0, 6);
        return this.f67398d.N() == f67392u && this.f67398d.T() == 0;
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f67399e = tVar;
    }

    @Override // androidx.media3.extractor.r
    public void release() {
        p pVar = this.f67407m;
        if (pVar != null) {
            pVar.release();
        }
    }
}
