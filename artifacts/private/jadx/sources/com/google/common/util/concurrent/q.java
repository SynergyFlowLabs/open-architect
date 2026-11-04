package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b
abstract class q<I, O, F, T> extends u0.a<O> implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @a8.b
    @fj.a
    t1<? extends I> f120278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @a8.b
    @fj.a
    F f120279j;

    private static final class a<I, O> extends q<I, O, w<? super I, ? extends O>, t1<? extends O>> {
        a(t1<? extends I> inputFuture, w<? super I, ? extends O> function) {
            super(inputFuture, function);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.q
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public t1<? extends O> P(w<? super I, ? extends O> function, @d2 I input) throws Exception {
            t1<? extends O> t1VarApply = function.apply(input);
            com.google.common.base.j0.V(t1VarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", function);
            return t1VarApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.q
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public void Q(t1<? extends O> result) {
            D(result);
        }
    }

    private static final class b<I, O> extends q<I, O, com.google.common.base.t<? super I, ? extends O>, O> {
        b(t1<? extends I> inputFuture, com.google.common.base.t<? super I, ? extends O> function) {
            super(inputFuture, function);
        }

        @Override // com.google.common.util.concurrent.q
        void Q(@d2 O result) {
            B(result);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.q
        @d2
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public O P(com.google.common.base.t<? super I, ? extends O> function, @d2 I input) {
            return function.apply(input);
        }
    }

    q(t1<? extends I> t1Var, F f10) {
        this.f120278i = (t1) com.google.common.base.j0.E(t1Var);
        this.f120279j = (F) com.google.common.base.j0.E(f10);
    }

    static <I, O> t1<O> N(t1<I> input, com.google.common.base.t<? super I, ? extends O> function, Executor executor) {
        com.google.common.base.j0.E(function);
        b bVar = new b(input, function);
        input.m0(bVar, a2.p(executor, bVar));
        return bVar;
    }

    static <I, O> t1<O> O(t1<I> input, w<? super I, ? extends O> function, Executor executor) {
        com.google.common.base.j0.E(executor);
        a aVar = new a(input, function);
        input.m0(aVar, a2.p(executor, aVar));
        return aVar;
    }

    @d2
    @z7.g
    abstract T P(F function, @d2 I result) throws Exception;

    @z7.g
    abstract void Q(@d2 T result);

    @Override // com.google.common.util.concurrent.f
    protected final void m() {
        x(this.f120278i);
        this.f120278i = null;
        this.f120279j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        t1<? extends I> t1Var = this.f120278i;
        F f10 = this.f120279j;
        if ((isCancelled() | (t1Var == null)) || (f10 == null)) {
            return;
        }
        this.f120278i = null;
        if (t1Var.isCancelled()) {
            D(t1Var);
            return;
        }
        try {
            try {
                Object objP = P(f10, h1.j(t1Var));
                this.f120279j = null;
                Q(objP);
            } catch (Throwable th2) {
                try {
                    f2.b(th2);
                    C(th2);
                    this.f120279j = null;
                } catch (Throwable th3) {
                    this.f120279j = null;
                    throw th3;
                }
            }
        } catch (Error e10) {
            C(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            C(e11.getCause());
        } catch (Exception e12) {
            C(e12);
        }
    }

    @Override // com.google.common.util.concurrent.f
    @fj.a
    protected String y() {
        String str;
        t1<? extends I> t1Var = this.f120278i;
        F f10 = this.f120279j;
        String strY = super.y();
        if (t1Var != null) {
            str = "inputFuture=[" + t1Var + "], ";
        } else {
            str = "";
        }
        if (f10 != null) {
            return str + "function=[" + f10 + "]";
        }
        if (strY == null) {
            return null;
        }
        return str + strY;
    }
}
