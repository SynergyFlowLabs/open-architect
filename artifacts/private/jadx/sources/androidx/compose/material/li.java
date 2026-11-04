package androidx.compose.material;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class li {
    @androidx.compose.runtime.o
    @oj.i(name = "getSystemBarsForVisualComponents")
    @NotNull
    public static final androidx.compose.foundation.layout.v6 a(@NotNull androidx.compose.foundation.layout.v6.a aVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1520067638, i10, -1, "androidx.compose.material.<get-systemBarsForVisualComponents> (SystemBarsDefaultInsets.android.kt:25)");
        }
        int i11 = i10 & 14;
        androidx.compose.foundation.layout.v6 v6VarL = androidx.compose.foundation.layout.b7.l(androidx.compose.foundation.layout.b8.E(aVar, c0Var, i11), androidx.compose.foundation.layout.b8.o(aVar, c0Var, i11));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v6VarL;
    }
}
