package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.f6;
import io.sentry.g6;
import io.sentry.n0;
import io.sentry.n8;
import io.sentry.q4;
import io.sentry.y7;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f306864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.cache.g f306865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n8 f306866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final a0 f306867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final r f306868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final o f306869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private volatile Runnable f306870g;

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f306871a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryAsyncConnection-");
            int i10 = this.f306871a;
            this.f306871a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final g6 f306872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final n0 f306873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final io.sentry.cache.g f306874c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d0 f306875d = d0.a();

        c(@NotNull g6 g6Var, @NotNull n0 n0Var, io.sentry.cache.g gVar) {
            this.f306872a = (g6) io.sentry.util.y.c(g6Var, "Envelope is required.");
            this.f306873b = n0Var;
            this.f306874c = (io.sentry.cache.g) io.sentry.util.y.c(gVar, "EnvelopeCache is required.");
        }

        public static /* synthetic */ void a(c cVar, d0 d0Var, io.sentry.hints.p pVar) {
            e.this.f306866c.getLogger().c(y7.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(d0Var.d()));
            pVar.d(d0Var.d());
        }

        public static /* synthetic */ void b(c cVar, io.sentry.hints.f fVar) {
            int i10 = 7 ^ 0;
            if (!fVar.f(cVar.f306872a.d().a())) {
                e.this.f306866c.getLogger().c(y7.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            } else {
                fVar.a();
                e.this.f306866c.getLogger().c(y7.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
        }

        public static /* synthetic */ void d(c cVar, boolean z10, g6 g6Var, Object obj, Class cls) {
            if (z10) {
                cVar.getClass();
            } else {
                io.sentry.util.v.a(cls, obj, e.this.f306866c.getLogger());
                e.this.f306866c.getClientReportRecorder().d(io.sentry.clientreport.f.NETWORK_ERROR, g6Var);
            }
        }

        public static /* synthetic */ void e(c cVar, boolean z10, Object obj, Class cls) {
            if (z10) {
                cVar.getClass();
            } else {
                io.sentry.util.v.a(cls, obj, e.this.f306866c.getLogger());
                e.this.f306866c.getClientReportRecorder().d(io.sentry.clientreport.f.NETWORK_ERROR, cVar.f306872a);
            }
        }

        @NotNull
        private d0 j() {
            d0 d0Var = this.f306875d;
            this.f306872a.d().e(null);
            final boolean zM3 = this.f306874c.M3(this.f306872a, this.f306873b);
            io.sentry.util.n.k(this.f306873b, io.sentry.hints.f.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.f
                @Override // io.sentry.util.n.a
                public final void accept(Object obj) {
                    e.c.b(this.f306877a, (io.sentry.hints.f) obj);
                }
            });
            if (!e.this.f306868e.isConnected()) {
                io.sentry.util.n.l(this.f306873b, io.sentry.hints.k.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.j
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).e(true);
                    }
                }, new io.sentry.util.n.b() { // from class: io.sentry.transport.k
                    @Override // io.sentry.util.n.b
                    public final void a(Object obj, Class cls) {
                        e.c.e(this.f306883a, zM3, obj, cls);
                    }
                });
                return d0Var;
            }
            final g6 g6VarE = e.this.f306866c.getClientReportRecorder().e(this.f306872a);
            try {
                g6VarE.d().e(io.sentry.p.k(e.this.f306866c.getDateProvider().a().k()));
                d0 d0VarI = e.this.f306869f.i(g6VarE);
                if (d0VarI.d()) {
                    this.f306874c.e3(this.f306872a);
                    return d0VarI;
                }
                String str = "The transport failed to send the envelope with response code " + d0VarI.c();
                e.this.f306866c.getLogger().c(y7.ERROR, str, new Object[0]);
                if (d0VarI.c() >= 400 && d0VarI.c() != 429 && !zM3) {
                    io.sentry.util.n.j(this.f306873b, io.sentry.hints.k.class, new io.sentry.util.n.c() { // from class: io.sentry.transport.g
                        @Override // io.sentry.util.n.c
                        public final void accept(Object obj) {
                            e.this.f306866c.getClientReportRecorder().d(io.sentry.clientreport.f.NETWORK_ERROR, g6VarE);
                        }
                    });
                }
                throw new IllegalStateException(str);
            } catch (IOException e10) {
                io.sentry.util.n.l(this.f306873b, io.sentry.hints.k.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.h
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).e(true);
                    }
                }, new io.sentry.util.n.b() { // from class: io.sentry.transport.i
                    @Override // io.sentry.util.n.b
                    public final void a(Object obj, Class cls) {
                        e.c.d(this.f306880a, zM3, g6VarE, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f306870g = this;
            final d0 d0VarJ = this.f306875d;
            try {
                d0VarJ = j();
                e.this.f306866c.getLogger().c(y7.DEBUG, "Envelope flushed", new Object[0]);
                io.sentry.util.n.k(this.f306873b, io.sentry.hints.p.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.l
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        e.c.a(this.f306885a, d0VarJ, (io.sentry.hints.p) obj);
                    }
                });
                e.this.f306870g = null;
            } catch (Throwable th2) {
                try {
                    e.this.f306866c.getLogger().b(y7.ERROR, th2, "Envelope submission failed", new Object[0]);
                    throw th2;
                } catch (Throwable th3) {
                    io.sentry.util.n.k(this.f306873b, io.sentry.hints.p.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.l
                        @Override // io.sentry.util.n.a
                        public final void accept(Object obj) {
                            e.c.a(this.f306885a, d0VarJ, (io.sentry.hints.p) obj);
                        }
                    });
                    e.this.f306870g = null;
                    throw th3;
                }
            }
        }
    }

    public e(@NotNull n8 n8Var, @NotNull a0 a0Var, @NotNull r rVar, @NotNull q4 q4Var) {
        this(j(n8Var.getMaxQueueSize(), n8Var.getEnvelopeDiskCache(), n8Var.getLogger(), n8Var.getDateProvider()), n8Var, a0Var, rVar, new o(n8Var, q4Var, a0Var));
    }

    public static /* synthetic */ void b(e eVar, io.sentry.hints.g gVar) {
        eVar.getClass();
        gVar.a();
        eVar.f306866c.getLogger().c(y7.DEBUG, "Envelope enqueued", new Object[0]);
    }

    public static /* synthetic */ void d(io.sentry.cache.g gVar, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!io.sentry.util.n.h(cVar.f306873b, io.sentry.hints.e.class)) {
                gVar.M3(cVar.f306872a, cVar.f306873b);
            }
            l(cVar.f306873b, true);
            iLogger.c(y7.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    private static w j(int i10, @NotNull final io.sentry.cache.g gVar, @NotNull final ILogger iLogger, @NotNull f6 f6Var) {
        return new w(1, i10, new b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.c
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                e.d(gVar, iLogger, runnable, threadPoolExecutor);
            }
        }, iLogger, f6Var);
    }

    private static void l(@NotNull n0 n0Var, final boolean z10) {
        io.sentry.util.n.k(n0Var, io.sentry.hints.p.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.a
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                ((io.sentry.hints.p) obj).d(false);
            }
        });
        io.sentry.util.n.k(n0Var, io.sentry.hints.k.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.b
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                ((io.sentry.hints.k) obj).e(z10);
            }
        });
    }

    @Override // io.sentry.transport.q
    public void H2(@NotNull g6 g6Var, @NotNull n0 n0Var) throws IOException {
        io.sentry.cache.g gVarC = this.f306865b;
        boolean z10 = false;
        if (io.sentry.util.n.h(n0Var, io.sentry.hints.e.class)) {
            gVarC = s.c();
            this.f306866c.getLogger().c(y7.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z10 = true;
        }
        g6 g6VarG = this.f306867d.g(g6Var, n0Var);
        if (g6VarG == null) {
            if (z10) {
                this.f306865b.e3(g6Var);
                return;
            }
            return;
        }
        if (io.sentry.util.n.h(n0Var, UncaughtExceptionHandlerIntegration.a.class)) {
            g6VarG = this.f306866c.getClientReportRecorder().e(g6VarG);
        }
        Future<?> futureSubmit = this.f306864a.submit(new c(g6VarG, n0Var, gVarC));
        if (futureSubmit == null || !futureSubmit.isCancelled()) {
            io.sentry.util.n.k(n0Var, io.sentry.hints.g.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.d
                @Override // io.sentry.util.n.a
                public final void accept(Object obj) {
                    e.b(this.f306861a, (io.sentry.hints.g) obj);
                }
            });
        } else {
            this.f306866c.getClientReportRecorder().d(io.sentry.clientreport.f.QUEUE_OVERFLOW, g6VarG);
        }
    }

    @Override // io.sentry.transport.q
    public boolean L() {
        return (this.f306867d.l() || this.f306864a.a()) ? false : true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        i(false);
    }

    @Override // io.sentry.transport.q
    public void i(boolean z10) throws IOException {
        this.f306867d.close();
        this.f306864a.shutdown();
        this.f306866c.getLogger().c(y7.DEBUG, "Shutting down", new Object[0]);
        if (z10) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f306866c.getFlushTimeoutMillis();
            if (this.f306864a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f306866c.getLogger().c(y7.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f306864a.shutdownNow();
            if (this.f306870g != null) {
                this.f306864a.getRejectedExecutionHandler().rejectedExecution(this.f306870g, this.f306864a);
            }
        } catch (InterruptedException unused) {
            this.f306866c.getLogger().c(y7.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.q
    @NotNull
    public a0 i0() {
        return this.f306867d;
    }

    @Override // io.sentry.transport.q
    public void w(long j10) {
        this.f306864a.c(j10);
    }

    public e(@NotNull w wVar, @NotNull n8 n8Var, @NotNull a0 a0Var, @NotNull r rVar, @NotNull o oVar) {
        this.f306870g = null;
        this.f306864a = (w) io.sentry.util.y.c(wVar, "executor is required");
        this.f306865b = (io.sentry.cache.g) io.sentry.util.y.c(n8Var.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f306866c = (n8) io.sentry.util.y.c(n8Var, "options is required");
        this.f306867d = (a0) io.sentry.util.y.c(a0Var, "rateLimiter is required");
        this.f306868e = (r) io.sentry.util.y.c(rVar, "transportGate is required");
        this.f306869f = (o) io.sentry.util.y.c(oVar, "httpConnection is required");
    }
}
