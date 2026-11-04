package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@j4
@kotlin.l(message = "ContextualFlowLayouts are no longer maintained")
@androidx.compose.runtime.k7
@u1
public interface w0 extends m0 {
    static /* synthetic */ androidx.compose.ui.a0 k(w0 w0Var, androidx.compose.ui.a0 a0Var, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxColumnWidth");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return w0Var.g(a0Var, f10);
    }

    int b();

    float c();

    int f();

    @u1
    @NotNull
    androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10);

    float m();
}
