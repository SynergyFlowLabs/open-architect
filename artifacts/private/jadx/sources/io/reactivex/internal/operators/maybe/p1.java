package io.reactivex.internal.operators.maybe;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class p1<T> extends io.reactivex.k0<T> implements ej.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T f300927b;

    static final class a<T> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f300928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f300929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f300930c;

        a(io.reactivex.n0<? super T> n0Var, T t10) {
            this.f300928a = n0Var;
            this.f300929b = t10;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300930c = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300928a.b(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300930c, cVar)) {
                this.f300930c = cVar;
                this.f300928a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300930c.dispose();
            this.f300930c = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300930c.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300930c = io.reactivex.internal.disposables.d.DISPOSED;
            T t10 = this.f300929b;
            if (t10 != null) {
                this.f300928a.b(t10);
            } else {
                this.f300928a.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300930c = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300928a.onError(th2);
        }
    }

    public p1(io.reactivex.y<T> yVar, T t10) {
        this.f300926a = yVar;
        this.f300927b = t10;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f300926a.a(new a(n0Var, this.f300927b));
    }

    @Override // ej.f
    public io.reactivex.y<T> source() {
        return this.f300926a;
    }
}
