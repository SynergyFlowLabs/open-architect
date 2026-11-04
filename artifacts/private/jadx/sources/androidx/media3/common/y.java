package androidx.media3.common;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class y extends r3 {

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private final z0 f61857k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private b f61858l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private r0 f61859m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f61860n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f61861o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private long f61862p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private boolean f61863q1;

    class a implements z0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0 f61864a;

        a(z0 z0Var) {
            this.f61864a = z0Var;
        }

        @Override // androidx.media3.common.z0.g
        public void F(r0 r0Var) {
            y.this.f61859m1 = r0Var;
        }

        @Override // androidx.media3.common.z0.g
        public void S(z0 z0Var, z0.f fVar) {
            y.this.O4();
        }

        @Override // androidx.media3.common.z0.g
        public void a0(boolean z10, int i10) {
            y.this.f61860n1 = i10;
        }

        @Override // androidx.media3.common.z0.g
        public void d0(z0.k kVar, z0.k kVar2, int i10) {
            y.this.f61861o1 = i10;
            y.this.f61862p1 = kVar2.f61952g;
            y.this.f61858l1.a(kVar.f61952g, kVar.f61953h);
            y.this.f61858l1 = new b(this.f61864a);
        }

        @Override // androidx.media3.common.z0.g
        public void v() {
            y.this.f61863q1 = true;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r3.b f61866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r3.b f61867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r3.b f61868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r3.b f61869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final r3.b f61870e;

        public b(final z0 z0Var) {
            Objects.requireNonNull(z0Var);
            this.f61866a = new r3.b(new r3.g() { // from class: androidx.media3.common.z
                @Override // androidx.media3.common.r3.g
                public final long get() {
                    return z0Var.getCurrentPosition();
                }
            });
            this.f61867b = new r3.b(new r3.g() { // from class: androidx.media3.common.a0
                @Override // androidx.media3.common.r3.g
                public final long get() {
                    return z0Var.v();
                }
            });
            this.f61868c = new r3.b(new r3.g() { // from class: androidx.media3.common.b0
                @Override // androidx.media3.common.r3.g
                public final long get() {
                    return z0Var.n0();
                }
            });
            this.f61869d = new r3.b(new r3.g() { // from class: androidx.media3.common.c0
                @Override // androidx.media3.common.r3.g
                public final long get() {
                    return z0Var.R();
                }
            });
            this.f61870e = new r3.b(new r3.g() { // from class: androidx.media3.common.d0
                @Override // androidx.media3.common.r3.g
                public final long get() {
                    return z0Var.y();
                }
            });
        }

        public void a(long j10, long j11) {
            this.f61866a.e(j10);
            this.f61867b.e(j10);
            this.f61868c.e(j11);
            this.f61869d.e(j11);
            this.f61870e.e(0L);
        }
    }

    public y(z0 z0Var) {
        super(z0Var.d0());
        this.f61857k1 = z0Var;
        this.f61859m1 = new r0(-9223372036854775807L, new r0.a[0]);
        this.f61860n1 = 1;
        this.f61861o1 = 5;
        this.f61858l1 = new b(z0Var);
        z0Var.U1(new a(z0Var));
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> A4(int i10, long j10, int i11) {
        switch (i11) {
            case 4:
                this.f61857k1.U();
                break;
            case 5:
                this.f61857k1.F(j10);
                break;
            case 6:
                this.f61857k1.A1();
                break;
            case 7:
                this.f61857k1.I1();
                break;
            case 8:
                this.f61857k1.L0();
                break;
            case 9:
                this.f61857k1.X1();
                break;
            case 10:
                if (i10 != -1) {
                    this.f61857k1.j0(i10, j10);
                }
                break;
            case 11:
                this.f61857k1.t2();
                break;
            case 12:
                this.f61857k1.t1();
                break;
            default:
                throw new IllegalStateException();
        }
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> B4(d dVar, boolean z10) {
        this.f61857k1.c1(dVar, z10);
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> C4(boolean z10, int i10) {
        if (this.f61857k1.P0(34)) {
            this.f61857k1.y1(z10, i10);
        } else {
            this.f61857k1.R0(z10);
        }
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> D4(int i10, int i11) {
        if (this.f61857k1.P0(33)) {
            this.f61857k1.b2(i10, i11);
        } else {
            this.f61857k1.r2(i10);
        }
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> E4(List<k0> list, int i10, long j10) {
        int i11 = 6 >> 1;
        boolean z10 = list.size() == 1 && this.f61857k1.P0(31);
        if (i10 == -1) {
            if (z10) {
                this.f61857k1.K0(list.get(0));
            } else {
                this.f61857k1.w1(list);
            }
        } else if (z10) {
            this.f61857k1.l2(list.get(0), j10);
        } else {
            this.f61857k1.h1(list, i10, j10);
        }
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> F4(boolean z10) {
        this.f61857k1.b0(z10);
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> G4(y0 y0Var) {
        this.f61857k1.h(y0Var);
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> H4(q0 q0Var) {
        this.f61857k1.F0(q0Var);
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> I4(int i10) {
        this.f61857k1.D(i10);
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> J4(boolean z10) {
        this.f61857k1.K(z10);
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> K4(e4 e4Var) {
        this.f61857k1.n1(e4Var);
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> L4(Object obj) {
        if (obj instanceof SurfaceView) {
            this.f61857k1.j((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.f61857k1.f0((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.f61857k1.l((SurfaceHolder) obj);
        } else {
            if (!(obj instanceof Surface)) {
                throw new IllegalStateException();
            }
            this.f61857k1.i((Surface) obj);
        }
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> M4(float f10) {
        this.f61857k1.f(f10);
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> N4() {
        this.f61857k1.stop();
        return com.google.common.util.concurrent.h1.p();
    }

    protected final z0 f5() {
        return this.f61857k1;
    }

    @Override // androidx.media3.common.r3
    protected r3.h m4() {
        r3.h.a aVar = new r3.h.a();
        b bVar = this.f61858l1;
        if (this.f61857k1.P0(16)) {
            aVar.S(bVar.f61867b);
            aVar.U(bVar.f61866a);
        }
        if (this.f61857k1.P0(21)) {
            aVar.V(this.f61857k1.e());
        }
        aVar.W(this.f61857k1.a2());
        if (this.f61857k1.P0(16)) {
            aVar.X(bVar.f61869d);
            aVar.Z(bVar.f61868c);
            if (this.f61857k1.P0(17)) {
                aVar.a0(this.f61857k1.E(), this.f61857k1.P());
            }
        }
        if (this.f61857k1.P0(28)) {
            aVar.b0(this.f61857k1.P1());
        }
        if (this.f61857k1.P0(17)) {
            aVar.c0(this.f61857k1.l0());
        }
        aVar.d0(this.f61857k1.d1());
        if (this.f61857k1.P0(23)) {
            aVar.e0(this.f61857k1.W0());
            aVar.f0(this.f61857k1.q1());
        }
        aVar.g0(this.f61857k1.d());
        aVar.h0(this.f61857k1.Z0());
        if (this.f61863q1) {
            aVar.i0(true);
            this.f61863q1 = false;
        }
        aVar.k0(this.f61857k1.c());
        aVar.l0(this.f61857k1.H());
        aVar.m0(this.f61857k1.V1());
        aVar.n0(this.f61857k1.a());
        if (this.f61857k1.P0(17)) {
            aVar.o0(this.f61857k1.c0(), this.f61857k1.P0(30) ? this.f61857k1.M0() : i4.f60639b, this.f61857k1.P0(18) ? this.f61857k1.u2() : null);
        }
        if (this.f61857k1.P0(18)) {
            aVar.q0(this.f61857k1.V());
        }
        aVar.j0(this.f61857k1.J(), this.f61860n1);
        long j10 = this.f61862p1;
        if (j10 != -9223372036854775807L) {
            aVar.r0(this.f61861o1, j10);
            this.f61862p1 = -9223372036854775807L;
        }
        aVar.s0(this.f61857k1.C());
        aVar.t0(this.f61857k1.v2());
        aVar.u0(this.f61857k1.i1());
        aVar.v0(this.f61857k1.s0());
        aVar.w0(this.f61857k1.D1());
        aVar.x0(this.f61859m1);
        if (this.f61857k1.P0(16)) {
            aVar.y0(bVar.f61870e);
        }
        aVar.z0(this.f61857k1.V0());
        aVar.A0(this.f61857k1.h0());
        if (this.f61857k1.P0(22)) {
            aVar.B0(this.f61857k1.k0());
        }
        return aVar.Q();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> r4(int i10, List<k0> list) {
        if (list.size() == 1) {
            this.f61857k1.Z1(i10, list.get(0));
        } else {
            this.f61857k1.g2(i10, list);
        }
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> s4(@androidx.annotation.p0 Object obj) {
        if (obj instanceof SurfaceView) {
            this.f61857k1.r0((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.f61857k1.p((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.f61857k1.m((SurfaceHolder) obj);
        } else if (obj instanceof Surface) {
            this.f61857k1.u((Surface) obj);
        } else {
            if (obj != null) {
                throw new IllegalStateException();
            }
            this.f61857k1.m0();
        }
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> t4(int i10) {
        if (this.f61857k1.P0(34)) {
            this.f61857k1.M1(i10);
        } else {
            this.f61857k1.B1();
        }
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> u4(int i10) {
        if (this.f61857k1.P0(34)) {
            this.f61857k1.D0(i10);
        } else {
            this.f61857k1.U0();
        }
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> v4(int i10, int i11, int i12) {
        if (i11 == i10 + 1) {
            this.f61857k1.o1(i10, i12);
        } else {
            this.f61857k1.o2(i10, i11, i12);
        }
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> w4() {
        this.f61857k1.A();
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> x4() {
        this.f61857k1.release();
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> y4(int i10, int i11) {
        if (i11 == i10 + 1) {
            this.f61857k1.F1(i10);
        } else {
            this.f61857k1.H0(i10, i11);
        }
        return com.google.common.util.concurrent.h1.p();
    }

    @Override // androidx.media3.common.r3
    protected com.google.common.util.concurrent.t1<?> z4(int i10, int i11, List<k0> list) {
        if (i11 == i10 + 1 && list.size() == 1) {
            this.f61857k1.o(i10, list.get(0));
        } else {
            this.f61857k1.w(i10, i11, list);
        }
        return com.google.common.util.concurrent.h1.p();
    }
}
