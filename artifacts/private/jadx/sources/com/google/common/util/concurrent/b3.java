package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b
class b3<V> extends u0.a<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @fj.a
    private volatile p1<?> f119942i;

    private final class a extends p1<t1<V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final v<V> f119943d;

        a(v<V> callable) {
            this.f119943d = (v) com.google.common.base.j0.E(callable);
        }

        @Override // com.google.common.util.concurrent.p1
        void a(Throwable error) {
            b3.this.C(error);
        }

        @Override // com.google.common.util.concurrent.p1
        final boolean d() {
            return b3.this.isDone();
        }

        @Override // com.google.common.util.concurrent.p1
        String f() {
            return this.f119943d.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.p1
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void b(t1<V> result) {
            b3.this.D(result);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.p1
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public t1<V> e() throws Exception {
            return (t1) com.google.common.base.j0.V(this.f119943d.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f119943d);
        }
    }

    private final class b extends p1<V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Callable<V> f119945d;

        b(Callable<V> callable) {
            this.f119945d = (Callable) com.google.common.base.j0.E(callable);
        }

        @Override // com.google.common.util.concurrent.p1
        void a(Throwable error) {
            b3.this.C(error);
        }

        @Override // com.google.common.util.concurrent.p1
        void b(@d2 V result) {
            b3.this.B(result);
        }

        @Override // com.google.common.util.concurrent.p1
        final boolean d() {
            return b3.this.isDone();
        }

        @Override // com.google.common.util.concurrent.p1
        @d2
        V e() throws Exception {
            return this.f119945d.call();
        }

        @Override // com.google.common.util.concurrent.p1
        String f() {
            return this.f119945d.toString();
        }
    }

    b3(Callable<V> callable) {
        this.f119942i = new b(callable);
    }

    static <V> b3<V> N(v<V> callable) {
        return new b3<>(callable);
    }

    static <V> b3<V> O(Runnable runnable, @d2 V result) {
        return new b3<>(Executors.callable(runnable, result));
    }

    static <V> b3<V> P(Callable<V> callable) {
        return new b3<>(callable);
    }

    @Override // com.google.common.util.concurrent.f
    protected void m() {
        p1<?> p1Var;
        super.m();
        if (E() && (p1Var = this.f119942i) != null) {
            p1Var.c();
        }
        this.f119942i = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        p1<?> p1Var = this.f119942i;
        if (p1Var != null) {
            p1Var.run();
        }
        this.f119942i = null;
    }

    @Override // com.google.common.util.concurrent.f
    @fj.a
    protected String y() {
        p1<?> p1Var = this.f119942i;
        if (p1Var == null) {
            return super.y();
        }
        return "task=[" + p1Var + "]";
    }

    b3(v<V> callable) {
        this.f119942i = new a(callable);
    }
}
