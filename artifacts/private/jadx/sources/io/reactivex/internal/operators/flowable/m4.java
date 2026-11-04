package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class m4<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f299792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.j0 f299793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f299794f;

    static final class a<T> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.subscriptions.i f299796b;

        a(org.reactivestreams.v<? super T> vVar, io.reactivex.internal.subscriptions.i iVar) {
            this.f299795a = vVar;
            this.f299796b = iVar;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            this.f299796b.h(wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299795a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299795a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299795a.onNext(t10);
        }
    }

    static final class b<T> extends io.reactivex.internal.subscriptions.i implements io.reactivex.q<T>, d {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final long f299797w = 3764492702657003550L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299798j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final long f299799k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final TimeUnit f299800l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final io.reactivex.j0.c f299801m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f299802n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f299803o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final AtomicLong f299804s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f299805t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        org.reactivestreams.u<? extends T> f299806v;

        b(org.reactivestreams.v<? super T> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0.c cVar, org.reactivestreams.u<? extends T> uVar) {
            super(true);
            this.f299798j = vVar;
            this.f299799k = j10;
            this.f299800l = timeUnit;
            this.f299801m = cVar;
            this.f299806v = uVar;
            this.f299802n = new io.reactivex.internal.disposables.h();
            this.f299803o = new AtomicReference<>();
            this.f299804s = new AtomicLong();
        }

        @Override // io.reactivex.internal.operators.flowable.m4.d
        public void b(long j10) {
            if (this.f299804s.compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.j.b(this.f299803o);
                long j11 = this.f299805t;
                if (j11 != 0) {
                    g(j11);
                }
                org.reactivestreams.u<? extends T> uVar = this.f299806v;
                this.f299806v = null;
                uVar.e(new a(this.f299798j, this));
                this.f299801m.dispose();
            }
        }

        @Override // io.reactivex.internal.subscriptions.i, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f299801m.dispose();
        }

        void i(long j10) {
            this.f299802n.a(this.f299801m.c(new e(j10, this), this.f299799k, this.f299800l));
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.n(this.f299803o, wVar)) {
                h(wVar);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299804s.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f299802n.dispose();
                this.f299798j.onComplete();
                this.f299801m.dispose();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299804s.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299802n.dispose();
            this.f299798j.onError(th2);
            this.f299801m.dispose();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            long j10 = this.f299804s.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = j10 + 1;
                if (this.f299804s.compareAndSet(j10, j11)) {
                    this.f299802n.get().dispose();
                    this.f299805t++;
                    this.f299798j.onNext(t10);
                    i(j11);
                }
            }
        }
    }

    static final class c<T> extends AtomicLong implements io.reactivex.q<T>, org.reactivestreams.w, d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f299807h = 3764492702657003550L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f299810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0.c f299811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f299812e = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f299813f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicLong f299814g = new AtomicLong();

        c(org.reactivestreams.v<? super T> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0.c cVar) {
            this.f299808a = vVar;
            this.f299809b = j10;
            this.f299810c = timeUnit;
            this.f299811d = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.m4.d
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.j.b(this.f299813f);
                this.f299808a.onError(new TimeoutException(io.reactivex.internal.util.k.e(this.f299809b, this.f299810c)));
                this.f299811d.dispose();
            }
        }

        void c(long j10) {
            this.f299812e.a(this.f299811d.c(new e(j10, this), this.f299809b, this.f299810c));
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this.f299813f);
            this.f299811d.dispose();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.d(this.f299813f, this.f299814g, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f299812e.dispose();
                this.f299808a.onComplete();
                this.f299811d.dispose();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299812e.dispose();
            this.f299808a.onError(th2);
            this.f299811d.dispose();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    this.f299812e.get().dispose();
                    this.f299808a.onNext(t10);
                    c(j11);
                }
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.subscriptions.j.c(this.f299813f, this.f299814g, j10);
        }
    }

    interface d {
        void b(long j10);
    }

    static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f299815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299816b;

        e(long j10, d dVar) {
            this.f299816b = j10;
            this.f299815a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f299815a.b(this.f299816b);
        }
    }

    public m4(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, org.reactivestreams.u<? extends T> uVar) {
        super(lVar);
        this.f299791c = j10;
        this.f299792d = timeUnit;
        this.f299793e = j0Var;
        this.f299794f = uVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        if (this.f299794f == null) {
            c cVar = new c(vVar, this.f299791c, this.f299792d, this.f299793e.c());
            vVar.l(cVar);
            cVar.c(0L);
            this.f299043b.j6(cVar);
            return;
        }
        b bVar = new b(vVar, this.f299791c, this.f299792d, this.f299793e.c(), this.f299794f);
        vVar.l(bVar);
        bVar.i(0L);
        this.f299043b.j6(bVar);
    }
}
