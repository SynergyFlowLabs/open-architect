package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class c4<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    static final class a<T> extends io.reactivex.internal.subscriptions.f<T> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final long f299184n = -5467847744262967226L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        org.reactivestreams.w f299185m;

        a(org.reactivestreams.v<? super T> vVar) {
            super(vVar);
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f299185m.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299185m, wVar)) {
                this.f299185m = wVar;
                this.f303450b.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            T t10 = this.f303451c;
            if (t10 != null) {
                f(t10);
            } else {
                this.f303450b.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f303451c = null;
            this.f303450b.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f303451c = t10;
        }
    }

    public c4(io.reactivex.l<T> lVar) {
        super(lVar);
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar));
    }
}
