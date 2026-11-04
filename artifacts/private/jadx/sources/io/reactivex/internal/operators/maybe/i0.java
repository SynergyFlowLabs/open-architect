package io.reactivex.internal.operators.maybe;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class i0<T> extends io.reactivex.s<T> implements Callable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final dj.a f300832a;

    public i0(dj.a aVar) {
        this.f300832a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        this.f300832a.run();
        return null;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        io.reactivex.disposables.c cVarB = io.reactivex.disposables.d.b();
        vVar.d(cVarB);
        if (!cVarB.k()) {
            try {
                this.f300832a.run();
                if (!cVarB.k()) {
                    vVar.onComplete();
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
}
