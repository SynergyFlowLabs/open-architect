package io.reactivex.internal.operators.single;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class d0<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f302924a;

    public d0(Callable<? extends T> callable) {
        this.f302924a = callable;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        io.reactivex.disposables.c cVarB = io.reactivex.disposables.d.b();
        n0Var.d(cVarB);
        if (cVarB.k()) {
            return;
        }
        try {
            a0.c cVar = (Object) io.reactivex.internal.functions.b.g(this.f302924a.call(), "The callable returned a null value");
            if (cVarB.k()) {
                return;
            }
            n0Var.b(cVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            if (cVarB.k()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                n0Var.onError(th2);
            }
        }
    }
}
