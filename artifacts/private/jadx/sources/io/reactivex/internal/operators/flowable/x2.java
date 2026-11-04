package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class x2<T, R> extends io.reactivex.k0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.u<T> f300501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final R f300502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<R, ? super T, R> f300503c;

    static final class a<T, R> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super R> f300504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<R, ? super T, R> f300505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        R f300506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.w f300507d;

        a(io.reactivex.n0<? super R> n0Var, dj.c<R, ? super T, R> cVar, R r10) {
            this.f300504a = n0Var;
            this.f300506c = r10;
            this.f300505b = cVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300507d.cancel();
            this.f300507d = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300507d == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300507d, wVar)) {
                this.f300507d = wVar;
                this.f300504a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            R r10 = this.f300506c;
            if (r10 != null) {
                this.f300506c = null;
                this.f300507d = io.reactivex.internal.subscriptions.j.CANCELLED;
                this.f300504a.b(r10);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300506c == null) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f300506c = null;
            this.f300507d = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300504a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            R r10 = this.f300506c;
            if (r10 != null) {
                try {
                    this.f300506c = (R) io.reactivex.internal.functions.b.g(this.f300505b.apply(r10, t10), "The reducer returned a null value");
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f300507d.cancel();
                    onError(th2);
                }
            }
        }
    }

    public x2(org.reactivestreams.u<T> uVar, R r10, dj.c<R, ? super T, R> cVar) {
        this.f300501a = uVar;
        this.f300502b = r10;
        this.f300503c = cVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super R> n0Var) {
        this.f300501a.e(new a(n0Var, this.f300503c, this.f300502b));
    }
}
