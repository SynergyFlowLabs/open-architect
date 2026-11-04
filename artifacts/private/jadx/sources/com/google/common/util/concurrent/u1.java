package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public class u1<V> extends FutureTask<V> implements t1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0 f120339a;

    u1(Callable<V> callable) {
        super(callable);
        this.f120339a = new q0();
    }

    public static <V> u1<V> a(Runnable runnable, @d2 V result) {
        return new u1<>(runnable, result);
    }

    public static <V> u1<V> b(Callable<V> callable) {
        return new u1<>(callable);
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        this.f120339a.b();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @d2
    @z7.a
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        return nanos <= 2147483647999999999L ? (V) super.get(j10, timeUnit) : (V) super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    @Override // com.google.common.util.concurrent.t1
    public void m0(Runnable listener, Executor exec) {
        this.f120339a.a(listener, exec);
    }

    u1(Runnable runnable, @d2 V result) {
        super(runnable, result);
        this.f120339a = new q0();
    }
}
