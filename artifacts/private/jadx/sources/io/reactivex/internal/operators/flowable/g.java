package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class g<T> extends io.reactivex.k0<Boolean> implements ej.b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f299389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super T> f299390b;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Boolean> f299391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super T> f299392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f299393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f299394d;

        a(io.reactivex.n0<? super Boolean> n0Var, dj.r<? super T> rVar) {
            this.f299391a = n0Var;
            this.f299392b = rVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f299393c.cancel();
            this.f299393c = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f299393c == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299393c, wVar)) {
                this.f299393c = wVar;
                this.f299391a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299394d) {
                return;
            }
            this.f299394d = true;
            this.f299393c = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f299391a.b(Boolean.TRUE);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299394d) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299394d = true;
            this.f299393c = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f299391a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299394d) {
                return;
            }
            try {
                if (this.f299392b.test(t10)) {
                    return;
                }
                this.f299394d = true;
                this.f299393c.cancel();
                this.f299393c = io.reactivex.internal.subscriptions.j.CANCELLED;
                this.f299391a.b(Boolean.FALSE);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f299393c.cancel();
                this.f299393c = io.reactivex.internal.subscriptions.j.CANCELLED;
                onError(th2);
            }
        }
    }

    public g(io.reactivex.l<T> lVar, dj.r<? super T> rVar) {
        this.f299389a = lVar;
        this.f299390b = rVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super Boolean> n0Var) {
        this.f299389a.j6(new a(n0Var, this.f299390b));
    }

    @Override // ej.b
    public io.reactivex.l<Boolean> e() {
        return io.reactivex.plugins.a.P(new f(this.f299389a, this.f299390b));
    }
}
