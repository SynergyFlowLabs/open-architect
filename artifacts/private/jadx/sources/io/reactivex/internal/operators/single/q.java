package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class q<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super Throwable> f303035b;

    final class a implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.n0<? super T> f303036a;

        a(io.reactivex.n0<? super T> n0Var) {
            this.f303036a = n0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303036a.b(t10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            this.f303036a.d(cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            try {
                q.this.f303035b.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                th2 = new io.reactivex.exceptions.a(th2, th3);
            }
            this.f303036a.onError(th2);
        }
    }

    public q(io.reactivex.q0<T> q0Var, dj.g<? super Throwable> gVar) {
        this.f303034a = q0Var;
        this.f303035b = gVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f303034a.f(new a(n0Var));
    }
}
