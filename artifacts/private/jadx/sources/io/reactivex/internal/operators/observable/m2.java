package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class m2<T, R> extends io.reactivex.k0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f301951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<R> f301952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<R, ? super T, R> f301953c;

    public m2(io.reactivex.g0<T> g0Var, Callable<R> callable, dj.c<R, ? super T, R> cVar) {
        this.f301951a = g0Var;
        this.f301952b = callable;
        this.f301953c = cVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super R> n0Var) {
        try {
            this.f301951a.a(new l2.a(n0Var, this.f301953c, io.reactivex.internal.functions.b.g(this.f301952b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.o(th2, n0Var);
        }
    }
}
