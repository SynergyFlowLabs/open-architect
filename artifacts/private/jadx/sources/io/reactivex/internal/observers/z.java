package io.reactivex.internal.observers;

import io.reactivex.n0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class z<T> implements n0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.c> f298832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n0<? super T> f298833b;

    public z(AtomicReference<io.reactivex.disposables.c> atomicReference, n0<? super T> n0Var) {
        this.f298832a = atomicReference;
        this.f298833b = n0Var;
    }

    @Override // io.reactivex.n0
    public void b(T t10) {
        this.f298833b.b(t10);
    }

    @Override // io.reactivex.n0
    public void d(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.disposables.d.d(this.f298832a, cVar);
    }

    @Override // io.reactivex.n0
    public void onError(Throwable th2) {
        this.f298833b.onError(th2);
    }
}
