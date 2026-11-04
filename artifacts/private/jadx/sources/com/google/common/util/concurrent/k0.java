package com.google.common.util.concurrent;

import com.google.common.collect.h6;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b
final class k0<V> extends t<Object, V> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @a8.b
    @fj.a
    private k0<V>.c<?> f120127t;

    private final class a extends k0<V>.c<t1<V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final v<V> f120128f;

        a(v<V> callable, Executor listenerExecutor) {
            super(listenerExecutor);
            this.f120128f = (v) com.google.common.base.j0.E(callable);
        }

        @Override // com.google.common.util.concurrent.p1
        String f() {
            return this.f120128f.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.p1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public t1<V> e() throws Exception {
            return (t1) com.google.common.base.j0.V(this.f120128f.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f120128f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.k0.c
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(t1<V> value) {
            k0.this.D(value);
        }
    }

    private final class b extends k0<V>.c<V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Callable<V> f120130f;

        b(Callable<V> callable, Executor listenerExecutor) {
            super(listenerExecutor);
            this.f120130f = (Callable) com.google.common.base.j0.E(callable);
        }

        @Override // com.google.common.util.concurrent.p1
        @d2
        V e() throws Exception {
            return this.f120130f.call();
        }

        @Override // com.google.common.util.concurrent.p1
        String f() {
            return this.f120130f.toString();
        }

        @Override // com.google.common.util.concurrent.k0.c
        void i(@d2 V value) {
            k0.this.B(value);
        }
    }

    private abstract class c<T> extends p1<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Executor f120132d;

        c(Executor listenerExecutor) {
            this.f120132d = (Executor) com.google.common.base.j0.E(listenerExecutor);
        }

        @Override // com.google.common.util.concurrent.p1
        final void a(Throwable error) {
            k0.this.f120127t = null;
            if (error instanceof ExecutionException) {
                k0.this.C(((ExecutionException) error).getCause());
            } else if (error instanceof CancellationException) {
                k0.this.cancel(false);
            } else {
                k0.this.C(error);
            }
        }

        @Override // com.google.common.util.concurrent.p1
        final void b(@d2 T result) {
            k0.this.f120127t = null;
            i(result);
        }

        @Override // com.google.common.util.concurrent.p1
        final boolean d() {
            return k0.this.isDone();
        }

        final void h() {
            try {
                this.f120132d.execute(this);
            } catch (RejectedExecutionException e10) {
                k0.this.C(e10);
            }
        }

        abstract void i(@d2 T value);
    }

    k0(h6<? extends t1<?>> futures, boolean allMustSucceed, Executor listenerExecutor, v<V> callable) {
        super(futures, allMustSucceed, false);
        this.f120127t = new a(callable, listenerExecutor);
        U();
    }

    @Override // com.google.common.util.concurrent.t
    void P(int index, @fj.a Object returnValue) {
    }

    @Override // com.google.common.util.concurrent.t
    void S() {
        k0<V>.c<?> cVar = this.f120127t;
        if (cVar != null) {
            cVar.h();
        }
    }

    @Override // com.google.common.util.concurrent.t
    void Y(t.a reason) {
        super.Y(reason);
        if (reason == t.a.OUTPUT_FUTURE_DONE) {
            this.f120127t = null;
        }
    }

    @Override // com.google.common.util.concurrent.f
    protected void w() {
        k0<V>.c<?> cVar = this.f120127t;
        if (cVar != null) {
            cVar.c();
        }
    }

    k0(h6<? extends t1<?>> futures, boolean allMustSucceed, Executor listenerExecutor, Callable<V> callable) {
        super(futures, allMustSucceed, false);
        this.f120127t = new b(callable, listenerExecutor);
        U();
    }
}
