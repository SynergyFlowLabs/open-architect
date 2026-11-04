package io.reactivex.internal.operators.completable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends Throwable> f299008a;

    public p(Callable<? extends Throwable> callable) {
        this.f299008a = callable;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        try {
            th = (Throwable) io.reactivex.internal.functions.b.g(this.f299008a.call(), "The error returned is null");
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.exceptions.b.b(th);
        }
        io.reactivex.internal.disposables.e.e(th, fVar);
    }
}
