package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class v0<T> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f303097a;

    static final class a<T> extends io.reactivex.internal.observers.l<T> implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f303098k = 3786543492451018833L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        io.reactivex.disposables.c f303099j;

        a(io.reactivex.i0<? super T> i0Var) {
            super(i0Var);
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            c(t10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f303099j, cVar)) {
                this.f303099j = cVar;
                this.f298769b.d(this);
            }
        }

        @Override // io.reactivex.internal.observers.l, io.reactivex.disposables.c
        public void dispose() {
            super.dispose();
            this.f303099j.dispose();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            e(th2);
        }
    }

    public v0(io.reactivex.q0<? extends T> q0Var) {
        this.f303097a = q0Var;
    }

    public static <T> io.reactivex.n0<T> h8(io.reactivex.i0<? super T> i0Var) {
        return new a(i0Var);
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f303097a.f(h8(i0Var));
    }
}
