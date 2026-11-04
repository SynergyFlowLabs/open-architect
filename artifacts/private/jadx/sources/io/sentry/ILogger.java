package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface ILogger {
    void a(@NotNull y7 y7Var, @NotNull String str, @Nullable Throwable th2);

    void b(@NotNull y7 y7Var, @Nullable Throwable th2, @NotNull String str, @Nullable Object... objArr);

    void c(@NotNull y7 y7Var, @NotNull String str, @Nullable Object... objArr);

    boolean d(@Nullable y7 y7Var);
}
