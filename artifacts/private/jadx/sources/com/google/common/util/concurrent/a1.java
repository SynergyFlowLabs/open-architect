package com.google.common.util.concurrent;

import com.google.common.collect.m5;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b
public abstract class a1<V> extends m5 implements Future<V> {

    public static abstract class a<V> extends a1<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Future<V> f119918a;

        protected a(Future<V> delegate) {
            this.f119918a = (Future) com.google.common.base.j0.E(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.a1, com.google.common.collect.m5
        public final Future<V> L0() {
            return this.f119918a;
        }
    }

    protected a1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.m5
    public abstract Future<? extends V> L0();

    @Override // java.util.concurrent.Future
    @z7.a
    public boolean cancel(boolean mayInterruptIfRunning) {
        return L0().cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.Future
    @d2
    @z7.a
    public V get() throws ExecutionException, InterruptedException {
        return L0().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return L0().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return L0().isDone();
    }

    @Override // java.util.concurrent.Future
    @d2
    @z7.a
    public V get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        return L0().get(timeout, unit);
    }
}
