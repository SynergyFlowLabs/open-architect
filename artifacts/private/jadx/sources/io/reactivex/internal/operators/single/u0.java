package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class u0<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f303087b;

    static final class a<T> extends io.reactivex.internal.subscriptions.f<T> implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final long f303088n = 187782011903685568L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        io.reactivex.disposables.c f303089m;

        a(org.reactivestreams.v<? super T> vVar) {
            super(vVar);
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            f(t10);
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f303089m.dispose();
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f303089m, cVar)) {
                this.f303089m = cVar;
                this.f303450b.l(this);
            }
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303450b.onError(th2);
        }
    }

    public u0(io.reactivex.q0<? extends T> q0Var) {
        this.f303087b = q0Var;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        this.f303087b.f(new a(vVar));
    }
}
