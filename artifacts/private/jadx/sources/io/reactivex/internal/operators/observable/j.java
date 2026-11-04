package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class j<T> extends io.reactivex.k0<Boolean> implements ej.d<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f301773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super T> f301774b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Boolean> f301775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super T> f301776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f301778d;

        a(io.reactivex.n0<? super Boolean> n0Var, dj.r<? super T> rVar) {
            this.f301775a = n0Var;
            this.f301776b = rVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301777c, cVar)) {
                this.f301777c = cVar;
                this.f301775a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301777c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301777c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301778d) {
                return;
            }
            this.f301778d = true;
            this.f301775a.b(Boolean.FALSE);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301778d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301778d = true;
                this.f301775a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301778d) {
                return;
            }
            try {
                if (this.f301776b.test(t10)) {
                    this.f301778d = true;
                    this.f301777c.dispose();
                    this.f301775a.b(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301777c.dispose();
                onError(th2);
            }
        }
    }

    public j(io.reactivex.g0<T> g0Var, dj.r<? super T> rVar) {
        this.f301773a = g0Var;
        this.f301774b = rVar;
    }

    @Override // ej.d
    public io.reactivex.b0<Boolean> c() {
        return io.reactivex.plugins.a.R(new i(this.f301773a, this.f301774b));
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super Boolean> n0Var) {
        this.f301773a.a(new a(n0Var, this.f301774b));
    }
}
