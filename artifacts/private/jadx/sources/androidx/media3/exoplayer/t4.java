package androidx.media3.exoplayer;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public abstract class t4 implements z4, a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c5 f65606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f65607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.source.s1 f65609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f65610e;

    protected void A(long j10, boolean z10) throws s0 {
    }

    protected void E(long j10) throws s0 {
    }

    @Override // androidx.media3.exoplayer.z4
    public final void J(int i10, androidx.media3.exoplayer.analytics.j4 j4Var, androidx.media3.common.util.j jVar) {
        this.f65607b = i10;
    }

    protected void N() {
    }

    @Override // androidx.media3.exoplayer.z4
    public void P(androidx.media3.common.z3 z3Var) {
    }

    protected void S() throws s0 {
    }

    protected void T() {
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean a() {
        return true;
    }

    @Override // androidx.media3.exoplayer.a5
    public int b(androidx.media3.common.w wVar) throws s0 {
        return a5.M(0);
    }

    @androidx.annotation.p0
    protected final c5 c() {
        return this.f65606a;
    }

    @Override // androidx.media3.exoplayer.z4
    public final void d() {
        androidx.media3.common.util.a.i(this.f65608c == 1);
        this.f65608c = 0;
        this.f65609d = null;
        this.f65610e = false;
        k();
    }

    @Override // androidx.media3.exoplayer.z4
    @androidx.annotation.p0
    public final androidx.media3.exoplayer.source.s1 e() {
        return this.f65609d;
    }

    @Override // androidx.media3.exoplayer.z4, androidx.media3.exoplayer.a5
    public final int f() {
        return -2;
    }

    @Override // androidx.media3.exoplayer.z4
    public final int getState() {
        return this.f65608c;
    }

    protected final int h() {
        return this.f65607b;
    }

    @Override // androidx.media3.exoplayer.w4.b
    public void i(int i10, @androidx.annotation.p0 Object obj) throws s0 {
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean isReady() {
        return true;
    }

    protected void k() {
    }

    @Override // androidx.media3.exoplayer.a5
    public int l() throws s0 {
        return 0;
    }

    @Override // androidx.media3.exoplayer.z4
    public final void m(c5 c5Var, androidx.media3.common.w[] wVarArr, androidx.media3.exoplayer.source.s1 s1Var, long j10, boolean z10, boolean z11, long j11, long j12, androidx.media3.exoplayer.source.t0.b bVar) throws s0 {
        androidx.media3.common.util.a.i(this.f65608c == 0);
        this.f65606a = c5Var;
        this.f65608c = 1;
        w(z10);
        y(wVarArr, s1Var, j11, j12, bVar);
        A(j10, z10);
    }

    @Override // androidx.media3.exoplayer.z4
    public final a5 p() {
        return this;
    }

    @Override // androidx.media3.exoplayer.z4
    public final boolean q() {
        return true;
    }

    @Override // androidx.media3.exoplayer.z4
    public final boolean r() {
        return this.f65610e;
    }

    @Override // androidx.media3.exoplayer.z4
    public final void reset() {
        androidx.media3.common.util.a.i(this.f65608c == 0);
        N();
    }

    @Override // androidx.media3.exoplayer.z4
    public long s() {
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.z4
    public final void start() throws s0 {
        androidx.media3.common.util.a.i(this.f65608c == 1);
        this.f65608c = 2;
        S();
    }

    @Override // androidx.media3.exoplayer.z4
    public final void stop() {
        androidx.media3.common.util.a.i(this.f65608c == 2);
        this.f65608c = 1;
        T();
    }

    @Override // androidx.media3.exoplayer.z4
    public final void t(long j10) throws s0 {
        this.f65610e = false;
        A(j10, false);
    }

    @Override // androidx.media3.exoplayer.z4
    @androidx.annotation.p0
    public u3 u() {
        return null;
    }

    @Override // androidx.media3.exoplayer.z4
    public final void v() {
        this.f65610e = true;
    }

    protected void w(boolean z10) throws s0 {
    }

    @Override // androidx.media3.exoplayer.z4
    public final void x() throws IOException {
    }

    @Override // androidx.media3.exoplayer.z4
    public final void y(androidx.media3.common.w[] wVarArr, androidx.media3.exoplayer.source.s1 s1Var, long j10, long j11, androidx.media3.exoplayer.source.t0.b bVar) throws s0 {
        androidx.media3.common.util.a.i(!this.f65610e);
        this.f65609d = s1Var;
        E(j11);
    }
}
