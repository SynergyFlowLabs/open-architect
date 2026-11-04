package com.google.common.util.concurrent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
final class n0 extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f120219a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.a(io.sentry.protocol.z.b.f306551r)
    private int f120220b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a8.a(io.sentry.protocol.z.b.f306551r)
    private boolean f120221c = false;

    n0() {
    }

    private void a() {
        synchronized (this.f120219a) {
            try {
                int i10 = this.f120220b - 1;
                this.f120220b = i10;
                if (i10 == 0) {
                    this.f120219a.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void b() {
        synchronized (this.f120219a) {
            try {
                if (this.f120221c) {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
                this.f120220b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        long nanos = unit.toNanos(timeout);
        synchronized (this.f120219a) {
            while (true) {
                try {
                    if (this.f120221c && this.f120220b == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long jNanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f120219a, nanos);
                    nanos -= System.nanoTime() - jNanoTime;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        b();
        try {
            command.run();
        } finally {
            a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        boolean z10;
        synchronized (this.f120219a) {
            z10 = this.f120221c;
        }
        return z10;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        boolean z10;
        synchronized (this.f120219a) {
            try {
                z10 = this.f120221c && this.f120220b == 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this.f120219a) {
            try {
                this.f120221c = true;
                if (this.f120220b == 0) {
                    this.f120219a.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.EMPTY_LIST;
    }
}
