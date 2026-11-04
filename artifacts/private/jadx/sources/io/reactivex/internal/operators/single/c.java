package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class c<T> extends io.reactivex.k0<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f302909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f302910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.d<Object, Object> f302911c;

    final class a implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.n0<? super Boolean> f302912a;

        a(io.reactivex.n0<? super Boolean> n0Var) {
            this.f302912a = n0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            try {
                c cVar = c.this;
                this.f302912a.b(Boolean.valueOf(cVar.f302911c.test(t10, cVar.f302910b)));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302912a.onError(th2);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            this.f302912a.d(cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f302912a.onError(th2);
        }
    }

    public c(io.reactivex.q0<T> q0Var, Object obj, dj.d<Object, Object> dVar) {
        this.f302909a = q0Var;
        this.f302910b = obj;
        this.f302911c = dVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super Boolean> n0Var) {
        this.f302909a.f(new a(n0Var));
    }
}
