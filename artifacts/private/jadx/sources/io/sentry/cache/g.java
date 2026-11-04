package io.sentry.cache;

import io.sentry.g6;
import io.sentry.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface g extends Iterable<g6> {
    @Deprecated
    void D3(@NotNull g6 g6Var, @NotNull n0 n0Var);

    default boolean M3(@NotNull g6 g6Var, @NotNull n0 n0Var) {
        D3(g6Var, n0Var);
        return true;
    }

    @Deprecated
    default void R2(@NotNull g6 g6Var) {
        M3(g6Var, new n0());
    }

    void e3(@NotNull g6 g6Var);
}
