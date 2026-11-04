package io.reactivex.internal.operators.single;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class w<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends Throwable> f303100a;

    public w(Callable<? extends Throwable> callable) {
        this.f303100a = callable;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        try {
            th = (Throwable) io.reactivex.internal.functions.b.g(this.f303100a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.exceptions.b.b(th);
        }
        io.reactivex.internal.disposables.e.o(th, n0Var);
    }
}
