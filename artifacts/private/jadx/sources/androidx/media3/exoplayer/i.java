package androidx.media3.exoplayer;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public abstract class i implements z4, a5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63842b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private c5 f63844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f63845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.media3.exoplayer.analytics.j4 f63846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media3.common.util.j f63847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f63848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.source.s1 f63849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.common.w[] f63850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f63851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f63852l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f63854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f63855o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    @androidx.annotation.p0
    private a5.f f63857t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f63841a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p3 f63843c = new p3();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f63853m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private androidx.media3.common.z3 f63856s = androidx.media3.common.z3.f61958a;

    public i(int i10) {
        this.f63842b = i10;
    }

    private void q0(long j10, boolean z10) throws s0 {
        this.f63854n = false;
        this.f63852l = j10;
        this.f63853m = j10;
        h0(j10, z10);
    }

    @Override // androidx.media3.exoplayer.a5
    public final void G() {
        synchronized (this.f63841a) {
            this.f63857t = null;
        }
    }

    @Override // androidx.media3.exoplayer.z4
    public final void J(int i10, androidx.media3.exoplayer.analytics.j4 j4Var, androidx.media3.common.util.j jVar) {
        this.f63845e = i10;
        this.f63846f = j4Var;
        this.f63847g = jVar;
        g0();
    }

    @Override // androidx.media3.exoplayer.z4
    public final void P(androidx.media3.common.z3 z3Var) {
        if (!Objects.equals(this.f63856s, z3Var)) {
            this.f63856s = z3Var;
            o0(z3Var);
        }
    }

    @Override // androidx.media3.exoplayer.a5
    public final void Q(a5.f fVar) {
        synchronized (this.f63841a) {
            this.f63857t = fVar;
        }
    }

    protected final s0 S(Throwable th2, @androidx.annotation.p0 androidx.media3.common.w wVar, int i10) {
        return T(th2, wVar, false, i10);
    }

    protected final s0 T(Throwable th2, @androidx.annotation.p0 androidx.media3.common.w wVar, boolean z10, int i10) {
        int iF;
        if (wVar == null || this.f63855o) {
            iF = 4;
        } else {
            this.f63855o = true;
            try {
                iF = a5.F(b(wVar));
                this.f63855o = false;
            } catch (s0 unused) {
                this.f63855o = false;
                iF = 4;
            } catch (Throwable th3) {
                this.f63855o = false;
                throw th3;
            }
        }
        return s0.l(th2, getName(), X(), wVar, iF, z10, i10);
    }

    protected final androidx.media3.common.util.j U() {
        return (androidx.media3.common.util.j) androidx.media3.common.util.a.g(this.f63847g);
    }

    protected final c5 V() {
        return (c5) androidx.media3.common.util.a.g(this.f63844d);
    }

    protected final p3 W() {
        this.f63843c.a();
        return this.f63843c;
    }

    protected final int X() {
        return this.f63845e;
    }

    protected final long Y() {
        return this.f63852l;
    }

    protected final androidx.media3.exoplayer.analytics.j4 Z() {
        return (androidx.media3.exoplayer.analytics.j4) androidx.media3.common.util.a.g(this.f63846f);
    }

    protected final androidx.media3.common.w[] a0() {
        return (androidx.media3.common.w[]) androidx.media3.common.util.a.g(this.f63850j);
    }

    protected final long b0() {
        return this.f63851k;
    }

    protected final androidx.media3.common.z3 c0() {
        return this.f63856s;
    }

    @Override // androidx.media3.exoplayer.z4
    public final void d() {
        boolean z10 = true;
        if (this.f63848h != 1) {
            z10 = false;
        }
        androidx.media3.common.util.a.i(z10);
        this.f63843c.a();
        this.f63848h = 0;
        this.f63849i = null;
        this.f63850j = null;
        this.f63854n = false;
        e0();
    }

    protected final boolean d0() {
        return q() ? this.f63854n : ((androidx.media3.exoplayer.source.s1) androidx.media3.common.util.a.g(this.f63849i)).isReady();
    }

    @Override // androidx.media3.exoplayer.z4
    @androidx.annotation.p0
    public final androidx.media3.exoplayer.source.s1 e() {
        return this.f63849i;
    }

    protected void e0() {
    }

    @Override // androidx.media3.exoplayer.z4, androidx.media3.exoplayer.a5
    public final int f() {
        return this.f63842b;
    }

    protected void f0(boolean z10, boolean z11) throws s0 {
    }

    protected void g0() {
    }

    @Override // androidx.media3.exoplayer.z4
    public final int getState() {
        return this.f63848h;
    }

    protected void h0(long j10, boolean z10) throws s0 {
    }

    @Override // androidx.media3.exoplayer.w4.b
    public void i(int i10, @androidx.annotation.p0 Object obj) throws s0 {
    }

    protected void i0() {
    }

    protected final void j0() {
        a5.f fVar;
        synchronized (this.f63841a) {
            try {
                fVar = this.f63857t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (fVar != null) {
            fVar.a(this);
        }
    }

    protected void k0() {
    }

    @Override // androidx.media3.exoplayer.a5
    public int l() throws s0 {
        return 0;
    }

    protected void l0() throws s0 {
    }

    @Override // androidx.media3.exoplayer.z4
    public final void m(c5 c5Var, androidx.media3.common.w[] wVarArr, androidx.media3.exoplayer.source.s1 s1Var, long j10, boolean z10, boolean z11, long j11, long j12, androidx.media3.exoplayer.source.t0.b bVar) throws s0 {
        androidx.media3.common.util.a.i(this.f63848h == 0);
        this.f63844d = c5Var;
        this.f63848h = 1;
        f0(z10, z11);
        y(wVarArr, s1Var, j11, j12, bVar);
        q0(j11, z10);
    }

    protected void m0() {
    }

    protected void n0(androidx.media3.common.w[] wVarArr, long j10, long j11, androidx.media3.exoplayer.source.t0.b bVar) throws s0 {
    }

    protected void o0(androidx.media3.common.z3 z3Var) {
    }

    @Override // androidx.media3.exoplayer.z4
    public final a5 p() {
        return this;
    }

    protected final int p0(p3 p3Var, androidx.media3.decoder.g gVar, int i10) {
        int iR = ((androidx.media3.exoplayer.source.s1) androidx.media3.common.util.a.g(this.f63849i)).r(p3Var, gVar, i10);
        if (iR != -4) {
            if (iR == -5) {
                androidx.media3.common.w wVar = (androidx.media3.common.w) androidx.media3.common.util.a.g(p3Var.f64600b);
                if (wVar.f61766t != Long.MAX_VALUE) {
                    p3Var.f64600b = wVar.b().y0(wVar.f61766t + this.f63851k).N();
                }
            }
            return iR;
        }
        if (gVar.s()) {
            this.f63853m = Long.MIN_VALUE;
            return this.f63854n ? -4 : -3;
        }
        long j10 = gVar.f62702f + this.f63851k;
        gVar.f62702f = j10;
        this.f63853m = Math.max(this.f63853m, j10);
        return iR;
    }

    @Override // androidx.media3.exoplayer.z4
    public final boolean q() {
        return this.f63853m == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.z4
    public final boolean r() {
        return this.f63854n;
    }

    protected int r0(long j10) {
        return ((androidx.media3.exoplayer.source.s1) androidx.media3.common.util.a.g(this.f63849i)).l(j10 - this.f63851k);
    }

    @Override // androidx.media3.exoplayer.z4
    public final void release() {
        androidx.media3.common.util.a.i(this.f63848h == 0);
        i0();
    }

    @Override // androidx.media3.exoplayer.z4
    public final void reset() {
        androidx.media3.common.util.a.i(this.f63848h == 0);
        this.f63843c.a();
        k0();
    }

    @Override // androidx.media3.exoplayer.z4
    public final long s() {
        return this.f63853m;
    }

    @Override // androidx.media3.exoplayer.z4
    public final void start() throws s0 {
        androidx.media3.common.util.a.i(this.f63848h == 1);
        this.f63848h = 2;
        l0();
    }

    @Override // androidx.media3.exoplayer.z4
    public final void stop() {
        androidx.media3.common.util.a.i(this.f63848h == 2);
        this.f63848h = 1;
        m0();
    }

    @Override // androidx.media3.exoplayer.z4
    public final void t(long j10) throws s0 {
        q0(j10, false);
    }

    @Override // androidx.media3.exoplayer.z4
    @androidx.annotation.p0
    public u3 u() {
        return null;
    }

    @Override // androidx.media3.exoplayer.z4
    public final void v() {
        this.f63854n = true;
    }

    @Override // androidx.media3.exoplayer.z4
    public final void x() throws IOException {
        ((androidx.media3.exoplayer.source.s1) androidx.media3.common.util.a.g(this.f63849i)).a();
    }

    @Override // androidx.media3.exoplayer.z4
    public final void y(androidx.media3.common.w[] wVarArr, androidx.media3.exoplayer.source.s1 s1Var, long j10, long j11, androidx.media3.exoplayer.source.t0.b bVar) throws s0 {
        androidx.media3.common.util.a.i(!this.f63854n);
        this.f63849i = s1Var;
        if (this.f63853m == Long.MIN_VALUE) {
            this.f63853m = j10;
        }
        this.f63850j = wVarArr;
        this.f63851k = j11;
        n0(wVarArr, j10, j11, bVar);
    }
}
