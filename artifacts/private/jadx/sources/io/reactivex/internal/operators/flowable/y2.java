package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class y2<T, R> extends io.reactivex.k0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.u<T> f300543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<R> f300544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<R, ? super T, R> f300545c;

    public y2(org.reactivestreams.u<T> uVar, Callable<R> callable, dj.c<R, ? super T, R> cVar) {
        this.f300543a = uVar;
        this.f300544b = callable;
        this.f300545c = cVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super R> n0Var) {
        try {
            this.f300543a.e(new x2.a(n0Var, this.f300545c, io.reactivex.internal.functions.b.g(this.f300544b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.o(th2, n0Var);
        }
    }
}
