package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class d1<T, U> extends io.reactivex.l<U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<T> f299194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> f299195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f299196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f299197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f299198f;

    public d1(org.reactivestreams.u<T> uVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> oVar, boolean z10, int i10, int i11) {
        this.f299194b = uVar;
        this.f299195c = oVar;
        this.f299196d = z10;
        this.f299197e = i10;
        this.f299198f = i11;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super U> vVar) {
        if (j3.b(this.f299194b, vVar, this.f299195c)) {
            return;
        }
        this.f299194b.e(z0.M8(vVar, this.f299195c, this.f299196d, this.f299197e, this.f299198f));
    }
}
