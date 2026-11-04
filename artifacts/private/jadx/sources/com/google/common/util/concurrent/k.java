package com.google.common.util.concurrent;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
@z7.b
public abstract class k extends AbstractExecutorService implements x1 {
    @Override // java.util.concurrent.AbstractExecutorService
    @z7.a
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, @d2 T value) {
        return b3.O(runnable, value);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    @z7.a
    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return b3.P(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.x1
    @z7.a
    public t1<?> submit(Runnable task) {
        return (t1) super.submit(task);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.x1
    @z7.a
    public <T> t1<T> submit(Runnable task, @d2 T result) {
        return (t1) super.submit(task, (Object) result);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.x1
    @z7.a
    public <T> t1<T> submit(Callable<T> task) {
        return (t1) super.submit((Callable) task);
    }
}
