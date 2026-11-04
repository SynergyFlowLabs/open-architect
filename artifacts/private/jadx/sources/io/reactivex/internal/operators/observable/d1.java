package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class d1<T> extends io.reactivex.b0<T> implements Callable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f301444a;

    public d1(Callable<? extends T> callable) {
        this.f301444a = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.internal.observers.l lVar = new io.reactivex.internal.observers.l(i0Var);
        i0Var.d(lVar);
        if (lVar.k()) {
            return;
        }
        try {
            lVar.c(io.reactivex.internal.functions.b.g(this.f301444a.call(), "Callable returned null"));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            if (lVar.k()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                i0Var.onError(th2);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) io.reactivex.internal.functions.b.g(this.f301444a.call(), "The callable returned a null value");
    }
}
