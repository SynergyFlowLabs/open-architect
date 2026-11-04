package io.reactivex.internal.operators.maybe;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class j0<T> extends io.reactivex.s<T> implements Callable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f300842a;

    public j0(Callable<? extends T> callable) {
        this.f300842a = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.f300842a.call();
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        io.reactivex.disposables.c cVarB = io.reactivex.disposables.d.b();
        vVar.d(cVarB);
        if (cVarB.k()) {
            return;
        }
        try {
            T tCall = this.f300842a.call();
            if (cVarB.k()) {
                return;
            }
            if (tCall == null) {
                vVar.onComplete();
            } else {
                vVar.b(tCall);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            if (cVarB.k()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                vVar.onError(th2);
            }
        }
    }
}
