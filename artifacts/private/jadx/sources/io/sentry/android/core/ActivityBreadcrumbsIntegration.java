package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.ILogger;
import io.sentry.ja;
import io.sentry.n8;
import io.sentry.y7;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class ActivityBreadcrumbsIntegration implements io.sentry.x1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f303910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private io.sentry.i1 f303911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f303912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f303913d = new io.sentry.util.a();

    public ActivityBreadcrumbsIntegration(@NotNull Application application) {
        this.f303910a = (Application) io.sentry.util.y.c(application, "Application is required");
    }

    private void a(@NotNull Activity activity, @NotNull String str) {
        if (this.f303911b == null) {
            return;
        }
        io.sentry.f fVar = new io.sentry.f();
        fVar.Y("navigation");
        fVar.U("state", str);
        fVar.U(com.segment.analytics.kotlin.android.plugins.a.f266538j3, b(activity));
        fVar.T("ui.lifecycle");
        fVar.V(y7.INFO);
        io.sentry.n0 n0Var = new io.sentry.n0();
        n0Var.o(ja.f305664h, activity);
        this.f303911b.m(fVar, n0Var);
    }

    @NotNull
    private String b(@NotNull Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @Override // io.sentry.x1
    public void c(@NotNull io.sentry.i1 i1Var, @NotNull n8 n8Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(n8Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) n8Var : null, "SentryAndroidOptions is required");
        this.f303911b = (io.sentry.i1) io.sentry.util.y.c(i1Var, "Scopes are required");
        this.f303912c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = n8Var.getLogger();
        y7 y7Var = y7.DEBUG;
        logger.c(y7Var, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f303912c));
        if (this.f303912c) {
            this.f303910a.registerActivityLifecycleCallbacks(this);
            n8Var.getLogger().c(y7Var, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.q.a("ActivityBreadcrumbs");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f303912c) {
            this.f303910a.unregisterActivityLifecycleCallbacks(this);
            io.sentry.i1 i1Var = this.f303911b;
            if (i1Var != null) {
                i1Var.b().getLogger().c(y7.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        io.sentry.m1 m1VarA = this.f303913d.a();
        try {
            a(activity, "created");
            if (m1VarA != null) {
                m1VarA.close();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        io.sentry.m1 m1VarA = this.f303913d.a();
        try {
            a(activity, "destroyed");
            if (m1VarA != null) {
                m1VarA.close();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        io.sentry.m1 m1VarA = this.f303913d.a();
        try {
            a(activity, "paused");
            if (m1VarA != null) {
                m1VarA.close();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        io.sentry.m1 m1VarA = this.f303913d.a();
        try {
            a(activity, "resumed");
            if (m1VarA != null) {
                m1VarA.close();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        io.sentry.m1 m1VarA = this.f303913d.a();
        try {
            a(activity, "saveInstanceState");
            if (m1VarA != null) {
                m1VarA.close();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        io.sentry.m1 m1VarA = this.f303913d.a();
        try {
            a(activity, "started");
            if (m1VarA != null) {
                m1VarA.close();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        io.sentry.m1 m1VarA = this.f303913d.a();
        try {
            a(activity, "stopped");
            if (m1VarA != null) {
                m1VarA.close();
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
