package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class a2<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299064c;

    static final class a<T> extends AtomicLong implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f299065d = 2288246011222124525L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f299067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f299068c;

        a(org.reactivestreams.v<? super T> vVar, long j10) {
            this.f299066a = vVar;
            this.f299067b = j10;
            lazySet(j10);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299068c.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299068c, wVar)) {
                if (this.f299067b == 0) {
                    wVar.cancel();
                    io.reactivex.internal.subscriptions.g.b(this.f299066a);
                } else {
                    this.f299068c = wVar;
                    this.f299066a.l(this);
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299067b > 0) {
                this.f299067b = 0L;
                this.f299066a.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299067b <= 0) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299067b = 0L;
                this.f299066a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            long j10 = this.f299067b;
            if (j10 > 0) {
                long j11 = j10 - 1;
                this.f299067b = j11;
                this.f299066a.onNext(t10);
                if (j11 == 0) {
                    this.f299068c.cancel();
                    this.f299066a.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            long j11;
            long j12;
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                do {
                    j11 = get();
                    if (j11 == 0) {
                        return;
                    } else {
                        j12 = j11 <= j10 ? j11 : j10;
                    }
                } while (!compareAndSet(j11, j11 - j12));
                this.f299068c.request(j12);
            }
        }
    }

    public a2(io.reactivex.l<T> lVar, long j10) {
        super(lVar);
        this.f299064c = j10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299064c));
    }
}
