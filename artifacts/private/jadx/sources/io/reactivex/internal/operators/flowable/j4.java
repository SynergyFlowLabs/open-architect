package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class j4<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f299604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.j0 f299605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f299606f;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w, Runnable {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f299607o = -8296689127439125014L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f299610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0.c f299611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f299612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<T> f299613f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicLong f299614g = new AtomicLong();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        org.reactivestreams.w f299615h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f299616i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Throwable f299617j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f299618k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f299619l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f299620m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f299621n;

        a(org.reactivestreams.v<? super T> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0.c cVar, boolean z10) {
            this.f299608a = vVar;
            this.f299609b = j10;
            this.f299610c = timeUnit;
            this.f299611d = cVar;
            this.f299612e = z10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.f299613f;
                AtomicLong atomicLong = this.f299614g;
                org.reactivestreams.v<? super T> vVar = this.f299608a;
                int iAddAndGet = 1;
                while (!this.f299618k) {
                    boolean z10 = this.f299616i;
                    if (z10 && this.f299617j != null) {
                        atomicReference.lazySet(null);
                        vVar.onError(this.f299617j);
                        this.f299611d.dispose();
                        return;
                    }
                    boolean z11 = atomicReference.get() == null;
                    if (z10) {
                        if (z11 || !this.f299612e) {
                            atomicReference.lazySet(null);
                            vVar.onComplete();
                        } else {
                            T andSet = atomicReference.getAndSet(null);
                            long j10 = this.f299620m;
                            if (j10 != atomicLong.get()) {
                                this.f299620m = j10 + 1;
                                vVar.onNext(andSet);
                                vVar.onComplete();
                            } else {
                                vVar.onError(new io.reactivex.exceptions.c("Could not emit final value due to lack of requests"));
                            }
                        }
                        this.f299611d.dispose();
                        return;
                    }
                    if (z11) {
                        if (this.f299619l) {
                            this.f299621n = false;
                            this.f299619l = false;
                        }
                    } else if (!this.f299621n || this.f299619l) {
                        T andSet2 = atomicReference.getAndSet(null);
                        long j11 = this.f299620m;
                        if (j11 == atomicLong.get()) {
                            this.f299615h.cancel();
                            vVar.onError(new io.reactivex.exceptions.c("Could not emit value due to lack of requests"));
                            this.f299611d.dispose();
                            return;
                        } else {
                            vVar.onNext(andSet2);
                            this.f299620m = j11 + 1;
                            this.f299619l = false;
                            this.f299621n = true;
                            this.f299611d.c(this, this.f299609b, this.f299610c);
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                }
                atomicReference.lazySet(null);
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299618k = true;
            this.f299615h.cancel();
            this.f299611d.dispose();
            if (getAndIncrement() == 0) {
                this.f299613f.lazySet(null);
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299615h, wVar)) {
                this.f299615h = wVar;
                this.f299608a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299616i = true;
            a();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299617j = th2;
            this.f299616i = true;
            a();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299613f.set(t10);
            a();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299614g, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f299619l = true;
            a();
        }
    }

    public j4(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, boolean z10) {
        super(lVar);
        this.f299603c = j10;
        this.f299604d = timeUnit;
        this.f299605e = j0Var;
        this.f299606f = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299603c, this.f299604d, this.f299605e.c(), this.f299606f));
    }
}
