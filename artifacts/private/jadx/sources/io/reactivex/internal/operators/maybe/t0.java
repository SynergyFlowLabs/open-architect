package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class t0<T> extends io.reactivex.s<T> implements ej.m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final T f300970a;

    public t0(T t10) {
        this.f300970a = t10;
    }

    @Override // ej.m, java.util.concurrent.Callable
    public T call() {
        return this.f300970a;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        vVar.d(io.reactivex.disposables.d.a());
        vVar.b(this.f300970a);
    }
}
