package androidx.media3.common;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class x implements z0 {

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private final z0 f61809b1;

    private static final class a implements z0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f61810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z0.g f61811b;

        public a(x xVar, z0.g gVar) {
            this.f61810a = xVar;
            this.f61811b = gVar;
        }

        @Override // androidx.media3.common.z0.g
        public void A(int i10) {
            this.f61811b.A(i10);
        }

        @Override // androidx.media3.common.z0.g
        public void B(float f10) {
            this.f61811b.B(f10);
        }

        @Override // androidx.media3.common.z0.g
        public void C(boolean z10, int i10) {
            this.f61811b.C(z10, i10);
        }

        @Override // androidx.media3.common.z0.g
        public void E(androidx.media3.common.text.d dVar) {
            this.f61811b.E(dVar);
        }

        @Override // androidx.media3.common.z0.g
        public void F(r0 r0Var) {
            this.f61811b.F(r0Var);
        }

        @Override // androidx.media3.common.z0.g
        public void K(int i10) {
            this.f61811b.K(i10);
        }

        @Override // androidx.media3.common.z0.g
        public void M(int i10, boolean z10) {
            this.f61811b.M(i10, z10);
        }

        @Override // androidx.media3.common.z0.g
        public void N(q0 q0Var) {
            this.f61811b.N(q0Var);
        }

        @Override // androidx.media3.common.z0.g
        public void O(x0 x0Var) {
            this.f61811b.O(x0Var);
        }

        @Override // androidx.media3.common.z0.g
        public void Q(z0.c cVar) {
            this.f61811b.Q(cVar);
        }

        @Override // androidx.media3.common.z0.g
        public void S(z0 z0Var, z0.f fVar) {
            this.f61811b.S(this.f61810a, fVar);
        }

        @Override // androidx.media3.common.z0.g
        public void V(z3 z3Var, int i10) {
            this.f61811b.V(z3Var, i10);
        }

        @Override // androidx.media3.common.z0.g
        public void W(long j10) {
            this.f61811b.W(j10);
        }

        @Override // androidx.media3.common.z0.g
        public void X(i4 i4Var) {
            this.f61811b.X(i4Var);
        }

        @Override // androidx.media3.common.z0.g
        public void Y(o oVar) {
            this.f61811b.Y(oVar);
        }

        @Override // androidx.media3.common.z0.g
        public void a(n4 n4Var) {
            this.f61811b.a(n4Var);
        }

        @Override // androidx.media3.common.z0.g
        public void a0(boolean z10, int i10) {
            this.f61811b.a0(z10, i10);
        }

        @Override // androidx.media3.common.z0.g
        public void d0(z0.k kVar, z0.k kVar2, int i10) {
            this.f61811b.d0(kVar, kVar2, i10);
        }

        @Override // androidx.media3.common.z0.g
        public void e0(boolean z10) {
            this.f61811b.e0(z10);
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f61810a.equals(aVar.f61810a)) {
                return this.f61811b.equals(aVar.f61811b);
            }
            return false;
        }

        @Override // androidx.media3.common.z0.g
        public void f0(int i10) {
            this.f61811b.f0(i10);
        }

        @Override // androidx.media3.common.z0.g
        public void g(boolean z10) {
            this.f61811b.g(z10);
        }

        @Override // androidx.media3.common.z0.g
        public void h0(int i10) {
            this.f61811b.h0(i10);
        }

        public int hashCode() {
            return (this.f61810a.hashCode() * 31) + this.f61811b.hashCode();
        }

        @Override // androidx.media3.common.z0.g
        public void i(List<androidx.media3.common.text.a> list) {
            this.f61811b.i(list);
        }

        @Override // androidx.media3.common.z0.g
        public void j(boolean z10) {
            this.f61811b.q0(z10);
        }

        @Override // androidx.media3.common.z0.g
        public void j0(long j10) {
            this.f61811b.j0(j10);
        }

        @Override // androidx.media3.common.z0.g
        public void k0(e4 e4Var) {
            this.f61811b.k0(e4Var);
        }

        @Override // androidx.media3.common.z0.g
        public void l0(@androidx.annotation.p0 k0 k0Var, int i10) {
            this.f61811b.l0(k0Var, i10);
        }

        @Override // androidx.media3.common.z0.g
        public void n(boolean z10) {
            this.f61811b.n(z10);
        }

        @Override // androidx.media3.common.z0.g
        public void q0(boolean z10) {
            this.f61811b.q0(z10);
        }

        @Override // androidx.media3.common.z0.g
        public void r0(d dVar) {
            this.f61811b.r0(dVar);
        }

        @Override // androidx.media3.common.z0.g
        public void u(y0 y0Var) {
            this.f61811b.u(y0Var);
        }

        @Override // androidx.media3.common.z0.g
        public void v() {
            this.f61811b.v();
        }

        @Override // androidx.media3.common.z0.g
        public void v0(q0 q0Var) {
            this.f61811b.v0(q0Var);
        }

        @Override // androidx.media3.common.z0.g
        public void w0(@androidx.annotation.p0 x0 x0Var) {
            this.f61811b.w0(x0Var);
        }

        @Override // androidx.media3.common.z0.g
        public void x(int i10) {
            this.f61811b.x(i10);
        }

        @Override // androidx.media3.common.z0.g
        public void x0(long j10) {
            this.f61811b.x0(j10);
        }

        @Override // androidx.media3.common.z0.g
        public void z(int i10, int i11) {
            this.f61811b.z(i10, i11);
        }
    }

    public x(z0 z0Var) {
        this.f61809b1 = z0Var;
    }

    @Override // androidx.media3.common.z0
    public void A() {
        this.f61809b1.A();
    }

    @Override // androidx.media3.common.z0
    public void A1() {
        this.f61809b1.A1();
    }

    @Override // androidx.media3.common.z0
    public void B() {
        this.f61809b1.B();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void B1() {
        this.f61809b1.B1();
    }

    @Override // androidx.media3.common.z0
    public int C() {
        return this.f61809b1.C();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void C1() {
        this.f61809b1.C1();
    }

    @Override // androidx.media3.common.z0
    public void D(int i10) {
        this.f61809b1.D(i10);
    }

    @Override // androidx.media3.common.z0
    public void D0(int i10) {
        this.f61809b1.D0(i10);
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.util.r0 D1() {
        return this.f61809b1.D1();
    }

    @Override // androidx.media3.common.z0
    public int E() {
        return this.f61809b1.E();
    }

    @Override // androidx.media3.common.z0
    public void F(long j10) {
        this.f61809b1.F(j10);
    }

    @Override // androidx.media3.common.z0
    public void F0(q0 q0Var) {
        this.f61809b1.F0(q0Var);
    }

    @Override // androidx.media3.common.z0
    public void F1(int i10) {
        this.f61809b1.F1(i10);
    }

    @Override // androidx.media3.common.z0
    public void G(float f10) {
        this.f61809b1.G(f10);
    }

    @Override // androidx.media3.common.z0
    public boolean G0() {
        return this.f61809b1.G0();
    }

    @Override // androidx.media3.common.z0
    public int G1() {
        return this.f61809b1.G1();
    }

    @Override // androidx.media3.common.z0
    public int H() {
        return this.f61809b1.H();
    }

    @Override // androidx.media3.common.z0
    public void H0(int i10, int i11) {
        this.f61809b1.H0(i10, i11);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void I0() {
        this.f61809b1.I0();
    }

    @Override // androidx.media3.common.z0
    public void I1() {
        this.f61809b1.I1();
    }

    @Override // androidx.media3.common.z0
    public boolean J() {
        return this.f61809b1.J();
    }

    @Override // androidx.media3.common.z0
    public void K(boolean z10) {
        this.f61809b1.K(z10);
    }

    @Override // androidx.media3.common.z0
    public void K0(k0 k0Var) {
        this.f61809b1.K0(k0Var);
    }

    @Override // androidx.media3.common.z0
    public void L0() {
        this.f61809b1.L0();
    }

    @Override // androidx.media3.common.z0
    public i4 M0() {
        return this.f61809b1.M0();
    }

    @Override // androidx.media3.common.z0
    public void M1(int i10) {
        this.f61809b1.M1(i10);
    }

    @Override // androidx.media3.common.z0
    public long N() {
        return this.f61809b1.N();
    }

    @Override // androidx.media3.common.z0
    public int O() {
        return this.f61809b1.O();
    }

    @Override // androidx.media3.common.z0
    public boolean O0() {
        return this.f61809b1.O0();
    }

    @Override // androidx.media3.common.z0
    public void O1(k0 k0Var) {
        this.f61809b1.O1(k0Var);
    }

    @Override // androidx.media3.common.z0
    public int P() {
        return this.f61809b1.P();
    }

    @Override // androidx.media3.common.z0
    public boolean P0(int i10) {
        return this.f61809b1.P0(i10);
    }

    @Override // androidx.media3.common.z0
    public androidx.media3.common.text.d P1() {
        return this.f61809b1.P1();
    }

    @Override // androidx.media3.common.z0
    public void Q(int i10) {
        this.f61809b1.Q(i10);
    }

    @Override // androidx.media3.common.z0
    public void Q1(z0.g gVar) {
        this.f61809b1.Q1(new a(this, gVar));
    }

    @Override // androidx.media3.common.z0
    public long R() {
        return this.f61809b1.R();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void R0(boolean z10) {
        this.f61809b1.R0(z10);
    }

    @Override // androidx.media3.common.z0
    public int S() {
        return this.f61809b1.S();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public boolean T() {
        return this.f61809b1.T();
    }

    @Override // androidx.media3.common.z0
    public boolean T1() {
        return this.f61809b1.T1();
    }

    @Override // androidx.media3.common.z0
    public void U() {
        this.f61809b1.U();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void U0() {
        this.f61809b1.U0();
    }

    @Override // androidx.media3.common.z0
    public void U1(z0.g gVar) {
        this.f61809b1.U1(new a(this, gVar));
    }

    @Override // androidx.media3.common.z0
    public q0 V() {
        return this.f61809b1.V();
    }

    @Override // androidx.media3.common.z0
    public e4 V0() {
        return this.f61809b1.V0();
    }

    @Override // androidx.media3.common.z0
    public int V1() {
        return this.f61809b1.V1();
    }

    @Override // androidx.media3.common.z0
    public int W0() {
        return this.f61809b1.W0();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public boolean X() {
        return this.f61809b1.X();
    }

    @Override // androidx.media3.common.z0
    public long X0() {
        return this.f61809b1.X0();
    }

    @Override // androidx.media3.common.z0
    public void X1() {
        this.f61809b1.X1();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public int Y() {
        return this.f61809b1.Y();
    }

    @Override // androidx.media3.common.z0
    public k0 Y0(int i10) {
        return this.f61809b1.Y0(i10);
    }

    @Override // androidx.media3.common.z0
    @androidx.annotation.p0
    public k0 Z() {
        return this.f61809b1.Z();
    }

    @Override // androidx.media3.common.z0
    public long Z0() {
        return this.f61809b1.Z0();
    }

    @Override // androidx.media3.common.z0
    public void Z1(int i10, k0 k0Var) {
        this.f61809b1.Z1(i10, k0Var);
    }

    @Override // androidx.media3.common.z0
    @androidx.annotation.p0
    public x0 a() {
        return this.f61809b1.a();
    }

    @Override // androidx.media3.common.z0
    public int a0() {
        return this.f61809b1.a0();
    }

    @Override // androidx.media3.common.z0
    public z0.c a2() {
        return this.f61809b1.a2();
    }

    @Override // androidx.media3.common.z0
    public void b0(boolean z10) {
        this.f61809b1.b0(z10);
    }

    @Override // androidx.media3.common.z0
    public void b2(int i10, int i11) {
        this.f61809b1.b2(i10, i11);
    }

    @Override // androidx.media3.common.z0
    public y0 c() {
        return this.f61809b1.c();
    }

    @Override // androidx.media3.common.z0
    public z3 c0() {
        return this.f61809b1.c0();
    }

    @Override // androidx.media3.common.z0
    public void c1(d dVar, boolean z10) {
        this.f61809b1.c1(dVar, z10);
    }

    @Override // androidx.media3.common.z0
    public boolean c2() {
        return this.f61809b1.c2();
    }

    @Override // androidx.media3.common.z0
    public boolean d() {
        return this.f61809b1.d();
    }

    @Override // androidx.media3.common.z0
    public Looper d0() {
        return this.f61809b1.d0();
    }

    @Override // androidx.media3.common.z0
    public o d1() {
        return this.f61809b1.d1();
    }

    @Override // androidx.media3.common.z0
    public d e() {
        return this.f61809b1.e();
    }

    @Override // androidx.media3.common.z0
    public int e0() {
        return this.f61809b1.e0();
    }

    @Override // androidx.media3.common.z0
    public void f(float f10) {
        this.f61809b1.f(f10);
    }

    @Override // androidx.media3.common.z0
    public void f0(@androidx.annotation.p0 TextureView textureView) {
        this.f61809b1.f0(textureView);
    }

    @Override // androidx.media3.common.z0
    public void g2(int i10, List<k0> list) {
        this.f61809b1.g2(i10, list);
    }

    @Override // androidx.media3.common.z0
    public long getCurrentPosition() {
        return this.f61809b1.getCurrentPosition();
    }

    @Override // androidx.media3.common.z0
    public long getDuration() {
        return this.f61809b1.getDuration();
    }

    @Override // androidx.media3.common.z0
    public void h(y0 y0Var) {
        this.f61809b1.h(y0Var);
    }

    @Override // androidx.media3.common.z0
    public n4 h0() {
        return this.f61809b1.h0();
    }

    @Override // androidx.media3.common.z0
    public void h1(List<k0> list, int i10, long j10) {
        this.f61809b1.h1(list, i10, j10);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public boolean hasNext() {
        return this.f61809b1.hasNext();
    }

    @Override // androidx.media3.common.z0
    public void i(@androidx.annotation.p0 Surface surface) {
        this.f61809b1.i(surface);
    }

    @Override // androidx.media3.common.z0
    public long i1() {
        return this.f61809b1.i1();
    }

    @Override // androidx.media3.common.z0
    public void i2(k0 k0Var, boolean z10) {
        this.f61809b1.i2(k0Var, z10);
    }

    @Override // androidx.media3.common.z0
    public boolean isPlaying() {
        return this.f61809b1.isPlaying();
    }

    @Override // androidx.media3.common.z0
    public void j(@androidx.annotation.p0 SurfaceView surfaceView) {
        this.f61809b1.j(surfaceView);
    }

    @Override // androidx.media3.common.z0
    public void j0(int i10, long j10) {
        this.f61809b1.j0(i10, j10);
    }

    @Override // androidx.media3.common.z0
    public float k0() {
        return this.f61809b1.k0();
    }

    @Override // androidx.media3.common.z0
    public boolean k1() {
        return this.f61809b1.k1();
    }

    @Override // androidx.media3.common.z0
    public void l(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
        this.f61809b1.l(surfaceHolder);
    }

    @Override // androidx.media3.common.z0
    public int l0() {
        return this.f61809b1.l0();
    }

    @Override // androidx.media3.common.z0
    public void l2(k0 k0Var, long j10) {
        this.f61809b1.l2(k0Var, j10);
    }

    @Override // androidx.media3.common.z0
    public void m(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
        this.f61809b1.m(surfaceHolder);
    }

    @Override // androidx.media3.common.z0
    public void m0() {
        this.f61809b1.m0();
    }

    @Override // androidx.media3.common.z0
    public long n0() {
        return this.f61809b1.n0();
    }

    @Override // androidx.media3.common.z0
    public void n1(e4 e4Var) {
        this.f61809b1.n1(e4Var);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public boolean n2() {
        return this.f61809b1.n2();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void next() {
        this.f61809b1.next();
    }

    @Override // androidx.media3.common.z0
    public void o(int i10, k0 k0Var) {
        this.f61809b1.o(i10, k0Var);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public int o0() {
        return this.f61809b1.o0();
    }

    @Override // androidx.media3.common.z0
    public void o1(int i10, int i11) {
        this.f61809b1.o1(i10, i11);
    }

    @Override // androidx.media3.common.z0
    public void o2(int i10, int i11, int i12) {
        this.f61809b1.o2(i10, i11, i12);
    }

    @Override // androidx.media3.common.z0
    public void p(@androidx.annotation.p0 TextureView textureView) {
        this.f61809b1.p(textureView);
    }

    @Override // androidx.media3.common.z0
    public void p2(List<k0> list) {
        this.f61809b1.p2(list);
    }

    @Override // androidx.media3.common.z0
    public void pause() {
        this.f61809b1.pause();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public int q0() {
        return this.f61809b1.q0();
    }

    @Override // androidx.media3.common.z0
    public boolean q1() {
        return this.f61809b1.q1();
    }

    @Override // androidx.media3.common.z0
    public void r0(@androidx.annotation.p0 SurfaceView surfaceView) {
        this.f61809b1.r0(surfaceView);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public void r2(int i10) {
        this.f61809b1.r2(i10);
    }

    @Override // androidx.media3.common.z0
    public void release() {
        this.f61809b1.release();
    }

    @Override // androidx.media3.common.z0
    public boolean s0() {
        return this.f61809b1.s0();
    }

    @Override // androidx.media3.common.z0
    public void stop() {
        this.f61809b1.stop();
    }

    @Override // androidx.media3.common.z0
    public void t1() {
        this.f61809b1.t1();
    }

    @Override // androidx.media3.common.z0
    public void t2() {
        this.f61809b1.t2();
    }

    @Override // androidx.media3.common.z0
    public void u(@androidx.annotation.p0 Surface surface) {
        this.f61809b1.u(surface);
    }

    @Override // androidx.media3.common.z0
    public q0 u2() {
        return this.f61809b1.u2();
    }

    @Override // androidx.media3.common.z0
    public long v() {
        return this.f61809b1.v();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public boolean v0() {
        return this.f61809b1.v0();
    }

    @Override // androidx.media3.common.z0
    public long v2() {
        return this.f61809b1.v2();
    }

    @Override // androidx.media3.common.z0
    public void w(int i10, int i11, List<k0> list) {
        this.f61809b1.w(i10, i11, list);
    }

    @Override // androidx.media3.common.z0
    public void w1(List<k0> list) {
        this.f61809b1.w1(list);
    }

    public z0 w2() {
        return this.f61809b1;
    }

    @Override // androidx.media3.common.z0
    public boolean x() {
        return this.f61809b1.x();
    }

    @Override // androidx.media3.common.z0
    public boolean x1() {
        return this.f61809b1.x1();
    }

    @Override // androidx.media3.common.z0
    public long y() {
        return this.f61809b1.y();
    }

    @Override // androidx.media3.common.z0
    public void y1(boolean z10, int i10) {
        this.f61809b1.y1(z10, i10);
    }

    @Override // androidx.media3.common.z0
    @androidx.annotation.p0
    public Object z() {
        return this.f61809b1.z();
    }

    @Override // androidx.media3.common.z0
    public void z0(List<k0> list, boolean z10) {
        this.f61809b1.z0(list, z10);
    }

    @Override // androidx.media3.common.z0
    public void z1() {
        this.f61809b1.z1();
    }
}
