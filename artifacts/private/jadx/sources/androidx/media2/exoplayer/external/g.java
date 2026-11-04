package androidx.media2.exoplayer.external;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class g implements androidx.media2.exoplayer.external.util.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.g0 f55218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f55219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private t0 f55220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.util.r f55221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55222e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f55223f;

    public interface a {
        void f(m0 newPlaybackParameters);
    }

    public g(a listener, androidx.media2.exoplayer.external.util.c clock) {
        this.f55219b = listener;
        this.f55218a = new androidx.media2.exoplayer.external.util.g0(clock);
    }

    private boolean e(boolean isReadingAhead) {
        t0 t0Var = this.f55220c;
        return t0Var == null || t0Var.a() || (!this.f55220c.isReady() && (isReadingAhead || this.f55220c.q()));
    }

    private void i(boolean isReadingAhead) {
        if (e(isReadingAhead)) {
            this.f55222e = true;
            if (this.f55223f) {
                this.f55218a.b();
                return;
            }
            return;
        }
        long jK = this.f55221d.k();
        if (this.f55222e) {
            if (jK < this.f55218a.k()) {
                this.f55218a.d();
                return;
            } else {
                this.f55222e = false;
                if (this.f55223f) {
                    this.f55218a.b();
                }
            }
        }
        this.f55218a.a(jK);
        m0 m0VarC = this.f55221d.c();
        if (m0VarC.equals(this.f55218a.c())) {
            return;
        }
        this.f55218a.w(m0VarC);
        this.f55219b.f(m0VarC);
    }

    public void a(t0 renderer) {
        if (renderer == this.f55220c) {
            this.f55221d = null;
            this.f55220c = null;
            this.f55222e = true;
        }
    }

    public void b(t0 renderer) throws i {
        androidx.media2.exoplayer.external.util.r rVar;
        androidx.media2.exoplayer.external.util.r rVarU = renderer.u();
        if (rVarU == null || rVarU == (rVar = this.f55221d)) {
            return;
        }
        if (rVar != null) {
            throw i.e(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f55221d = rVarU;
        this.f55220c = renderer;
        rVarU.w(this.f55218a.c());
    }

    @Override // androidx.media2.exoplayer.external.util.r
    public m0 c() {
        androidx.media2.exoplayer.external.util.r rVar = this.f55221d;
        return rVar != null ? rVar.c() : this.f55218a.c();
    }

    public void d(long positionUs) {
        this.f55218a.a(positionUs);
    }

    public void f() {
        this.f55223f = true;
        this.f55218a.b();
    }

    public void g() {
        this.f55223f = false;
        this.f55218a.d();
    }

    public long h(boolean isReadingAhead) {
        i(isReadingAhead);
        return k();
    }

    @Override // androidx.media2.exoplayer.external.util.r
    public long k() {
        return this.f55222e ? this.f55218a.k() : this.f55221d.k();
    }

    @Override // androidx.media2.exoplayer.external.util.r
    public void w(m0 playbackParameters) {
        androidx.media2.exoplayer.external.util.r rVar = this.f55221d;
        if (rVar != null) {
            rVar.w(playbackParameters);
            playbackParameters = this.f55221d.c();
        }
        this.f55218a.w(playbackParameters);
    }
}
