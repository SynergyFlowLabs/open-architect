package io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class u1<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f302385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T f302386b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f302388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f302389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f302390d;

        a(io.reactivex.n0<? super T> n0Var, T t10) {
            this.f302387a = n0Var;
            this.f302388b = t10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302389c, cVar)) {
                this.f302389c = cVar;
                this.f302387a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302389c.dispose();
            this.f302389c = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302389c == io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302389c = io.reactivex.internal.disposables.d.DISPOSED;
            T t10 = this.f302390d;
            if (t10 != null) {
                this.f302390d = null;
                this.f302387a.b(t10);
                return;
            }
            T t11 = this.f302388b;
            if (t11 != null) {
                this.f302387a.b(t11);
            } else {
                this.f302387a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302389c = io.reactivex.internal.disposables.d.DISPOSED;
            this.f302390d = null;
            this.f302387a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302390d = t10;
        }
    }

    public u1(io.reactivex.g0<T> g0Var, T t10) {
        this.f302385a = g0Var;
        this.f302386b = t10;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f302385a.a(new a(n0Var, this.f302386b));
    }
}
