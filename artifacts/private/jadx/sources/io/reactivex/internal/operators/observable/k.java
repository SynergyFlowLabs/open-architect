package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class k<T> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.observables.a<? extends T> f301827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f301828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super io.reactivex.disposables.c> f301829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicInteger f301830d = new AtomicInteger();

    public k(io.reactivex.observables.a<? extends T> aVar, int i10, dj.g<? super io.reactivex.disposables.c> gVar) {
        this.f301827a = aVar;
        this.f301828b = i10;
        this.f301829c = gVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301827a.a(i0Var);
        if (this.f301830d.incrementAndGet() == this.f301828b) {
            this.f301827a.l8(this.f301829c);
        }
    }
}
