package com.google.common.util.concurrent;

import com.google.common.collect.l6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
abstract class h3 implements ExecutorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f120099a;

    protected h3(ExecutorService delegate) {
        this.f120099a = (ExecutorService) com.google.common.base.j0.E(delegate);
    }

    public static /* synthetic */ void a(Callable callable) {
        try {
            callable.call();
        } catch (Exception e10) {
            f2.b(e10);
            com.google.common.base.v0.w(e10);
            throw new RuntimeException(e10);
        }
    }

    private <T> l6<Callable<T>> d(Collection<? extends Callable<T>> tasks) {
        l6.a aVarS = l6.s();
        Iterator<? extends Callable<T>> it = tasks.iterator();
        while (it.hasNext()) {
            aVarS.a(c(it.next()));
        }
        return aVarS.e();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return this.f120099a.awaitTermination(timeout, unit);
    }

    protected Runnable b(Runnable command) {
        final Callable callableC = c(Executors.callable(command, null));
        return new Runnable() { // from class: com.google.common.util.concurrent.g3
            @Override // java.lang.Runnable
            public final void run() {
                h3.a(callableC);
            }
        };
    }

    protected abstract <T> Callable<T> c(Callable<T> callable);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        this.f120099a.execute(b(command));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return this.f120099a.invokeAll(d(tasks));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f120099a.invokeAny(d(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f120099a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f120099a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f120099a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @z7.a
    public final List<Runnable> shutdownNow() {
        return this.f120099a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> task) {
        return this.f120099a.submit(c((Callable) com.google.common.base.j0.E(task)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return this.f120099a.invokeAll(d(tasks), timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f120099a.invokeAny(d(collection), j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable task) {
        return this.f120099a.submit(b(task));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable task, @d2 T result) {
        return this.f120099a.submit(b(task), result);
    }
}
