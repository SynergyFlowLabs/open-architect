package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
abstract class i3 extends h3 implements ScheduledExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ScheduledExecutorService f120116b;

    protected i3(ScheduledExecutorService delegate) {
        super(delegate);
        this.f120116b = delegate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return this.f120116b.schedule(b(command), delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        return this.f120116b.scheduleAtFixedRate(b(command), initialDelay, period, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
        return this.f120116b.scheduleWithFixedDelay(b(command), initialDelay, delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> task, long delay, TimeUnit unit) {
        return this.f120116b.schedule(c(task), delay, unit);
    }
}
