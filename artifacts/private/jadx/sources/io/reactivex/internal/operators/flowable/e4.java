package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class e4<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<T> f299312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299313c;

    public e4(org.reactivestreams.u<T> uVar, long j10) {
        this.f299312b = uVar;
        this.f299313c = j10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299312b.e(new a4.a(vVar, this.f299313c));
    }
}
