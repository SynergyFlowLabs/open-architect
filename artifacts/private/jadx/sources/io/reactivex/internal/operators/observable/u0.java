package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class u0<T> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends Throwable> f302384a;

    public u0(Callable<? extends Throwable> callable) {
        this.f302384a = callable;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        try {
            th = (Throwable) io.reactivex.internal.functions.b.g(this.f302384a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.exceptions.b.b(th);
        }
        io.reactivex.internal.disposables.e.l(th, i0Var);
    }
}
