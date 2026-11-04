package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class n2<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    static final class a<T> extends AtomicLong implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f299882d = -3176480756392482682L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f299884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f299885c;

        a(org.reactivestreams.v<? super T> vVar) {
            this.f299883a = vVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299884b.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299884b, wVar)) {
                this.f299884b = wVar;
                this.f299883a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299885c) {
                return;
            }
            this.f299885c = true;
            this.f299883a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299885c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299885c = true;
                this.f299883a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299885c) {
                return;
            }
            if (get() == 0) {
                onError(new io.reactivex.exceptions.c("could not emit value due to lack of requests"));
            } else {
                this.f299883a.onNext(t10);
                io.reactivex.internal.util.d.e(this, 1L);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this, j10);
            }
        }
    }

    public n2(io.reactivex.l<T> lVar) {
        super(lVar);
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar));
    }
}
