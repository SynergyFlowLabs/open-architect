package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class l<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f302991a;

    static final class a<T> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        io.reactivex.n0<? super T> f302992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f302993b;

        a(io.reactivex.n0<? super T> n0Var) {
            this.f302992a = n0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f302993b = io.reactivex.internal.disposables.d.DISPOSED;
            io.reactivex.n0<? super T> n0Var = this.f302992a;
            if (n0Var != null) {
                this.f302992a = null;
                n0Var.b(t10);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302993b, cVar)) {
                this.f302993b = cVar;
                this.f302992a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302992a = null;
            this.f302993b.dispose();
            this.f302993b = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302993b.k();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f302993b = io.reactivex.internal.disposables.d.DISPOSED;
            io.reactivex.n0<? super T> n0Var = this.f302992a;
            if (n0Var != null) {
                this.f302992a = null;
                n0Var.onError(th2);
            }
        }
    }

    public l(io.reactivex.q0<T> q0Var) {
        this.f302991a = q0Var;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f302991a.f(new a(n0Var));
    }
}
