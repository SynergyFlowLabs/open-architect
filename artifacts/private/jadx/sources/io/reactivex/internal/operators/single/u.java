package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class u<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.a f303084b;

    final class a implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303085a;

        a(io.reactivex.n0<? super T> n0Var) {
            this.f303085a = n0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            try {
                u.this.f303084b.run();
                this.f303085a.b(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f303085a.onError(th2);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            this.f303085a.d(cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            try {
                u.this.f303084b.run();
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                th2 = new io.reactivex.exceptions.a(th2, th3);
            }
            this.f303085a.onError(th2);
        }
    }

    public u(io.reactivex.q0<T> q0Var, dj.a aVar) {
        this.f303083a = q0Var;
        this.f303084b = aVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f303083a.f(new a(n0Var));
    }
}
