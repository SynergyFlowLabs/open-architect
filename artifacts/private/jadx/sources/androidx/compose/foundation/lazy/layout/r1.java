package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.q3;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {
    public static final float a(int i10, int i11, boolean z10) {
        return z10 ? b(i10, i11) + 100 : b(i10, i11);
    }

    public static final float b(int i10, int i11) {
        return i11 + (i10 * 500);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function0<? extends l0> function0, @NotNull q1 q1Var, @NotNull q3 q3Var, boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1070136913, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        androidx.compose.ui.a0 a0VarB2 = a0Var.B2(new LazyLayoutSemanticsModifier(function0, q1Var, q3Var, z10, z11));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a0VarB2;
    }
}
