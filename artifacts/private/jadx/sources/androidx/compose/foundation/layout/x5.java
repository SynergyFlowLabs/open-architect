package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@j4
@androidx.compose.runtime.o2
public interface x5 {

    public static final class a {
    }

    static /* synthetic */ androidx.compose.ui.a0 q(x5 x5Var, androidx.compose.ui.a0 a0Var, float f10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return x5Var.h(a0Var, f10, z10);
    }

    @androidx.compose.runtime.k7
    @NotNull
    androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1);

    @androidx.compose.runtime.k7
    @NotNull
    androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, boolean z10);

    @androidx.compose.runtime.k7
    @NotNull
    androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.s sVar);

    @androidx.compose.runtime.k7
    @NotNull
    androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.c cVar);

    @androidx.compose.runtime.k7
    @NotNull
    androidx.compose.ui.a0 o(@NotNull androidx.compose.ui.a0 a0Var);
}
