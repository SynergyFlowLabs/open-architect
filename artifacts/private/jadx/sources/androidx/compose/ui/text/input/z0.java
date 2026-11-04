package androidx.compose.ui.text.input;

import androidx.compose.ui.text.w3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 {
    @NotNull
    public static final androidx.compose.ui.text.f a(@NotNull y0 y0Var) {
        return y0Var.j().v(y0Var.l());
    }

    @NotNull
    public static final androidx.compose.ui.text.f b(@NotNull y0 y0Var, int i10) {
        return y0Var.j().subSequence(w3.k(y0Var.l()), Math.min(w3.k(y0Var.l()) + i10, y0Var.m().length()));
    }

    @NotNull
    public static final androidx.compose.ui.text.f c(@NotNull y0 y0Var, int i10) {
        return y0Var.j().subSequence(Math.max(0, w3.l(y0Var.l()) - i10), w3.l(y0Var.l()));
    }
}
