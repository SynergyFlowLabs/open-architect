package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
@Deprecated
public class g5 extends androidx.media3.common.g implements ExoPlayer {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private final y2 f63803c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private final androidx.media3.common.util.m f63804d1;

    @Deprecated
    protected g5(Context context, e5 e5Var, androidx.media3.exoplayer.trackselection.k0 k0Var, androidx.media3.exoplayer.source.t0.a aVar, s3 s3Var, androidx.media3.exoplayer.upstream.d dVar, androidx.media3.exoplayer.analytics.a aVar2, boolean z10, androidx.media3.common.util.j jVar, Looper looper) {
        this(new ExoPlayer.b(context, e5Var, aVar, k0Var, s3Var, dVar, aVar2).b0(z10).D(jVar).J(looper));
    }

    private void F2() {
        this.f63804d1.c();
    }

    @Override // androidx.media3.common.z0
    public void A() {
        F2();
        this.f63803c1.A();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void A0(@androidx.annotation.p0 f5 f5Var) {
        F2();
        this.f63803c1.A0(f5Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void B0(androidx.media3.exoplayer.source.t0 t0Var, boolean z10) {
        F2();
        this.f63803c1.B0(t0Var, z10);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void B1() {
        F2();
        this.f63803c1.B1();
    }

    @Override // androidx.media3.common.z0
    public int C() {
        F2();
        return this.f63803c1.C();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void C0(ExoPlayer.a aVar) {
        F2();
        this.f63803c1.C0(aVar);
    }

    @Override // androidx.media3.common.z0
    public void D(int i10) {
        F2();
        this.f63803c1.D(i10);
    }

    @Override // androidx.media3.common.z0
    public void D0(int i10) {
        F2();
        this.f63803c1.D0(i10);
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.util.r0 D1() {
        F2();
        return this.f63803c1.D1();
    }

    @Override // androidx.media3.common.z0
    public int E() {
        F2();
        return this.f63803c1.E();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void E0(androidx.media3.exoplayer.source.t0 t0Var, long j10) {
        F2();
        this.f63803c1.E0(t0Var, j10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void E1(ExoPlayer.c cVar) {
        F2();
        this.f63803c1.E1(cVar);
    }

    @Override // androidx.media3.common.z0
    public void F0(androidx.media3.common.q0 q0Var) {
        F2();
        this.f63803c1.F0(q0Var);
    }

    void G2(boolean z10) {
        F2();
        this.f63803c1.t4(z10);
    }

    @Override // androidx.media3.common.z0
    public int H() {
        F2();
        return this.f63803c1.H();
    }

    @Override // androidx.media3.common.z0
    public void H0(int i10, int i11) {
        F2();
        this.f63803c1.H0(i10, i11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void H1(List<androidx.media3.exoplayer.source.t0> list) {
        F2();
        this.f63803c1.H1(list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public androidx.media3.exoplayer.source.h2 I() {
        F2();
        return this.f63803c1.I();
    }

    @Override // androidx.media3.common.z0
    public boolean J() {
        F2();
        return this.f63803c1.J();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void J0(androidx.media3.exoplayer.analytics.b bVar) {
        F2();
        this.f63803c1.J0(bVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public w4 J1(w4.b bVar) {
        F2();
        return this.f63803c1.J1(bVar);
    }

    @Override // androidx.media3.common.z0
    public void K(boolean z10) {
        F2();
        this.f63803c1.K(z10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int K1() {
        F2();
        return this.f63803c1.K1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void L(List<androidx.media3.common.p> list) {
        F2();
        this.f63803c1.L(list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @androidx.annotation.p0
    public androidx.media3.common.w L1() {
        F2();
        return this.f63803c1.L1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int M() {
        F2();
        return this.f63803c1.M();
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.i4 M0() {
        F2();
        return this.f63803c1.M0();
    }

    @Override // androidx.media3.common.z0
    public void M1(int i10) {
        F2();
        this.f63803c1.M1(i10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @androidx.annotation.w0(23)
    public void N0(@androidx.annotation.p0 AudioDeviceInfo audioDeviceInfo) {
        F2();
        this.f63803c1.N0(audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void N1(List<androidx.media3.exoplayer.source.t0> list, boolean z10) {
        F2();
        this.f63803c1.N1(list, z10);
    }

    @Override // androidx.media3.common.z0
    public int O() {
        F2();
        return this.f63803c1.O();
    }

    @Override // androidx.media3.common.z0
    public int P() {
        F2();
        return this.f63803c1.P();
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.text.d P1() {
        F2();
        return this.f63803c1.P1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void Q0(boolean z10) {
        F2();
        this.f63803c1.Q0(z10);
    }

    @Override // androidx.media3.common.z0
    public void Q1(androidx.media3.common.z0.g gVar) {
        F2();
        this.f63803c1.Q1(gVar);
    }

    @Override // androidx.media3.common.z0
    public long R() {
        F2();
        return this.f63803c1.R();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void R0(boolean z10) {
        F2();
        this.f63803c1.R0(z10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void R1(boolean z10) {
        F2();
        this.f63803c1.R1(z10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void S0(List<androidx.media3.exoplayer.source.t0> list, int i10, long j10) {
        F2();
        this.f63803c1.S0(list, i10, j10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void S1(int i10) {
        F2();
        this.f63803c1.S1(i10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean T0() {
        return this.f63803c1.T0();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void U0() {
        F2();
        this.f63803c1.U0();
    }

    @Override // androidx.media3.common.z0
    public void U1(androidx.media3.common.z0.g gVar) {
        F2();
        this.f63803c1.U1(gVar);
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.q0 V() {
        F2();
        return this.f63803c1.V();
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.e4 V0() {
        F2();
        return this.f63803c1.V0();
    }

    @Override // androidx.media3.common.z0
    public int V1() {
        F2();
        return this.f63803c1.V1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void W(boolean z10) {
        F2();
        this.f63803c1.W(z10);
    }

    @Override // androidx.media3.common.z0
    public int W0() {
        F2();
        return this.f63803c1.W0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void W1(androidx.media3.exoplayer.analytics.b bVar) {
        F2();
        this.f63803c1.W1(bVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean Y1() {
        F2();
        return this.f63803c1.Y1();
    }

    @Override // androidx.media3.common.z0
    public long Z0() {
        F2();
        return this.f63803c1.Z0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void a1(int i10, List<androidx.media3.exoplayer.source.t0> list) {
        F2();
        this.f63803c1.a1(i10, list);
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.z0.c a2() {
        F2();
        return this.f63803c1.a2();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void b(int i10) {
        F2();
        this.f63803c1.b(i10);
    }

    @Override // androidx.media3.common.z0
    public void b0(boolean z10) {
        F2();
        this.f63803c1.b0(z10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public z4 b1(int i10) {
        F2();
        return this.f63803c1.b1(i10);
    }

    @Override // androidx.media3.common.z0
    public void b2(int i10, int i11) {
        F2();
        this.f63803c1.b2(i10, i11);
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.y0 c() {
        F2();
        return this.f63803c1.c();
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.z3 c0() {
        F2();
        return this.f63803c1.c0();
    }

    @Override // androidx.media3.common.z0
    public void c1(androidx.media3.common.d dVar, boolean z10) {
        F2();
        this.f63803c1.c1(dVar, z10);
    }

    @Override // androidx.media3.common.z0
    public boolean d() {
        F2();
        return this.f63803c1.d();
    }

    @Override // androidx.media3.common.z0
    public Looper d0() {
        F2();
        return this.f63803c1.d0();
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.o d1() {
        F2();
        return this.f63803c1.d1();
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.d e() {
        F2();
        return this.f63803c1.e();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void e1(ExoPlayer.a aVar) {
        F2();
        this.f63803c1.e1(aVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public ExoPlayer.c e2() {
        F2();
        return this.f63803c1.e2();
    }

    @Override // androidx.media3.common.z0
    public void f(float f10) {
        F2();
        this.f63803c1.f(f10);
    }

    @Override // androidx.media3.common.z0
    public void f0(@androidx.annotation.p0 TextureView textureView) {
        F2();
        this.f63803c1.f0(textureView);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void f1(List<androidx.media3.exoplayer.source.t0> list) {
        F2();
        this.f63803c1.f1(list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @androidx.annotation.p0
    public androidx.media3.common.w f2() {
        F2();
        return this.f63803c1.f2();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void g(int i10) {
        F2();
        this.f63803c1.g(i10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public androidx.media3.exoplayer.trackselection.i0 g0() {
        F2();
        return this.f63803c1.g0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void g1(androidx.media3.exoplayer.source.t0 t0Var) {
        F2();
        this.f63803c1.g1(t0Var);
    }

    @Override // androidx.media3.common.z0
    public void g2(int i10, List<androidx.media3.common.k0> list) {
        F2();
        this.f63803c1.g2(i10, list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getAudioSessionId() {
        F2();
        return this.f63803c1.getAudioSessionId();
    }

    @Override // androidx.media3.common.z0
    public long getCurrentPosition() {
        F2();
        return this.f63803c1.getCurrentPosition();
    }

    @Override // androidx.media3.common.z0
    public long getDuration() {
        F2();
        return this.f63803c1.getDuration();
    }

    @Override // androidx.media3.common.z0
    public void h(androidx.media3.common.y0 y0Var) {
        F2();
        this.f63803c1.h(y0Var);
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.n4 h0() {
        F2();
        return this.f63803c1.h0();
    }

    @Override // androidx.media3.common.z0
    public void h1(List<androidx.media3.common.k0> list, int i10, long j10) {
        F2();
        this.f63803c1.h1(list, i10, j10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void h2(int i10, androidx.media3.exoplayer.source.t0 t0Var) {
        F2();
        this.f63803c1.h2(i10, t0Var);
    }

    @Override // androidx.media3.common.z0
    public void i(@androidx.annotation.p0 Surface surface) {
        F2();
        this.f63803c1.i(surface);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int i0(int i10) {
        F2();
        return this.f63803c1.i0(i10);
    }

    @Override // androidx.media3.common.z0
    public long i1() {
        F2();
        return this.f63803c1.i1();
    }

    @Override // androidx.media3.common.z0
    public void j(@androidx.annotation.p0 SurfaceView surfaceView) {
        F2();
        this.f63803c1.j(surfaceView);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @androidx.annotation.p0
    public j j1() {
        F2();
        return this.f63803c1.j1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void j2(androidx.media3.exoplayer.source.t0 t0Var) {
        F2();
        this.f63803c1.j2(t0Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void k(androidx.media3.exoplayer.video.w wVar) {
        F2();
        this.f63803c1.k(wVar);
    }

    @Override // androidx.media3.common.z0
    public float k0() {
        F2();
        return this.f63803c1.k0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void k2(androidx.media3.exoplayer.video.w wVar) {
        F2();
        this.f63803c1.k2(wVar);
    }

    @Override // androidx.media3.common.z0
    public void l(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
        F2();
        this.f63803c1.l(surfaceHolder);
    }

    @Override // androidx.media3.common.z0
    public int l0() {
        F2();
        return this.f63803c1.l0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void l1(androidx.media3.exoplayer.source.t0 t0Var, boolean z10, boolean z11) {
        F2();
        this.f63803c1.l1(t0Var, z10, z11);
    }

    @Override // androidx.media3.common.z0
    public void m(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
        F2();
        this.f63803c1.m(surfaceHolder);
    }

    @Override // androidx.media3.common.z0
    public void m0() {
        F2();
        this.f63803c1.m0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void m1(@androidx.annotation.p0 androidx.media3.common.b1 b1Var) {
        F2();
        this.f63803c1.m1(b1Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void m2(int i10) {
        F2();
        this.f63803c1.m2(i10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void n() {
        F2();
        this.f63803c1.n();
    }

    @Override // androidx.media3.common.z0
    public long n0() {
        F2();
        return this.f63803c1.n0();
    }

    @Override // androidx.media3.common.z0
    public void n1(androidx.media3.common.e4 e4Var) {
        F2();
        this.f63803c1.n1(e4Var);
    }

    @Override // androidx.media3.common.z0
    public void o2(int i10, int i11, int i12) {
        F2();
        this.f63803c1.o2(i10, i11, i12);
    }

    @Override // androidx.media3.common.z0
    public void p(@androidx.annotation.p0 TextureView textureView) {
        F2();
        this.f63803c1.p(textureView);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Looper p0() {
        F2();
        return this.f63803c1.p0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.analytics.a p1() {
        F2();
        return this.f63803c1.p1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean q() {
        F2();
        return this.f63803c1.q();
    }

    @Override // androidx.media3.common.z0
    public boolean q1() {
        F2();
        return this.f63803c1.q1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void q2(androidx.media3.exoplayer.video.spherical.a aVar) {
        F2();
        this.f63803c1.q2(aVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public f5 r() {
        F2();
        return this.f63803c1.r();
    }

    @Override // androidx.media3.common.z0
    public void r0(@androidx.annotation.p0 SurfaceView surfaceView) {
        F2();
        this.f63803c1.r0(surfaceView);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void r1(androidx.media3.exoplayer.video.spherical.a aVar) {
        F2();
        this.f63803c1.r1(aVar);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void r2(int i10) {
        F2();
        this.f63803c1.r2(i10);
    }

    @Override // androidx.media3.common.z0
    public void release() {
        F2();
        this.f63803c1.release();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int s() {
        F2();
        return this.f63803c1.s();
    }

    @Override // androidx.media3.common.z0
    public boolean s0() {
        F2();
        return this.f63803c1.s0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean s1() {
        F2();
        return this.f63803c1.s1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void s2(androidx.media3.exoplayer.source.t0 t0Var) {
        F2();
        this.f63803c1.s2(t0Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(@androidx.annotation.p0 ImageOutput imageOutput) {
        F2();
        this.f63803c1.setImageOutput(imageOutput);
    }

    @Override // androidx.media3.common.z0
    public void stop() {
        F2();
        this.f63803c1.stop();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void t(androidx.media3.common.f fVar) {
        F2();
        this.f63803c1.t(fVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void t0(boolean z10) {
        F2();
        this.f63803c1.t0(z10);
    }

    @Override // androidx.media3.common.z0
    public void u(@androidx.annotation.p0 Surface surface) {
        F2();
        this.f63803c1.u(surface);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean u0() {
        F2();
        return this.f63803c1.u0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @androidx.annotation.p0
    public j u1() {
        F2();
        return this.f63803c1.u1();
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.q0 u2() {
        F2();
        return this.f63803c1.u2();
    }

    @Override // androidx.media3.common.z0
    public long v() {
        F2();
        return this.f63803c1.v();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void v1(int i10) {
        F2();
        this.f63803c1.v1(i10);
    }

    @Override // androidx.media3.common.z0
    public long v2() {
        F2();
        return this.f63803c1.v2();
    }

    @Override // androidx.media3.common.z0
    public void w(int i10, int i11, List<androidx.media3.common.k0> list) {
        F2();
        this.f63803c1.w(i10, i11, list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void w0(androidx.media3.exoplayer.source.u1 u1Var) {
        F2();
        this.f63803c1.w0(u1Var);
    }

    @Override // androidx.media3.common.z0
    public boolean x() {
        F2();
        return this.f63803c1.x();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.util.j x0() {
        F2();
        return this.f63803c1.x0();
    }

    @Override // androidx.media3.common.z0
    public long y() {
        F2();
        return this.f63803c1.y();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.trackselection.k0 y0() {
        F2();
        return this.f63803c1.y0();
    }

    @Override // androidx.media3.common.z0
    public void y1(boolean z10, int i10) {
        F2();
        this.f63803c1.y1(z10, i10);
    }

    @Override // androidx.media3.common.z0
    public void z0(List<androidx.media3.common.k0> list, boolean z10) {
        F2();
        this.f63803c1.z0(list, z10);
    }

    @Override // androidx.media3.common.g
    protected void z2(int i10, long j10, int i11, boolean z10) {
        F2();
        this.f63803c1.z2(i10, j10, i11, z10);
    }

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExoPlayer.b f63805a;

        @Deprecated
        public a(Context context) {
            this.f63805a = new ExoPlayer.b(context);
        }

        @Deprecated
        public g5 b() {
            return this.f63805a.x();
        }

        @z7.a
        @Deprecated
        public a c(long j10) {
            this.f63805a.z(j10);
            return this;
        }

        @z7.a
        @Deprecated
        public a d(androidx.media3.exoplayer.analytics.a aVar) {
            this.f63805a.A(aVar);
            return this;
        }

        @z7.a
        @Deprecated
        public a e(androidx.media3.common.d dVar, boolean z10) {
            this.f63805a.B(dVar, z10);
            return this;
        }

        @z7.a
        @Deprecated
        public a f(androidx.media3.exoplayer.upstream.d dVar) {
            this.f63805a.C(dVar);
            return this;
        }

        @z7.a
        @androidx.annotation.l1
        @Deprecated
        public a g(androidx.media3.common.util.j jVar) {
            this.f63805a.D(jVar);
            return this;
        }

        @z7.a
        @Deprecated
        public a h(long j10) {
            this.f63805a.E(j10);
            return this;
        }

        @z7.a
        @Deprecated
        public a i(boolean z10) {
            this.f63805a.G(z10);
            return this;
        }

        @z7.a
        @Deprecated
        public a j(r3 r3Var) {
            this.f63805a.H(r3Var);
            return this;
        }

        @z7.a
        @Deprecated
        public a k(s3 s3Var) {
            this.f63805a.I(s3Var);
            return this;
        }

        @z7.a
        @Deprecated
        public a l(Looper looper) {
            this.f63805a.J(looper);
            return this;
        }

        @z7.a
        @Deprecated
        public a m(androidx.media3.exoplayer.source.t0.a aVar) {
            this.f63805a.L(aVar);
            return this;
        }

        @z7.a
        @Deprecated
        public a n(boolean z10) {
            this.f63805a.N(z10);
            return this;
        }

        @z7.a
        @Deprecated
        public a o(@androidx.annotation.p0 androidx.media3.common.b1 b1Var) {
            this.f63805a.R(b1Var);
            return this;
        }

        @z7.a
        @Deprecated
        public a p(long j10) {
            this.f63805a.S(j10);
            return this;
        }

        @z7.a
        @Deprecated
        public a q(@androidx.annotation.g0(from = 1) long j10) {
            this.f63805a.U(j10);
            return this;
        }

        @z7.a
        @Deprecated
        public a r(@androidx.annotation.g0(from = 1) long j10) {
            this.f63805a.V(j10);
            return this;
        }

        @z7.a
        @Deprecated
        public a s(f5 f5Var) {
            this.f63805a.W(f5Var);
            return this;
        }

        @z7.a
        @Deprecated
        public a t(boolean z10) {
            this.f63805a.X(z10);
            return this;
        }

        @z7.a
        @Deprecated
        public a u(androidx.media3.exoplayer.trackselection.k0 k0Var) {
            this.f63805a.a0(k0Var);
            return this;
        }

        @z7.a
        @Deprecated
        public a v(boolean z10) {
            this.f63805a.b0(z10);
            return this;
        }

        @z7.a
        @Deprecated
        public a w(int i10) {
            this.f63805a.d0(i10);
            return this;
        }

        @z7.a
        @Deprecated
        public a x(int i10) {
            this.f63805a.e0(i10);
            return this;
        }

        @z7.a
        @Deprecated
        public a y(int i10) {
            this.f63805a.f0(i10);
            return this;
        }

        @Deprecated
        public a(Context context, e5 e5Var) {
            this.f63805a = new ExoPlayer.b(context, e5Var);
        }

        @Deprecated
        public a(Context context, androidx.media3.extractor.w wVar) {
            this.f63805a = new ExoPlayer.b(context, new androidx.media3.exoplayer.source.q(context, wVar));
        }

        @Deprecated
        public a(Context context, e5 e5Var, androidx.media3.extractor.w wVar) {
            this.f63805a = new ExoPlayer.b(context, e5Var, new androidx.media3.exoplayer.source.q(context, wVar));
        }

        @Deprecated
        public a(Context context, e5 e5Var, androidx.media3.exoplayer.trackselection.k0 k0Var, androidx.media3.exoplayer.source.t0.a aVar, s3 s3Var, androidx.media3.exoplayer.upstream.d dVar, androidx.media3.exoplayer.analytics.a aVar2) {
            this.f63805a = new ExoPlayer.b(context, e5Var, aVar, k0Var, s3Var, dVar, aVar2);
        }
    }

    @Override // androidx.media3.common.z0
    @androidx.annotation.p0
    public s0 a() {
        F2();
        return this.f63803c1.a();
    }

    protected g5(a aVar) {
        this(aVar.f63805a);
    }

    g5(ExoPlayer.b bVar) {
        androidx.media3.common.util.m mVar = new androidx.media3.common.util.m();
        this.f63804d1 = mVar;
        try {
            this.f63803c1 = new y2(bVar, this);
            mVar.f();
        } catch (Throwable th2) {
            this.f63804d1.f();
            throw th2;
        }
    }
}
