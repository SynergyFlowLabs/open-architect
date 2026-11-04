package io.reactivex.internal.operators.maybe;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class k<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends io.reactivex.y<? extends T>> f300854a;

    public k(Callable<? extends io.reactivex.y<? extends T>> callable) {
        this.f300854a = callable;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        try {
            ((io.reactivex.y) io.reactivex.internal.functions.b.g(this.f300854a.call(), "The maybeSupplier returned a null MaybeSource")).a(vVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.f(th2, vVar);
        }
    }
}
