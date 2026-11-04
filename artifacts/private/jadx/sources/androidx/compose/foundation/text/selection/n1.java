package androidx.compose.foundation.text.selection;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {
    @NotNull
    public static final androidx.compose.ui.text.style.i a(@NotNull androidx.compose.ui.text.p3 p3Var, int i10) {
        return b(p3Var, i10) ? p3Var.z(i10) : p3Var.c(i10);
    }

    private static final boolean b(androidx.compose.ui.text.p3 p3Var, int i10) {
        if (p3Var.l().n().length() != 0) {
            int iR = p3Var.r(i10);
            if ((i10 != 0 && iR == p3Var.r(i10 - 1)) || (i10 != p3Var.l().n().length() && iR == p3Var.r(i10 + 1))) {
                return false;
            }
        }
        return true;
    }
}
