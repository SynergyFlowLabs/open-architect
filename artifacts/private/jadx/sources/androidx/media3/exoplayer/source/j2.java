package androidx.media3.exoplayer.source;

import androidx.media3.common.z3;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public abstract class j2 extends h<Void> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Void f65087l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final t0 f65088k;

    protected j2(t0 t0Var) {
        this.f65088k = t0Var;
    }

    protected final void D0() {
        v0(f65087l);
    }

    protected final void E0() {
        w0(f65087l);
    }

    @androidx.annotation.p0
    protected t0.b F0(t0.b bVar) {
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    @androidx.annotation.p0
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final t0.b x0(Void r10, t0.b bVar) {
        return F0(bVar);
    }

    protected long H0(long j10, @androidx.annotation.p0 t0.b bVar) {
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public final long y0(Void r10, long j10, @androidx.annotation.p0 t0.b bVar) {
        return H0(j10, bVar);
    }

    protected int J0(int i10) {
        return i10;
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void K(androidx.media3.common.k0 k0Var) {
        this.f65088k.K(k0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final int z0(Void r10, int i10) {
        return J0(i10);
    }

    protected void L0(z3 z3Var) {
        k0(z3Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public final void A0(Void r10, t0 t0Var, z3 z3Var) {
        L0(z3Var);
    }

    @Override // androidx.media3.exoplayer.source.t0
    public boolean N() {
        return this.f65088k.N();
    }

    protected final void N0() {
        B0(f65087l, this.f65088k);
    }

    @Override // androidx.media3.exoplayer.source.t0
    public boolean O(androidx.media3.common.k0 k0Var) {
        return this.f65088k.O(k0Var);
    }

    protected void O0() {
        N0();
    }

    protected final void P0() {
        C0(f65087l);
    }

    @Override // androidx.media3.exoplayer.source.t0
    public androidx.media3.common.k0 g() {
        return this.f65088k.g();
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected final void j0(@androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        super.j0(r1Var);
        O0();
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        this.f65088k.l(s0Var);
    }

    @Override // androidx.media3.exoplayer.source.t0
    @androidx.annotation.p0
    public z3 u() {
        return this.f65088k.u();
    }

    @Override // androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        return this.f65088k.x(bVar, bVar2, j10);
    }
}
