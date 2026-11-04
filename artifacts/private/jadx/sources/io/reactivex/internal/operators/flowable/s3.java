package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class s3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f300166c;

    static final class a<T> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f300168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f300169c;

        a(org.reactivestreams.v<? super T> vVar, long j10) {
            this.f300167a = vVar;
            this.f300168b = j10;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300169c.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300169c, wVar)) {
                long j10 = this.f300168b;
                this.f300169c = wVar;
                this.f300167a.l(this);
                wVar.request(j10);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300167a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300167a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            long j10 = this.f300168b;
            if (j10 != 0) {
                this.f300168b = j10 - 1;
            } else {
                this.f300167a.onNext(t10);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f300169c.request(j10);
        }
    }

    public s3(io.reactivex.l<T> lVar, long j10) {
        super(lVar);
        this.f300166c = j10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f300166c));
    }
}
