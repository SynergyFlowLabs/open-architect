package androidx.compose.material3;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface x20 {
    static /* synthetic */ androidx.compose.ui.a0 d(x20 x20Var, androidx.compose.ui.a0 a0Var, int i10, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tabIndicatorOffset");
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return x20Var.b(a0Var, i10, z10);
    }

    @NotNull
    androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull pj.o<? super androidx.compose.ui.layout.c1, ? super androidx.compose.ui.layout.z0, ? super androidx.compose.ui.unit.b, ? super List<f30>, ? extends androidx.compose.ui.layout.b1> oVar);

    @NotNull
    androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, int i10, boolean z10);
}
