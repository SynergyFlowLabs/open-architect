package androidx.compose.foundation.text.input.internal;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCoreTextFieldSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextFieldSemanticsModifier.kt\nandroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
public final class r0 extends androidx.compose.ui.node.m implements androidx.compose.ui.node.i2 {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f19770i3 = 8;

    @NotNull
    private androidx.compose.ui.text.input.m0 H1;

    @NotNull
    private androidx.compose.ui.text.input.y0 X;

    @NotNull
    private androidx.compose.foundation.text.g4 Y;
    private boolean Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.input.u f19771g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.focus.g0 f19772h3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f19773p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f19774p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.text.selection.u3 f19775p2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.input.h1 f19776w;

    public r0(@NotNull androidx.compose.ui.text.input.h1 h1Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.foundation.text.g4 g4Var, boolean z10, boolean z11, boolean z12, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull androidx.compose.foundation.text.selection.u3 u3Var, @NotNull androidx.compose.ui.text.input.u uVar, @NotNull androidx.compose.ui.focus.g0 g0Var) {
        this.f19776w = h1Var;
        this.X = y0Var;
        this.Y = g4Var;
        this.Z = z10;
        this.f19773p0 = z11;
        this.f19774p1 = z12;
        this.H1 = m0Var;
        this.f19775p2 = u3Var;
        this.f19771g3 = uVar;
        this.f19772h3 = g0Var;
        u3Var.Q0(new Function0() { // from class: androidx.compose.foundation.text.input.internal.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r0.T9(this.f19626a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Aa(r0 r0Var) {
        androidx.compose.ui.node.k.o(r0Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T9(r0 r0Var) {
        androidx.compose.ui.node.k.o(r0Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean U9(r0 r0Var, androidx.compose.ui.text.f fVar) {
        r0Var.Y.P(true);
        r0Var.Y.J(true);
        r0Var.na(r0Var.Y, fVar.m(), r0Var.Z, r0Var.f19773p0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V9(r0 r0Var) {
        androidx.compose.foundation.text.selection.u3.I(r0Var.f19775p2, false, 1, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean W9(r0 r0Var) {
        androidx.compose.foundation.text.selection.u3.B(r0Var.f19775p2, false, 1, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X9(r0 r0Var) {
        r0Var.f19775p2.E();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y9(r0 r0Var) {
        r0Var.f19775p2.y0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z9(r0 r0Var, List list) {
        if (r0Var.Y.n() == null) {
            return false;
        }
        androidx.compose.foundation.text.y6 y6VarN = r0Var.Y.n();
        Intrinsics.checkNotNull(y6VarN);
        list.add(y6VarN.i());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean aa(r0 r0Var, androidx.compose.ui.text.f fVar) {
        r0Var.na(r0Var.Y, fVar.m(), r0Var.Z, r0Var.f19773p0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ba(r0 r0Var, androidx.compose.ui.semantics.e0 e0Var, androidx.compose.ui.text.f fVar) {
        if (r0Var.Z || !r0Var.f19773p0) {
            return false;
        }
        androidx.compose.ui.text.input.g1 g1VarJ = r0Var.Y.j();
        if (g1VarJ != null) {
            androidx.compose.foundation.text.q5.f20780a.k(CollectionsKt.listOf((Object[]) new androidx.compose.ui.text.input.j[]{new androidx.compose.ui.text.input.p(), new androidx.compose.ui.text.input.b(fVar, 1)}), r0Var.Y.s(), r0Var.Y.r(), g1VarJ);
        } else {
            int i10 = 6 << 0;
            r0Var.Y.r().invoke(new androidx.compose.ui.text.input.y0(StringsKt.J4(r0Var.X.m(), androidx.compose.ui.text.w3.n(r0Var.X.l()), androidx.compose.ui.text.w3.i(r0Var.X.l()), fVar).toString(), androidx.compose.ui.text.x3.a(androidx.compose.ui.text.w3.n(r0Var.X.l()) + fVar.length()), (androidx.compose.ui.text.w3) null, 4, (DefaultConstructorMarker) null));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ca(r0 r0Var, int i10, int i11, boolean z10) {
        if (!z10) {
            i10 = r0Var.H1.a(i10);
        }
        if (!z10) {
            i11 = r0Var.H1.a(i11);
        }
        if (!r0Var.f19773p0) {
            return false;
        }
        if (i10 == androidx.compose.ui.text.w3.n(r0Var.X.l()) && i11 == androidx.compose.ui.text.w3.i(r0Var.X.l())) {
            return false;
        }
        if (Math.min(i10, i11) < 0 || Math.max(i10, i11) > r0Var.X.j().length()) {
            r0Var.f19775p2.J();
            return false;
        }
        if (z10 || i10 == i11) {
            r0Var.f19775p2.J();
        } else {
            androidx.compose.foundation.text.selection.u3.I(r0Var.f19775p2, false, 1, null);
        }
        r0Var.Y.r().invoke(new androidx.compose.ui.text.input.y0(r0Var.X.j(), androidx.compose.ui.text.x3.b(i10, i11), (androidx.compose.ui.text.w3) null, 4, (DefaultConstructorMarker) null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean da(r0 r0Var) {
        r0Var.Y.p().invoke(androidx.compose.ui.text.input.t.j(r0Var.f19771g3.k()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ea(r0 r0Var) {
        androidx.compose.foundation.text.d3.W(r0Var.Y, r0Var.f19772h3, !r0Var.Z);
        return true;
    }

    private final void na(androidx.compose.foundation.text.g4 g4Var, String str, boolean z10, boolean z11) {
        if (z10 || !z11) {
            return;
        }
        androidx.compose.ui.text.input.g1 g1VarJ = g4Var.j();
        if (g1VarJ != null) {
            androidx.compose.foundation.text.q5.f20780a.k(CollectionsKt.listOf((Object[]) new androidx.compose.ui.text.input.j[]{new androidx.compose.ui.text.input.g(), new androidx.compose.ui.text.input.b(str, 1)}), g4Var.s(), g4Var.r(), g1VarJ);
        } else {
            g4Var.r().invoke(new androidx.compose.ui.text.input.y0(str, androidx.compose.ui.text.x3.a(str.length()), (androidx.compose.ui.text.w3) null, 4, (DefaultConstructorMarker) null));
        }
    }

    @Override // androidx.compose.ui.node.i2
    public boolean A4() {
        return true;
    }

    public final boolean fa() {
        return this.f19773p0;
    }

    @NotNull
    public final androidx.compose.ui.text.input.u ga() {
        return this.f19771g3;
    }

    @NotNull
    public final androidx.compose.foundation.text.selection.u3 ha() {
        return this.f19775p2;
    }

    @NotNull
    public final androidx.compose.ui.text.input.m0 ia() {
        return this.H1;
    }

    public final boolean ja() {
        return this.Z;
    }

    @NotNull
    public final androidx.compose.foundation.text.g4 ka() {
        return this.Y;
    }

    @NotNull
    public final androidx.compose.ui.text.input.h1 la() {
        return this.f19776w;
    }

    @NotNull
    public final androidx.compose.ui.text.input.y0 ma() {
        return this.X;
    }

    @NotNull
    public final androidx.compose.ui.focus.g0 n1() {
        return this.f19772h3;
    }

    public final boolean oa() {
        return this.f19774p1;
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull final androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.D1(e0Var, this.X.j());
        androidx.compose.ui.semantics.b0.z1(e0Var, this.f19776w.b());
        androidx.compose.ui.semantics.b0.W1(e0Var, this.X.l());
        androidx.compose.ui.semantics.b0.u1(e0Var, androidx.compose.ui.autofill.s.f37034a.d());
        androidx.compose.ui.semantics.b0.O0(e0Var, null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(r0.U9(this.f19633a, (androidx.compose.ui.text.f) obj));
            }
        }, 1, null);
        if (!this.f19773p0) {
            androidx.compose.ui.semantics.b0.n(e0Var);
        }
        if (this.f19774p1) {
            androidx.compose.ui.semantics.b0.d1(e0Var);
        }
        boolean z10 = this.f19773p0 && !this.Z;
        androidx.compose.ui.semantics.b0.y1(e0Var, z10);
        androidx.compose.ui.semantics.b0.l0(e0Var, null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(r0.Z9(this.f19687a, (List) obj));
            }
        }, 1, null);
        if (z10) {
            androidx.compose.ui.semantics.b0.V1(e0Var, null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.m0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(r0.aa(this.f19703a, (androidx.compose.ui.text.f) obj));
                }
            }, 1, null);
            androidx.compose.ui.semantics.b0.A0(e0Var, null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.n0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(r0.ba(this.f19712a, e0Var, (androidx.compose.ui.text.f) obj));
                }
            }, 1, null);
        }
        androidx.compose.ui.semantics.b0.N1(e0Var, null, new pj.n() { // from class: androidx.compose.foundation.text.input.internal.o0
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(r0.ca(this.f19720a, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue()));
            }
        }, 1, null);
        androidx.compose.ui.semantics.b0.S0(e0Var, this.f19771g3.k(), null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(r0.da(this.f19736a));
            }
        }, 2, null);
        androidx.compose.ui.semantics.b0.Q0(e0Var, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(r0.ea(this.f19753a));
            }
        }, 1, null);
        androidx.compose.ui.semantics.b0.U0(e0Var, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(r0.V9(this.f19600a));
            }
        }, 1, null);
        if (!androidx.compose.ui.text.w3.h(this.X.l()) && !this.f19774p1) {
            androidx.compose.ui.semantics.b0.j(e0Var, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(r0.W9(this.f19604a));
                }
            }, 1, null);
            if (this.f19773p0 && !this.Z) {
                androidx.compose.ui.semantics.b0.l(e0Var, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.h0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(r0.X9(this.f19613a));
                    }
                }, 1, null);
            }
        }
        if (this.f19773p0 && !this.Z) {
            androidx.compose.ui.semantics.b0.f1(e0Var, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(r0.Y9(this.f19681a));
                }
            }, 1, null);
        }
    }

    public final void pa(boolean z10) {
        this.f19773p0 = z10;
    }

    public final void qa(@NotNull androidx.compose.ui.focus.g0 g0Var) {
        this.f19772h3 = g0Var;
    }

    public final void ra(@NotNull androidx.compose.ui.text.input.u uVar) {
        this.f19771g3 = uVar;
    }

    public final void sa(@NotNull androidx.compose.foundation.text.selection.u3 u3Var) {
        this.f19775p2 = u3Var;
    }

    public final void ta(@NotNull androidx.compose.ui.text.input.m0 m0Var) {
        this.H1 = m0Var;
    }

    public final void ua(boolean z10) {
        this.f19774p1 = z10;
    }

    public final void va(boolean z10) {
        this.Z = z10;
    }

    public final void wa(@NotNull androidx.compose.foundation.text.g4 g4Var) {
        this.Y = g4Var;
    }

    public final void xa(@NotNull androidx.compose.ui.text.input.h1 h1Var) {
        this.f19776w = h1Var;
    }

    public final void ya(@NotNull androidx.compose.ui.text.input.y0 y0Var) {
        this.X = y0Var;
    }

    public final void za(@NotNull androidx.compose.ui.text.input.h1 h1Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.foundation.text.g4 g4Var, boolean z10, boolean z11, boolean z12, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull androidx.compose.foundation.text.selection.u3 u3Var, @NotNull androidx.compose.ui.text.input.u uVar, @NotNull androidx.compose.ui.focus.g0 g0Var) {
        boolean z13 = this.f19773p0;
        boolean z14 = false;
        boolean z15 = z13 && !this.Z;
        boolean z16 = this.f19774p1;
        androidx.compose.ui.text.input.u uVar2 = this.f19771g3;
        androidx.compose.foundation.text.selection.u3 u3Var2 = this.f19775p2;
        if (z11 && !z10) {
            z14 = true;
        }
        this.f19776w = h1Var;
        this.X = y0Var;
        this.Y = g4Var;
        this.Z = z10;
        this.f19773p0 = z11;
        this.H1 = m0Var;
        this.f19775p2 = u3Var;
        this.f19771g3 = uVar;
        this.f19772h3 = g0Var;
        if (z11 != z13 || z14 != z15 || !Intrinsics.areEqual(uVar, uVar2) || z12 != z16 || !androidx.compose.ui.text.w3.h(y0Var.l())) {
            androidx.compose.ui.node.j2.b(this);
        }
        if (Intrinsics.areEqual(u3Var, u3Var2)) {
            return;
        }
        u3Var.Q0(new Function0() { // from class: androidx.compose.foundation.text.input.internal.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r0.Aa(this.f19573a);
            }
        });
    }
}
