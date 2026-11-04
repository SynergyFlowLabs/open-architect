package io.sentry;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class SendCachedEnvelopeFireAndForgetIntegration implements x1, u0.b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f303865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private u0 f303866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private i1 f303867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private n8 f303868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private a f303869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f303870f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f303871g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f303872h = new io.sentry.util.a();

    public interface a {
        void send();
    }

    public interface b {
        @Nullable
        String a();
    }

    public interface c {
        static /* synthetic */ void c(ILogger iLogger, String str, y yVar, File file) {
            y7 y7Var = y7.DEBUG;
            iLogger.c(y7Var, "Started processing cached files from %s", str);
            yVar.d(file);
            iLogger.c(y7Var, "Finished processing cached files from %s", str);
        }

        @NotNull
        default a a(@NotNull final y yVar, @NotNull final String str, @NotNull final ILogger iLogger) {
            final File file = new File(str);
            return new a() { // from class: io.sentry.k5
                @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.a
                public final void send() {
                    SendCachedEnvelopeFireAndForgetIntegration.c.c(iLogger, str, yVar, file);
                }
            };
        }

        default boolean b(@Nullable String str, @NotNull ILogger iLogger) {
            if (str != null && !str.isEmpty()) {
                return true;
            }
            iLogger.c(y7.INFO, "No cached dir path is defined in options.", new Object[0]);
            return false;
        }

        @Nullable
        a d(@NotNull i1 i1Var, @NotNull n8 n8Var);
    }

    public SendCachedEnvelopeFireAndForgetIntegration(@NotNull c cVar) {
        this.f303865a = (c) io.sentry.util.y.c(cVar, "SendFireAndForgetFactory is required");
    }

    public static /* synthetic */ void a(SendCachedEnvelopeFireAndForgetIntegration sendCachedEnvelopeFireAndForgetIntegration, n8 n8Var, i1 i1Var) {
        sendCachedEnvelopeFireAndForgetIntegration.getClass();
        try {
            if (sendCachedEnvelopeFireAndForgetIntegration.f303871g.get()) {
                n8Var.getLogger().c(y7.INFO, "SendCachedEnvelopeFireAndForgetIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!sendCachedEnvelopeFireAndForgetIntegration.f303870f.getAndSet(true)) {
                u0 connectionStatusProvider = n8Var.getConnectionStatusProvider();
                sendCachedEnvelopeFireAndForgetIntegration.f303866b = connectionStatusProvider;
                connectionStatusProvider.Pd(sendCachedEnvelopeFireAndForgetIntegration);
                sendCachedEnvelopeFireAndForgetIntegration.f303869e = sendCachedEnvelopeFireAndForgetIntegration.f303865a.d(i1Var, n8Var);
            }
            u0 u0Var = sendCachedEnvelopeFireAndForgetIntegration.f303866b;
            if (u0Var != null && u0Var.L3() == u0.a.DISCONNECTED) {
                n8Var.getLogger().c(y7.INFO, "SendCachedEnvelopeFireAndForgetIntegration, no connection.", new Object[0]);
                return;
            }
            io.sentry.transport.a0 a0VarI0 = i1Var.i0();
            if (a0VarI0 != null && a0VarI0.j(o.All)) {
                n8Var.getLogger().c(y7.INFO, "SendCachedEnvelopeFireAndForgetIntegration, rate limiting active.", new Object[0]);
                return;
            }
            a aVar = sendCachedEnvelopeFireAndForgetIntegration.f303869e;
            if (aVar == null) {
                n8Var.getLogger().c(y7.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            } else {
                aVar.send();
            }
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.ERROR, "Failed trying to send cached events.", th2);
        }
    }

    private void b(@NotNull final i1 i1Var, @NotNull final n8 n8Var) {
        try {
            m1 m1VarA = this.f303872h.a();
            try {
                n8Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.j5
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendCachedEnvelopeFireAndForgetIntegration.a(this.f305651a, n8Var, i1Var);
                    }
                });
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
        } catch (RejectedExecutionException e10) {
            n8Var.getLogger().a(y7.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e10);
        } catch (Throwable th4) {
            n8Var.getLogger().a(y7.ERROR, "Failed to call the executor. Cached events will not be sent", th4);
        }
    }

    @Override // io.sentry.x1
    public void c(@NotNull i1 i1Var, @NotNull n8 n8Var) {
        this.f303867c = (i1) io.sentry.util.y.c(i1Var, "Scopes are required");
        this.f303868d = (n8) io.sentry.util.y.c(n8Var, "SentryOptions is required");
        if (!this.f303865a.b(n8Var.getCacheDirPath(), n8Var.getLogger())) {
            n8Var.getLogger().c(y7.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        n8Var.getLogger().c(y7.DEBUG, "SendCachedEventFireAndForgetIntegration installed.", new Object[0]);
        io.sentry.util.q.a("SendCachedEnvelopeFireAndForget");
        b(i1Var, n8Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f303871g.set(true);
        u0 u0Var = this.f303866b;
        if (u0Var != null) {
            u0Var.T7(this);
        }
    }

    @Override // io.sentry.u0.b
    public void h(@NotNull u0.a aVar) {
        n8 n8Var;
        i1 i1Var = this.f303867c;
        if (i1Var == null || (n8Var = this.f303868d) == null || aVar == u0.a.DISCONNECTED) {
            return;
        }
        b(i1Var, n8Var);
    }
}
