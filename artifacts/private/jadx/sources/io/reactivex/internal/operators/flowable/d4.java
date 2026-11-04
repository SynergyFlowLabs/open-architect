package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class d4<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f299254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f299255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.j0 f299256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f299257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f299258h;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f299259m = -5677354903406201275L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f299262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f299263d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.j0 f299264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.queue.c<Object> f299265f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f299266g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        org.reactivestreams.w f299267h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicLong f299268i = new AtomicLong();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f299269j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f299270k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Throwable f299271l;

        a(org.reactivestreams.v<? super T> vVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10, boolean z10) {
            this.f299260a = vVar;
            this.f299261b = j10;
            this.f299262c = j11;
            this.f299263d = timeUnit;
            this.f299264e = j0Var;
            this.f299265f = new io.reactivex.internal.queue.c<>(i10);
            this.f299266g = z10;
        }

        boolean a(boolean z10, org.reactivestreams.v<? super T> vVar, boolean z11) {
            if (this.f299269j) {
                this.f299265f.clear();
                return true;
            }
            if (!z11) {
                Throwable th2 = this.f299271l;
                if (th2 != null) {
                    this.f299265f.clear();
                    vVar.onError(th2);
                    return true;
                }
                if (z10) {
                    vVar.onComplete();
                    return true;
                }
            } else if (z10) {
                Throwable th3 = this.f299271l;
                if (th3 != null) {
                    vVar.onError(th3);
                } else {
                    vVar.onComplete();
                }
                return true;
            }
            return false;
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.v<? super T> vVar = this.f299260a;
            io.reactivex.internal.queue.c<Object> cVar = this.f299265f;
            boolean z10 = this.f299266g;
            int iAddAndGet = 1;
            do {
                if (this.f299270k) {
                    if (a(cVar.isEmpty(), vVar, z10)) {
                        return;
                    }
                    long j10 = this.f299268i.get();
                    long j11 = 0;
                    while (true) {
                        if (a(cVar.peek() == null, vVar, z10)) {
                            return;
                        }
                        if (j10 == j11) {
                            if (j11 == 0) {
                                break;
                            }
                            io.reactivex.internal.util.d.e(this.f299268i, j11);
                            break;
                        } else {
                            cVar.poll();
                            vVar.onNext(cVar.poll());
                            j11++;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        void c(long j10, io.reactivex.internal.queue.c<Object> cVar) {
            long j11 = this.f299262c;
            long j12 = this.f299261b;
            boolean z10 = j12 == Long.MAX_VALUE;
            while (!cVar.isEmpty()) {
                if (((Long) cVar.peek()).longValue() >= j10 - j11 && (z10 || (cVar.m() >> 1) <= j12)) {
                    return;
                }
                cVar.poll();
                cVar.poll();
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f299269j) {
                return;
            }
            this.f299269j = true;
            this.f299267h.cancel();
            if (getAndIncrement() == 0) {
                this.f299265f.clear();
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299267h, wVar)) {
                this.f299267h = wVar;
                this.f299260a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            c(this.f299264e.d(this.f299263d), this.f299265f);
            this.f299270k = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299266g) {
                c(this.f299264e.d(this.f299263d), this.f299265f);
            }
            this.f299271l = th2;
            this.f299270k = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            io.reactivex.internal.queue.c<Object> cVar = this.f299265f;
            long jD = this.f299264e.d(this.f299263d);
            cVar.r(Long.valueOf(jD), t10);
            c(jD, cVar);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299268i, j10);
                b();
            }
        }
    }

    public d4(io.reactivex.l<T> lVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10, boolean z10) {
        super(lVar);
        this.f299253c = j10;
        this.f299254d = j11;
        this.f299255e = timeUnit;
        this.f299256f = j0Var;
        this.f299257g = i10;
        this.f299258h = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299253c, this.f299254d, this.f299255e, this.f299256f, this.f299257g, this.f299258h));
    }
}
