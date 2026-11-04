package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b
final class z0<V> extends u0<V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t1<V> f120388i;

    z0(t1<V> delegate) {
        this.f120388i = (t1) com.google.common.base.j0.E(delegate);
    }

    @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return this.f120388i.cancel(mayInterruptIfRunning);
    }

    @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
    @d2
    public V get() throws ExecutionException, InterruptedException {
        return this.f120388i.get();
    }

    @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f120388i.isCancelled();
    }

    @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
    public boolean isDone() {
        return this.f120388i.isDone();
    }

    @Override // com.google.common.util.concurrent.f, com.google.common.util.concurrent.t1
    public void m0(Runnable listener, Executor executor) {
        this.f120388i.m0(listener, executor);
    }

    @Override // com.google.common.util.concurrent.f
    public String toString() {
        return this.f120388i.toString();
    }

    @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
    @d2
    public V get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f120388i.get(timeout, unit);
    }
}
