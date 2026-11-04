package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class c3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super io.reactivex.l<Object>, ? extends org.reactivestreams.u<?>> f299172c;

    static final class a<T> extends c<T, Object> {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f299173o = -2680129890138081029L;

        a(org.reactivestreams.v<? super T> vVar, io.reactivex.processors.c<Object> cVar, org.reactivestreams.w wVar) {
            super(vVar, cVar, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            i(0);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299182l.cancel();
            this.f299180j.onError(th2);
        }
    }

    static final class b<T, U> extends AtomicInteger implements io.reactivex.q<Object>, org.reactivestreams.w {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f299174e = 2827772011130406689L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.u<T> f299175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f299176b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicLong f299177c = new AtomicLong();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c<T, U> f299178d;

        b(org.reactivestreams.u<T> uVar) {
            this.f299175a = uVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this.f299176b);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.d(this.f299176b, this.f299177c, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299178d.cancel();
            this.f299178d.f299180j.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299178d.cancel();
            this.f299178d.f299180j.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f299176b.get() != io.reactivex.internal.subscriptions.j.CANCELLED) {
                    this.f299175a.e(this.f299178d);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.subscriptions.j.c(this.f299176b, this.f299177c, j10);
        }
    }

    static abstract class c<T, U> extends io.reactivex.internal.subscriptions.i implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final long f299179n = -5604623027276966720L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        protected final org.reactivestreams.v<? super T> f299180j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected final io.reactivex.processors.c<U> f299181k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        protected final org.reactivestreams.w f299182l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f299183m;

        c(org.reactivestreams.v<? super T> vVar, io.reactivex.processors.c<U> cVar, org.reactivestreams.w wVar) {
            super(false);
            this.f299180j = vVar;
            this.f299181k = cVar;
            this.f299182l = wVar;
        }

        @Override // io.reactivex.internal.subscriptions.i, org.reactivestreams.w
        public final void cancel() {
            super.cancel();
            this.f299182l.cancel();
        }

        protected final void i(U u10) {
            h(io.reactivex.internal.subscriptions.g.INSTANCE);
            long j10 = this.f299183m;
            if (j10 != 0) {
                this.f299183m = 0L;
                g(j10);
            }
            this.f299182l.request(1L);
            this.f299181k.onNext(u10);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public final void l(org.reactivestreams.w wVar) {
            h(wVar);
        }

        @Override // org.reactivestreams.v
        public final void onNext(T t10) {
            this.f299183m++;
            this.f299180j.onNext(t10);
        }
    }

    public c3(io.reactivex.l<T> lVar, dj.o<? super io.reactivex.l<Object>, ? extends org.reactivestreams.u<?>> oVar) {
        super(lVar);
        this.f299172c = oVar;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.subscribers.e eVar = new io.reactivex.subscribers.e(vVar);
        io.reactivex.processors.c<T> cVarQ8 = io.reactivex.processors.h.T8(8).Q8();
        try {
            org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f299172c.apply(cVarQ8), "handler returned a null Publisher");
            b bVar = new b(this.f299043b);
            a aVar = new a(eVar, cVarQ8, bVar);
            bVar.f299178d = aVar;
            vVar.l(aVar);
            uVar.e(bVar);
            bVar.onNext(0);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
