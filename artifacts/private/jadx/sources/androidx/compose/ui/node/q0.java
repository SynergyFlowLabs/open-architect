package androidx.compose.ui.node;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,498:1\n1#2:499\n*E\n"})
public final class q0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f39964r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0 f39965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39967c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f39970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f39971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f39974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f39977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f39978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f39979o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private x0 f39981q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private l0.e f39968d = l0.e.Idle;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final a1 f39980p = new a1(this);

    public q0(@NotNull l0 l0Var) {
        this.f39965a = l0Var;
    }

    public final int A() {
        return this.f39980p.h1();
    }

    public final void B() {
        this.f39980p.Y2();
        x0 x0Var = this.f39981q;
        if (x0Var != null) {
            x0Var.O2();
        }
    }

    public final void C() {
        this.f39980p.I3(true);
        x0 x0Var = this.f39981q;
        if (x0Var != null) {
            x0Var.z3(true);
        }
    }

    public final void D() {
        this.f39980p.j3();
    }

    public final void E() {
        this.f39970f = true;
        this.f39971g = true;
    }

    public final void F() {
        this.f39969e = true;
    }

    public final void G() {
        this.f39980p.k3();
    }

    public final void H() {
        l0.e eVarM0 = this.f39965a.m0();
        if (eVarM0 == l0.e.LayingOut || eVarM0 == l0.e.LookaheadLayingOut) {
            if (this.f39980p.t2()) {
                O(true);
            } else {
                N(true);
            }
        }
        if (eVarM0 == l0.e.LookaheadLayingOut) {
            x0 x0Var = this.f39981q;
            if (x0Var == null || !x0Var.b2()) {
                S(true);
            } else {
                T(true);
            }
        }
    }

    public final void I() {
        this.f39981q = null;
        this.f39970f = false;
        this.f39969e = false;
    }

    public final void J(long j10) {
        x0 x0Var = this.f39981q;
        if (x0Var != null) {
            x0Var.o3(j10);
        }
    }

    public final void K() {
        a aVarX;
        this.f39980p.x().t();
        x0 x0Var = this.f39981q;
        if (x0Var == null || (aVarX = x0Var.x()) == null) {
            return;
        }
        aVarX.t();
    }

    public final void L(int i10) {
        int i11 = this.f39976l;
        this.f39976l = i10;
        if ((i11 == 0) != (i10 == 0)) {
            l0 l0VarJ0 = this.f39965a.J0();
            q0 q0VarK0 = l0VarJ0 != null ? l0VarJ0.k0() : null;
            if (q0VarK0 != null) {
                if (i10 == 0) {
                    q0VarK0.L(q0VarK0.f39976l - 1);
                } else {
                    q0VarK0.L(q0VarK0.f39976l + 1);
                }
            }
        }
    }

    public final void M(int i10) {
        int i11 = this.f39979o;
        this.f39979o = i10;
        if ((i11 == 0) != (i10 == 0)) {
            l0 l0VarJ0 = this.f39965a.J0();
            q0 q0VarK0 = l0VarJ0 != null ? l0VarJ0.k0() : null;
            if (q0VarK0 != null) {
                if (i10 == 0) {
                    q0VarK0.M(q0VarK0.f39979o - 1);
                } else {
                    q0VarK0.M(q0VarK0.f39979o + 1);
                }
            }
        }
    }

    public final void N(boolean z10) {
        if (this.f39975k != z10) {
            this.f39975k = z10;
            if (z10 && !this.f39974j) {
                L(this.f39976l + 1);
            } else if (!z10 && !this.f39974j) {
                L(this.f39976l - 1);
            }
        }
    }

    public final void O(boolean z10) {
        if (this.f39974j != z10) {
            this.f39974j = z10;
            if (z10 && !this.f39975k) {
                L(this.f39976l + 1);
            } else {
                if (z10 || this.f39975k) {
                    return;
                }
                L(this.f39976l - 1);
            }
        }
    }

    public final void P(boolean z10) {
        this.f39966b = z10;
    }

    public final void Q(boolean z10) {
        this.f39967c = z10;
    }

    public final void R(@NotNull l0.e eVar) {
        this.f39968d = eVar;
    }

    public final void S(boolean z10) {
        if (this.f39978n != z10) {
            this.f39978n = z10;
            if (z10 && !this.f39977m) {
                M(this.f39979o + 1);
            } else {
                if (z10 || this.f39977m) {
                    return;
                }
                M(this.f39979o - 1);
            }
        }
    }

    public final void T(boolean z10) {
        if (this.f39977m != z10) {
            this.f39977m = z10;
            if (z10 && !this.f39978n) {
                M(this.f39979o + 1);
            } else {
                if (z10 || this.f39978n) {
                    return;
                }
                M(this.f39979o - 1);
            }
        }
    }

    public final void U(boolean z10) {
        this.f39970f = z10;
    }

    public final void V(boolean z10) {
        this.f39971g = z10;
    }

    public final void W(boolean z10) {
        this.f39969e = z10;
    }

    public final void X(int i10) {
        this.f39972h = i10;
    }

    public final void Y(int i10) {
        this.f39973i = i10;
    }

    public final void Z() {
        l0 l0VarJ0;
        if (this.f39980p.c4() && (l0VarJ0 = this.f39965a.J0()) != null) {
            l0.U1(l0VarJ0, false, false, false, 7, null);
        }
        x0 x0Var = this.f39981q;
        if (x0Var == null || !x0Var.X3()) {
            return;
        }
        if (r0.a(this.f39965a)) {
            l0 l0VarJ1 = this.f39965a.J0();
            if (l0VarJ1 != null) {
                l0.U1(l0VarJ1, false, false, false, 7, null);
                return;
            }
            return;
        }
        l0 l0VarJ2 = this.f39965a.J0();
        if (l0VarJ2 != null) {
            l0.Q1(l0VarJ2, false, false, false, 7, null);
        }
    }

    public final void a() {
        if (this.f39981q == null) {
            this.f39981q = new x0(this);
        }
    }

    @NotNull
    public final b b() {
        return this.f39980p;
    }

    public final int c() {
        return this.f39976l;
    }

    public final int d() {
        return this.f39979o;
    }

    public final boolean e() {
        return this.f39975k;
    }

    public final boolean f() {
        return this.f39974j;
    }

    public final boolean g() {
        return this.f39966b;
    }

    public final boolean h() {
        return this.f39967c;
    }

    public final int i() {
        return this.f39980p.c1();
    }

    @Nullable
    public final androidx.compose.ui.unit.b j() {
        return this.f39980p.l2();
    }

    @Nullable
    public final androidx.compose.ui.unit.b k() {
        x0 x0Var = this.f39981q;
        if (x0Var != null) {
            return x0Var.T1();
        }
        return null;
    }

    @NotNull
    public final l0 l() {
        return this.f39965a;
    }

    public final boolean m() {
        return this.f39980p.u2();
    }

    @NotNull
    public final l0.e n() {
        return this.f39968d;
    }

    @Nullable
    public final b o() {
        return this.f39981q;
    }

    public final boolean p() {
        return this.f39978n;
    }

    public final boolean q() {
        return this.f39977m;
    }

    public final boolean r() {
        return this.f39970f;
    }

    public final boolean s() {
        return this.f39971g;
    }

    public final boolean t() {
        return this.f39969e;
    }

    @Nullable
    public final x0 u() {
        return this.f39981q;
    }

    @NotNull
    public final a1 v() {
        return this.f39980p;
    }

    public final boolean w() {
        return this.f39980p.z2();
    }

    public final int x() {
        return this.f39972h;
    }

    public final int y() {
        return this.f39973i;
    }

    @NotNull
    public final k1 z() {
        return this.f39965a.A0().p();
    }
}
