package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class x0<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends Throwable> f300496b;

    public x0(Callable<? extends Throwable> callable) {
        this.f300496b = callable;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        try {
            th = (Throwable) io.reactivex.internal.functions.b.g(this.f300496b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.exceptions.b.b(th);
        }
        io.reactivex.internal.subscriptions.g.c(th, vVar);
    }
}
