package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@z7.f("Use FluentFuture.from(Futures.immediate*Future) or SettableFuture")
@o0
@com.google.common.annotations.b(emulated = true)
public abstract class u0<V> extends m1<V> {

    static abstract class a<V> extends u0<V> implements f.i<V> {
        a() {
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        @z7.a
        public final boolean cancel(boolean mayInterruptIfRunning) {
            return super.cancel(mayInterruptIfRunning);
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        @d2
        @z7.a
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.f, com.google.common.util.concurrent.t1
        public final void m0(Runnable listener, Executor executor) {
            super.m0(listener, executor);
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        @d2
        @z7.a
        public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }
    }

    u0() {
    }

    @Deprecated
    public static <V> u0<V> I(u0<V> future) {
        return (u0) com.google.common.base.j0.E(future);
    }

    public static <V> u0<V> J(t1<V> future) {
        return future instanceof u0 ? (u0) future : new z0(future);
    }

    public final void F(e1<? super V> callback, Executor executor) {
        h1.c(this, callback, executor);
    }

    @com.google.common.annotations.d
    @e2.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public final <X extends Throwable> u0<V> G(Class<X> exceptionType, com.google.common.base.t<? super X, ? extends V> fallback, Executor executor) {
        return (u0) h1.f(this, exceptionType, fallback, executor);
    }

    @com.google.common.annotations.d
    @e2.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public final <X extends Throwable> u0<V> H(Class<X> exceptionType, w<? super X, ? extends V> fallback, Executor executor) {
        return (u0) h1.g(this, exceptionType, fallback, executor);
    }

    public final <T> u0<T> K(com.google.common.base.t<? super V, T> function, Executor executor) {
        return (u0) h1.z(this, function, executor);
    }

    public final <T> u0<T> L(w<? super V, T> function, Executor executor) {
        return (u0) h1.A(this, function, executor);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public final u0<V> M(long timeout, TimeUnit unit, ScheduledExecutorService scheduledExecutor) {
        return (u0) h1.F(this, timeout, unit, scheduledExecutor);
    }
}
