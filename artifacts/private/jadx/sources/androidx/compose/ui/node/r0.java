package androidx.compose.ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,498:1\n210#2:499\n436#3,8:500\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n*L\n391#1:499\n391#1:500,8\n*E\n"})
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f39983a = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()";

    public static final boolean a(@NotNull l0 l0Var) {
        if (l0Var.t0() == null) {
            return false;
        }
        l0 l0VarJ0 = l0Var.J0();
        return (l0VarJ0 != null ? l0VarJ0.t0() : null) == null || l0Var.k0().g();
    }

    public static final <T extends androidx.compose.ui.layout.z0> void b(@NotNull l0 l0Var, @NotNull androidx.compose.runtime.collection.d<T> dVar, @NotNull Function1<? super l0, ? extends T> function1) {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = l0Var.Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var2 = l0VarArr[i10];
            if (dVar.R() <= i10) {
                dVar.d(function1.invoke(l0Var2));
            } else {
                dVar.x0(i10, function1.invoke(l0Var2));
            }
        }
        dVar.t0(l0Var.Z().size(), dVar.R());
    }
}
