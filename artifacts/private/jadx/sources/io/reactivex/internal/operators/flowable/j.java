package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class j<T> extends io.reactivex.k0<Boolean> implements ej.b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f299549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super T> f299550b;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Boolean> f299551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super T> f299552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f299553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f299554d;

        a(io.reactivex.n0<? super Boolean> n0Var, dj.r<? super T> rVar) {
            this.f299551a = n0Var;
            this.f299552b = rVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f299553c.cancel();
            this.f299553c = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f299553c == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299553c, wVar)) {
                this.f299553c = wVar;
                this.f299551a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (!this.f299554d) {
                this.f299554d = true;
                this.f299553c = io.reactivex.internal.subscriptions.j.CANCELLED;
                this.f299551a.b(Boolean.FALSE);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299554d) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299554d = true;
            this.f299553c = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f299551a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299554d) {
                return;
            }
            try {
                if (this.f299552b.test(t10)) {
                    this.f299554d = true;
                    this.f299553c.cancel();
                    this.f299553c = io.reactivex.internal.subscriptions.j.CANCELLED;
                    this.f299551a.b(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f299553c.cancel();
                this.f299553c = io.reactivex.internal.subscriptions.j.CANCELLED;
                onError(th2);
            }
        }
    }

    public j(io.reactivex.l<T> lVar, dj.r<? super T> rVar) {
        this.f299549a = lVar;
        this.f299550b = rVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super Boolean> n0Var) {
        this.f299549a.j6(new a(n0Var, this.f299550b));
    }

    @Override // ej.b
    public io.reactivex.l<Boolean> e() {
        return io.reactivex.plugins.a.P(new i(this.f299549a, this.f299550b));
    }
}
