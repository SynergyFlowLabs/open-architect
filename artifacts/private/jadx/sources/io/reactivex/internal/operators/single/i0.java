package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class i0<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final T f302974a;

    public i0(T t10) {
        this.f302974a = t10;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        n0Var.d(io.reactivex.disposables.d.a());
        n0Var.b(this.f302974a);
    }
}
