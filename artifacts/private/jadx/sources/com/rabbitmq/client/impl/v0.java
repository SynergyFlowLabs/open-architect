package com.rabbitmq.client.impl;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0 f265864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadFactory f265865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ScheduledExecutorService f265866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f265867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ScheduledFuture<?> f265868f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f265870h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f265863a = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f265869g = false;

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f265871a;

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (System.nanoTime() > v0.this.f265870h + this.f265871a) {
                    v0.this.f265864b.b(new s0(8, 0));
                    v0.this.f265864b.flush();
                }
            } catch (IOException unused) {
            }
        }

        private b(long j10) {
            this.f265871a = j10;
        }
    }

    v0(t0 t0Var, ScheduledExecutorService scheduledExecutorService, ThreadFactory threadFactory) {
        this.f265864b = t0Var;
        this.f265867e = scheduledExecutorService == null;
        this.f265866d = scheduledExecutorService;
        this.f265865c = threadFactory;
    }

    private ScheduledExecutorService c() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this.f265863a) {
            try {
                if (this.f265866d == null) {
                    this.f265866d = Executors.newSingleThreadScheduledExecutor(this.f265865c);
                }
                scheduledExecutorService = this.f265866d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return scheduledExecutorService;
    }

    public void d(int i10) {
        synchronized (this.f265863a) {
            try {
                if (this.f265869g) {
                    return;
                }
                ScheduledFuture<?> scheduledFuture = this.f265868f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    this.f265868f = null;
                }
                if (i10 > 0) {
                    long nanos = TimeUnit.SECONDS.toNanos(i10) / 2;
                    this.f265868f = c().scheduleAtFixedRate(new b(nanos), nanos, nanos, TimeUnit.NANOSECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this.f265863a) {
            try {
                ScheduledFuture<?> scheduledFuture = this.f265868f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    this.f265868f = null;
                }
                scheduledExecutorService = this.f265867e ? this.f265866d : null;
                this.f265866d = null;
                this.f265869g = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    public void f() {
        this.f265870h = System.nanoTime();
    }
}
