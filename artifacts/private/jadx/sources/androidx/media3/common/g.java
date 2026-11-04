package androidx.media3.common;

import com.google.common.collect.l6;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public abstract class g implements z0 {

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    protected final z3.d f60604b1 = new z3.d();

    protected g() {
    }

    private void A2(long j10, int i10) {
        z2(l0(), j10, i10, false);
    }

    private void B2(int i10, int i11) {
        z2(i10, -9223372036854775807L, i11, false);
    }

    private void C2(int i10) {
        int iE0 = e0();
        if (iE0 == -1) {
            x2(i10);
        } else if (iE0 == l0()) {
            y2(i10);
        } else {
            B2(iE0, i10);
        }
    }

    private void D2(long j10, int i10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        A2(Math.max(currentPosition, 0L), i10);
    }

    private void E2(int i10) {
        int iA0 = a0();
        if (iA0 == -1) {
            x2(i10);
        } else if (iA0 == l0()) {
            y2(i10);
        } else {
            B2(iA0, i10);
        }
    }

    private int w2() {
        int iC = C();
        if (iC == 1) {
            return 0;
        }
        return iC;
    }

    private void x2(int i10) {
        z2(-1, -9223372036854775807L, i10, false);
    }

    private void y2(int i10) {
        z2(l0(), -9223372036854775807L, i10, true);
    }

    @Override // androidx.media3.common.z0
    public final void A1() {
        E2(6);
    }

    @Override // androidx.media3.common.z0
    public final void B() {
        b0(true);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final void C1() {
        L0();
    }

    @Override // androidx.media3.common.z0
    public final void F(long j10) {
        A2(j10, 5);
    }

    @Override // androidx.media3.common.z0
    public final void F1(int i10) {
        H0(i10, i10 + 1);
    }

    @Override // androidx.media3.common.z0
    public final void G(float f10) {
        h(c().d(f10));
    }

    @Override // androidx.media3.common.z0
    public final boolean G0() {
        return true;
    }

    @Override // androidx.media3.common.z0
    public final int G1() {
        return c0().v();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final void I0() {
        A1();
    }

    @Override // androidx.media3.common.z0
    public final void I1() {
        if (c0().w() || x()) {
            x2(7);
            return;
        }
        boolean zC2 = c2();
        if (x1() && !k1()) {
            if (zC2) {
                E2(7);
                return;
            } else {
                x2(7);
                return;
            }
        }
        if (!zC2 || getCurrentPosition() > Z0()) {
            A2(0L, 7);
        } else {
            E2(7);
        }
    }

    @Override // androidx.media3.common.z0
    public final void K0(k0 k0Var) {
        w1(l6.G(k0Var));
    }

    @Override // androidx.media3.common.z0
    public final void L0() {
        C2(8);
    }

    @Override // androidx.media3.common.z0
    public final long N() {
        z3 z3VarC0 = c0();
        if (z3VarC0.w()) {
            return -9223372036854775807L;
        }
        return z3VarC0.t(l0(), this.f60604b1).e();
    }

    @Override // androidx.media3.common.z0
    public final boolean O0() {
        return e0() != -1;
    }

    @Override // androidx.media3.common.z0
    public final void O1(k0 k0Var) {
        p2(l6.G(k0Var));
    }

    @Override // androidx.media3.common.z0
    public final boolean P0(int i10) {
        return a2().c(i10);
    }

    @Override // androidx.media3.common.z0
    public final void Q(int i10) {
        B2(i10, 10);
    }

    @Override // androidx.media3.common.z0
    public final int S() {
        long jV = v();
        long duration = getDuration();
        if (jV == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return androidx.media3.common.util.k1.w((int) ((jV * 100) / duration), 0, 100);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final boolean T() {
        return k1();
    }

    @Override // androidx.media3.common.z0
    public final boolean T1() {
        z3 z3VarC0 = c0();
        return !z3VarC0.w() && z3VarC0.t(l0(), this.f60604b1).f61996i;
    }

    @Override // androidx.media3.common.z0
    public final void U() {
        B2(l0(), 4);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final boolean X() {
        return T1();
    }

    @Override // androidx.media3.common.z0
    public final long X0() {
        z3 z3VarC0 = c0();
        if (!z3VarC0.w() && z3VarC0.t(l0(), this.f60604b1).f61993f != -9223372036854775807L) {
            return (this.f60604b1.b() - this.f60604b1.f61993f) - n0();
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.common.z0
    public final void X1() {
        if (c0().w() || x()) {
            x2(9);
            return;
        }
        if (O0()) {
            C2(9);
        } else if (x1() && T1()) {
            B2(l0(), 9);
        } else {
            x2(9);
        }
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final int Y() {
        return l0();
    }

    @Override // androidx.media3.common.z0
    public final k0 Y0(int i10) {
        return c0().t(i10, this.f60604b1).f61990c;
    }

    @Override // androidx.media3.common.z0
    @androidx.annotation.p0
    public final k0 Z() {
        z3 z3VarC0 = c0();
        if (z3VarC0.w()) {
            return null;
        }
        return z3VarC0.t(l0(), this.f60604b1).f61990c;
    }

    @Override // androidx.media3.common.z0
    public final void Z1(int i10, k0 k0Var) {
        g2(i10, l6.G(k0Var));
    }

    @Override // androidx.media3.common.z0
    public final int a0() {
        z3 z3VarC0 = c0();
        if (z3VarC0.w()) {
            return -1;
        }
        return z3VarC0.r(l0(), w2(), s0());
    }

    @Override // androidx.media3.common.z0
    public final boolean c2() {
        return a0() != -1;
    }

    @Override // androidx.media3.common.z0
    public final int e0() {
        z3 z3VarC0 = c0();
        if (z3VarC0.w()) {
            return -1;
        }
        return z3VarC0.i(l0(), w2(), s0());
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final boolean hasNext() {
        return O0();
    }

    @Override // androidx.media3.common.z0
    public final void i2(k0 k0Var, boolean z10) {
        z0(l6.G(k0Var), z10);
    }

    @Override // androidx.media3.common.z0
    public final boolean isPlaying() {
        return H() == 3 && J() && V1() == 0;
    }

    @Override // androidx.media3.common.z0
    public final void j0(int i10, long j10) {
        z2(i10, j10, 10, false);
    }

    @Override // androidx.media3.common.z0
    public final boolean k1() {
        z3 z3VarC0 = c0();
        return !z3VarC0.w() && z3VarC0.t(l0(), this.f60604b1).f61995h;
    }

    @Override // androidx.media3.common.z0
    public final void l2(k0 k0Var, long j10) {
        h1(l6.G(k0Var), 0, j10);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final boolean n2() {
        return x1();
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final void next() {
        L0();
    }

    @Override // androidx.media3.common.z0
    public final void o(int i10, k0 k0Var) {
        w(i10, i10 + 1, l6.G(k0Var));
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final int o0() {
        return a0();
    }

    @Override // androidx.media3.common.z0
    public final void o1(int i10, int i11) {
        if (i10 != i11) {
            o2(i10, i10 + 1, i11);
        }
    }

    @Override // androidx.media3.common.z0
    public final void p2(List<k0> list) {
        g2(Integer.MAX_VALUE, list);
    }

    @Override // androidx.media3.common.z0
    public final void pause() {
        b0(false);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final int q0() {
        return e0();
    }

    @Override // androidx.media3.common.z0
    public final void t1() {
        D2(i1(), 12);
    }

    @Override // androidx.media3.common.z0
    public final void t2() {
        D2(-v2(), 11);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final boolean v0() {
        return O0();
    }

    @Override // androidx.media3.common.z0
    public final void w1(List<k0> list) {
        z0(list, true);
    }

    @Override // androidx.media3.common.z0
    public final boolean x1() {
        z3 z3VarC0 = c0();
        return !z3VarC0.w() && z3VarC0.t(l0(), this.f60604b1).i();
    }

    @Override // androidx.media3.common.z0
    @androidx.annotation.p0
    public final Object z() {
        z3 z3VarC0 = c0();
        if (z3VarC0.w()) {
            return null;
        }
        return z3VarC0.t(l0(), this.f60604b1).f61991d;
    }

    @Override // androidx.media3.common.z0
    public final void z1() {
        H0(0, Integer.MAX_VALUE);
    }

    @z7.g
    protected abstract void z2(int i10, long j10, int i11, boolean z10);
}
