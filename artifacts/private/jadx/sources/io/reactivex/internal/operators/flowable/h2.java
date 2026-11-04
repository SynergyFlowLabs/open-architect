package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class h2<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f299473c;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f299474o = -4592979584110982903L;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final int f299475s = 1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final int f299476t = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f299478b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C2137a<T> f299479c = new C2137a<>(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f299480d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f299481e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f299482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f299483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile ej.n<T> f299484h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        T f299485i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f299486j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f299487k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile int f299488l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f299489m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f299490n;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.h2$a$a, reason: collision with other inner class name */
        static final class C2137a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f299491b = -2935427570954647017L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<T> f299492a;

            C2137a(a<T> aVar) {
                this.f299492a = aVar;
            }

            @Override // io.reactivex.n0
            public void b(T t10) {
                this.f299492a.e(t10);
            }

            @Override // io.reactivex.n0
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.n0
            public void onError(Throwable th2) {
                this.f299492a.d(th2);
            }
        }

        a(org.reactivestreams.v<? super T> vVar) {
            this.f299477a = vVar;
            int iY = io.reactivex.l.Y();
            this.f299482f = iY;
            this.f299483g = iY - (iY >> 2);
        }

        void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        void b() {
            org.reactivestreams.v<? super T> vVar = this.f299477a;
            long j10 = this.f299489m;
            int i10 = this.f299490n;
            int i11 = this.f299483g;
            int i12 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.f299481e.get();
                while (j10 != j11) {
                    if (this.f299486j) {
                        this.f299485i = null;
                        this.f299484h = null;
                        return;
                    }
                    if (this.f299480d.get() != null) {
                        this.f299485i = null;
                        this.f299484h = null;
                        vVar.onError(this.f299480d.c());
                        return;
                    }
                    int i13 = this.f299488l;
                    if (i13 == i12) {
                        T t10 = this.f299485i;
                        this.f299485i = null;
                        this.f299488l = 2;
                        vVar.onNext(t10);
                        j10++;
                    } else {
                        boolean z10 = this.f299487k;
                        ej.n<T> nVar = this.f299484h;
                        a0.c cVarPoll = nVar != null ? nVar.poll() : null;
                        boolean z11 = cVarPoll == null;
                        if (z10 && z11 && i13 == 2) {
                            this.f299484h = null;
                            vVar.onComplete();
                            return;
                        } else {
                            if (z11) {
                                break;
                            }
                            vVar.onNext(cVarPoll);
                            j10++;
                            i10++;
                            if (i10 == i11) {
                                this.f299478b.get().request(i11);
                                i10 = 0;
                            }
                            i12 = 1;
                        }
                    }
                }
                if (j10 == j11) {
                    if (this.f299486j) {
                        this.f299485i = null;
                        this.f299484h = null;
                        return;
                    }
                    if (this.f299480d.get() != null) {
                        this.f299485i = null;
                        this.f299484h = null;
                        vVar.onError(this.f299480d.c());
                        return;
                    }
                    boolean z12 = this.f299487k;
                    ej.n<T> nVar2 = this.f299484h;
                    boolean z13 = nVar2 == null || nVar2.isEmpty();
                    if (z12 && z13 && this.f299488l == 2) {
                        this.f299484h = null;
                        vVar.onComplete();
                        return;
                    }
                }
                this.f299489m = j10;
                this.f299490n = i10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i12 = 1;
                }
            }
        }

        ej.n<T> c() {
            ej.n<T> bVar = this.f299484h;
            if (bVar == null) {
                bVar = new io.reactivex.internal.queue.b<>(io.reactivex.l.Y());
                this.f299484h = bVar;
            }
            return bVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299486j = true;
            io.reactivex.internal.subscriptions.j.b(this.f299478b);
            io.reactivex.internal.disposables.d.b(this.f299479c);
            if (getAndIncrement() == 0) {
                this.f299484h = null;
                this.f299485i = null;
            }
        }

        void d(Throwable th2) {
            if (!this.f299480d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.subscriptions.j.b(this.f299478b);
                a();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
        
            if (getAndIncrement() != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
        
            if (decrementAndGet() == 0) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void e(T r8) {
            /*
                r7 = this;
                r0 = 0
                r6 = 7
                r1 = 1
                boolean r0 = r7.compareAndSet(r0, r1)
                r6 = 3
                if (r0 == 0) goto L3a
                long r2 = r7.f299489m
                java.util.concurrent.atomic.AtomicLong r0 = r7.f299481e
                r6 = 6
                long r4 = r0.get()
                r6 = 1
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                r6 = 1
                if (r0 == 0) goto L2e
                r0 = 1
                r0 = 1
                r6 = 0
                long r2 = r2 + r0
                r6 = 2
                r7.f299489m = r2
                r6 = 2
                org.reactivestreams.v<? super T> r0 = r7.f299477a
                r0.onNext(r8)
                r8 = 2
                r6 = 0
                r7.f299488l = r8
                r6 = 1
                goto L48
            L2e:
                r7.f299485i = r8
                r7.f299488l = r1
                r6 = 6
                int r8 = r7.decrementAndGet()
                if (r8 != 0) goto L48
                goto L46
            L3a:
                r6 = 1
                r7.f299485i = r8
                r7.f299488l = r1
                int r8 = r7.getAndIncrement()
                r6 = 1
                if (r8 == 0) goto L48
            L46:
                r6 = 0
                return
            L48:
                r7.b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.h2.a.e(java.lang.Object):void");
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.o(this.f299478b, wVar, this.f299482f);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299487k = true;
            a();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f299480d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.subscriptions.j.b(this.f299478b);
                a();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        
            if (decrementAndGet() == 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        
            if (getAndIncrement() != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        
            b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
        
            return;
         */
        @Override // org.reactivestreams.v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onNext(T r8) {
            /*
                r7 = this;
                r0 = 0
                r1 = 1
                boolean r2 = r7.compareAndSet(r0, r1)
                r6 = 5
                if (r2 == 0) goto L61
                long r2 = r7.f299489m
                r6 = 2
                java.util.concurrent.atomic.AtomicLong r4 = r7.f299481e
                long r4 = r4.get()
                r6 = 3
                int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                r6 = 2
                if (r4 == 0) goto L51
                ej.n<T> r4 = r7.f299484h
                if (r4 == 0) goto L29
                r6 = 3
                boolean r5 = r4.isEmpty()
                r6 = 0
                if (r5 == 0) goto L25
                goto L29
            L25:
                r4.offer(r8)
                goto L59
            L29:
                r4 = 1
                r6 = 0
                long r2 = r2 + r4
                r7.f299489m = r2
                org.reactivestreams.v<? super T> r2 = r7.f299477a
                r2.onNext(r8)
                int r8 = r7.f299490n
                int r8 = r8 + r1
                r6 = 1
                int r1 = r7.f299483g
                if (r8 != r1) goto L4d
                r7.f299490n = r0
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.w> r0 = r7.f299478b
                java.lang.Object r0 = r0.get()
                r6 = 2
                org.reactivestreams.w r0 = (org.reactivestreams.w) r0
                long r1 = (long) r8
                r6 = 4
                r0.request(r1)
                goto L59
            L4d:
                r7.f299490n = r8
                r6 = 3
                goto L59
            L51:
                ej.n r0 = r7.c()
                r6 = 2
                r0.offer(r8)
            L59:
                int r8 = r7.decrementAndGet()
                r6 = 0
                if (r8 != 0) goto L72
                goto L70
            L61:
                r6 = 6
                ej.n r0 = r7.c()
                r0.offer(r8)
                int r8 = r7.getAndIncrement()
                r6 = 2
                if (r8 == 0) goto L72
            L70:
                r6 = 2
                return
            L72:
                r7.b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.h2.a.onNext(java.lang.Object):void");
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.util.d.a(this.f299481e, j10);
            a();
        }
    }

    public h2(io.reactivex.l<T> lVar, io.reactivex.q0<? extends T> q0Var) {
        super(lVar);
        this.f299473c = q0Var;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        a aVar = new a(vVar);
        vVar.l(aVar);
        this.f299043b.j6(aVar);
        this.f299473c.f(aVar.f299479c);
    }
}
