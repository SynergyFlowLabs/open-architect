package io.reactivex.internal.operators.completable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<?> f299018a;

    public r(Callable<?> callable) {
        this.f299018a = callable;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        io.reactivex.disposables.c cVarB = io.reactivex.disposables.d.b();
        fVar.d(cVarB);
        try {
            this.f299018a.call();
            if (!cVarB.k()) {
                fVar.onComplete();
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            if (cVarB.k()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                fVar.onError(th2);
            }
        }
    }
}
