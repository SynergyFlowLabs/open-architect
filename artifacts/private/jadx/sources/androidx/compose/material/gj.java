package androidx.compose.material;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
public interface gj {
    @androidx.compose.runtime.o
    @NotNull
    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> a(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10);

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Use/implement overload with interactionSource parameter", replaceWith = @kotlin.b1(expression = "leadingIconColor(enabled, isError, interactionSource)", imports = {}))
    @NotNull
    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> b(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10);

    @androidx.compose.runtime.o
    @NotNull
    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> c(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10);

    @androidx.compose.runtime.o
    @NotNull
    default androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> d(boolean z10, boolean z11, @NotNull androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-1036335134);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1036335134, i10, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:123)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB = b(z10, z11, c0Var, (i10 & okhttp3.internal.ws.g.f334652s) | ((i10 >> 3) & 896));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarB;
    }

    @androidx.compose.runtime.o
    @NotNull
    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> e(boolean z10, boolean z11, @NotNull androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10);

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Use/implement overload with interactionSource parameter", replaceWith = @kotlin.b1(expression = "trailingIconColor(enabled, isError, interactionSource)", imports = {}))
    @NotNull
    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> f(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10);

    @androidx.compose.runtime.o
    @NotNull
    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> g(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10);

    @androidx.compose.runtime.o
    @NotNull
    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> h(boolean z10, boolean z11, @NotNull androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10);

    @androidx.compose.runtime.o
    @NotNull
    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> i(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10);

    @androidx.compose.runtime.o
    @NotNull
    default androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> j(boolean z10, boolean z11, @NotNull androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(454310320);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(454310320, i10, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:155)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarF = f(z10, z11, c0Var, (i10 & okhttp3.internal.ws.g.f334652s) | ((i10 >> 3) & 896));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarF;
    }
}
