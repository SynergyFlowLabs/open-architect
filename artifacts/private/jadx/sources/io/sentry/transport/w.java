package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.e6;
import io.sentry.f6;
import io.sentry.y7;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class w extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f306899f = io.sentry.p.i(2000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f306900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private e6 f306901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ILogger f306902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f6 f306903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final b0 f306904e;

    static final class a<T> implements Future<T> {
        a() {
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

    public w(int i10, int i11, @NotNull ThreadFactory threadFactory, @NotNull RejectedExecutionHandler rejectedExecutionHandler, @NotNull ILogger iLogger, @NotNull f6 f6Var) {
        super(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f306901b = null;
        this.f306904e = new b0();
        this.f306900a = i11;
        this.f306902c = iLogger;
        this.f306903d = f6Var;
    }

    public boolean a() {
        e6 e6Var = this.f306901b;
        if (e6Var != null && this.f306903d.a().c(e6Var) < f306899f) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(@NotNull Runnable runnable, @Nullable Throwable th2) {
        try {
            super.afterExecute(runnable, th2);
            this.f306904e.a();
        } catch (Throwable th3) {
            this.f306904e.a();
            throw th3;
        }
    }

    public boolean b() {
        return this.f306904e.b() < this.f306900a;
    }

    void c(long j10) {
        try {
            this.f306904e.e(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.f306902c.a(y7.ERROR, "Failed to wait till idle", e10);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(@NotNull Runnable runnable) {
        if (!b()) {
            this.f306901b = this.f306903d.a();
            this.f306902c.c(y7.WARNING, "Submit cancelled", new Object[0]);
            return new a();
        }
        this.f306904e.c();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e10) {
            this.f306904e.a();
            this.f306901b = this.f306903d.a();
            this.f306902c.a(y7.WARNING, "Submit rejected by thread pool executor", e10);
            return new a();
        }
    }
}
