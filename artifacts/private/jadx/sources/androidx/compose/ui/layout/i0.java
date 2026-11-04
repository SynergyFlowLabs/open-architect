package androidx.compose.ui.layout;

import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 {
    @Nullable
    public static final Object a(@NotNull z0 z0Var) {
        Object objC = z0Var.c();
        k0 k0Var = objC instanceof k0 ? (k0) objC : null;
        if (k0Var != null) {
            return k0Var.N6();
        }
        return null;
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Object obj) {
        return a0Var.B2(new LayoutIdElement(obj));
    }
}
