package androidx.compose.foundation.text.input.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class x6 {
    public static final <R> R a(@NotNull w6 w6Var, int i10, @NotNull pj.n<? super o3, ? super androidx.compose.ui.text.w3, ? super androidx.compose.ui.text.w3, ? extends R> nVar) {
        o3 o3Var;
        long jW = w6Var.w(i10);
        long jA = w6Var.A(jW);
        if (androidx.compose.ui.text.w3.h(jW) && androidx.compose.ui.text.w3.h(jA)) {
            o3Var = o3.Untransformed;
        } else if (androidx.compose.ui.text.w3.h(jW) || androidx.compose.ui.text.w3.h(jA)) {
            o3Var = (!androidx.compose.ui.text.w3.h(jW) || androidx.compose.ui.text.w3.h(jA)) ? o3.Deletion : o3.Insertion;
        } else {
            o3Var = o3.Replacement;
        }
        return nVar.invoke(o3Var, androidx.compose.ui.text.w3.b(jW), androidx.compose.ui.text.w3.b(jA));
    }
}
