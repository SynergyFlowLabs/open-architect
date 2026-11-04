package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Throwable f299006a;

    public o(Throwable th2) {
        this.f299006a = th2;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        io.reactivex.internal.disposables.e.e(this.f299006a, fVar);
    }
}
