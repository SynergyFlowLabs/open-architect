package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class c3 implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c3 f305155a = new c3();

    private c3() {
    }

    public static c3 e() {
        return f305155a;
    }

    @Override // io.sentry.ILogger
    public void a(@NotNull y7 y7Var, @NotNull String str, @Nullable Throwable th2) {
    }

    @Override // io.sentry.ILogger
    public void b(@NotNull y7 y7Var, @Nullable Throwable th2, @NotNull String str, @Nullable Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public void c(@NotNull y7 y7Var, @NotNull String str, @Nullable Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public boolean d(@Nullable y7 y7Var) {
        return false;
    }
}
