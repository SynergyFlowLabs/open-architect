package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
class o implements ScheduledExecutorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f120911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f120912b;

    o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f120911a = executorService;
        this.f120912b = scheduledExecutorService;
    }

    public static /* synthetic */ void d(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void e(Runnable runnable, p.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
            throw e10;
        }
    }

    public static /* synthetic */ void h(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void j(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f120911a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f120911a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f120911a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f120911a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f120911a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f120911a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f120843a;
                return oVar.f120912b.schedule(new Runnable() { // from class: com.google.firebase.concurrent.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f120911a.execute(new Runnable() { // from class: com.google.firebase.concurrent.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.j(runnable, bVar);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f120864a;
                return oVar.f120912b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f120855a.f120911a.execute(new Runnable() { // from class: com.google.firebase.concurrent.n
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                o.e(runnable, bVar);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.j
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f120874a;
                return oVar.f120912b.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f120852a.f120911a.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.h(runnable, bVar);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
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
        return this.f120911a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f120911a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f120911a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.k
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f120881a;
                return oVar.f120912b.schedule(new Callable() { // from class: com.google.firebase.concurrent.m
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return oVar.f120911a.submit(new Runnable() { // from class: com.google.firebase.concurrent.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.d(callable, bVar);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f120911a.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f120911a.submit(runnable);
    }
}
