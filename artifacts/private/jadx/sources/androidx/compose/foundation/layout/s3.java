package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@j4
@androidx.compose.runtime.k7
public interface s3 extends x5 {
    static /* synthetic */ androidx.compose.ui.a0 m(s3 s3Var, androidx.compose.ui.a0 a0Var, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxRowHeight");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return s3Var.c(a0Var, f10);
    }

    @u1
    @NotNull
    androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10);
}
