package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class r<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.b<? super T, ? super Throwable> f303045b;

    final class a implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.n0<? super T> f303046a;

        a(io.reactivex.n0<? super T> n0Var) {
            this.f303046a = n0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            try {
                r.this.f303045b.accept(t10, null);
                this.f303046a.b(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f303046a.onError(th2);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            this.f303046a.d(cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            try {
                r.this.f303045b.accept(null, th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                th2 = new io.reactivex.exceptions.a(th2, th3);
            }
            this.f303046a.onError(th2);
        }
    }

    public r(io.reactivex.q0<T> q0Var, dj.b<? super T, ? super Throwable> bVar) {
        this.f303044a = q0Var;
        this.f303045b = bVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f303044a.f(new a(n0Var));
    }
}
