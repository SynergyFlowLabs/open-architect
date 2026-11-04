package androidx.media3.extractor.ogg;

import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.w;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.p0;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import androidx.media3.extractor.u0;
import il.m;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
abstract class i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f68251n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f68252o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f68253p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f68254q = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u0 f68256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t f68257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f68258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f68259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f68260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f68261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f68263i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f68265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f68266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f68267m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f68255a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f68264j = new b();

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        w f68268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f68269b;

        b() {
        }
    }

    private static final class c implements g {
        private c() {
        }

        @Override // androidx.media3.extractor.ogg.g
        public p0 a() {
            return new p0.b(-9223372036854775807L);
        }

        @Override // androidx.media3.extractor.ogg.g
        public long b(s sVar) {
            return -1L;
        }

        @Override // androidx.media3.extractor.ogg.g
        public void c(long j10) {
        }
    }

    @il.d({"trackOutput", "extractorOutput"})
    private void a() {
        androidx.media3.common.util.a.k(this.f68256b);
        k1.o(this.f68257c);
    }

    @il.e(expression = {"setupData.format"}, result = true)
    private boolean i(s sVar) throws IOException {
        while (this.f68255a.d(sVar)) {
            this.f68265k = sVar.getPosition() - this.f68260f;
            if (!h(this.f68255a.c(), this.f68260f, this.f68264j)) {
                return true;
            }
            this.f68260f = sVar.getPosition();
        }
        this.f68262h = 3;
        return false;
    }

    @m({"trackOutput"})
    private int j(s sVar) throws IOException {
        if (!i(sVar)) {
            return -1;
        }
        w wVar = this.f68264j.f68268a;
        this.f68263i = wVar.F;
        if (!this.f68267m) {
            this.f68256b.e(wVar);
            this.f68267m = true;
        }
        g gVar = this.f68264j.f68269b;
        if (gVar != null) {
            this.f68258d = gVar;
        } else if (sVar.getLength() == -1) {
            this.f68258d = new c();
        } else {
            f fVarB = this.f68255a.b();
            this.f68258d = new androidx.media3.extractor.ogg.a(this, this.f68260f, sVar.getLength(), fVarB.f68244h + fVarB.f68245i, fVarB.f68239c, (fVarB.f68238b & 4) != 0);
        }
        this.f68262h = 2;
        this.f68255a.f();
        return 0;
    }

    @m({"trackOutput", "oggSeeker", "extractorOutput"})
    private int k(s sVar, n0 n0Var) throws IOException {
        long jB = this.f68258d.b(sVar);
        if (jB >= 0) {
            n0Var.f68159a = jB;
            return 1;
        }
        if (jB < -1) {
            e(-(jB + 2));
        }
        if (!this.f68266l) {
            p0 p0Var = (p0) androidx.media3.common.util.a.k(this.f68258d.a());
            this.f68257c.u(p0Var);
            this.f68256b.c(p0Var.Q1());
            this.f68266l = true;
        }
        if (this.f68265k <= 0 && !this.f68255a.d(sVar)) {
            this.f68262h = 3;
            return -1;
        }
        this.f68265k = 0L;
        o0 o0VarC = this.f68255a.c();
        long jF = f(o0VarC);
        if (jF >= 0) {
            long j10 = this.f68261g;
            if (j10 + jF >= this.f68259e) {
                long jB2 = b(j10);
                this.f68256b.b(o0VarC, o0VarC.g());
                this.f68256b.g(jB2, 1, o0VarC.g(), 0, null);
                this.f68259e = -1L;
            }
        }
        this.f68261g += jF;
        return 0;
    }

    protected long b(long j10) {
        return (j10 * 1000000) / ((long) this.f68263i);
    }

    protected long c(long j10) {
        return (((long) this.f68263i) * j10) / 1000000;
    }

    void d(t tVar, u0 u0Var) {
        this.f68257c = tVar;
        this.f68256b = u0Var;
        l(true);
    }

    protected void e(long j10) {
        this.f68261g = j10;
    }

    protected abstract long f(o0 o0Var);

    final int g(s sVar, n0 n0Var) throws IOException {
        a();
        int i10 = this.f68262h;
        if (i10 == 0) {
            return j(sVar);
        }
        if (i10 == 1) {
            sVar.o((int) this.f68260f);
            this.f68262h = 2;
            return 0;
        }
        if (i10 == 2) {
            k1.o(this.f68258d);
            return k(sVar, n0Var);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @il.e(expression = {"#3.format"}, result = false)
    protected abstract boolean h(o0 o0Var, long j10, b bVar) throws IOException;

    protected void l(boolean z10) {
        if (z10) {
            this.f68264j = new b();
            this.f68260f = 0L;
            this.f68262h = 0;
        } else {
            this.f68262h = 1;
        }
        this.f68259e = -1L;
        this.f68261g = 0L;
    }

    final void m(long j10, long j11) {
        this.f68255a.e();
        if (j10 == 0) {
            l(!this.f68266l);
        } else if (this.f68262h != 0) {
            this.f68259e = c(j11);
            ((g) k1.o(this.f68258d)).c(this.f68259e);
            this.f68262h = 2;
        }
    }
}
