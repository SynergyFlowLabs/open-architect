package io.reactivex.internal.operators.single;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class e<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends io.reactivex.q0<? extends T>> f302925a;

    public e(Callable<? extends io.reactivex.q0<? extends T>> callable) {
        this.f302925a = callable;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        try {
            ((io.reactivex.q0) io.reactivex.internal.functions.b.g(this.f302925a.call(), "The singleSupplier returned a null SingleSource")).f(n0Var);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.o(th2, n0Var);
        }
    }
}
