package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWideNavigationRailState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRailState.kt\nandroidx/compose/material3/WideNavigationRailStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,261:1\n1282#2,6:262\n*S KotlinDebug\n*F\n+ 1 WideNavigationRailState.kt\nandroidx/compose/material3/WideNavigationRailStateKt\n*L\n90#1:262,6\n*E\n"})
public final class wb0 {
    public static final boolean b(@NotNull xb0 xb0Var) {
        return xb0Var == xb0.Expanded;
    }

    @NotNull
    public static final xb0 c(@NotNull xb0 xb0Var) {
        xb0 xb0Var2 = xb0.Collapsed;
        return xb0Var == xb0Var2 ? xb0.Expanded : xb0Var2;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final qb0 d(@Nullable final xb0 xb0Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        boolean z10 = true;
        if ((i11 & 1) != 0) {
            xb0Var = xb0.Collapsed;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1595273472, i10, -1, "androidx.compose.material3.rememberWideNavigationRailState (WideNavigationRailState.kt:86)");
        }
        final androidx.compose.animation.core.y0 y0VarB = hm.b(d0.h1.DefaultSpatial, c0Var, 6);
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<qb0, xb0> c0VarC = ub0.f33558f.c(y0VarB);
        if ((((i10 & 14) ^ 6) <= 4 || !c0Var.K(xb0Var.ordinal())) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zK0 = c0Var.k0(y0VarB) | z10;
        Object objI0 = c0Var.i0();
        if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.material3.vb0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return wb0.e(xb0Var, y0VarB);
                }
            };
            c0Var.Y(objI0);
        }
        qb0 qb0Var = (qb0) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI0, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return qb0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qb0 e(xb0 xb0Var, androidx.compose.animation.core.y0 y0Var) {
        return new ub0(xb0Var, y0Var);
    }
}
