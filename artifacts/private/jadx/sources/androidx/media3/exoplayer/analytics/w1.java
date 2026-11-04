package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.n4;
import com.google.common.collect.l6;
import com.google.common.collect.n6;
import com.google.common.collect.o7;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class w1 implements androidx.media3.exoplayer.analytics.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.common.util.j f63104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.common.z3.b f63105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.z3.d f63106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f63107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<b.C0577b> f63108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.media3.common.util.y<b> f63109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media3.common.z0 f63110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.media3.common.util.u f63111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f63112i;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.common.z3.b f63113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l6<androidx.media3.exoplayer.source.t0.b> f63114b = l6.F();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n6<androidx.media3.exoplayer.source.t0.b, androidx.media3.common.z3> f63115c = n6.q();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.exoplayer.source.t0.b f63116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.media3.exoplayer.source.t0.b f63117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media3.exoplayer.source.t0.b f63118f;

        public a(androidx.media3.common.z3.b bVar) {
            this.f63113a = bVar;
        }

        private void b(n6.b<androidx.media3.exoplayer.source.t0.b, androidx.media3.common.z3> bVar, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar2, androidx.media3.common.z3 z3Var) {
            if (bVar2 == null) {
                return;
            }
            if (z3Var.f(bVar2.f65467a) != -1) {
                bVar.i(bVar2, z3Var);
                return;
            }
            androidx.media3.common.z3 z3Var2 = this.f63115c.get(bVar2);
            if (z3Var2 != null) {
                bVar.i(bVar2, z3Var2);
            }
        }

        @androidx.annotation.p0
        private static androidx.media3.exoplayer.source.t0.b c(androidx.media3.common.z0 z0Var, l6<androidx.media3.exoplayer.source.t0.b> l6Var, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, androidx.media3.common.z3.b bVar2) {
            androidx.media3.common.z3 z3VarC0 = z0Var.c0();
            int iO = z0Var.O();
            Object objS = z3VarC0.w() ? null : z3VarC0.s(iO);
            int iE = (z0Var.x() || z3VarC0.w()) ? -1 : z3VarC0.j(iO, bVar2).e(androidx.media3.common.util.k1.D1(z0Var.getCurrentPosition()) - bVar2.q());
            for (int i10 = 0; i10 < l6Var.size(); i10++) {
                androidx.media3.exoplayer.source.t0.b bVar3 = l6Var.get(i10);
                if (i(bVar3, objS, z0Var.x(), z0Var.E(), z0Var.P(), iE)) {
                    return bVar3;
                }
            }
            if (l6Var.isEmpty() && bVar != null && i(bVar, objS, z0Var.x(), z0Var.E(), z0Var.P(), iE)) {
                return bVar;
            }
            return null;
        }

        private static boolean i(androidx.media3.exoplayer.source.t0.b bVar, @androidx.annotation.p0 Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f65467a.equals(obj)) {
                return false;
            }
            if (z10 && bVar.f65468b == i10 && bVar.f65469c == i11) {
                return true;
            }
            return !z10 && bVar.f65468b == -1 && bVar.f65471e == i12;
        }

        private void m(androidx.media3.common.z3 z3Var) {
            n6.b<androidx.media3.exoplayer.source.t0.b, androidx.media3.common.z3> bVarB = n6.b();
            if (this.f63114b.isEmpty()) {
                b(bVarB, this.f63117e, z3Var);
                if (!Objects.equals(this.f63118f, this.f63117e)) {
                    b(bVarB, this.f63118f, z3Var);
                }
                if (!Objects.equals(this.f63116d, this.f63117e) && !Objects.equals(this.f63116d, this.f63118f)) {
                    b(bVarB, this.f63116d, z3Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f63114b.size(); i10++) {
                    b(bVarB, this.f63114b.get(i10), z3Var);
                }
                if (!this.f63114b.contains(this.f63116d)) {
                    b(bVarB, this.f63116d, z3Var);
                }
            }
            this.f63115c = bVarB.d();
        }

        @androidx.annotation.p0
        public androidx.media3.exoplayer.source.t0.b d() {
            return this.f63116d;
        }

        @androidx.annotation.p0
        public androidx.media3.exoplayer.source.t0.b e() {
            if (this.f63114b.isEmpty()) {
                return null;
            }
            return (androidx.media3.exoplayer.source.t0.b) o7.w(this.f63114b);
        }

        @androidx.annotation.p0
        public androidx.media3.common.z3 f(androidx.media3.exoplayer.source.t0.b bVar) {
            return this.f63115c.get(bVar);
        }

        @androidx.annotation.p0
        public androidx.media3.exoplayer.source.t0.b g() {
            return this.f63117e;
        }

        @androidx.annotation.p0
        public androidx.media3.exoplayer.source.t0.b h() {
            return this.f63118f;
        }

        public void j(androidx.media3.common.z0 z0Var) {
            this.f63116d = c(z0Var, this.f63114b, this.f63117e, this.f63113a);
        }

        public void k(List<androidx.media3.exoplayer.source.t0.b> list, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, androidx.media3.common.z0 z0Var) {
            this.f63114b = l6.w(list);
            if (!list.isEmpty()) {
                this.f63117e = list.get(0);
                this.f63118f = (androidx.media3.exoplayer.source.t0.b) androidx.media3.common.util.a.g(bVar);
            }
            if (this.f63116d == null) {
                this.f63116d = c(z0Var, this.f63114b, this.f63117e, this.f63113a);
            }
            m(z0Var.c0());
        }

        public void l(androidx.media3.common.z0 z0Var) {
            this.f63116d = c(z0Var, this.f63114b, this.f63117e, this.f63113a);
            m(z0Var.c0());
        }
    }

    public w1(androidx.media3.common.util.j jVar) {
        this.f63104a = (androidx.media3.common.util.j) androidx.media3.common.util.a.g(jVar);
        this.f63109f = new androidx.media3.common.util.y<>(androidx.media3.common.util.k1.n0(), jVar, new androidx.media3.common.util.y.b() { // from class: androidx.media3.exoplayer.analytics.i0
            @Override // androidx.media3.common.util.y.b
            public final void a(Object obj, androidx.media3.common.s sVar) {
                w1.N1((b) obj, sVar);
            }
        });
        androidx.media3.common.z3.b bVar = new androidx.media3.common.z3.b();
        this.f63105b = bVar;
        this.f63106c = new androidx.media3.common.z3.d();
        this.f63107d = new a(bVar);
        this.f63108e = new SparseArray<>();
    }

    public static /* synthetic */ void B0(b.C0577b c0577b, int i10, b bVar) {
        bVar.p0(c0577b);
        bVar.p(c0577b, i10);
    }

    public static /* synthetic */ void D0(b.C0577b c0577b, String str, long j10, long j11, b bVar) {
        bVar.i0(c0577b, str, j10);
        bVar.i(c0577b, str, j11, j10);
    }

    public static /* synthetic */ void M0(b.C0577b c0577b, n4 n4Var, b bVar) {
        bVar.G(c0577b, n4Var);
        bVar.n0(c0577b, n4Var.f60997a, n4Var.f60998b, 0, n4Var.f61000d);
    }

    public static /* synthetic */ void N0(b.C0577b c0577b, androidx.media3.exoplayer.source.d0 d0Var, androidx.media3.exoplayer.source.h0 h0Var, int i10, b bVar) {
        bVar.q0(c0577b, d0Var, h0Var);
        bVar.o(c0577b, d0Var, h0Var, i10);
    }

    public static /* synthetic */ void N1(b bVar, androidx.media3.common.s sVar) {
    }

    private b.C0577b U1(@androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
        androidx.media3.common.util.a.g(this.f63110g);
        androidx.media3.common.z3 z3VarF = bVar == null ? null : this.f63107d.f(bVar);
        if (bVar != null && z3VarF != null) {
            return T1(z3VarF, z3VarF.l(bVar.f65467a, this.f63105b).f61969c, bVar);
        }
        int iL0 = this.f63110g.l0();
        androidx.media3.common.z3 z3VarC0 = this.f63110g.c0();
        if (iL0 >= z3VarC0.v()) {
            z3VarC0 = androidx.media3.common.z3.f61958a;
        }
        return T1(z3VarC0, iL0, null);
    }

    private b.C0577b V1() {
        return U1(this.f63107d.e());
    }

    private b.C0577b W1(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
        androidx.media3.common.util.a.g(this.f63110g);
        if (bVar != null) {
            return this.f63107d.f(bVar) != null ? U1(bVar) : T1(androidx.media3.common.z3.f61958a, i10, bVar);
        }
        androidx.media3.common.z3 z3VarC0 = this.f63110g.c0();
        if (i10 >= z3VarC0.v()) {
            z3VarC0 = androidx.media3.common.z3.f61958a;
        }
        return T1(z3VarC0, i10, null);
    }

    public static /* synthetic */ void X0(b.C0577b c0577b, String str, long j10, long j11, b bVar) {
        bVar.C(c0577b, str, j10);
        bVar.x0(c0577b, str, j11, j10);
    }

    private b.C0577b X1() {
        return U1(this.f63107d.g());
    }

    private b.C0577b Y1() {
        return U1(this.f63107d.h());
    }

    private b.C0577b Z1(@androidx.annotation.p0 androidx.media3.common.x0 x0Var) {
        androidx.media3.exoplayer.source.t0.b bVar;
        return (!(x0Var instanceof androidx.media3.exoplayer.s0) || (bVar = ((androidx.media3.exoplayer.s0) x0Var).X3) == null) ? S1() : U1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a2() {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, b.f62814h0, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.e
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).a0(c0577bS1);
            }
        });
        this.f63109f.j();
    }

    public static /* synthetic */ void e1(b.C0577b c0577b, boolean z10, b bVar) {
        bVar.A(c0577b, z10);
        bVar.O(c0577b, z10);
    }

    public static /* synthetic */ void n1(b.C0577b c0577b, int i10, androidx.media3.common.z0.k kVar, androidx.media3.common.z0.k kVar2, b bVar) {
        bVar.c(c0577b, i10);
        bVar.b0(c0577b, kVar, kVar2, i10);
    }

    @Override // androidx.media3.common.z0.g
    public void A(int i10) {
    }

    @Override // androidx.media3.common.z0.g
    public final void B(final float f10) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 22, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.o
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).e0(c0577bY1, f10);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void C(final boolean z10, final int i10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, -1, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.t
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).r0(c0577bS1, z10, i10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void D(final Object obj, final long j10) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 26, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.i1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj2) {
                ((b) obj2).N(c0577bY1, obj, j10);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void E(final androidx.media3.common.text.d dVar) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 27, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.f1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).w0(c0577bS1, dVar);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void F(final androidx.media3.common.r0 r0Var) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 28, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.v
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).Q(c0577bS1, r0Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void G(final androidx.media3.common.w wVar, @androidx.annotation.p0 final androidx.media3.exoplayer.k kVar) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 1017, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.v0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).C0(c0577bY1, wVar, kVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void H(final androidx.media3.exoplayer.j jVar) {
        final b.C0577b c0577bX1 = X1();
        b2(c0577bX1, 1020, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.u0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).V(c0577bX1, jVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void I(final int i10, final long j10, final long j11) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 1011, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.q
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).h0(c0577bY1, i10, j10, j11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void J(List<androidx.media3.exoplayer.source.t0.b> list, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
        this.f63107d.k(list, bVar, (androidx.media3.common.z0) androidx.media3.common.util.a.g(this.f63110g));
    }

    @Override // androidx.media3.common.z0.g
    public final void K(final int i10) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 21, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.y0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).u(c0577bY1, i10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.t
    public final void L(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
        final b.C0577b c0577bW1 = W1(i10, bVar);
        b2(c0577bW1, 1023, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.m1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).M(c0577bW1);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void M(final int i10, final boolean z10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 30, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.e0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).P(c0577bS1, i10, z10);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void N(final androidx.media3.common.q0 q0Var) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 14, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.q1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).W(c0577bS1, q0Var);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void O(final androidx.media3.common.x0 x0Var) {
        final b.C0577b c0577bZ1 = Z1(x0Var);
        b2(c0577bZ1, 10, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.m0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).T(c0577bZ1, x0Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.b1
    public final void P(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final androidx.media3.exoplayer.source.d0 d0Var, final androidx.media3.exoplayer.source.h0 h0Var, final IOException iOException, final boolean z10) {
        final b.C0577b c0577bW1 = W1(i10, bVar);
        b2(c0577bW1, 1003, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.r
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).f0(c0577bW1, d0Var, h0Var, iOException, z10);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void Q(final androidx.media3.common.z0.c cVar) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 13, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.j
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).q(c0577bS1, cVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.b1
    public final void R(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final androidx.media3.exoplayer.source.d0 d0Var, final androidx.media3.exoplayer.source.h0 h0Var) {
        final b.C0577b c0577bW1 = W1(i10, bVar);
        b2(c0577bW1, 1002, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.l0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).A0(c0577bW1, d0Var, h0Var);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void S(androidx.media3.common.z0 z0Var, androidx.media3.common.z0.f fVar) {
    }

    protected final b.C0577b S1() {
        return U1(this.f63107d.d());
    }

    @Override // androidx.media3.exoplayer.analytics.a
    @androidx.annotation.i
    public void T(b bVar) {
        androidx.media3.common.util.a.g(bVar);
        this.f63109f.c(bVar);
    }

    @il.m({"player"})
    protected final b.C0577b T1(androidx.media3.common.z3 z3Var, int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
        androidx.media3.exoplayer.source.t0.b bVar2 = z3Var.w() ? null : bVar;
        long jB = this.f63104a.b();
        boolean z10 = z3Var.equals(this.f63110g.c0()) && i10 == this.f63110g.l0();
        long jC = 0;
        if (bVar2 == null || !bVar2.c()) {
            if (z10) {
                jC = this.f63110g.n0();
            } else if (!z3Var.w()) {
                jC = z3Var.t(i10, this.f63106c).c();
            }
        } else if (z10 && this.f63110g.E() == bVar2.f65468b && this.f63110g.P() == bVar2.f65469c) {
            jC = this.f63110g.getCurrentPosition();
        }
        return new b.C0577b(jB, z3Var, i10, bVar2, jC, this.f63110g.c0(), this.f63110g.l0(), this.f63107d.d(), this.f63110g.getCurrentPosition(), this.f63110g.y());
    }

    @Override // androidx.media3.exoplayer.source.b1
    public final void U(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final androidx.media3.exoplayer.source.h0 h0Var) {
        final b.C0577b c0577bW1 = W1(i10, bVar);
        b2(c0577bW1, 1004, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.j0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).J(c0577bW1, h0Var);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void V(androidx.media3.common.z3 z3Var, final int i10) {
        this.f63107d.l((androidx.media3.common.z0) androidx.media3.common.util.a.g(this.f63110g));
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 0, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.k
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).Y(c0577bS1, i10);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void W(final long j10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 17, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.g
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).H(c0577bS1, j10);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void X(final androidx.media3.common.i4 i4Var) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 2, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.y
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).E(c0577bS1, i4Var);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void Y(final androidx.media3.common.o oVar) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 29, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.q0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).L(c0577bS1, oVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    @androidx.annotation.i
    public void Z(b bVar) {
        this.f63109f.k(bVar);
    }

    @Override // androidx.media3.common.z0.g
    public final void a(final n4 n4Var) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 25, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.a1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                w1.M0(c0577bY1, n4Var, (b) obj);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void a0(final boolean z10, final int i10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 5, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.f0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).d(c0577bS1, z10, i10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void b(final String str, final long j10, final long j11) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 1008, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.z
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                w1.D0(c0577bY1, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.t
    public final void b0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
        final b.C0577b c0577bW1 = W1(i10, bVar);
        b2(c0577bW1, b.f62812g0, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.o1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).e(c0577bW1);
            }
        });
    }

    protected final void b2(b.C0577b c0577b, int i10, androidx.media3.common.util.y.a<b> aVar) {
        this.f63108e.put(i10, c0577b);
        this.f63109f.l(i10, aVar);
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void c(final int i10, final long j10) {
        final b.C0577b c0577bX1 = X1();
        b2(c0577bX1, 1018, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.c0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).B(c0577bX1, i10, j10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    @androidx.annotation.i
    public void c0(final androidx.media3.common.z0 z0Var, Looper looper) {
        androidx.media3.common.util.a.i(this.f63110g == null || this.f63107d.f63114b.isEmpty());
        this.f63110g = (androidx.media3.common.z0) androidx.media3.common.util.a.g(z0Var);
        this.f63111h = this.f63104a.d(looper, null);
        this.f63109f = this.f63109f.f(looper, new androidx.media3.common.util.y.b() { // from class: androidx.media3.exoplayer.analytics.s
            @Override // androidx.media3.common.util.y.b
            public final void a(Object obj, androidx.media3.common.s sVar) {
                b bVar = (b) obj;
                bVar.K(z0Var, new b.c(sVar, this.f63070a.f63108e));
            }
        });
    }

    @Deprecated
    public void c2(boolean z10) {
        this.f63109f.m(z10);
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void d(final String str, final long j10, final long j11) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 1016, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.l1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                w1.X0(c0577bY1, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void d0(final androidx.media3.common.z0.k kVar, final androidx.media3.common.z0.k kVar2, final int i10) {
        if (i10 == 1) {
            this.f63112i = false;
        }
        this.f63107d.j((androidx.media3.common.z0) androidx.media3.common.util.a.g(this.f63110g));
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 11, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.d1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                w1.n1(c0577bS1, i10, kVar, kVar2, (b) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public void e(final androidx.media3.exoplayer.audio.x.a aVar) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, b.f62820k0, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.w0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).j0(c0577bY1, aVar);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void e0(final boolean z10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 7, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.x
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).b(c0577bS1, z10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public void f(final androidx.media3.exoplayer.audio.x.a aVar) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, b.f62822l0, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.n1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).x(c0577bY1, aVar);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void f0(final int i10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 6, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.a0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).y(c0577bS1, i10);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void g(final boolean z10) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 23, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.m
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).S(c0577bY1, z10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.b1
    public final void g0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final androidx.media3.exoplayer.source.h0 h0Var) {
        final b.C0577b c0577bW1 = W1(i10, bVar);
        b2(c0577bW1, 1005, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.j1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).z(c0577bW1, h0Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void h(final Exception exc) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 1014, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.p1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).d0(c0577bY1, exc);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void h0(final int i10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 4, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.o0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).t(c0577bS1, i10);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void i(final List<androidx.media3.common.text.a> list) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 27, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.h0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).R(c0577bS1, list);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void i0() {
        if (!this.f63112i) {
            final b.C0577b c0577bS1 = S1();
            this.f63112i = true;
            b2(c0577bS1, -1, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.b1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((b) obj).t0(c0577bS1);
                }
            });
        }
    }

    @Override // androidx.media3.common.z0.g
    public void j(boolean z10) {
    }

    @Override // androidx.media3.common.z0.g
    public void j0(final long j10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 16, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.t1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).U(c0577bS1, j10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void k(final String str) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 1019, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.b0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).l0(c0577bY1, str);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void k0(final androidx.media3.common.e4 e4Var) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 19, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.d
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).j(c0577bS1, e4Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.upstream.d.a
    public final void l(final int i10, final long j10, final long j11) {
        final b.C0577b c0577bV1 = V1();
        b2(c0577bV1, 1006, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.n
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).f(c0577bV1, i10, j10, j11);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void l0(@androidx.annotation.p0 final androidx.media3.common.k0 k0Var, final int i10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 1, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.l
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).l(c0577bS1, k0Var, i10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void m(final String str) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 1012, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.i
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).k0(c0577bY1, str);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.b1
    public final void m0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final androidx.media3.exoplayer.source.d0 d0Var, final androidx.media3.exoplayer.source.h0 h0Var, final int i11) {
        final b.C0577b c0577bW1 = W1(i10, bVar);
        b2(c0577bW1, 1000, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.u1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                w1.N0(c0577bW1, d0Var, h0Var, i11, (b) obj);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void n(final boolean z10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 9, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.r1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).s(c0577bS1, z10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.t
    public final void n0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final int i11) {
        final b.C0577b c0577bW1 = W1(i10, bVar);
        b2(c0577bW1, b.f62802b0, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.p0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                w1.B0(c0577bW1, i11, (b) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void o(final androidx.media3.exoplayer.j jVar) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 1007, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.f
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).m(c0577bY1, jVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.t
    public final void o0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
        final b.C0577b c0577bW1 = W1(i10, bVar);
        b2(c0577bW1, b.f62810f0, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.r0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).m0(c0577bW1);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void p(final androidx.media3.exoplayer.j jVar) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 1015, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.e1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).c0(c0577bY1, jVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.t
    public final void p0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final Exception exc) {
        final b.C0577b c0577bW1 = W1(i10, bVar);
        b2(c0577bW1, 1024, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.s0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).k(c0577bW1, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void q(final androidx.media3.common.w wVar, @androidx.annotation.p0 final androidx.media3.exoplayer.k kVar) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 1009, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.c1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).v(c0577bY1, wVar, kVar);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void q0(final boolean z10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 3, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.h
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                w1.e1(c0577bS1, z10, (b) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void r(final androidx.media3.exoplayer.j jVar) {
        final b.C0577b c0577bX1 = X1();
        b2(c0577bX1, 1013, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.n0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).Z(c0577bX1, jVar);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void r0(final androidx.media3.common.d dVar) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 20, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.u
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).X(c0577bY1, dVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    @androidx.annotation.i
    public void release() {
        ((androidx.media3.common.util.u) androidx.media3.common.util.a.k(this.f63111h)).g(new Runnable() { // from class: androidx.media3.exoplayer.analytics.g1
            @Override // java.lang.Runnable
            public final void run() {
                this.f62914a.a2();
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void s(final Exception exc) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 1029, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.k1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).g(c0577bY1, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.b1
    public final void s0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final androidx.media3.exoplayer.source.d0 d0Var, final androidx.media3.exoplayer.source.h0 h0Var) {
        final b.C0577b c0577bW1 = W1(i10, bVar);
        b2(c0577bW1, 1001, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.t0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).h(c0577bW1, d0Var, h0Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void t(final long j10, final int i10) {
        final b.C0577b c0577bX1 = X1();
        b2(c0577bX1, 1021, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.k0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).I(c0577bX1, j10, i10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.t
    public final void t0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
        final b.C0577b c0577bW1 = W1(i10, bVar);
        b2(c0577bW1, 1025, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.x0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).D(c0577bW1);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void u(final androidx.media3.common.y0 y0Var) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 12, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.c
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).w(c0577bS1, y0Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public void u0(final int i10, final int i11, final boolean z10) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, b.f62824m0, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.g0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).o0(c0577bY1, i10, i11, z10);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void v() {
    }

    @Override // androidx.media3.common.z0.g
    public void v0(final androidx.media3.common.q0 q0Var) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 15, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.z0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).y0(c0577bS1, q0Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void w(final long j10) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 1010, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.w
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).g0(c0577bY1, j10);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void w0(@androidx.annotation.p0 final androidx.media3.common.x0 x0Var) {
        final b.C0577b c0577bZ1 = Z1(x0Var);
        b2(c0577bZ1, 10, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.d0
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).s0(c0577bZ1, x0Var);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void x(final int i10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 8, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.h1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).v0(c0577bS1, i10);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public void x0(final long j10) {
        final b.C0577b c0577bS1 = S1();
        b2(c0577bS1, 18, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.v1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).u0(c0577bS1, j10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void y(final Exception exc) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, b.f62818j0, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.p
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).r(c0577bY1, exc);
            }
        });
    }

    @Override // androidx.media3.common.z0.g
    public final void z(final int i10, final int i11) {
        final b.C0577b c0577bY1 = Y1();
        b2(c0577bY1, 24, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.analytics.s1
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((b) obj).n(c0577bY1, i10, i11);
            }
        });
    }
}
