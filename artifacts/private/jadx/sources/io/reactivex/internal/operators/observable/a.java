package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
abstract class a<T, U> extends io.reactivex.b0<U> implements ej.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final io.reactivex.g0<T> f301291a;

    a(io.reactivex.g0<T> g0Var) {
        this.f301291a = g0Var;
    }

    @Override // ej.g
    public final io.reactivex.g0<T> source() {
        return this.f301291a;
    }
}
