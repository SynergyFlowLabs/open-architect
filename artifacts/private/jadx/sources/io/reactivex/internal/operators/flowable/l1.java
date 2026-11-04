package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class l1<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f299671b;

    public l1(org.reactivestreams.u<? extends T> uVar) {
        this.f299671b = uVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299671b.e(vVar);
    }
}
