package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class y<T, R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<T> f300529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> f300530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f300531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f300532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.internal.util.j f300533f;

    public y(org.reactivestreams.u<T> uVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, int i11, io.reactivex.internal.util.j jVar) {
        this.f300529b = uVar;
        this.f300530c = oVar;
        this.f300531d = i10;
        this.f300532e = i11;
        this.f300533f = jVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        this.f300529b.e(new x.a(vVar, this.f300530c, this.f300531d, this.f300532e, this.f300533f));
    }
}
