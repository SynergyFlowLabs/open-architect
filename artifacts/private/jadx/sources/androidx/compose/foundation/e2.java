package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class e2 {
    @k7
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var) {
        return a0Var.B2(FocusGroupElement.f13868c);
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar) {
        return a0Var.B2(z10 ? new FocusableElement(jVar) : androidx.compose.ui.a0.E);
    }

    public static /* synthetic */ androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.foundation.interaction.j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            jVar = null;
        }
        return b(a0Var, z10, jVar);
    }
}
