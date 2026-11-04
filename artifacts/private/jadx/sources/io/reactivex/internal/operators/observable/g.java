package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class g<T> extends io.reactivex.k0<Boolean> implements ej.d<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f301578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super T> f301579b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Boolean> f301580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super T> f301581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f301583d;

        a(io.reactivex.n0<? super Boolean> n0Var, dj.r<? super T> rVar) {
            this.f301580a = n0Var;
            this.f301581b = rVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301582c, cVar)) {
                this.f301582c = cVar;
                this.f301580a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301582c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301582c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301583d) {
                return;
            }
            this.f301583d = true;
            this.f301580a.b(Boolean.TRUE);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301583d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301583d = true;
                this.f301580a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301583d) {
                return;
            }
            try {
                if (this.f301581b.test(t10)) {
                    return;
                }
                this.f301583d = true;
                this.f301582c.dispose();
                this.f301580a.b(Boolean.FALSE);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301582c.dispose();
                onError(th2);
            }
        }
    }

    public g(io.reactivex.g0<T> g0Var, dj.r<? super T> rVar) {
        this.f301578a = g0Var;
        this.f301579b = rVar;
    }

    @Override // ej.d
    public io.reactivex.b0<Boolean> c() {
        return io.reactivex.plugins.a.R(new f(this.f301578a, this.f301579b));
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super Boolean> n0Var) {
        this.f301578a.a(new a(n0Var, this.f301579b));
    }
}
