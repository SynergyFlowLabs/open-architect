package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface e4 extends androidx.compose.runtime.external.kotlinx.collections.immutable.h<u0<Object>, z7<Object>>, b1, v0 {

    public interface a extends androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<u0<Object>, z7<Object>> {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h.a
        @NotNull
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<u0<Object>, z7<Object>> build();
    }

    @Override // androidx.compose.runtime.v0
    default <T> T H0(@NotNull u0<T> u0Var) {
        return (T) c1.c(this, u0Var);
    }

    @NotNull
    e4 b2(@NotNull u0<Object> u0Var, @NotNull z7<Object> z7Var);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @NotNull
    androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<u0<Object>, z7<Object>> builder();
}
