package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class t4<T, B> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.l<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.u<B> f300249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f300250d;

    static final class a<T, B> extends io.reactivex.subscribers.b<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, B> f300251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f300252c;

        a(b<T, B> bVar) {
            this.f300251b = bVar;
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300252c) {
                return;
            }
            this.f300252c = true;
            this.f300251b.b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300252c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300252c = true;
                this.f300251b.c(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(B b10) {
            if (this.f300252c) {
                return;
            }
            this.f300251b.d();
        }
    }

    static final class b<T, B> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w, Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f300253m = 2233020065421370272L;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Object f300254n = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super io.reactivex.l<T>> f300255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f300256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a<T, B> f300257c = new a<>(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f300258d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicInteger f300259e = new AtomicInteger(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f300260f = new io.reactivex.internal.queue.a<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final io.reactivex.internal.util.c f300261g = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicBoolean f300262h = new AtomicBoolean();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicLong f300263i = new AtomicLong();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f300264j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        io.reactivex.processors.h<T> f300265k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f300266l;

        b(org.reactivestreams.v<? super io.reactivex.l<T>> vVar, int i10) {
            this.f300255a = vVar;
            this.f300256b = i10;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.v<? super io.reactivex.l<T>> vVar = this.f300255a;
            io.reactivex.internal.queue.a<Object> aVar = this.f300260f;
            io.reactivex.internal.util.c cVar = this.f300261g;
            long j10 = this.f300266l;
            int iAddAndGet = 1;
            while (this.f300259e.get() != 0) {
                io.reactivex.processors.h<T> hVar = this.f300265k;
                boolean z10 = this.f300264j;
                if (z10 && cVar.get() != null) {
                    aVar.clear();
                    Throwable thC = cVar.c();
                    if (hVar != null) {
                        this.f300265k = null;
                        hVar.onError(thC);
                    }
                    vVar.onError(thC);
                    return;
                }
                Object objPoll = aVar.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    Throwable thC2 = cVar.c();
                    if (thC2 == null) {
                        if (hVar != null) {
                            this.f300265k = null;
                            hVar.onComplete();
                        }
                        vVar.onComplete();
                        return;
                    }
                    if (hVar != null) {
                        this.f300265k = null;
                        hVar.onError(thC2);
                    }
                    vVar.onError(thC2);
                    return;
                }
                if (z11) {
                    this.f300266l = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f300254n) {
                    hVar.onNext((T) objPoll);
                } else {
                    if (hVar != null) {
                        this.f300265k = null;
                        hVar.onComplete();
                    }
                    if (!this.f300262h.get()) {
                        io.reactivex.processors.h<T> hVarU8 = io.reactivex.processors.h.U8(this.f300256b, this);
                        this.f300265k = hVarU8;
                        this.f300259e.getAndIncrement();
                        if (j10 != this.f300263i.get()) {
                            j10++;
                            vVar.onNext(hVarU8);
                        } else {
                            io.reactivex.internal.subscriptions.j.b(this.f300258d);
                            this.f300257c.dispose();
                            cVar.a(new io.reactivex.exceptions.c("Could not deliver a window due to lack of requests"));
                            this.f300264j = true;
                        }
                    }
                }
            }
            aVar.clear();
            this.f300265k = null;
        }

        void b() {
            io.reactivex.internal.subscriptions.j.b(this.f300258d);
            this.f300264j = true;
            a();
        }

        void c(Throwable th2) {
            io.reactivex.internal.subscriptions.j.b(this.f300258d);
            if (!this.f300261g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300264j = true;
                a();
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f300262h.compareAndSet(false, true)) {
                this.f300257c.dispose();
                if (this.f300259e.decrementAndGet() == 0) {
                    io.reactivex.internal.subscriptions.j.b(this.f300258d);
                }
            }
        }

        void d() {
            this.f300260f.offer(f300254n);
            a();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.o(this.f300258d, wVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300257c.dispose();
            this.f300264j = true;
            a();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300257c.dispose();
            if (!this.f300261g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300264j = true;
                a();
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f300260f.offer(t10);
            a();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.util.d.a(this.f300263i, j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f300259e.decrementAndGet() == 0) {
                io.reactivex.internal.subscriptions.j.b(this.f300258d);
            }
        }
    }

    public t4(io.reactivex.l<T> lVar, org.reactivestreams.u<B> uVar, int i10) {
        super(lVar);
        this.f300249c = uVar;
        this.f300250d = i10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super io.reactivex.l<T>> vVar) {
        b bVar = new b(vVar, this.f300250d);
        vVar.l(bVar);
        bVar.d();
        this.f300249c.e(bVar.f300257c);
        this.f299043b.j6(bVar);
    }
}
