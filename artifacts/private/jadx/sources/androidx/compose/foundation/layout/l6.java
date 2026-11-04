package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSpacer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,55:1\n122#2,6:56\n129#2,4:71\n133#2:81\n135#2:84\n316#3,9:62\n325#3,2:82\n4360#4,6:75\n*S KotlinDebug\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n*L\n39#1:56,6\n39#1:71,4\n39#1:81\n39#1:84\n39#1:62,9\n39#1:82,2\n39#1:75,6\n*E\n"})
public final class l6 {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@NotNull androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-72882467, i10, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:37)");
        }
        n6 n6Var = n6.f16254a;
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0Var);
        androidx.compose.runtime.b1 b1VarK = c0Var.k();
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        if (c0Var.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var.q();
        if (c0Var.P()) {
            c0Var.q0(function0A);
        } else {
            c0Var.l();
        }
        androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
        androidx.compose.runtime.y7.n(c0VarD, n6Var, aVar.e());
        androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
        androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        c0Var.o();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }
}
