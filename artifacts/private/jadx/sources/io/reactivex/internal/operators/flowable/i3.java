package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class i3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f299523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.j0 f299524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f299525f;

    static final class a<T> extends c<T> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f299526j = -7139995637533111443L;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicInteger f299527i;

        a(org.reactivestreams.v<? super T> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            super(vVar, j10, timeUnit, j0Var);
            this.f299527i = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.flowable.i3.c
        void b() {
            c();
            if (this.f299527i.decrementAndGet() == 0) {
                this.f299530a.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f299527i.incrementAndGet() == 2) {
                c();
                if (this.f299527i.decrementAndGet() == 0) {
                    this.f299530a.onComplete();
                }
            }
        }
    }

    static final class b<T> extends c<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f299528i = -7139995637533111443L;

        b(org.reactivestreams.v<? super T> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            super(vVar, j10, timeUnit, j0Var);
        }

        @Override // io.reactivex.internal.operators.flowable.i3.c
        void b() {
            this.f299530a.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            c();
        }
    }

    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.q<T>, org.reactivestreams.w, Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f299529h = -3517602651313910099L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f299532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0 f299533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f299534e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f299535f = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.w f299536g;

        c(org.reactivestreams.v<? super T> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f299530a = vVar;
            this.f299531b = j10;
            this.f299532c = timeUnit;
            this.f299533d = j0Var;
        }

        void a() {
            io.reactivex.internal.disposables.d.b(this.f299535f);
        }

        abstract void b();

        void c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f299534e.get() != 0) {
                    this.f299530a.onNext(andSet);
                    io.reactivex.internal.util.d.e(this.f299534e, 1L);
                } else {
                    cancel();
                    this.f299530a.onError(new io.reactivex.exceptions.c("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            a();
            this.f299536g.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299536g, wVar)) {
                this.f299536g = wVar;
                this.f299530a.l(this);
                io.reactivex.internal.disposables.h hVar = this.f299535f;
                io.reactivex.j0 j0Var = this.f299533d;
                long j10 = this.f299531b;
                hVar.a(j0Var.g(this, j10, j10, this.f299532c));
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            a();
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            a();
            this.f299530a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299534e, j10);
            }
        }
    }

    public i3(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, boolean z10) {
        super(lVar);
        this.f299522c = j10;
        this.f299523d = timeUnit;
        this.f299524e = j0Var;
        this.f299525f = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.subscribers.e eVar = new io.reactivex.subscribers.e(vVar);
        if (this.f299525f) {
            this.f299043b.j6(new a(eVar, this.f299522c, this.f299523d, this.f299524e));
        } else {
            this.f299043b.j6(new b(eVar, this.f299522c, this.f299523d, this.f299524e));
        }
    }
}
