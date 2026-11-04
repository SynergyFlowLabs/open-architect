package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class p1<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    static final class a<T> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f299966b;

        a(org.reactivestreams.v<? super T> vVar) {
            this.f299965a = vVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299966b.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299966b, wVar)) {
                this.f299966b = wVar;
                this.f299965a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299965a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299965a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299965a.onNext(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f299966b.request(j10);
        }
    }

    public p1(io.reactivex.l<T> lVar) {
        super(lVar);
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar));
    }
}
