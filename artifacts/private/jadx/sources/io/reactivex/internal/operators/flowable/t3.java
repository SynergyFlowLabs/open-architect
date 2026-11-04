package io.reactivex.internal.operators.flowable;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes10.dex */
public final class t3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f300244c;

    static final class a<T> extends ArrayDeque<T> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f300245d = -3807491841935125653L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f300247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f300248c;

        a(org.reactivestreams.v<? super T> vVar, int i10) {
            super(i10);
            this.f300246a = vVar;
            this.f300247b = i10;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300248c.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300248c, wVar)) {
                this.f300248c = wVar;
                this.f300246a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300246a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300246a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300247b == size()) {
                this.f300246a.onNext(poll());
            } else {
                this.f300248c.request(1L);
            }
            offer(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f300248c.request(j10);
        }
    }

    public t3(io.reactivex.l<T> lVar, int i10) {
        super(lVar);
        this.f300244c = i10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f300244c));
    }
}
