package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.n8;
import io.sentry.o7;
import io.sentry.y7;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class AnrIntegration implements io.sentry.x1, Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e.a({"StaticFieldLeak"})
    @Nullable
    private static c f303937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    protected static final io.sentry.util.a f303938f = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f303939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f303940b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f303941c = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private n8 f303942d;

    static final class a implements io.sentry.hints.a, io.sentry.hints.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f303943a;

        a(boolean z10) {
            this.f303943a = z10;
        }

        @Override // io.sentry.hints.a
        @Nullable
        public Long b() {
            return null;
        }

        @Override // io.sentry.hints.a
        public boolean c() {
            return true;
        }

        @Override // io.sentry.hints.a
        public String d() {
            return this.f303943a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(@NotNull Context context) {
        this.f303939a = a1.g(context);
    }

    public static /* synthetic */ void a(AnrIntegration anrIntegration, io.sentry.i1 i1Var, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.m1 m1VarA = anrIntegration.f303941c.a();
        try {
            if (!anrIntegration.f303940b) {
                anrIntegration.h(i1Var, sentryAndroidOptions);
            }
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

    @NotNull
    private Throwable d(boolean z10, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z10) {
            str = "Background " + str;
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.a());
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        jVar.E("ANR");
        return new io.sentry.exception.a(jVar, applicationNotResponding2, applicationNotResponding2.a(), true);
    }

    private void f(@NotNull final io.sentry.i1 i1Var, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.getLogger().c(y7.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.q.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnrIntegration.a(this.f304370a, i1Var, sentryAndroidOptions);
                    }
                });
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().a(y7.DEBUG, "Failed to start AnrIntegration on executor thread.", th2);
            }
        }
    }

    private void h(@NotNull final io.sentry.i1 i1Var, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.m1 m1VarA = f303938f.a();
        try {
            if (f303937e == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                y7 y7Var = y7.DEBUG;
                logger.c(y7Var, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                c cVar = new c(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new c.a() { // from class: io.sentry.android.core.l0
                    @Override // io.sentry.android.core.c.a
                    public final void a(ApplicationNotResponding applicationNotResponding) {
                        this.f304380a.g(i1Var, sentryAndroidOptions, applicationNotResponding);
                    }
                }, sentryAndroidOptions.getLogger(), this.f303939a);
                f303937e = cVar;
                cVar.start();
                sentryAndroidOptions.getLogger().c(y7Var, "AnrIntegration installed.", new Object[0]);
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA == null) {
                throw th2;
            }
            try {
                m1VarA.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.x1
    public final void c(@NotNull io.sentry.i1 i1Var, @NotNull n8 n8Var) {
        this.f303942d = (n8) io.sentry.util.y.c(n8Var, "SentryOptions is required");
        f(i1Var, (SentryAndroidOptions) n8Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        io.sentry.m1 m1VarA = this.f303941c.a();
        try {
            this.f303940b = true;
            if (m1VarA != null) {
                m1VarA.close();
            }
            io.sentry.m1 m1VarA2 = f303938f.a();
            try {
                c cVar = f303937e;
                if (cVar != null) {
                    cVar.interrupt();
                    f303937e = null;
                    n8 n8Var = this.f303942d;
                    if (n8Var != null) {
                        n8Var.getLogger().c(y7.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                if (m1VarA2 != null) {
                    m1VarA2.close();
                }
            } catch (Throwable th2) {
                if (m1VarA2 != null) {
                    try {
                        m1VarA2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @lm.n
    @Nullable
    c e() {
        return f303937e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @lm.n
    public void g(@NotNull io.sentry.i1 i1Var, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().c(y7.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean zEquals = Boolean.TRUE.equals(s0.g().j());
        o7 o7Var = new o7(d(zEquals, sentryAndroidOptions, applicationNotResponding));
        o7Var.M0(y7.ERROR);
        i1Var.o0(o7Var, io.sentry.util.n.e(new a(zEquals)));
    }
}
