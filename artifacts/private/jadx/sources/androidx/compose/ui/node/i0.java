package androidx.compose.ui.node;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinatorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,316:1\n57#2,4:317\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinatorKt\n*L\n294#1:317,4\n*E\n"})
public final class i0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(u0 u0Var, androidx.compose.ui.layout.a aVar) {
        u0 u0VarT1 = u0Var.T1();
        if (!(u0VarT1 != null)) {
            s0.a.i("Child of " + u0Var + " cannot be null when calculating alignment line");
        }
        if (u0Var.l2().x().containsKey(aVar)) {
            Integer num = u0Var.l2().x().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iM = u0VarT1.M(aVar);
        if (iM == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        u0VarT1.Z2(true);
        u0Var.Y2(true);
        u0Var.W2();
        u0VarT1.Z2(false);
        u0Var.Y2(false);
        return iM + (aVar instanceof androidx.compose.ui.layout.s ? androidx.compose.ui.unit.q.p(u0VarT1.u2()) : androidx.compose.ui.unit.q.n(u0VarT1.u2()));
    }
}
