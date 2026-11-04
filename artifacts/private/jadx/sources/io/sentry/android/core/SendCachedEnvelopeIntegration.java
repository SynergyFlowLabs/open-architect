package io.sentry.android.core;

import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.n8;
import io.sentry.y7;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class SendCachedEnvelopeIntegration implements io.sentry.x1, io.sentry.u0.b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SendCachedEnvelopeFireAndForgetIntegration.c f303998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.s<Boolean> f303999b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private io.sentry.u0 f304001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private io.sentry.i1 f304002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private SentryAndroidOptions f304003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private SendCachedEnvelopeFireAndForgetIntegration.a f304004g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f304000c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f304005h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f304006i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304007j = new io.sentry.util.a();

    public SendCachedEnvelopeIntegration(@NotNull SendCachedEnvelopeFireAndForgetIntegration.c cVar, @NotNull io.sentry.util.s<Boolean> sVar) {
        this.f303998a = (SendCachedEnvelopeFireAndForgetIntegration.c) io.sentry.util.y.c(cVar, "SendFireAndForgetFactory is required");
        this.f303999b = sVar;
    }

    public static /* synthetic */ void a(SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration, SentryAndroidOptions sentryAndroidOptions, io.sentry.i1 i1Var) {
        sendCachedEnvelopeIntegration.getClass();
        try {
            if (sendCachedEnvelopeIntegration.f304006i.get()) {
                sentryAndroidOptions.getLogger().c(y7.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!sendCachedEnvelopeIntegration.f304005h.getAndSet(true)) {
                io.sentry.u0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                sendCachedEnvelopeIntegration.f304001d = connectionStatusProvider;
                connectionStatusProvider.Pd(sendCachedEnvelopeIntegration);
                sendCachedEnvelopeIntegration.f304004g = sendCachedEnvelopeIntegration.f303998a.d(i1Var, sentryAndroidOptions);
            }
            io.sentry.u0 u0Var = sendCachedEnvelopeIntegration.f304001d;
            if (u0Var != null && u0Var.L3() == io.sentry.u0.a.DISCONNECTED) {
                sentryAndroidOptions.getLogger().c(y7.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                return;
            }
            io.sentry.transport.a0 a0VarI0 = i1Var.i0();
            if (a0VarI0 != null && a0VarI0.j(io.sentry.o.All)) {
                sentryAndroidOptions.getLogger().c(y7.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                return;
            }
            SendCachedEnvelopeFireAndForgetIntegration.a aVar = sendCachedEnvelopeIntegration.f304004g;
            if (aVar == null) {
                sentryAndroidOptions.getLogger().c(y7.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
            } else {
                aVar.send();
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(y7.ERROR, "Failed trying to send cached events.", th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006e A[Catch: all -> 0x0073, RejectedExecutionException -> 0x0075, TRY_ENTER, TRY_LEAVE, TryCatch #5 {RejectedExecutionException -> 0x0075, all -> 0x0073, blocks: (B:2:0x0000, B:15:0x006e, B:26:0x0083, B:25:0x0080, B:3:0x0008, B:5:0x0028, B:7:0x0031, B:8:0x0040, B:12:0x004e, B:13:0x005f, B:22:0x007a), top: B:37:0x0000, inners: #1, #4 }] */
    private void b(@NotNull final io.sentry.i1 i1Var, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        try {
            io.sentry.m1 m1VarA = this.f304007j.a();
            try {
                Future<?> futureSubmit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendCachedEnvelopeIntegration.a(this.f304097a, sentryAndroidOptions, i1Var);
                    }
                });
                if (this.f303999b.a().booleanValue() && this.f304000c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().c(y7.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().c(y7.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                    sentryAndroidOptions.getLogger().c(y7.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                    if (m1VarA != null) {
                        m1VarA.close();
                    }
                } else {
                    sentryAndroidOptions.getLogger().c(y7.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                    if (m1VarA != null) {
                        m1VarA.close();
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
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().a(y7.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e10);
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().a(y7.ERROR, "Failed to call the executor. Cached events will not be sent", th4);
        }
    }

    @Override // io.sentry.x1
    public void c(@NotNull io.sentry.i1 i1Var, @NotNull n8 n8Var) {
        this.f304002e = (io.sentry.i1) io.sentry.util.y.c(i1Var, "Scopes are required");
        this.f304003f = (SentryAndroidOptions) io.sentry.util.y.c(n8Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) n8Var : null, "SentryAndroidOptions is required");
        if (!this.f303998a.b(n8Var.getCacheDirPath(), n8Var.getLogger())) {
            n8Var.getLogger().c(y7.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.q.a("SendCachedEnvelope");
            b(i1Var, this.f304003f);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f304006i.set(true);
        io.sentry.u0 u0Var = this.f304001d;
        if (u0Var != null) {
            u0Var.T7(this);
        }
    }

    @Override // io.sentry.u0.b
    public void h(@NotNull io.sentry.u0.a aVar) {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.i1 i1Var = this.f304002e;
        if (i1Var != null && (sentryAndroidOptions = this.f304003f) != null && aVar != io.sentry.u0.a.DISCONNECTED) {
            b(i1Var, sentryAndroidOptions);
        }
    }
}
