package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface r5 {
    static /* synthetic */ long t(r5 r5Var, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
        }
        if ((i14 & 16) != 0) {
            z10 = false;
        }
        return r5Var.f(i10, i11, i12, i13, z10);
    }

    long f(int i10, int i11, int i12, int i13, boolean z10);

    void g(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, @NotNull androidx.compose.ui.layout.c1 c1Var);

    int h(@NotNull androidx.compose.ui.layout.i2 i2Var);

    @NotNull
    androidx.compose.ui.layout.b1 j(@NotNull androidx.compose.ui.layout.i2[] i2VarArr, @NotNull androidx.compose.ui.layout.c1 c1Var, int i10, @NotNull int[] iArr, int i11, int i12, @Nullable int[] iArr2, int i13, int i14, int i15);

    int k(@NotNull androidx.compose.ui.layout.i2 i2Var);
}
