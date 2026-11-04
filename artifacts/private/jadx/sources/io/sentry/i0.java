package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface i0 {
    @Nullable
    default o8 a(@NotNull o8 o8Var, @NotNull n0 n0Var) {
        return o8Var;
    }

    @Nullable
    default a8 b(@NotNull a8 a8Var) {
        return a8Var;
    }

    @Nullable
    default o7 c(@NotNull o7 o7Var, @NotNull n0 n0Var) {
        return o7Var;
    }

    @Nullable
    default io.sentry.protocol.c0 d(@NotNull io.sentry.protocol.c0 c0Var, @NotNull n0 n0Var) {
        return c0Var;
    }

    @Nullable
    default Long getOrder() {
        return null;
    }
}
