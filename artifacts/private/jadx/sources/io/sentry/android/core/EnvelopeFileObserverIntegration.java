package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.d4;
import io.sentry.n8;
import io.sentry.y7;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class EnvelopeFileObserverIntegration implements io.sentry.x1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private j1 f303970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private ILogger f303971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f303972c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.a f303973d = new io.sentry.util.a();

    private static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        @Nullable
        protected String d(@NotNull n8 n8Var) {
            return n8Var.getOutboxPath();
        }
    }

    public static /* synthetic */ void a(EnvelopeFileObserverIntegration envelopeFileObserverIntegration, io.sentry.i1 i1Var, n8 n8Var, String str) {
        io.sentry.m1 m1VarA = envelopeFileObserverIntegration.f303973d.a();
        try {
            if (!envelopeFileObserverIntegration.f303972c) {
                envelopeFileObserverIntegration.e(i1Var, n8Var, str);
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
    public static EnvelopeFileObserverIntegration b() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    private void e(@NotNull io.sentry.i1 i1Var, @NotNull n8 n8Var, @NotNull String str) {
        j1 j1Var = new j1(str, new d4(i1Var, n8Var.getEnvelopeReader(), n8Var.getSerializer(), n8Var.getLogger(), n8Var.getFlushTimeoutMillis(), n8Var.getMaxQueueSize()), n8Var.getLogger(), n8Var.getFlushTimeoutMillis());
        this.f303970a = j1Var;
        try {
            j1Var.startWatching();
            n8Var.getLogger().c(y7.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.util.q.a("EnvelopeFileObserver");
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }

    @Override // io.sentry.x1
    public final void c(@NotNull final io.sentry.i1 i1Var, @NotNull final n8 n8Var) {
        io.sentry.util.y.c(i1Var, "Scopes are required");
        io.sentry.util.y.c(n8Var, "SentryOptions is required");
        this.f303971b = n8Var.getLogger();
        final String strD = d(n8Var);
        if (strD == null) {
            this.f303971b.c(y7.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f303971b.c(y7.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", strD);
        try {
            n8Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.k1
                @Override // java.lang.Runnable
                public final void run() {
                    EnvelopeFileObserverIntegration.a(this.f304373a, i1Var, n8Var, strD);
                }
            });
        } catch (Throwable th2) {
            this.f303971b.a(y7.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.m1 m1VarA = this.f303973d.a();
        try {
            this.f303972c = true;
            if (m1VarA != null) {
                m1VarA.close();
            }
            j1 j1Var = this.f303970a;
            if (j1Var != null) {
                j1Var.stopWatching();
                ILogger iLogger = this.f303971b;
                if (iLogger != null) {
                    iLogger.c(y7.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
        } finally {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
    }

    @lm.n
    @Nullable
    abstract String d(@NotNull n8 n8Var);
}
