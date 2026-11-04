package io.sentry;

import java.io.Closeable;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class UncaughtExceptionHandlerIntegration implements x1, Thread.UncaughtExceptionHandler, Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f303878f = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Thread.UncaughtExceptionHandler f303879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private i1 f303880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private n8 f303881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f303882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ka f303883e;

    @lm.a.c
    public static class a extends io.sentry.hints.d implements io.sentry.hints.l, io.sentry.hints.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicReference<io.sentry.protocol.v> f303884d;

        public a(long j10, @NotNull ILogger iLogger) {
            super(j10, iLogger);
            this.f303884d = new AtomicReference<>();
        }

        @Override // io.sentry.hints.f
        public boolean f(@Nullable io.sentry.protocol.v vVar) {
            io.sentry.protocol.v vVar2 = this.f303884d.get();
            return vVar2 != null && vVar2.equals(vVar);
        }

        @Override // io.sentry.hints.f
        public void g(@NotNull io.sentry.protocol.v vVar) {
            this.f303884d.set(vVar);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(ka.a.c());
    }

    @lm.n
    @NotNull
    static Throwable a(@NotNull Thread thread, @NotNull Throwable th2) {
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        jVar.z(Boolean.FALSE);
        jVar.E("UncaughtExceptionHandler");
        return new io.sentry.exception.a(jVar, th2, thread);
    }

    private void b(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        d(uncaughtExceptionHandler, new HashSet());
    }

    private void d(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NotNull Set<Thread.UncaughtExceptionHandler> set) {
        if (uncaughtExceptionHandler == null) {
            n8 n8Var = this.f303881c;
            if (n8Var != null) {
                n8Var.getLogger().c(y7.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
            }
        } else if (!set.add(uncaughtExceptionHandler)) {
            n8 n8Var2 = this.f303881c;
            if (n8Var2 != null) {
                n8Var2.getLogger().c(y7.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
            }
        } else if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f303879a;
            if (this != uncaughtExceptionHandler2) {
                d(uncaughtExceptionHandler2, set);
                return;
            }
            uncaughtExceptionHandlerIntegration.f303879a = this.f303879a;
            n8 n8Var3 = this.f303881c;
            if (n8Var3 != null) {
                n8Var3.getLogger().c(y7.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.x1
    public final void c(@NotNull i1 i1Var, @NotNull n8 n8Var) {
        if (this.f303882d) {
            n8Var.getLogger().c(y7.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f303882d = true;
        this.f303880b = (i1) io.sentry.util.y.c(i1Var, "Scopes are required");
        n8 n8Var2 = (n8) io.sentry.util.y.c(n8Var, "SentryOptions is required");
        this.f303881c = n8Var2;
        ILogger logger = n8Var2.getLogger();
        y7 y7Var = y7.DEBUG;
        logger.c(y7Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f303881c.isEnableUncaughtExceptionHandler()));
        if (this.f303881c.isEnableUncaughtExceptionHandler()) {
            m1 m1VarA = f303878f.a();
            try {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandlerB = this.f303883e.b();
                if (uncaughtExceptionHandlerB != null) {
                    this.f303881c.getLogger().c(y7Var, "default UncaughtExceptionHandler class='" + uncaughtExceptionHandlerB.getClass().getName() + "'", new Object[0]);
                    if (uncaughtExceptionHandlerB instanceof UncaughtExceptionHandlerIntegration) {
                        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandlerB;
                        if (uncaughtExceptionHandlerIntegration.f303880b == null || i1Var.g() != uncaughtExceptionHandlerIntegration.f303880b.g()) {
                            this.f303879a = uncaughtExceptionHandlerB;
                        } else {
                            this.f303879a = uncaughtExceptionHandlerIntegration.f303879a;
                        }
                    } else {
                        this.f303879a = uncaughtExceptionHandlerB;
                    }
                }
                this.f303883e.a(this);
                if (m1VarA != null) {
                    m1VarA.close();
                }
                this.f303881c.getLogger().c(y7Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                io.sentry.util.q.a("UncaughtExceptionHandler");
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
    public void close() {
        m1 m1VarA = f303878f.a();
        try {
            if (this == this.f303883e.b()) {
                this.f303883e.a(this.f303879a);
                n8 n8Var = this.f303881c;
                if (n8Var != null) {
                    n8Var.getLogger().c(y7.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                b(this.f303883e.b());
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

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        n8 n8Var = this.f303881c;
        if (n8Var == null || this.f303880b == null) {
            return;
        }
        n8Var.getLogger().c(y7.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.f303881c.getFlushTimeoutMillis(), this.f303881c.getLogger());
            o7 o7Var = new o7(a(thread, th2));
            o7Var.M0(y7.FATAL);
            if (this.f303880b.p() == null && o7Var.I() != null) {
                aVar.g(o7Var.I());
            }
            n0 n0VarE = io.sentry.util.n.e(aVar);
            boolean zEquals = this.f303880b.o0(o7Var, n0VarE).equals(io.sentry.protocol.v.f306474b);
            io.sentry.hints.h hVarF = io.sentry.util.n.f(n0VarE);
            if ((!zEquals || io.sentry.hints.h.MULTITHREADED_DEDUPLICATION.equals(hVarF)) && !aVar.h()) {
                this.f303881c.getLogger().c(y7.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", o7Var.I());
            }
        } catch (Throwable th3) {
            this.f303881c.getLogger().a(y7.ERROR, "Error sending uncaught exception to Sentry.", th3);
        }
        if (this.f303879a != null) {
            this.f303881c.getLogger().c(y7.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f303879a.uncaughtException(thread, th2);
        } else if (this.f303881c.isPrintUncaughtStackTrace()) {
            th2.printStackTrace();
        }
    }

    UncaughtExceptionHandlerIntegration(@NotNull ka kaVar) {
        this.f303882d = false;
        this.f303883e = (ka) io.sentry.util.y.c(kaVar, "threadAdapter is required.");
    }
}
