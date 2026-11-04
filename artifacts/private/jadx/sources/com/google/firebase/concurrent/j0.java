package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
final class j0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f120879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f120880b;

    j0(boolean z10, ExecutorService executorService) {
        this.f120879a = executorService;
        this.f120880b = new f0(z10, executorService);
    }

    public static /* synthetic */ Object a(Runnable runnable) {
        runnable.run();
        return null;
    }

    public static /* synthetic */ Object b(Runnable runnable, Object obj) {
        runnable.run();
        return obj;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f120879a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f120880b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f120879a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f120879a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f120879a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f120879a.isTerminated();
    }

    @Override // com.google.firebase.concurrent.e0
    public boolean o3() {
        return this.f120880b.o3();
    }

    @Override // com.google.firebase.concurrent.e0
    public void p() {
        this.f120880b.p();
    }

    @Override // com.google.firebase.concurrent.e0
    public void pause() {
        this.f120880b.pause();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        execute(futureTask);
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f120879a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f120879a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Runnable runnable, final T t10) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j0.b(runnable, t10);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable runnable) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.h0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j0.a(runnable);
            }
        });
    }
}
