package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes3.dex */
final class n implements u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h5 f64232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f64233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private z4 f64234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private u3 f64235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f64236e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f64237f;

    public interface a {
        void u(androidx.media3.common.y0 y0Var);
    }

    public n(a aVar, androidx.media3.common.util.j jVar) {
        this.f64233b = aVar;
        this.f64232a = new h5(jVar);
    }

    private boolean e(boolean z10) {
        z4 z4Var = this.f64234c;
        if (z4Var == null || z4Var.a()) {
            return true;
        }
        if (z10 && this.f64234c.getState() != 2) {
            return true;
        }
        if (this.f64234c.isReady() || (!z10 && !this.f64234c.q())) {
            return false;
        }
        return true;
    }

    private void j(boolean z10) {
        if (e(z10)) {
            this.f64236e = true;
            if (this.f64237f) {
                this.f64232a.b();
                return;
            }
            return;
        }
        u3 u3Var = (u3) androidx.media3.common.util.a.g(this.f64235d);
        long jK = u3Var.k();
        if (this.f64236e) {
            if (jK < this.f64232a.k()) {
                this.f64232a.d();
                return;
            } else {
                this.f64236e = false;
                if (this.f64237f) {
                    this.f64232a.b();
                }
            }
        }
        this.f64232a.a(jK);
        androidx.media3.common.y0 y0VarC = u3Var.c();
        if (y0VarC.equals(this.f64232a.c())) {
            return;
        }
        this.f64232a.h(y0VarC);
        this.f64233b.u(y0VarC);
    }

    public void a(z4 z4Var) {
        if (z4Var == this.f64234c) {
            this.f64235d = null;
            this.f64234c = null;
            this.f64236e = true;
        }
    }

    public void b(z4 z4Var) throws s0 {
        u3 u3Var;
        u3 u3VarU = z4Var.u();
        if (u3VarU == null || u3VarU == (u3Var = this.f64235d)) {
            return;
        }
        if (u3Var != null) {
            throw s0.o(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f64235d = u3VarU;
        this.f64234c = z4Var;
        u3VarU.h(this.f64232a.c());
    }

    @Override // androidx.media3.exoplayer.u3
    public androidx.media3.common.y0 c() {
        u3 u3Var = this.f64235d;
        return u3Var != null ? u3Var.c() : this.f64232a.c();
    }

    public void d(long j10) {
        this.f64232a.a(j10);
    }

    public void f() {
        this.f64237f = true;
        this.f64232a.b();
    }

    public void g() {
        this.f64237f = false;
        this.f64232a.d();
    }

    @Override // androidx.media3.exoplayer.u3
    public void h(androidx.media3.common.y0 y0Var) {
        u3 u3Var = this.f64235d;
        if (u3Var != null) {
            u3Var.h(y0Var);
            y0Var = this.f64235d.c();
        }
        this.f64232a.h(y0Var);
    }

    public long i(boolean z10) {
        j(z10);
        return k();
    }

    @Override // androidx.media3.exoplayer.u3
    public long k() {
        return this.f64236e ? this.f64232a.k() : ((u3) androidx.media3.common.util.a.g(this.f64235d)).k();
    }

    @Override // androidx.media3.exoplayer.u3
    public boolean w() {
        return this.f64236e ? this.f64232a.w() : ((u3) androidx.media3.common.util.a.g(this.f64235d)).w();
    }
}
