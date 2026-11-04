package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollNode\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,485:1\n101#2,10:486\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollNode\n*L\n428#1:486,10\n*E\n"})
public final class v4 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0, androidx.compose.ui.node.i2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f21857w = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private b5 f21858s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f21859t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f21860v;

    public v4(@NotNull b5 b5Var, boolean z10, boolean z11) {
        this.f21858s = b5Var;
        this.f21859t = z10;
        this.f21860v = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float A9(v4 v4Var) {
        return v4Var.f21858s.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E9(v4 v4Var, int i10, final androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        int iB = v4Var.f21858s.B();
        if (iB < 0) {
            iB = 0;
        }
        if (iB > i10) {
            iB = i10;
        }
        int i11 = v4Var.f21859t ? iB - i10 : -iB;
        boolean z10 = v4Var.f21860v;
        final int i12 = z10 ? 0 : i11;
        final int i13 = z10 ? i11 : 0;
        aVar.K0(new Function1() { // from class: androidx.compose.foundation.s4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v4.F9(i2Var, i12, i13, (androidx.compose.ui.layout.i2.a) obj);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F9(androidx.compose.ui.layout.i2 i2Var, int i10, int i11, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.p0(aVar, i2Var, i10, i11, 0.0f, null, 12, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float z9(v4 v4Var) {
        return v4Var.f21858s.B();
    }

    public final boolean B9() {
        return this.f21859t;
    }

    @NotNull
    public final b5 C9() {
        return this.f21858s;
    }

    public final boolean D9() {
        return this.f21860v;
    }

    public final void G9(boolean z10) {
        this.f21859t = z10;
    }

    public final void H9(@NotNull b5 b5Var) {
        this.f21858s = b5Var;
    }

    public final void I9(boolean z10) {
        this.f21860v = z10;
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        if (this.f21860v) {
            i10 = Integer.MAX_VALUE;
        }
        return yVar.L0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        if (this.f21860v) {
            i10 = Integer.MAX_VALUE;
        }
        return yVar.M0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        g1.a(j10, this.f21860v ? androidx.compose.foundation.gestures.q3.Vertical : androidx.compose.foundation.gestures.q3.Horizontal);
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(j10, 0, this.f21860v ? androidx.compose.ui.unit.b.p(j10) : Integer.MAX_VALUE, 0, this.f21860v ? Integer.MAX_VALUE : androidx.compose.ui.unit.b.o(j10), 5, null));
        int iB = kotlin.ranges.r.B(i2VarP0.h1(), androidx.compose.ui.unit.b.p(j10));
        int iB2 = kotlin.ranges.r.B(i2VarP0.c1(), androidx.compose.ui.unit.b.o(j10));
        final int iC1 = i2VarP0.c1() - iB2;
        int iH1 = i2VarP0.h1() - iB;
        if (!this.f21860v) {
            iC1 = iH1;
        }
        this.f21858s.F(iC1);
        this.f21858s.H(this.f21860v ? iB2 : iB);
        return androidx.compose.ui.layout.c1.h6(c1Var, iB, iB2, null, new Function1() { // from class: androidx.compose.foundation.r4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v4.E9(this.f18556a, iC1, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        if (!this.f21860v) {
            i10 = Integer.MAX_VALUE;
        }
        return yVar.p0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        if (!this.f21860v) {
            i10 = Integer.MAX_VALUE;
        }
        return yVar.D0(i10);
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.b2(e0Var, true);
        androidx.compose.ui.semantics.l lVar = new androidx.compose.ui.semantics.l(new Function0() { // from class: androidx.compose.foundation.t4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(v4.z9(this.f18752a));
            }
        }, new Function0() { // from class: androidx.compose.foundation.u4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(v4.A9(this.f21838a));
            }
        }, this.f21859t);
        if (this.f21860v) {
            androidx.compose.ui.semantics.b0.d2(e0Var, lVar);
        } else {
            androidx.compose.ui.semantics.b0.B1(e0Var, lVar);
        }
    }
}
