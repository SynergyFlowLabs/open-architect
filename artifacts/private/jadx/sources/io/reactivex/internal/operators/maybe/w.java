package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class w<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Throwable f301001a;

    public w(Throwable th2) {
        this.f301001a = th2;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        vVar.d(io.reactivex.disposables.d.a());
        vVar.onError(this.f301001a);
    }
}
