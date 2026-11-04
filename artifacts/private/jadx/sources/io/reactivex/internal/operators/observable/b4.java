package io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class b4<T, U extends Collection<? super T>> extends io.reactivex.k0<U> implements ej.d<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f301397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<U> f301398b;

    static final class a<T, U extends Collection<? super T>> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super U> f301399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        U f301400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301401c;

        a(io.reactivex.n0<? super U> n0Var, U u10) {
            this.f301399a = n0Var;
            this.f301400b = u10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301401c, cVar)) {
                this.f301401c = cVar;
                this.f301399a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301401c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301401c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            U u10 = this.f301400b;
            this.f301400b = null;
            this.f301399a.b(u10);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301400b = null;
            this.f301399a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301400b.add(t10);
        }
    }

    public b4(io.reactivex.g0<T> g0Var, int i10) {
        this.f301397a = g0Var;
        this.f301398b = io.reactivex.internal.functions.a.f(i10);
    }

    @Override // ej.d
    public io.reactivex.b0<U> c() {
        return io.reactivex.plugins.a.R(new a4(this.f301397a, this.f301398b));
    }

    @Override // io.reactivex.k0
    public void d1(io.reactivex.n0<? super U> n0Var) {
        try {
            this.f301397a.a(new a(n0Var, (Collection) io.reactivex.internal.functions.b.g(this.f301398b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.o(th2, n0Var);
        }
    }

    public b4(io.reactivex.g0<T> g0Var, Callable<U> callable) {
        this.f301397a = g0Var;
        this.f301398b = callable;
    }
}
