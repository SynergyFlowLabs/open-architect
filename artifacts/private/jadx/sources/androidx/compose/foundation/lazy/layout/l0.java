package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface l0 {
    @androidx.annotation.g0(from = 0)
    int a();

    default int c(@NotNull Object obj) {
        return -1;
    }

    @NotNull
    default Object d(@androidx.annotation.g0(from = 0) int i10) {
        return i2.a(i10);
    }

    @Nullable
    default Object f(@androidx.annotation.g0(from = 0) int i10) {
        return null;
    }

    @androidx.compose.runtime.o
    void i(@androidx.annotation.g0(from = 0) int i10, @NotNull Object obj, @Nullable androidx.compose.runtime.c0 c0Var, int i11);
}
