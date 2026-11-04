package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class s1<T> extends io.reactivex.b0<T> implements ej.m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f302325a;

    public s1(T t10) {
        this.f302325a = t10;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        x2.a aVar = new x2.a(i0Var, this.f302325a);
        i0Var.d(aVar);
        aVar.run();
    }

    @Override // ej.m, java.util.concurrent.Callable
    public T call() {
        return this.f302325a;
    }
}
