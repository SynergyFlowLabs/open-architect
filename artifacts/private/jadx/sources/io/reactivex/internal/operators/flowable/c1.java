package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class c1<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.y<? extends R>> f299148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f299149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f299150e;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f299151l = 8600231336733376951L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f299152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f299153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f299154c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.y<? extends R>> f299159h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        org.reactivestreams.w f299161j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f299162k;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f299155d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.disposables.b f299156e = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final io.reactivex.internal.util.c f299158g = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f299157f = new AtomicInteger(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicReference<io.reactivex.internal.queue.c<R>> f299160i = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.c1$a$a, reason: collision with other inner class name */
        final class C2130a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<R>, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f299163b = -502562646270949838L;

            C2130a() {
            }

            @Override // io.reactivex.v
            public void b(R r10) {
                a.this.g(this, r10);
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.disposables.c
            public void dispose() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.disposables.c
            public boolean k() {
                return io.reactivex.internal.disposables.d.c(get());
            }

            @Override // io.reactivex.v
            public void onComplete() {
                a.this.e(this);
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                a.this.f(this, th2);
            }
        }

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends io.reactivex.y<? extends R>> oVar, boolean z10, int i10) {
            this.f299152a = vVar;
            this.f299159h = oVar;
            this.f299153b = z10;
            this.f299154c = i10;
        }

        void a() {
            io.reactivex.internal.queue.c<R> cVar = this.f299160i.get();
            if (cVar != null) {
                cVar.clear();
            }
        }

        void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }

        void c() {
            org.reactivestreams.v<? super R> vVar = this.f299152a;
            AtomicInteger atomicInteger = this.f299157f;
            AtomicReference<io.reactivex.internal.queue.c<R>> atomicReference = this.f299160i;
            int iAddAndGet = 1;
            do {
                long j10 = this.f299155d.get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (this.f299162k) {
                        a();
                        return;
                    }
                    if (!this.f299153b && this.f299158g.get() != null) {
                        Throwable thC = this.f299158g.c();
                        a();
                        vVar.onError(thC);
                        return;
                    }
                    boolean z10 = atomicInteger.get() == 0;
                    io.reactivex.internal.queue.c<R> cVar = atomicReference.get();
                    a0.c cVarPoll = cVar != null ? cVar.poll() : null;
                    boolean z11 = cVarPoll == null;
                    if (z10 && z11) {
                        Throwable thC2 = this.f299158g.c();
                        if (thC2 != null) {
                            vVar.onError(thC2);
                            return;
                        } else {
                            vVar.onComplete();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    vVar.onNext(cVarPoll);
                    j11++;
                }
                if (j11 == j10) {
                    if (this.f299162k) {
                        a();
                        return;
                    }
                    if (!this.f299153b && this.f299158g.get() != null) {
                        Throwable thC3 = this.f299158g.c();
                        a();
                        vVar.onError(thC3);
                        return;
                    }
                    boolean z12 = atomicInteger.get() == 0;
                    io.reactivex.internal.queue.c<R> cVar2 = atomicReference.get();
                    boolean z13 = cVar2 == null || cVar2.isEmpty();
                    if (z12 && z13) {
                        Throwable thC4 = this.f299158g.c();
                        if (thC4 != null) {
                            vVar.onError(thC4);
                            return;
                        } else {
                            vVar.onComplete();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    io.reactivex.internal.util.d.e(this.f299155d, j11);
                    if (this.f299154c != Integer.MAX_VALUE) {
                        this.f299161j.request(j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299162k = true;
            this.f299161j.cancel();
            this.f299156e.dispose();
        }

        io.reactivex.internal.queue.c<R> d() {
            io.reactivex.internal.queue.c<R> cVar;
            do {
                io.reactivex.internal.queue.c<R> cVar2 = this.f299160i.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new io.reactivex.internal.queue.c<>(io.reactivex.l.Y());
            } while (!androidx.compose.animation.core.z1.a(this.f299160i, null, cVar));
            return cVar;
        }

        void e(a<T, R>.C2130a c2130a) {
            this.f299156e.b(c2130a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.f299157f.decrementAndGet() == 0;
                    io.reactivex.internal.queue.c<R> cVar = this.f299160i.get();
                    if (z10 && (cVar == null || cVar.isEmpty())) {
                        Throwable thC = this.f299158g.c();
                        if (thC != null) {
                            this.f299152a.onError(thC);
                            return;
                        } else {
                            this.f299152a.onComplete();
                            return;
                        }
                    }
                    if (this.f299154c != Integer.MAX_VALUE) {
                        this.f299161j.request(1L);
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    c();
                    return;
                }
            }
            this.f299157f.decrementAndGet();
            if (this.f299154c != Integer.MAX_VALUE) {
                this.f299161j.request(1L);
            }
            b();
        }

        void f(a<T, R>.C2130a c2130a, Throwable th2) {
            this.f299156e.b(c2130a);
            if (!this.f299158g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f299153b) {
                this.f299161j.cancel();
                this.f299156e.dispose();
            } else if (this.f299154c != Integer.MAX_VALUE) {
                this.f299161j.request(1L);
            }
            this.f299157f.decrementAndGet();
            b();
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
        
            if (decrementAndGet() == 0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
        
            if (getAndIncrement() != 0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a4, code lost:
        
            c();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void g(io.reactivex.internal.operators.flowable.c1.a<T, R>.C2130a r6, R r7) {
            /*
                r5 = this;
                io.reactivex.disposables.b r0 = r5.f299156e
                r0.b(r6)
                int r6 = r5.get()
                if (r6 != 0) goto L8d
                r6 = 0
                r0 = 1
                boolean r1 = r5.compareAndSet(r6, r0)
                if (r1 == 0) goto L8d
                java.util.concurrent.atomic.AtomicInteger r1 = r5.f299157f
                r4 = 4
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L1e
                r4 = 3
                r6 = r0
            L1e:
                java.util.concurrent.atomic.AtomicLong r0 = r5.f299155d
                r4 = 4
                long r0 = r0.get()
                r4 = 2
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r4 = 0
                if (r0 == 0) goto L77
                r4 = 5
                org.reactivestreams.v<? super R> r0 = r5.f299152a
                r0.onNext(r7)
                r4 = 3
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.c<R>> r7 = r5.f299160i
                java.lang.Object r7 = r7.get()
                r4 = 7
                io.reactivex.internal.queue.c r7 = (io.reactivex.internal.queue.c) r7
                r4 = 1
                if (r6 == 0) goto L5f
                if (r7 == 0) goto L48
                boolean r6 = r7.isEmpty()
                if (r6 == 0) goto L5f
            L48:
                io.reactivex.internal.util.c r6 = r5.f299158g
                java.lang.Throwable r6 = r6.c()
                r4 = 4
                if (r6 == 0) goto L58
                r4 = 7
                org.reactivestreams.v<? super R> r5 = r5.f299152a
                r5.onError(r6)
                return
            L58:
                org.reactivestreams.v<? super R> r5 = r5.f299152a
                r5.onComplete()
                r4 = 3
                return
            L5f:
                java.util.concurrent.atomic.AtomicLong r6 = r5.f299155d
                r4 = 7
                r0 = 1
                r0 = 1
                io.reactivex.internal.util.d.e(r6, r0)
                r4 = 6
                int r6 = r5.f299154c
                r7 = 2147483647(0x7fffffff, float:NaN)
                if (r6 == r7) goto L80
                org.reactivestreams.w r6 = r5.f299161j
                r6.request(r0)
                goto L80
            L77:
                io.reactivex.internal.queue.c r6 = r5.d()
                monitor-enter(r6)
                r6.offer(r7)     // Catch: java.lang.Throwable -> L88
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L88
            L80:
                int r6 = r5.decrementAndGet()
                r4 = 7
                if (r6 != 0) goto La4
                goto La2
            L88:
                r5 = move-exception
                r4 = 3
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L88
                r4 = 0
                throw r5
            L8d:
                io.reactivex.internal.queue.c r6 = r5.d()
                r4 = 6
                monitor-enter(r6)
                r6.offer(r7)     // Catch: java.lang.Throwable -> La9
                monitor-exit(r6)     // Catch: java.lang.Throwable -> La9
                java.util.concurrent.atomic.AtomicInteger r6 = r5.f299157f
                r6.decrementAndGet()
                int r6 = r5.getAndIncrement()
                if (r6 == 0) goto La4
            La2:
                r4 = 1
                return
            La4:
                r4 = 0
                r5.c()
                return
            La9:
                r5 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> La9
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.c1.a.g(io.reactivex.internal.operators.flowable.c1$a$a, java.lang.Object):void");
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299161j, wVar)) {
                this.f299161j = wVar;
                this.f299152a.l(this);
                int i10 = this.f299154c;
                if (i10 == Integer.MAX_VALUE) {
                    wVar.request(Long.MAX_VALUE);
                } else {
                    wVar.request(i10);
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299157f.decrementAndGet();
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299157f.decrementAndGet();
            if (!this.f299158g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f299153b) {
                this.f299156e.dispose();
            }
            b();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            try {
                io.reactivex.y yVar = (io.reactivex.y) io.reactivex.internal.functions.b.g(this.f299159h.apply(t10), "The mapper returned a null MaybeSource");
                this.f299157f.getAndIncrement();
                C2130a c2130a = new C2130a();
                if (this.f299162k || !this.f299156e.c(c2130a)) {
                    return;
                }
                yVar.a(c2130a);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f299161j.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299155d, j10);
                b();
            }
        }
    }

    public c1(io.reactivex.l<T> lVar, dj.o<? super T, ? extends io.reactivex.y<? extends R>> oVar, boolean z10, int i10) {
        super(lVar);
        this.f299148c = oVar;
        this.f299149d = z10;
        this.f299150e = i10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        this.f299043b.j6(new a(vVar, this.f299148c, this.f299149d, this.f299150e));
    }
}
