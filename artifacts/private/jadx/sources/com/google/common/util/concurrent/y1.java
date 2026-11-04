package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public interface y1 extends ScheduledExecutorService, x1 {
    @Override // java.util.concurrent.ScheduledExecutorService
    v1<?> schedule(Runnable command, long delay, TimeUnit unit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> v1<V> schedule(Callable<V> callable, long delay, TimeUnit unit);

    @Override // java.util.concurrent.ScheduledExecutorService
    v1<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit);

    @Override // java.util.concurrent.ScheduledExecutorService
    v1<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit);
}
