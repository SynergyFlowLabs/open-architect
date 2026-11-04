package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class g0<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f302950a;

    static final class a<T> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f302952b;

        a(io.reactivex.n0<? super T> n0Var) {
            this.f302951a = n0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f302951a.b(t10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302952b, cVar)) {
                this.f302952b = cVar;
                this.f302951a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302952b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302952b.k();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f302951a.onError(th2);
        }
    }

    public g0(io.reactivex.q0<? extends T> q0Var) {
        this.f302950a = q0Var;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f302950a.f(new a(n0Var));
    }
}
