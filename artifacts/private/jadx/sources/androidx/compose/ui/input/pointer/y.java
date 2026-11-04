package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class y {
    @k7
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull x xVar, boolean z10) {
        return a0Var.B2(new PointerHoverIconModifierElement(xVar, z10));
    }

    public static /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, x xVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(a0Var, xVar, z10);
    }

    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull x xVar, boolean z10, @Nullable androidx.compose.ui.node.s sVar) {
        return a0Var.B2(new StylusHoverIconModifierElement(xVar, z10, sVar));
    }

    public static /* synthetic */ androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, x xVar, boolean z10, androidx.compose.ui.node.s sVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            sVar = null;
        }
        return c(a0Var, xVar, z10, sVar);
    }
}
