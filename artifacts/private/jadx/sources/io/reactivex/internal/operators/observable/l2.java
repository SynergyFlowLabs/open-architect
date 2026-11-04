package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class l2<T, R> extends io.reactivex.k0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f301901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final R f301902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<R, ? super T, R> f301903c;

    static final class a<T, R> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super R> f301904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<R, ? super T, R> f301905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        R f301906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f301907d;

        a(io.reactivex.n0<? super R> n0Var, dj.c<R, ? super T, R> cVar, R r10) {
            this.f301904a = n0Var;
            this.f301906c = r10;
            this.f301905b = cVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301907d, cVar)) {
                this.f301907d = cVar;
                this.f301904a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301907d.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301907d.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            R r10 = this.f301906c;
            if (r10 != null) {
                this.f301906c = null;
                this.f301904a.b(r10);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301906c == null) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301906c = null;
                this.f301904a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            R r10 = this.f301906c;
            if (r10 != null) {
                try {
                    this.f301906c = (R) io.reactivex.internal.functions.b.g(this.f301905b.apply(r10, t10), "The reducer returned a null value");
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f301907d.dispose();
                    onError(th2);
                }
            }
        }
    }

    public l2(io.reactivex.g0<T> g0Var, R r10, dj.c<R, ? super T, R> cVar) {
        this.f301901a = g0Var;
        this.f301902b = r10;
        this.f301903c = cVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super R> n0Var) {
        this.f301901a.a(new a(n0Var, this.f301903c, this.f301902b));
    }
}
