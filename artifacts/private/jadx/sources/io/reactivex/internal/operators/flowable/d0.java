package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class d0<T> extends io.reactivex.internal.operators.flowable.a<T, Long> {

    static final class a extends io.reactivex.internal.subscriptions.f<Long> implements io.reactivex.q<Object> {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f299191o = 4973004223787171406L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        org.reactivestreams.w f299192m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f299193n;

        a(org.reactivestreams.v<? super Long> vVar) {
            super(vVar);
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f299192m.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299192m, wVar)) {
                this.f299192m = wVar;
                this.f303450b.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            f(Long.valueOf(this.f299193n));
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f303450b.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            this.f299193n++;
        }
    }

    public d0(io.reactivex.l<T> lVar) {
        super(lVar);
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super Long> vVar) {
        this.f299043b.j6(new a(vVar));
    }
}
