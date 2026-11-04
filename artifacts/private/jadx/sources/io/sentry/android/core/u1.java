package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.n8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public final class u1 extends io.sentry.util.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.u f304552a = new io.sentry.util.u();

    @Override // io.sentry.util.u
    public boolean a(@NotNull String str, @Nullable ILogger iLogger) {
        return this.f304552a.a(str, iLogger);
    }

    @Override // io.sentry.util.u
    public boolean b(@NotNull String str, @Nullable n8 n8Var) {
        return this.f304552a.b(str, n8Var);
    }

    @Override // io.sentry.util.u
    @Nullable
    public Class<?> c(@NotNull String str, @Nullable ILogger iLogger) {
        return this.f304552a.c(str, iLogger);
    }
}
