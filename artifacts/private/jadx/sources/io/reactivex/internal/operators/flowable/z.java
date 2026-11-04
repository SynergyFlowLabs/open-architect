package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class z<T, R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<T> f300568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> f300569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f300570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.internal.util.j f300571e;

    public z(org.reactivestreams.u<T> uVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, io.reactivex.internal.util.j jVar) {
        this.f300568b = uVar;
        this.f300569c = oVar;
        this.f300570d = i10;
        this.f300571e = jVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        if (j3.b(this.f300568b, vVar, this.f300569c)) {
            return;
        }
        this.f300568b.e(w.M8(vVar, this.f300569c, this.f300570d, this.f300571e));
    }
}
