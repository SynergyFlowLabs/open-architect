package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class i0<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends org.reactivestreams.u<? extends T>> f299517b;

    public i0(Callable<? extends org.reactivestreams.u<? extends T>> callable) {
        this.f299517b = callable;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        try {
            ((org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f299517b.call(), "The publisher supplied is null")).e(vVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
