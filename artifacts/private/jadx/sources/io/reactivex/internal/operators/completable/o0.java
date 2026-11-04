package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class o0<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.i f299007b;

    public o0(io.reactivex.i iVar) {
        this.f299007b = iVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299007b.b(new io.reactivex.internal.observers.a0(vVar));
    }
}
