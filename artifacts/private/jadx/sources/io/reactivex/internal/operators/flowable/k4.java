package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class k4<T> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.schedulers.d<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.j0 f299659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f299660d;

    static final class a<T> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super io.reactivex.schedulers.d<T>> f299661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TimeUnit f299662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.j0 f299663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.w f299664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f299665e;

        a(org.reactivestreams.v<? super io.reactivex.schedulers.d<T>> vVar, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f299661a = vVar;
            this.f299663c = j0Var;
            this.f299662b = timeUnit;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299664d.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299664d, wVar)) {
                this.f299665e = this.f299663c.d(this.f299662b);
                this.f299664d = wVar;
                this.f299661a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299661a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299661a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            long jD = this.f299663c.d(this.f299662b);
            long j10 = this.f299665e;
            this.f299665e = jD;
            this.f299661a.onNext(new io.reactivex.schedulers.d(t10, jD - j10, this.f299662b));
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f299664d.request(j10);
        }
    }

    public k4(io.reactivex.l<T> lVar, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        super(lVar);
        this.f299659c = j0Var;
        this.f299660d = timeUnit;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super io.reactivex.schedulers.d<T>> vVar) {
        this.f299043b.j6(new a(vVar, this.f299660d, this.f299659c));
    }
}
