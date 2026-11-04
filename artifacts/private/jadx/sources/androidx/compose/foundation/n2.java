package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class n2 {
    @k7
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.foundation.interaction.j jVar, boolean z10) {
        return a0Var.B2(z10 ? new HoverableElement(jVar) : androidx.compose.ui.a0.E);
    }

    public static /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, androidx.compose.foundation.interaction.j jVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(a0Var, jVar, z10);
    }
}
