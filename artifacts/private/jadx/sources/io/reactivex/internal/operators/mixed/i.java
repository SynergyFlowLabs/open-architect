package io.reactivex.internal.operators.mixed;

import io.reactivex.a0;
import io.reactivex.n0;
import io.reactivex.v;

/* JADX INFO: loaded from: classes10.dex */
@cj.e
public final class i<T> implements n0<T>, v<T>, io.reactivex.f, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final n0<? super a0<T>> f301167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    io.reactivex.disposables.c f301168b;

    public i(n0<? super a0<T>> n0Var) {
        this.f301167a = n0Var;
    }

    @Override // io.reactivex.n0
    public void b(T t10) {
        this.f301167a.b(a0.c(t10));
    }

    @Override // io.reactivex.n0
    public void d(io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.disposables.d.q(this.f301168b, cVar)) {
            this.f301168b = cVar;
            this.f301167a.d(this);
        }
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        this.f301168b.dispose();
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this.f301168b.k();
    }

    @Override // io.reactivex.v
    public void onComplete() {
        this.f301167a.b(a0.a());
    }

    @Override // io.reactivex.n0
    public void onError(Throwable th2) {
        this.f301167a.b(a0.b(th2));
    }
}
