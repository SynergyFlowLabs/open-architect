package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class t<T, U> extends io.reactivex.k0<U> implements ej.d<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f302338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends U> f302339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.b<? super U, ? super T> f302340c;

    static final class a<T, U> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super U> f302341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.b<? super U, ? super T> f302342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final U f302343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f302344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f302345e;

        a(io.reactivex.n0<? super U> n0Var, U u10, dj.b<? super U, ? super T> bVar) {
            this.f302341a = n0Var;
            this.f302342b = bVar;
            this.f302343c = u10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302344d, cVar)) {
                this.f302344d = cVar;
                this.f302341a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302344d.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302344d.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302345e) {
                return;
            }
            this.f302345e = true;
            this.f302341a.b(this.f302343c);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302345e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302345e = true;
                this.f302341a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302345e) {
                return;
            }
            try {
                this.f302342b.accept(this.f302343c, t10);
            } catch (Throwable th2) {
                this.f302344d.dispose();
                onError(th2);
            }
        }
    }

    public t(io.reactivex.g0<T> g0Var, Callable<? extends U> callable, dj.b<? super U, ? super T> bVar) {
        this.f302338a = g0Var;
        this.f302339b = callable;
        this.f302340c = bVar;
    }

    @Override // ej.d
    public io.reactivex.b0<U> c() {
        return io.reactivex.plugins.a.R(new s(this.f302338a, this.f302339b, this.f302340c));
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super U> n0Var) {
        try {
            this.f302338a.a(new a(n0Var, io.reactivex.internal.functions.b.g(this.f302339b.call(), "The initialSupplier returned a null value"), this.f302340c));
        } catch (Throwable th2) {
            io.reactivex.internal.disposables.e.o(th2, n0Var);
        }
    }
}
