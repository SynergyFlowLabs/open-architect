package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class s0<T> extends io.reactivex.k0<Boolean> implements ej.f<T>, ej.c<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300954a;

    static final class a<T> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Boolean> f300955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f300956b;

        a(io.reactivex.n0<? super Boolean> n0Var) {
            this.f300955a = n0Var;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300956b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300955a.b(Boolean.FALSE);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300956b, cVar)) {
                this.f300956b = cVar;
                this.f300955a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300956b.dispose();
            this.f300956b = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300956b.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300956b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300955a.b(Boolean.TRUE);
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300956b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300955a.onError(th2);
        }
    }

    public s0(io.reactivex.y<T> yVar) {
        this.f300954a = yVar;
    }

    @Override // ej.c
    public io.reactivex.s<Boolean> a() {
        return io.reactivex.plugins.a.Q(new r0(this.f300954a));
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super Boolean> n0Var) {
        this.f300954a.a(new a(n0Var));
    }

    @Override // ej.f
    public io.reactivex.y<T> source() {
        return this.f300954a;
    }
}
