package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class w1<T> extends io.reactivex.l<T> implements ej.m<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f300453b;

    public w1(T t10) {
        this.f300453b = t10;
    }

    @Override // ej.m, java.util.concurrent.Callable
    public T call() {
        return this.f300453b;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        vVar.l(new io.reactivex.internal.subscriptions.h(vVar, this.f300453b));
    }
}
