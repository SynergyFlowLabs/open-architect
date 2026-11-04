package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class k<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.flowables.a<? extends T> f299622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f299623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.g<? super io.reactivex.disposables.c> f299624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicInteger f299625e = new AtomicInteger();

    public k(io.reactivex.flowables.a<? extends T> aVar, int i10, dj.g<? super io.reactivex.disposables.c> gVar) {
        this.f299622b = aVar;
        this.f299623c = i10;
        this.f299624d = gVar;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299622b.e(vVar);
        if (this.f299625e.incrementAndGet() == this.f299623c) {
            this.f299622b.Q8(this.f299624d);
        }
    }
}
