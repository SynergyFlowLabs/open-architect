package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class k0<T, R> extends io.reactivex.k0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f302987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends R> f302988b;

    static final class a<T, R> implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super R> f302989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends R> f302990b;

        a(io.reactivex.n0<? super R> n0Var, dj.o<? super T, ? extends R> oVar) {
            this.f302989a = n0Var;
            this.f302990b = oVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            try {
                this.f302989a.b(io.reactivex.internal.functions.b.g(this.f302990b.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                onError(th2);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            this.f302989a.d(cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f302989a.onError(th2);
        }
    }

    public k0(io.reactivex.q0<? extends T> q0Var, dj.o<? super T, ? extends R> oVar) {
        this.f302987a = q0Var;
        this.f302988b = oVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super R> n0Var) {
        this.f302987a.f(new a(n0Var, this.f302988b));
    }
}
