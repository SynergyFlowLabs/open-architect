package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class v4<T, B> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.l<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends org.reactivestreams.u<B>> f300403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f300404d;

    static final class a<T, B> extends io.reactivex.subscribers.b<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, B> f300405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f300406c;

        a(b<T, B> bVar) {
            this.f300405b = bVar;
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300406c) {
                return;
            }
            this.f300406c = true;
            this.f300405b.c();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300406c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300406c = true;
                this.f300405b.d(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(B b10) {
            if (this.f300406c) {
                return;
            }
            this.f300406c = true;
            dispose();
            this.f300405b.e(this);
        }
    }

    static final class b<T, B> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w, Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final long f300407n = 2233020065421370272L;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final a<Object, Object> f300408o = new a<>(null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final Object f300409s = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super io.reactivex.l<T>> f300410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f300411b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Callable<? extends org.reactivestreams.u<B>> f300417h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        org.reactivestreams.w f300419j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f300420k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        io.reactivex.processors.h<T> f300421l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f300422m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<a<T, B>> f300412c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f300413d = new AtomicInteger(1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f300414e = new io.reactivex.internal.queue.a<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.util.c f300415f = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicBoolean f300416g = new AtomicBoolean();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicLong f300418i = new AtomicLong();

        b(org.reactivestreams.v<? super io.reactivex.l<T>> vVar, int i10, Callable<? extends org.reactivestreams.u<B>> callable) {
            this.f300410a = vVar;
            this.f300411b = i10;
            this.f300417h = callable;
        }

        void a() {
            AtomicReference<a<T, B>> atomicReference = this.f300412c;
            a<Object, Object> aVar = f300408o;
            a<T, B> andSet = atomicReference.getAndSet((a<T, B>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.dispose();
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.v<? super io.reactivex.l<T>> vVar = this.f300410a;
            io.reactivex.internal.queue.a<Object> aVar = this.f300414e;
            io.reactivex.internal.util.c cVar = this.f300415f;
            long j10 = this.f300422m;
            int iAddAndGet = 1;
            while (this.f300413d.get() != 0) {
                io.reactivex.processors.h<T> hVar = this.f300421l;
                boolean z10 = this.f300420k;
                if (z10 && cVar.get() != null) {
                    aVar.clear();
                    Throwable thC = cVar.c();
                    if (hVar != null) {
                        this.f300421l = null;
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
                            this.f300421l = null;
                            hVar.onComplete();
                        }
                        vVar.onComplete();
                        return;
                    }
                    if (hVar != null) {
                        this.f300421l = null;
                        hVar.onError(thC2);
                    }
                    vVar.onError(thC2);
                    return;
                }
                if (z11) {
                    this.f300422m = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f300409s) {
                    hVar.onNext((T) objPoll);
                } else {
                    if (hVar != null) {
                        this.f300421l = null;
                        hVar.onComplete();
                    }
                    if (!this.f300416g.get()) {
                        if (j10 != this.f300418i.get()) {
                            io.reactivex.processors.h<T> hVarU8 = io.reactivex.processors.h.U8(this.f300411b, this);
                            this.f300421l = hVarU8;
                            this.f300413d.getAndIncrement();
                            try {
                                org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300417h.call(), "The other Callable returned a null Publisher");
                                a aVar2 = new a(this);
                                if (androidx.compose.animation.core.z1.a(this.f300412c, null, aVar2)) {
                                    uVar.e(aVar2);
                                    j10++;
                                    vVar.onNext(hVarU8);
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                cVar.a(th2);
                                this.f300420k = true;
                            }
                        } else {
                            this.f300419j.cancel();
                            a();
                            cVar.a(new io.reactivex.exceptions.c("Could not deliver a window due to lack of requests"));
                            this.f300420k = true;
                        }
                    }
                }
            }
            aVar.clear();
            this.f300421l = null;
        }

        void c() {
            this.f300419j.cancel();
            this.f300420k = true;
            b();
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f300416g.compareAndSet(false, true)) {
                a();
                if (this.f300413d.decrementAndGet() == 0) {
                    this.f300419j.cancel();
                }
            }
        }

        void d(Throwable th2) {
            this.f300419j.cancel();
            if (!this.f300415f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300420k = true;
                b();
            }
        }

        void e(a<T, B> aVar) {
            androidx.compose.animation.core.z1.a(this.f300412c, aVar, null);
            this.f300414e.offer(f300409s);
            b();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300419j, wVar)) {
                this.f300419j = wVar;
                this.f300410a.l(this);
                this.f300414e.offer(f300409s);
                b();
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            a();
            this.f300420k = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            a();
            if (!this.f300415f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300420k = true;
                b();
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f300414e.offer(t10);
            b();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.util.d.a(this.f300418i, j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f300413d.decrementAndGet() == 0) {
                this.f300419j.cancel();
            }
        }
    }

    public v4(io.reactivex.l<T> lVar, Callable<? extends org.reactivestreams.u<B>> callable, int i10) {
        super(lVar);
        this.f300403c = callable;
        this.f300404d = i10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super io.reactivex.l<T>> vVar) {
        this.f299043b.j6(new b(vVar, this.f300404d, this.f300403c));
    }
}
