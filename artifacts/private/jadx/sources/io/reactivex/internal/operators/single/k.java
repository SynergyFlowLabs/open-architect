package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
@cj.e
public final class k<T, R> extends io.reactivex.s<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.k0<T> f302982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, io.reactivex.a0<R>> f302983b;

    static final class a<T, R> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super R> f302984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, io.reactivex.a0<R>> f302985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f302986c;

        a(io.reactivex.v<? super R> vVar, dj.o<? super T, io.reactivex.a0<R>> oVar) {
            this.f302984a = vVar;
            this.f302985b = oVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            try {
                io.reactivex.a0 a0Var = (io.reactivex.a0) io.reactivex.internal.functions.b.g(this.f302985b.apply(t10), "The selector returned a null Notification");
                if (a0Var.h()) {
                    this.f302984a.b((Object) a0Var.e());
                } else if (a0Var.f()) {
                    this.f302984a.onComplete();
                } else {
                    this.f302984a.onError(a0Var.d());
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302984a.onError(th2);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302986c, cVar)) {
                this.f302986c = cVar;
                this.f302984a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302986c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302986c.k();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f302984a.onError(th2);
        }
    }

    public k(io.reactivex.k0<T> k0Var, dj.o<? super T, io.reactivex.a0<R>> oVar) {
        this.f302982a = k0Var;
        this.f302983b = oVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super R> vVar) {
        this.f302982a.f(new a(vVar, this.f302983b));
    }
}
