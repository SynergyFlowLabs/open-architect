package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class u0<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.x<? extends R, ? super T> f300983b;

    public u0(io.reactivex.y<T> yVar, io.reactivex.x<? extends R, ? super T> xVar) {
        super(yVar);
        this.f300983b = xVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super R> vVar) {
        try {
            this.f300667a.a((io.reactivex.v) io.reactivex.internal.functions.b.g(this.f300983b.a(vVar), "The operator returned a null MaybeObserver"));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.f(th2, vVar);
        }
    }
}
