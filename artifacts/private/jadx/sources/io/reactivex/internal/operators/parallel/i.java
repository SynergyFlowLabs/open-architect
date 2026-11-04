package io.reactivex.internal.operators.parallel;

import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class i<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.parallel.b<? extends T> f302762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f302763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f302764d;

    static final class a<T> extends AtomicReference<w> implements q<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f302765f = 8410034718427740355L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c<T> f302766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f302767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f302768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f302769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile ej.n<T> f302770e;

        a(c<T> cVar, int i10) {
            this.f302766a = cVar;
            this.f302767b = i10;
            this.f302768c = i10 - (i10 >> 2);
        }

        public boolean a() {
            return io.reactivex.internal.subscriptions.j.b(this);
        }

        ej.n<T> b() {
            ej.n<T> bVar = this.f302770e;
            if (bVar == null) {
                bVar = new io.reactivex.internal.queue.b<>(this.f302767b);
                this.f302770e = bVar;
            }
            return bVar;
        }

        public void c(long j10) {
            long j11 = this.f302769d + j10;
            if (j11 < this.f302768c) {
                this.f302769d = j11;
            } else {
                this.f302769d = 0L;
                get().request(j11);
            }
        }

        public void d() {
            long j10 = this.f302769d + 1;
            if (j10 != this.f302768c) {
                this.f302769d = j10;
            } else {
                this.f302769d = 0L;
                get().request(j10);
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            io.reactivex.internal.subscriptions.j.o(this, wVar, this.f302767b);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f302766a.d();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f302766a.e(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f302766a.f(this, t10);
        }
    }

    static final class b<T> extends c<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f302771h = 6312374661811000451L;

        b(v<? super T> vVar, int i10, int i11) {
            super(vVar, i10, i11);
        }

        @Override // io.reactivex.internal.operators.parallel.i.c
        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            g();
        }

        @Override // io.reactivex.internal.operators.parallel.i.c
        public void d() {
            this.f302778f.decrementAndGet();
            c();
        }

        @Override // io.reactivex.internal.operators.parallel.i.c
        public void e(Throwable th2) {
            if (this.f302775c.compareAndSet(null, th2)) {
                a();
                c();
            } else {
                if (th2 != this.f302775c.get()) {
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
        
            if (decrementAndGet() == 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        
            if (getAndIncrement() != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
        
            g();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
        
            return;
         */
        @Override // io.reactivex.internal.operators.parallel.i.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void f(io.reactivex.internal.operators.parallel.i.a<T> r8, T r9) {
            /*
                r7 = this;
                int r0 = r7.get()
                java.lang.String r1 = "Queue full?!"
                if (r0 != 0) goto L75
                r0 = 0
                r2 = 1
                boolean r0 = r7.compareAndSet(r0, r2)
                if (r0 == 0) goto L75
                java.util.concurrent.atomic.AtomicLong r0 = r7.f302776d
                long r2 = r0.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r6 = 4
                if (r0 == 0) goto L43
                r6 = 5
                org.reactivestreams.v<? super T> r0 = r7.f302773a
                r0.onNext(r9)
                java.util.concurrent.atomic.AtomicLong r9 = r7.f302776d
                long r0 = r9.get()
                r6 = 0
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r6 = 1
                if (r9 == 0) goto L3b
                r6 = 2
                java.util.concurrent.atomic.AtomicLong r9 = r7.f302776d
                r6 = 0
                r9.decrementAndGet()
            L3b:
                r0 = 1
                r6 = 5
                r8.c(r0)
                r6 = 7
                goto L6e
            L43:
                ej.n r8 = r8.b()
                r6 = 4
                boolean r8 = r8.offer(r9)
                r6 = 7
                if (r8 != 0) goto L6e
                r7.a()
                r6 = 2
                io.reactivex.exceptions.c r8 = new io.reactivex.exceptions.c
                r8.<init>(r1)
                io.reactivex.internal.util.c r9 = r7.f302775c
                r0 = 0
                r6 = r0
                boolean r9 = r9.compareAndSet(r0, r8)
                if (r9 == 0) goto L69
                org.reactivestreams.v<? super T> r7 = r7.f302773a
                r7.onError(r8)
                r6 = 3
                return
            L69:
                io.reactivex.plugins.a.Y(r8)
                r6 = 7
                return
            L6e:
                int r8 = r7.decrementAndGet()
                if (r8 != 0) goto L96
                goto L94
            L75:
                r6 = 0
                ej.n r8 = r8.b()
                boolean r8 = r8.offer(r9)
                if (r8 != 0) goto L8e
                r7.a()
                r6 = 4
                io.reactivex.exceptions.c r8 = new io.reactivex.exceptions.c
                r8.<init>(r1)
                r6 = 6
                r7.e(r8)
                return
            L8e:
                int r8 = r7.getAndIncrement()
                if (r8 == 0) goto L96
            L94:
                r6 = 4
                return
            L96:
                r6 = 4
                r7.g()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.i.b.f(io.reactivex.internal.operators.parallel.i$a, java.lang.Object):void");
        }

        void g() {
            boolean z10;
            long j10;
            boolean z11;
            T tPoll;
            a<T>[] aVarArr = this.f302774b;
            int length = aVarArr.length;
            v<? super T> vVar = this.f302773a;
            int i10 = 1;
            while (true) {
                long j11 = this.f302776d.get();
                long j12 = 0;
                do {
                    z10 = false;
                    if (j12 == j11) {
                        j10 = 0;
                        break;
                    }
                    if (this.f302777e) {
                        b();
                        return;
                    }
                    Throwable th2 = this.f302775c.get();
                    if (th2 != null) {
                        b();
                        vVar.onError(th2);
                        return;
                    }
                    boolean z12 = this.f302778f.get() == 0;
                    z11 = true;
                    for (a<T> aVar : aVarArr) {
                        j10 = 0;
                        ej.n<T> nVar = aVar.f302770e;
                        if (nVar != null && (tPoll = nVar.poll()) != null) {
                            vVar.onNext(tPoll);
                            aVar.d();
                            j12++;
                            if (j12 == j11) {
                                break;
                            } else {
                                z11 = false;
                            }
                        }
                    }
                    j10 = 0;
                    if (z12 && z11) {
                        vVar.onComplete();
                        return;
                    }
                } while (!z11);
                if (j12 == j11) {
                    if (this.f302777e) {
                        b();
                        return;
                    }
                    Throwable th3 = this.f302775c.get();
                    if (th3 != null) {
                        b();
                        vVar.onError(th3);
                        return;
                    }
                    boolean z13 = this.f302778f.get() == 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            z10 = true;
                            break;
                        }
                        ej.n<T> nVar2 = aVarArr[i11].f302770e;
                        if (nVar2 != null && !nVar2.isEmpty()) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (z13 && z10) {
                        vVar.onComplete();
                        return;
                    }
                }
                if (j12 != j10 && j11 != Long.MAX_VALUE) {
                    this.f302776d.addAndGet(-j12);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i10 && (iAddAndGet = addAndGet(-i10)) == 0) {
                    return;
                } else {
                    i10 = iAddAndGet;
                }
            }
        }
    }

    static abstract class c<T> extends AtomicInteger implements w {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f302772g = 3100232009247827843L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super T> f302773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a<T>[] f302774b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f302777e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.util.c f302775c = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f302776d = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f302778f = new AtomicInteger();

        c(v<? super T> vVar, int i10, int i11) {
            this.f302773a = vVar;
            a<T>[] aVarArr = new a[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                aVarArr[i12] = new a<>(this, i11);
            }
            this.f302774b = aVarArr;
            this.f302778f.lazySet(i10);
        }

        void a() {
            for (a<T> aVar : this.f302774b) {
                aVar.a();
            }
        }

        void b() {
            for (a<T> aVar : this.f302774b) {
                aVar.f302770e = null;
            }
        }

        abstract void c();

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f302777e) {
                return;
            }
            this.f302777e = true;
            a();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        abstract void d();

        abstract void e(Throwable th2);

        abstract void f(a<T> aVar, T t10);

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f302776d, j10);
                c();
            }
        }
    }

    static final class d<T> extends c<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f302779h = -5737965195918321883L;

        d(v<? super T> vVar, int i10, int i11) {
            super(vVar, i10, i11);
        }

        @Override // io.reactivex.internal.operators.parallel.i.c
        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            g();
        }

        @Override // io.reactivex.internal.operators.parallel.i.c
        void d() {
            this.f302778f.decrementAndGet();
            c();
        }

        @Override // io.reactivex.internal.operators.parallel.i.c
        void e(Throwable th2) {
            this.f302775c.a(th2);
            this.f302778f.decrementAndGet();
            c();
        }

        @Override // io.reactivex.internal.operators.parallel.i.c
        void f(a<T> aVar, T t10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.f302776d.get() != 0) {
                    this.f302773a.onNext(t10);
                    if (this.f302776d.get() != Long.MAX_VALUE) {
                        this.f302776d.decrementAndGet();
                    }
                    aVar.c(1L);
                } else if (!aVar.b().offer(t10)) {
                    aVar.a();
                    this.f302775c.a(new io.reactivex.exceptions.c("Queue full?!"));
                    this.f302778f.decrementAndGet();
                    g();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!aVar.b().offer(t10) && aVar.a()) {
                    this.f302775c.a(new io.reactivex.exceptions.c("Queue full?!"));
                    this.f302778f.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            g();
        }

        void g() {
            boolean z10;
            long j10;
            boolean z11;
            T tPoll;
            a<T>[] aVarArr = this.f302774b;
            int length = aVarArr.length;
            v<? super T> vVar = this.f302773a;
            int i10 = 1;
            while (true) {
                long j11 = this.f302776d.get();
                long j12 = 0;
                do {
                    z10 = false;
                    if (j12 == j11) {
                        j10 = 0;
                        break;
                    }
                    if (this.f302777e) {
                        b();
                        return;
                    }
                    boolean z12 = this.f302778f.get() == 0;
                    z11 = true;
                    for (a<T> aVar : aVarArr) {
                        j10 = 0;
                        ej.n<T> nVar = aVar.f302770e;
                        if (nVar != null && (tPoll = nVar.poll()) != null) {
                            vVar.onNext(tPoll);
                            aVar.d();
                            j12++;
                            if (j12 == j11) {
                                break;
                            } else {
                                z11 = false;
                            }
                        }
                    }
                    j10 = 0;
                    if (z12 && z11) {
                        if (this.f302775c.get() != null) {
                            vVar.onError(this.f302775c.c());
                            return;
                        } else {
                            vVar.onComplete();
                            return;
                        }
                    }
                } while (!z11);
                if (j12 == j11) {
                    if (this.f302777e) {
                        b();
                        return;
                    }
                    boolean z13 = this.f302778f.get() == 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            z10 = true;
                            break;
                        }
                        ej.n<T> nVar2 = aVarArr[i11].f302770e;
                        if (nVar2 != null && !nVar2.isEmpty()) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (z13 && z10) {
                        if (this.f302775c.get() != null) {
                            vVar.onError(this.f302775c.c());
                            return;
                        } else {
                            vVar.onComplete();
                            return;
                        }
                    }
                }
                if (j12 != j10 && j11 != Long.MAX_VALUE) {
                    this.f302776d.addAndGet(-j12);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i10 && (iAddAndGet = addAndGet(-i10)) == 0) {
                    return;
                } else {
                    i10 = iAddAndGet;
                }
            }
        }
    }

    public i(io.reactivex.parallel.b<? extends T> bVar, int i10, boolean z10) {
        this.f302762b = bVar;
        this.f302763c = i10;
        this.f302764d = z10;
    }

    @Override // io.reactivex.l
    protected void k6(v<? super T> vVar) {
        c dVar = this.f302764d ? new d(vVar, this.f302762b.F(), this.f302763c) : new b(vVar, this.f302762b.F(), this.f302763c);
        vVar.l(dVar);
        this.f302762b.Q(dVar.f302774b);
    }
}
