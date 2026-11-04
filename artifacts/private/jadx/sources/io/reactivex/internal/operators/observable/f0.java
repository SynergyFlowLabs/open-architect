package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class f0<T> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends io.reactivex.g0<? extends T>> f301546a;

    public f0(Callable<? extends io.reactivex.g0<? extends T>> callable) {
        this.f301546a = callable;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        try {
            ((io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f301546a.call(), "null ObservableSource supplied")).a(i0Var);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.l(th2, i0Var);
        }
    }
}
