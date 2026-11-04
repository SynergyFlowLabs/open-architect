package io.reactivex.internal.operators.completable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends io.reactivex.i> f298921a;

    public h(Callable<? extends io.reactivex.i> callable) {
        this.f298921a = callable;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        try {
            ((io.reactivex.i) io.reactivex.internal.functions.b.g(this.f298921a.call(), "The completableSupplier returned a null CompletableSource")).b(fVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.e(th2, fVar);
        }
    }
}
