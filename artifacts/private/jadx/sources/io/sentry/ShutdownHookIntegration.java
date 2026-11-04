package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class ShutdownHookIntegration implements x1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Runtime f303873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Thread f303874b;

    @lm.n
    public ShutdownHookIntegration(@NotNull Runtime runtime) {
        this.f303873a = (Runtime) io.sentry.util.y.c(runtime, "Runtime is required");
    }

    public static /* synthetic */ void a(ShutdownHookIntegration shutdownHookIntegration, n8 n8Var) {
        shutdownHookIntegration.f303873a.addShutdownHook(shutdownHookIntegration.f303874b);
        n8Var.getLogger().c(y7.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        io.sentry.util.q.a("ShutdownHook");
    }

    private void f(@NotNull Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e10) {
            String message = e10.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e10;
            }
        }
    }

    @Override // io.sentry.x1
    public void c(@NotNull final i1 i1Var, @NotNull final n8 n8Var) {
        io.sentry.util.y.c(i1Var, "Scopes are required");
        io.sentry.util.y.c(n8Var, "SentryOptions is required");
        if (!n8Var.isEnableShutdownHook()) {
            n8Var.getLogger().c(y7.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.f303874b = new Thread(new Runnable() { // from class: io.sentry.l9
                @Override // java.lang.Runnable
                public final void run() {
                    i1Var.w(n8Var.getFlushTimeoutMillis());
                }
            }, "sentry-shutdownhook");
            f(new Runnable() { // from class: io.sentry.m9
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration.a(this.f305883a, n8Var);
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f303874b != null) {
            f(new Runnable() { // from class: io.sentry.n9
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration shutdownHookIntegration = this.f305937a;
                    shutdownHookIntegration.f303873a.removeShutdownHook(shutdownHookIntegration.f303874b);
                }
            });
        }
    }

    @lm.r
    @Nullable
    Thread e() {
        return this.f303874b;
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
