package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class d2<T, U> extends io.reactivex.l<U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<T> f299199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends U> f299200c;

    public d2(org.reactivestreams.u<T> uVar, dj.o<? super T, ? extends U> oVar) {
        this.f299199b = uVar;
        this.f299200c = oVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super U> vVar) {
        this.f299199b.e(new b2.b(vVar, this.f299200c));
    }
}
