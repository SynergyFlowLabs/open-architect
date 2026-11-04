package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.l3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    @NotNull
    public static final c a(@NotNull l3<Boolean> l3Var) {
        String strS = l3Var.s();
        if (strS == null) {
            strS = "AnimatedVisibility";
        }
        return new c(l3Var, strS);
    }
}
