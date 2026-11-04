package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class s<T, U> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends U> f302309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.b<? super U, ? super T> f302310c;

    static final class a<T, U> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super U> f302311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.b<? super U, ? super T> f302312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final U f302313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f302314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f302315e;

        a(io.reactivex.i0<? super U> i0Var, U u10, dj.b<? super U, ? super T> bVar) {
            this.f302311a = i0Var;
            this.f302312b = bVar;
            this.f302313c = u10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302314d, cVar)) {
                this.f302314d = cVar;
                this.f302311a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302314d.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302314d.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302315e) {
                return;
            }
            this.f302315e = true;
            this.f302311a.onNext(this.f302313c);
            this.f302311a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302315e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302315e = true;
                this.f302311a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302315e) {
                return;
            }
            try {
                this.f302312b.accept(this.f302313c, t10);
            } catch (Throwable th2) {
                this.f302314d.dispose();
                onError(th2);
            }
        }
    }

    public s(io.reactivex.g0<T> g0Var, Callable<? extends U> callable, dj.b<? super U, ? super T> bVar) {
        super(g0Var);
        this.f302309b = callable;
        this.f302310c = bVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super U> i0Var) {
        try {
            this.f301291a.a(new a(i0Var, io.reactivex.internal.functions.b.g(this.f302309b.call(), "The initialSupplier returned a null value"), this.f302310c));
        } catch (Throwable th2) {
            io.reactivex.internal.disposables.e.l(th2, i0Var);
        }
    }
}
