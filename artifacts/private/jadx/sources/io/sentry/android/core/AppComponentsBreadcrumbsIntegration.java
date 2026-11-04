package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.ILogger;
import io.sentry.ja;
import io.sentry.n8;
import io.sentry.y7;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class AppComponentsBreadcrumbsIntegration implements io.sentry.x1, Closeable, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f303959e = 60000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final io.sentry.n0 f303960f = new io.sentry.n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f303961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private io.sentry.i1 f303962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private SentryAndroidOptions f303963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.m f303964d = new io.sentry.android.core.internal.util.m(io.sentry.android.core.internal.util.f.b(), 60000, 0);

    public AppComponentsBreadcrumbsIntegration(@NotNull Context context) {
        this.f303961a = (Context) io.sentry.util.y.c(a1.g(context), "Context is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j10, @NotNull Configuration configuration) {
        if (this.f303962b != null) {
            io.sentry.protocol.e.b bVarA = io.sentry.android.core.internal.util.n.a(this.f303961a.getResources().getConfiguration().orientation);
            String lowerCase = bVarA != null ? bVarA.name().toLowerCase(Locale.ROOT) : "undefined";
            io.sentry.f fVar = new io.sentry.f(j10);
            fVar.Y("navigation");
            fVar.T("device.orientation");
            fVar.U("position", lowerCase);
            fVar.V(y7.INFO);
            io.sentry.n0 n0Var = new io.sentry.n0();
            n0Var.o(ja.f305665i, configuration);
            this.f303962b.m(fVar, n0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j10, int i10) {
        if (this.f303962b != null) {
            io.sentry.f fVar = new io.sentry.f(j10);
            fVar.Y("system");
            fVar.T("device.event");
            fVar.W("Low memory");
            fVar.U(com.facebook.internal.w0.f100156c1, "LOW_MEMORY");
            fVar.U("level", Integer.valueOf(i10));
            fVar.V(y7.WARNING);
            this.f303962b.m(fVar, f303960f);
        }
    }

    private void f(@NotNull Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f303963c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th2) {
                this.f303963c.getLogger().b(y7.ERROR, th2, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // io.sentry.x1
    public void c(@NotNull io.sentry.i1 i1Var, @NotNull n8 n8Var) {
        this.f303962b = (io.sentry.i1) io.sentry.util.y.c(i1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(n8Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) n8Var : null, "SentryAndroidOptions is required");
        this.f303963c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        y7 y7Var = y7.DEBUG;
        logger.c(y7Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f303963c.isEnableAppComponentBreadcrumbs()));
        if (this.f303963c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f303961a.registerComponentCallbacks(this);
                n8Var.getLogger().c(y7Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.q.a("AppComponentsBreadcrumbs");
            } catch (Throwable th2) {
                this.f303963c.setEnableAppComponentBreadcrumbs(false);
                n8Var.getLogger().b(y7.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f303961a.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f303963c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().b(y7.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f303963c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(y7.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull final Configuration configuration) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f(new Runnable() { // from class: io.sentry.android.core.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f304410a.d(jCurrentTimeMillis, configuration);
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(final int i10) {
        if (i10 >= 40 && !this.f303964d.a()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            f(new Runnable() { // from class: io.sentry.android.core.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f304422a.e(jCurrentTimeMillis, i10);
                }
            });
        }
    }
}
