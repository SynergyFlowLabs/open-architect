package io.reactivex.internal.operators.maybe;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class x<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends Throwable> f301003a;

    public x(Callable<? extends Throwable> callable) {
        this.f301003a = callable;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        vVar.d(io.reactivex.disposables.d.a());
        try {
            th = (Throwable) io.reactivex.internal.functions.b.g(this.f301003a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.exceptions.b.b(th);
        }
        vVar.onError(th);
    }
}
