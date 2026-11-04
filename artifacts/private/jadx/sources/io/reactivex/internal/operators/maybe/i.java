package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class i<T> extends io.reactivex.k0<Long> implements ej.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300829a;

    static final class a implements io.reactivex.v<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Long> f300830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f300831b;

        a(io.reactivex.n0<? super Long> n0Var) {
            this.f300830a = n0Var;
        }

        @Override // io.reactivex.v
        public void b(Object obj) {
            this.f300831b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300830a.b(1L);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300831b, cVar)) {
                this.f300831b = cVar;
                this.f300830a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300831b.dispose();
            this.f300831b = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300831b.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300831b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300830a.b(0L);
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300831b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300830a.onError(th2);
        }
    }

    public i(io.reactivex.y<T> yVar) {
        this.f300829a = yVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super Long> n0Var) {
        this.f300829a.a(new a(n0Var));
    }

    @Override // ej.f
    public io.reactivex.y<T> source() {
        return this.f300829a;
    }
}
