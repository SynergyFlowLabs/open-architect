package io.reactivex.internal.operators.flowable;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class b4<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f299131c;

    static final class a<T> extends ArrayDeque<T> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f299132h = 7240042530241604978L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f299134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f299135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f299136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f299137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f299138f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicInteger f299139g = new AtomicInteger();

        a(org.reactivestreams.v<? super T> vVar, int i10) {
            this.f299133a = vVar;
            this.f299134b = i10;
        }

        void c() {
            if (this.f299139g.getAndIncrement() == 0) {
                org.reactivestreams.v<? super T> vVar = this.f299133a;
                long jAddAndGet = this.f299138f.get();
                while (!this.f299137e) {
                    if (this.f299136d) {
                        long j10 = 0;
                        while (j10 != jAddAndGet) {
                            if (this.f299137e) {
                                return;
                            }
                            T tPoll = poll();
                            if (tPoll == null) {
                                vVar.onComplete();
                                return;
                            } else {
                                vVar.onNext(tPoll);
                                j10++;
                            }
                        }
                        if (j10 != 0 && jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.f299138f.addAndGet(-j10);
                        }
                    }
                    if (this.f299139g.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299137e = true;
            this.f299135c.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299135c, wVar)) {
                this.f299135c = wVar;
                this.f299133a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299136d = true;
            c();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299133a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299134b == size()) {
                poll();
            }
            offer(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299138f, j10);
                c();
            }
        }
    }

    public b4(io.reactivex.l<T> lVar, int i10) {
        super(lVar);
        this.f299131c = i10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299131c));
    }
}
