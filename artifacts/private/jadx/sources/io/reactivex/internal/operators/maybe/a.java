package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
abstract class a<T, R> extends io.reactivex.s<R> implements ej.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final io.reactivex.y<T> f300667a;

    a(io.reactivex.y<T> yVar) {
        this.f300667a = yVar;
    }

    @Override // ej.f
    public final io.reactivex.y<T> source() {
        return this.f300667a;
    }
}
