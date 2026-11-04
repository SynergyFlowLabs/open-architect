package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class w implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f307097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final ILogger f307098b;

    public w(@NotNull n8 n8Var, @Nullable ILogger iLogger) {
        this.f307097a = (n8) io.sentry.util.y.c(n8Var, "SentryOptions is required.");
        this.f307098b = iLogger;
    }

    @Override // io.sentry.ILogger
    public void a(@NotNull y7 y7Var, @NotNull String str, @Nullable Throwable th2) {
        if (this.f307098b == null || !d(y7Var)) {
            return;
        }
        this.f307098b.a(y7Var, str, th2);
    }

    @Override // io.sentry.ILogger
    public void b(@NotNull y7 y7Var, @Nullable Throwable th2, @NotNull String str, @Nullable Object... objArr) {
        if (this.f307098b == null || !d(y7Var)) {
            return;
        }
        this.f307098b.b(y7Var, th2, str, objArr);
    }

    @Override // io.sentry.ILogger
    public void c(@NotNull y7 y7Var, @NotNull String str, @Nullable Object... objArr) {
        if (this.f307098b == null || !d(y7Var)) {
            return;
        }
        this.f307098b.c(y7Var, str, objArr);
    }

    @Override // io.sentry.ILogger
    public boolean d(@Nullable y7 y7Var) {
        boolean z10 = false & false;
        return y7Var != null && this.f307097a.isDebug() && y7Var.ordinal() >= this.f307097a.getDiagnosticLevel().ordinal();
    }

    @lm.n
    @Nullable
    public ILogger e() {
        return this.f307098b;
    }
}
