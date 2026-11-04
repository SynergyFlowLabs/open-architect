package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@j4
@androidx.compose.runtime.k7
public interface i2 extends m0 {
    static /* synthetic */ androidx.compose.ui.a0 l(i2 i2Var, androidx.compose.ui.a0 a0Var, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxColumnWidth");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return i2Var.g(a0Var, f10);
    }

    @u1
    @NotNull
    androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10);
}
