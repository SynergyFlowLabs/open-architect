package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class h3<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<T> f299493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.u<?> f299494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f299495d;

    static final class a<T> extends c<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f299496i = -3029755663834015785L;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicInteger f299497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f299498h;

        a(org.reactivestreams.v<? super T> vVar, org.reactivestreams.u<?> uVar) {
            super(vVar, uVar);
            this.f299497g = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.h3.c
        void b() {
            this.f299498h = true;
            if (this.f299497g.getAndIncrement() == 0) {
                d();
                this.f299501a.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.h3.c
        void c() {
            this.f299498h = true;
            if (this.f299497g.getAndIncrement() == 0) {
                d();
                this.f299501a.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.h3.c
        void f() {
            if (this.f299497g.getAndIncrement() == 0) {
                do {
                    boolean z10 = this.f299498h;
                    d();
                    if (z10) {
                        this.f299501a.onComplete();
                        return;
                    }
                } while (this.f299497g.decrementAndGet() != 0);
            }
        }
    }

    static final class b<T> extends c<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f299499g = -3029755663834015785L;

        b(org.reactivestreams.v<? super T> vVar, org.reactivestreams.u<?> uVar) {
            super(vVar, uVar);
        }

        @Override // io.reactivex.internal.operators.flowable.h3.c
        void b() {
            this.f299501a.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.h3.c
        void c() {
            this.f299501a.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.h3.c
        void f() {
            d();
        }
    }

    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f299500f = -3517602651313910099L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.u<?> f299502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicLong f299503c = new AtomicLong();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f299504d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.w f299505e;

        c(org.reactivestreams.v<? super T> vVar, org.reactivestreams.u<?> uVar) {
            this.f299501a = vVar;
            this.f299502b = uVar;
        }

        public void a() {
            this.f299505e.cancel();
            c();
        }

        abstract void b();

        abstract void c();

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this.f299504d);
            this.f299505e.cancel();
        }

        void d() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f299503c.get() != 0) {
                    this.f299501a.onNext(andSet);
                    io.reactivex.internal.util.d.e(this.f299503c, 1L);
                } else {
                    cancel();
                    this.f299501a.onError(new io.reactivex.exceptions.c("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        public void e(Throwable th2) {
            this.f299505e.cancel();
            this.f299501a.onError(th2);
        }

        abstract void f();

        void g(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.o(this.f299504d, wVar, Long.MAX_VALUE);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299505e, wVar)) {
                this.f299505e = wVar;
                this.f299501a.l(this);
                if (this.f299504d.get() == null) {
                    this.f299502b.e(new d(this));
                    wVar.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            io.reactivex.internal.subscriptions.j.b(this.f299504d);
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            io.reactivex.internal.subscriptions.j.b(this.f299504d);
            this.f299501a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299503c, j10);
            }
        }
    }

    static final class d<T> implements io.reactivex.q<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c<T> f299506a;

        d(c<T> cVar) {
            this.f299506a = cVar;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            this.f299506a.g(wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299506a.a();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299506a.e(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            this.f299506a.f();
        }
    }

    public h3(org.reactivestreams.u<T> uVar, org.reactivestreams.u<?> uVar2, boolean z10) {
        this.f299493b = uVar;
        this.f299494c = uVar2;
        this.f299495d = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.subscribers.e eVar = new io.reactivex.subscribers.e(vVar);
        if (this.f299495d) {
            this.f299493b.e(new a(eVar, this.f299494c));
        } else {
            this.f299493b.e(new b(eVar, this.f299494c));
        }
    }
}
