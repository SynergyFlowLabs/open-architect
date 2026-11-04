package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class t<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super T> f303075b;

    final class a implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303076a;

        a(io.reactivex.n0<? super T> n0Var) {
            this.f303076a = n0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            try {
                t.this.f303075b.accept(t10);
                this.f303076a.b(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f303076a.onError(th2);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            this.f303076a.d(cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303076a.onError(th2);
        }
    }

    public t(io.reactivex.q0<T> q0Var, dj.g<? super T> gVar) {
        this.f303074a = q0Var;
        this.f303075b = gVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f303074a.f(new a(n0Var));
    }
}
