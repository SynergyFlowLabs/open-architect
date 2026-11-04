package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class s7 implements l1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f306778e = 40;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f306779f = 271;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ScheduledThreadPoolExecutor f306780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f306781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Runnable f306782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final n8 f306783d;

    private static final class b<T> implements Future<T> {
        private b() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, @NotNull TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f306784a;

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryExecutorServiceThreadFactory-");
            int i10 = this.f306784a;
            this.f306784a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    @lm.n
    s7(@NotNull ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, @Nullable n8 n8Var) {
        this.f306781b = new io.sentry.util.a();
        this.f306782c = new Runnable() { // from class: io.sentry.q7
            @Override // java.lang.Runnable
            public final void run() {
                s7.e();
            }
        };
        this.f306780a = scheduledThreadPoolExecutor;
        this.f306783d = n8Var;
    }

    public static /* synthetic */ void d(s7 s7Var) {
        s7Var.getClass();
        for (int i10 = 0; i10 < 40; i10++) {
            try {
                s7Var.f306780a.schedule(s7Var.f306782c, 365L, TimeUnit.DAYS).cancel(true);
            } catch (RejectedExecutionException unused) {
            }
        }
        s7Var.f306780a.purge();
    }

    public static /* synthetic */ void e() {
    }

    @Override // io.sentry.l1
    public void a() {
        try {
            this.f306780a.submit(new Runnable() { // from class: io.sentry.r7
                @Override // java.lang.Runnable
                public final void run() {
                    s7.d(this.f306624a);
                }
            });
        } catch (RejectedExecutionException e10) {
            n8 n8Var = this.f306783d;
            if (n8Var != null) {
                n8Var.getLogger().a(y7.WARNING, "Prewarm task rejected from " + this.f306780a, e10);
            }
        }
    }

    @Override // io.sentry.l1
    @NotNull
    public Future<?> b(@NotNull Runnable runnable, long j10) throws RejectedExecutionException {
        if (this.f306780a.getQueue().size() < f306779f) {
            return this.f306780a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        }
        n8 n8Var = this.f306783d;
        if (n8Var != null) {
            n8Var.getLogger().c(y7.WARNING, "Task " + runnable + " rejected from " + this.f306780a, new Object[0]);
        }
        return new b();
    }

    @Override // io.sentry.l1
    public void c(long j10) {
        m1 m1VarA = this.f306781b.a();
        try {
            if (!this.f306780a.isShutdown()) {
                this.f306780a.shutdown();
                try {
                    if (!this.f306780a.awaitTermination(j10, TimeUnit.MILLISECONDS)) {
                        this.f306780a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f306780a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
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

    @Override // io.sentry.l1
    public boolean isClosed() {
        m1 m1VarA = this.f306781b.a();
        try {
            boolean zIsShutdown = this.f306780a.isShutdown();
            if (m1VarA != null) {
                m1VarA.close();
            }
            return zIsShutdown;
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

    @Override // io.sentry.l1
    @NotNull
    public Future<?> submit(@NotNull Runnable runnable) throws RejectedExecutionException {
        if (this.f306780a.getQueue().size() < f306779f) {
            return this.f306780a.submit(runnable);
        }
        n8 n8Var = this.f306783d;
        if (n8Var != null) {
            n8Var.getLogger().c(y7.WARNING, "Task " + runnable + " rejected from " + this.f306780a, new Object[0]);
        }
        return new b();
    }

    public s7(@Nullable n8 n8Var) {
        this(new ScheduledThreadPoolExecutor(1, new c()), n8Var);
    }

    public s7() {
        this(new ScheduledThreadPoolExecutor(1, new c()), null);
    }

    @Override // io.sentry.l1
    @NotNull
    public <T> Future<T> submit(@NotNull Callable<T> callable) throws RejectedExecutionException {
        if (this.f306780a.getQueue().size() < f306779f) {
            return this.f306780a.submit(callable);
        }
        n8 n8Var = this.f306783d;
        if (n8Var != null) {
            n8Var.getLogger().c(y7.WARNING, "Task " + callable + " rejected from " + this.f306780a, new Object[0]);
        }
        return new b();
    }
}
