package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class u3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f300321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f300322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.j0 f300323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f300324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f300325g;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f300326l = -5677354903406201275L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f300328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f300329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0 f300330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.queue.c<Object> f300331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f300332f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.w f300333g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicLong f300334h = new AtomicLong();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f300335i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f300336j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Throwable f300337k;

        a(org.reactivestreams.v<? super T> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10, boolean z10) {
            this.f300327a = vVar;
            this.f300328b = j10;
            this.f300329c = timeUnit;
            this.f300330d = j0Var;
            this.f300331e = new io.reactivex.internal.queue.c<>(i10);
            this.f300332f = z10;
        }

        boolean a(boolean z10, boolean z11, org.reactivestreams.v<? super T> vVar, boolean z12) {
            if (this.f300335i) {
                this.f300331e.clear();
                return true;
            }
            if (z10) {
                if (!z12) {
                    Throwable th2 = this.f300337k;
                    if (th2 != null) {
                        this.f300331e.clear();
                        vVar.onError(th2);
                        return true;
                    }
                    if (z11) {
                        vVar.onComplete();
                        return true;
                    }
                } else if (z11) {
                    Throwable th3 = this.f300337k;
                    if (th3 != null) {
                        vVar.onError(th3);
                    } else {
                        vVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        void b() {
            long j10;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.v<? super T> vVar = this.f300327a;
            io.reactivex.internal.queue.c<Object> cVar = this.f300331e;
            boolean z10 = this.f300332f;
            TimeUnit timeUnit = this.f300329c;
            io.reactivex.j0 j0Var = this.f300330d;
            long j11 = this.f300328b;
            int iAddAndGet = 1;
            do {
                long j12 = this.f300334h.get();
                long j13 = 0;
                while (true) {
                    if (j13 == j12) {
                        j10 = 0;
                        break;
                    }
                    boolean z11 = this.f300336j;
                    Long l10 = (Long) cVar.peek();
                    boolean z12 = l10 == null;
                    boolean z13 = (z12 || l10.longValue() <= j0Var.d(timeUnit) - j11) ? z12 : true;
                    j10 = 0;
                    if (a(z11, z13, vVar, z10)) {
                        return;
                    }
                    if (z13) {
                        break;
                    }
                    cVar.poll();
                    vVar.onNext(cVar.poll());
                    j13++;
                }
                if (j13 != j10) {
                    io.reactivex.internal.util.d.e(this.f300334h, j13);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f300335i) {
                return;
            }
            this.f300335i = true;
            this.f300333g.cancel();
            if (getAndIncrement() == 0) {
                this.f300331e.clear();
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300333g, wVar)) {
                this.f300333g = wVar;
                this.f300327a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300336j = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300337k = th2;
            this.f300336j = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f300331e.r(Long.valueOf(this.f300330d.d(this.f300329c)), t10);
            b();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f300334h, j10);
                b();
            }
        }
    }

    public u3(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10, boolean z10) {
        super(lVar);
        this.f300321c = j10;
        this.f300322d = timeUnit;
        this.f300323e = j0Var;
        this.f300324f = i10;
        this.f300325g = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f300321c, this.f300322d, this.f300323e, this.f300324f, this.f300325g));
    }
}
