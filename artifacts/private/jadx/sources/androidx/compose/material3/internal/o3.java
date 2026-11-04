package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.b7;
import androidx.compose.foundation.layout.b8;
import androidx.compose.foundation.layout.v6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o3 {
    @androidx.compose.runtime.o
    @oj.i(name = "getSystemBarsForVisualComponents")
    @NotNull
    public static final v6 a(@NotNull v6.a aVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2011811170, i10, -1, "androidx.compose.material3.internal.<get-systemBarsForVisualComponents> (SystemBarsDefaultInsets.android.kt:25)");
        }
        int i11 = i10 & 14;
        v6 v6VarL = b7.l(b8.E(aVar, c0Var, i11), b8.o(aVar, c0Var, i11));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v6VarL;
    }
}
