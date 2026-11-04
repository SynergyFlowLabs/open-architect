package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class n<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.a f303002b;

    static final class a<T> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.a f303004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f303005c;

        a(io.reactivex.n0<? super T> n0Var, dj.a aVar) {
            this.f303003a = n0Var;
            this.f303004b = aVar;
        }

        private void a() {
            try {
                this.f303004b.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303003a.b(t10);
            a();
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f303005c, cVar)) {
                this.f303005c = cVar;
                this.f303003a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f303005c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303005c.k();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303003a.onError(th2);
            a();
        }
    }

    public n(io.reactivex.q0<T> q0Var, dj.a aVar) {
        this.f303001a = q0Var;
        this.f303002b = aVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f303001a.f(new a(n0Var, this.f303002b));
    }
}
