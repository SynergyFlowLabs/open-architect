package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.n8;
import io.sentry.y7;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class UserInteractionIntegration implements io.sentry.x1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f304033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private io.sentry.i1 f304034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private SentryAndroidOptions f304035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f304036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f304037e;

    public UserInteractionIntegration(@NotNull Application application, @NotNull io.sentry.util.u uVar) {
        this.f304033a = (Application) io.sentry.util.y.c(application, "Application is required");
        this.f304036d = uVar.b("androidx.core.view.GestureDetectorCompat", this.f304035c);
        this.f304037e = uVar.b("androidx.lifecycle.Lifecycle", this.f304035c);
    }

    private void a(@NotNull Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f304035c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(y7.INFO, "Window was null in startTracking", new Object[0]);
            }
        } else if (this.f304034b != null && this.f304035c != null) {
            Window.Callback callback = window.getCallback();
            if (callback == null) {
                callback = new io.sentry.android.core.internal.gestures.b();
            }
            if (!(callback instanceof io.sentry.android.core.internal.gestures.h)) {
                window.setCallback(new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.f304034b, this.f304035c), this.f304035c));
            }
        }
    }

    private void b(@NotNull Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f304035c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(y7.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar = (io.sentry.android.core.internal.gestures.h) callback;
            hVar.c();
            if (hVar.a() instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(hVar.a());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.x1
    public void c(@NotNull io.sentry.i1 i1Var, @NotNull n8 n8Var) {
        this.f304035c = (SentryAndroidOptions) io.sentry.util.y.c(n8Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) n8Var : null, "SentryAndroidOptions is required");
        this.f304034b = (io.sentry.i1) io.sentry.util.y.c(i1Var, "Scopes are required");
        boolean z10 = this.f304035c.isEnableUserInteractionBreadcrumbs() || this.f304035c.isEnableUserInteractionTracing();
        ILogger logger = this.f304035c.getLogger();
        y7 y7Var = y7.DEBUG;
        logger.c(y7Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z10));
        if (z10) {
            if (!this.f304036d) {
                n8Var.getLogger().c(y7.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f304033a.registerActivityLifecycleCallbacks(this);
            this.f304035c.getLogger().c(y7Var, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.q.a("UserInteraction");
            if (this.f304037e) {
                Activity activityC = b1.d().c();
                if ((activityC instanceof androidx.lifecycle.o0) && ((androidx.lifecycle.o0) activityC).getLifecycle().d() == androidx.lifecycle.c0.b.RESUMED) {
                    a(activityC);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f304033a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f304035c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(y7.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
    }
}
