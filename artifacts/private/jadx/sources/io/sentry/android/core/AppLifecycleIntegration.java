package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.n8;
import io.sentry.y7;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class AppLifecycleIntegration implements io.sentry.x1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f303965a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @lm.n
    @Nullable
    volatile t1 f303966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private SentryAndroidOptions f303967c;

    private void a() {
        io.sentry.m1 m1VarA = this.f303965a.a();
        try {
            t1 t1Var = this.f303966b;
            this.f303966b = null;
            if (m1VarA != null) {
                m1VarA.close();
            }
            if (t1Var != null) {
                s0.g().m(t1Var);
                SentryAndroidOptions sentryAndroidOptions = this.f303967c;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().c(y7.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.x1
    public void c(@NotNull io.sentry.i1 i1Var, @NotNull n8 n8Var) {
        io.sentry.util.y.c(i1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(n8Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) n8Var : null, "SentryAndroidOptions is required");
        this.f303967c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        y7 y7Var = y7.DEBUG;
        logger.c(y7Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f303967c.isEnableAutoSessionTracking()));
        this.f303967c.getLogger().c(y7Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f303967c.isEnableAppLifecycleBreadcrumbs()));
        if (this.f303967c.isEnableAutoSessionTracking() || this.f303967c.isEnableAppLifecycleBreadcrumbs()) {
            io.sentry.m1 m1VarA = this.f303965a.a();
            try {
                if (this.f303966b != null) {
                    if (m1VarA != null) {
                        m1VarA.close();
                    }
                } else {
                    this.f303966b = new t1(i1Var, this.f303967c.getSessionTrackingIntervalMillis(), this.f303967c.isEnableAutoSessionTracking(), this.f303967c.isEnableAppLifecycleBreadcrumbs());
                    s0.g().d(this.f303966b);
                    if (m1VarA != null) {
                        m1VarA.close();
                    }
                    n8Var.getLogger().c(y7Var, "AppLifecycleIntegration installed.", new Object[0]);
                    io.sentry.util.q.a("AppLifecycle");
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a();
        s0.g().x();
    }
}
