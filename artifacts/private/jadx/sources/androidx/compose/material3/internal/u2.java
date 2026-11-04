package androidx.compose.material3.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class u2 {
    public static final int a(@Nullable androidx.compose.ui.layout.i2 i2Var) {
        if (i2Var != null) {
            return i2Var.c1();
        }
        return 0;
    }

    @Nullable
    public static final Object b(@NotNull androidx.compose.ui.layout.y yVar) {
        Object objC = yVar.c();
        androidx.compose.ui.layout.k0 k0Var = objC instanceof androidx.compose.ui.layout.k0 ? (androidx.compose.ui.layout.k0) objC : null;
        if (k0Var != null) {
            return k0Var.N6();
        }
        return null;
    }

    public static final int c(@Nullable androidx.compose.ui.layout.i2 i2Var) {
        if (i2Var != null) {
            return i2Var.h1();
        }
        return 0;
    }

    public static final int d(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : kotlin.ranges.r.u(i10 - i11, 0);
    }
}
