package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,477:1\n113#2:478\n113#2:479\n113#2:480\n113#2:481\n93#3,4:482\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n456#1:478\n457#1:479\n458#1:480\n459#1:481\n455#1:482,4\n*E\n"})
final class l5 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private g5 f16211s;

    public l5(@NotNull g5 g5Var) {
        this.f16211s = g5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x9(androidx.compose.ui.layout.i2 i2Var, int i10, int i11, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, i10, i11, 0.0f, 4, null);
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        float fB = this.f16211s.b(c1Var.getLayoutDirection());
        float fD = this.f16211s.d();
        float fC = this.f16211s.c(c1Var.getLayoutDirection());
        float fA = this.f16211s.a();
        float f10 = 0;
        if (!((androidx.compose.ui.unit.h.q(fA, androidx.compose.ui.unit.h.r(f10)) >= 0) & (androidx.compose.ui.unit.h.q(fB, androidx.compose.ui.unit.h.r(f10)) >= 0) & (androidx.compose.ui.unit.h.q(fD, androidx.compose.ui.unit.h.r(f10)) >= 0) & (androidx.compose.ui.unit.h.q(fC, androidx.compose.ui.unit.h.r(f10)) >= 0))) {
            x.a.f("Padding must be non-negative");
        }
        final int iG6 = c1Var.g6(fB);
        int iG7 = c1Var.g6(fC) + iG6;
        final int iG8 = c1Var.g6(fD);
        int iG9 = c1Var.g6(fA) + iG8;
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.c.q(j10, -iG7, -iG9));
        return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.c.i(j10, i2VarP0.h1() + iG7), androidx.compose.ui.unit.c.h(j10, i2VarP0.c1() + iG9), null, new Function1() { // from class: androidx.compose.foundation.layout.k5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l5.x9(i2VarP0, iG6, iG8, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @NotNull
    public final g5 w9() {
        return this.f16211s;
    }

    public final void y9(@NotNull g5 g5Var) {
        this.f16211s = g5Var;
    }
}
