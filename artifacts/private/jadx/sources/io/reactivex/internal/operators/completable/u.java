package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f299033a;

    public u(Runnable runnable) {
        this.f299033a = runnable;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        io.reactivex.disposables.c cVarB = io.reactivex.disposables.d.b();
        fVar.d(cVarB);
        try {
            this.f299033a.run();
            if (cVarB.k()) {
                return;
            }
            fVar.onComplete();
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
