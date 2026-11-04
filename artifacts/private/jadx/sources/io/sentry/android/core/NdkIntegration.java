package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.k9;
import io.sentry.n8;
import io.sentry.y7;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class NdkIntegration implements io.sentry.x1, Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f303974c = "io.sentry.android.ndk.SentryNdk";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Class<?> f303975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private SentryAndroidOptions f303976b;

    public NdkIntegration(@Nullable Class<?> cls) {
        this.f303975a = cls;
    }

    private void a(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @lm.n
    @Nullable
    Class<?> b() {
        return this.f303975a;
    }

    @Override // io.sentry.x1
    public final void c(@NotNull io.sentry.i1 i1Var, @NotNull n8 n8Var) {
        io.sentry.util.y.c(i1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(n8Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) n8Var : null, "SentryAndroidOptions is required");
        this.f303976b = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f303976b.getLogger();
        y7 y7Var = y7.DEBUG;
        logger.c(y7Var, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || this.f303975a == null) {
            a(this.f303976b);
            return;
        }
        if (this.f303976b.getCacheDirPath() == null) {
            this.f303976b.getLogger().c(y7.ERROR, "No cache dir path is defined in options.", new Object[0]);
            a(this.f303976b);
            return;
        }
        try {
            this.f303975a.getMethod(k9.b.f305796c, SentryAndroidOptions.class).invoke(null, this.f303976b);
            this.f303976b.getLogger().c(y7Var, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.q.a("Ndk");
        } catch (NoSuchMethodException e10) {
            a(this.f303976b);
            this.f303976b.getLogger().a(y7.ERROR, "Failed to invoke the SentryNdk.init method.", e10);
        } catch (Throwable th2) {
            a(this.f303976b);
            this.f303976b.getLogger().a(y7.ERROR, "Failed to initialize SentryNdk.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.f303976b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class<?> cls = this.f303975a;
        try {
            if (cls != null) {
                try {
                    cls.getMethod("close", null).invoke(null, null);
                    this.f303976b.getLogger().c(y7.DEBUG, "NdkIntegration removed.", new Object[0]);
                    a(this.f303976b);
                } catch (NoSuchMethodException e10) {
                    this.f303976b.getLogger().a(y7.ERROR, "Failed to invoke the SentryNdk.close method.", e10);
                    a(this.f303976b);
                } catch (Throwable th2) {
                    this.f303976b.getLogger().a(y7.ERROR, "Failed to close SentryNdk.", th2);
                    a(this.f303976b);
                }
            }
        } catch (Throwable th3) {
            a(this.f303976b);
            throw th3;
        }
    }
}
