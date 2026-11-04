package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class x3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.j0 f300508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f300509d;

    static final class a<T> extends AtomicReference<Thread> implements io.reactivex.q<T>, org.reactivestreams.w, Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f300510g = 8094547886072529208L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.j0.c f300512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f300513c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f300514d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f300515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.u<T> f300516f;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.x3$a$a, reason: collision with other inner class name */
        static final class RunnableC2144a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final org.reactivestreams.w f300517a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final long f300518b;

            RunnableC2144a(org.reactivestreams.w wVar, long j10) {
                this.f300517a = wVar;
                this.f300518b = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f300517a.request(this.f300518b);
            }
        }

        a(org.reactivestreams.v<? super T> vVar, io.reactivex.j0.c cVar, org.reactivestreams.u<T> uVar, boolean z10) {
            this.f300511a = vVar;
            this.f300512b = cVar;
            this.f300516f = uVar;
            this.f300515e = !z10;
        }

        void a(long j10, org.reactivestreams.w wVar) {
            if (this.f300515e || Thread.currentThread() == get()) {
                wVar.request(j10);
            } else {
                this.f300512b.b(new RunnableC2144a(wVar, j10));
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this.f300513c);
            this.f300512b.dispose();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.n(this.f300513c, wVar)) {
                long andSet = this.f300514d.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, wVar);
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300511a.onComplete();
            this.f300512b.dispose();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300511a.onError(th2);
            this.f300512b.dispose();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f300511a.onNext(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                org.reactivestreams.w wVar = this.f300513c.get();
                if (wVar != null) {
                    a(j10, wVar);
                    return;
                }
                io.reactivex.internal.util.d.a(this.f300514d, j10);
                org.reactivestreams.w wVar2 = this.f300513c.get();
                if (wVar2 != null) {
                    long andSet = this.f300514d.getAndSet(0L);
                    if (andSet != 0) {
                        a(andSet, wVar2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            org.reactivestreams.u<T> uVar = this.f300516f;
            this.f300516f = null;
            uVar.e(this);
        }
    }

    public x3(io.reactivex.l<T> lVar, io.reactivex.j0 j0Var, boolean z10) {
        super(lVar);
        this.f300508c = j0Var;
        this.f300509d = z10;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.j0.c cVarC = this.f300508c.c();
        a aVar = new a(vVar, cVarC, this.f299043b, this.f300509d);
        vVar.l(aVar);
        cVarC.b(aVar);
    }
}
