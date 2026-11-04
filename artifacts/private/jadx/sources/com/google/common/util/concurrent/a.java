package com.google.common.util.concurrent;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b
abstract class a<V, X extends Throwable, F, T> extends u0.a<V> implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @a8.b
    @fj.a
    t1<? extends V> f119915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @a8.b
    @fj.a
    Class<X> f119916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @a8.b
    @fj.a
    F f119917k;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    private static final class C1116a<V, X extends Throwable> extends a<V, X, w<? super X, ? extends V>, t1<? extends V>> {
        C1116a(t1<? extends V> input, Class<X> exceptionType, w<? super X, ? extends V> fallback) {
            super(input, exceptionType, fallback);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.a
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public t1<? extends V> P(w<? super X, ? extends V> fallback, X cause) throws Exception {
            t1<? extends V> t1VarApply = fallback.apply(cause);
            com.google.common.base.j0.V(t1VarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", fallback);
            return t1VarApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.a
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public void Q(t1<? extends V> result) {
            D(result);
        }
    }

    private static final class b<V, X extends Throwable> extends a<V, X, com.google.common.base.t<? super X, ? extends V>, V> {
        b(t1<? extends V> input, Class<X> exceptionType, com.google.common.base.t<? super X, ? extends V> fallback) {
            super(input, exceptionType, fallback);
        }

        @Override // com.google.common.util.concurrent.a
        void Q(@d2 V result) {
            B(result);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.a
        @d2
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public V P(com.google.common.base.t<? super X, ? extends V> fallback, X cause) throws Exception {
            return fallback.apply(cause);
        }
    }

    a(t1<? extends V> t1Var, Class<X> cls, F f10) {
        this.f119915i = (t1) com.google.common.base.j0.E(t1Var);
        this.f119916j = (Class) com.google.common.base.j0.E(cls);
        this.f119917k = (F) com.google.common.base.j0.E(f10);
    }

    static <V, X extends Throwable> t1<V> N(t1<? extends V> input, Class<X> exceptionType, com.google.common.base.t<? super X, ? extends V> fallback, Executor executor) {
        b bVar = new b(input, exceptionType, fallback);
        input.m0(bVar, a2.p(executor, bVar));
        return bVar;
    }

    static <X extends Throwable, V> t1<V> O(t1<? extends V> input, Class<X> exceptionType, w<? super X, ? extends V> fallback, Executor executor) {
        C1116a c1116a = new C1116a(input, exceptionType, fallback);
        input.m0(c1116a, a2.p(executor, c1116a));
        return c1116a;
    }

    @d2
    @z7.g
    abstract T P(F fallback, X throwable) throws Exception;

    @z7.g
    abstract void Q(@d2 T result);

    @Override // com.google.common.util.concurrent.f
    protected final void m() {
        x(this.f119915i);
        this.f119915i = null;
        this.f119916j = null;
        this.f119917k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objJ;
        t1<? extends V> t1Var = this.f119915i;
        Class<X> cls = this.f119916j;
        F f10 = this.f119917k;
        int i10 = 5 ^ 1;
        if (((f10 == null) || ((t1Var == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r10 = (Class<X>) null;
        this.f119915i = null;
        try {
            th = t1Var instanceof com.google.common.util.concurrent.internal.a ? com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) t1Var) : null;
            objJ = th == null ? h1.j(t1Var) : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + t1Var.getClass() + " threw " + e10.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        if (th == null) {
            B(b2.a(objJ));
            return;
        }
        if (!f2.a(th, cls)) {
            D(t1Var);
            return;
        }
        try {
            Object objP = P(f10, th);
            this.f119916j = null;
            this.f119917k = null;
            Q(objP);
        } catch (Throwable th3) {
            try {
                f2.b(th3);
                C(th3);
            } finally {
                this.f119916j = null;
                this.f119917k = null;
            }
        }
    }

    @Override // com.google.common.util.concurrent.f
    @fj.a
    protected String y() {
        String str;
        t1<? extends V> t1Var = this.f119915i;
        Class<X> cls = this.f119916j;
        F f10 = this.f119917k;
        String strY = super.y();
        if (t1Var != null) {
            str = "inputFuture=[" + t1Var + "], ";
        } else {
            str = "";
        }
        if (cls == null || f10 == null) {
            if (strY == null) {
                return null;
            }
            return str + strY;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + f10 + "]";
    }
}
