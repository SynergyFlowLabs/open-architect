package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class h1<T> extends io.reactivex.l<T> implements Callable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends T> f299472b;

    public h1(Callable<? extends T> callable) {
        this.f299472b = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) io.reactivex.internal.functions.b.g(this.f299472b.call(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.internal.subscriptions.f fVar = new io.reactivex.internal.subscriptions.f(vVar);
        vVar.l(fVar);
        try {
            fVar.f(io.reactivex.internal.functions.b.g(this.f299472b.call(), "The callable returned a null value"));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            if (fVar.g()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                vVar.onError(th2);
            }
        }
    }
}
