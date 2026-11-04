package com.google.common.util.concurrent;

import com.google.common.collect.m5;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public abstract class y0 extends m5 implements ExecutorService {
    protected y0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.m5
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public abstract ExecutorService i1();

    @Override // java.util.concurrent.ExecutorService
    @z7.b
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return i1().awaitTermination(timeout, unit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        i1().execute(command);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return i1().invokeAll(tasks);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) i1().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return i1().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return i1().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        i1().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @z7.a
    public List<Runnable> shutdownNow() {
        return i1().shutdownNow();
    }

    public <T> Future<T> submit(Callable<T> task) {
        return i1().submit(task);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return i1().invokeAll(tasks, timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) i1().invokeAny(collection, j10, timeUnit);
    }

    public Future<?> submit(Runnable task) {
        return i1().submit(task);
    }

    public <T> Future<T> submit(Runnable task, @d2 T result) {
        return i1().submit(task, result);
    }
}
