package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
abstract class a<T, R> extends io.reactivex.l<R> implements ej.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.reactivex.l<T> f299043b;

    a(io.reactivex.l<T> lVar) {
        this.f299043b = (io.reactivex.l) io.reactivex.internal.functions.b.g(lVar, "source is null");
    }

    @Override // ej.h
    public final org.reactivestreams.u<T> source() {
        return this.f299043b;
    }
}
