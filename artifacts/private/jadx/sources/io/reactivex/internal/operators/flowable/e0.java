package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class e0<T> extends io.reactivex.k0<Long> implements ej.b<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f299282a;

    static final class a implements io.reactivex.q<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Long> f299283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f299284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f299285c;

        a(io.reactivex.n0<? super Long> n0Var) {
            this.f299283a = n0Var;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f299284b.cancel();
            this.f299284b = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f299284b == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299284b, wVar)) {
                this.f299284b = wVar;
                this.f299283a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299284b = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f299283a.b(Long.valueOf(this.f299285c));
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299284b = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f299283a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            this.f299285c++;
        }
    }

    public e0(io.reactivex.l<T> lVar) {
        this.f299282a = lVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super Long> n0Var) {
        this.f299282a.j6(new a(n0Var));
    }

    @Override // ej.b
    public io.reactivex.l<Long> e() {
        return io.reactivex.plugins.a.P(new d0(this.f299282a));
    }
}
