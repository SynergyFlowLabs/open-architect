package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class a1<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.q0<? extends R>> f301295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f301296c;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f301297j = 8600231336733376951L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f301298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f301299b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.q0<? extends R>> f301303f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.disposables.c f301305h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f301306i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.b f301300c = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.util.c f301302e = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f301301d = new AtomicInteger(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<io.reactivex.internal.queue.c<R>> f301304g = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.a1$a$a, reason: collision with other inner class name */
        final class C2166a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<R>, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f301307b = -502562646270949838L;

            C2166a() {
            }

            @Override // io.reactivex.n0
            public void b(R r10) {
                a.this.g(this, r10);
            }

            @Override // io.reactivex.n0
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

            @Override // io.reactivex.n0
            public void onError(Throwable th2) {
                a.this.f(this, th2);
            }
        }

        a(io.reactivex.i0<? super R> i0Var, dj.o<? super T, ? extends io.reactivex.q0<? extends R>> oVar, boolean z10) {
            this.f301298a = i0Var;
            this.f301303f = oVar;
            this.f301299b = z10;
        }

        void a() {
            io.reactivex.internal.queue.c<R> cVar = this.f301304g.get();
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
            io.reactivex.i0<? super R> i0Var = this.f301298a;
            AtomicInteger atomicInteger = this.f301301d;
            AtomicReference<io.reactivex.internal.queue.c<R>> atomicReference = this.f301304g;
            int i10 = 2 >> 1;
            int iAddAndGet = 1;
            while (!this.f301306i) {
                if (!this.f301299b && this.f301302e.get() != null) {
                    Throwable thC = this.f301302e.c();
                    a();
                    i0Var.onError(thC);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                io.reactivex.internal.queue.c<R> cVar = atomicReference.get();
                a0.c cVarPoll = cVar != null ? cVar.poll() : null;
                boolean z11 = cVarPoll == null;
                if (z10 && z11) {
                    Throwable thC2 = this.f301302e.c();
                    if (thC2 != null) {
                        i0Var.onError(thC2);
                        return;
                    } else {
                        i0Var.onComplete();
                        return;
                    }
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    i0Var.onNext(cVarPoll);
                }
            }
            a();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301305h, cVar)) {
                this.f301305h = cVar;
                this.f301298a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301306i = true;
            this.f301305h.dispose();
            this.f301300c.dispose();
        }

        io.reactivex.internal.queue.c<R> e() {
            io.reactivex.internal.queue.c<R> cVar;
            do {
                io.reactivex.internal.queue.c<R> cVar2 = this.f301304g.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new io.reactivex.internal.queue.c<>(io.reactivex.b0.T());
            } while (!androidx.compose.animation.core.z1.a(this.f301304g, null, cVar));
            return cVar;
        }

        void f(a<T, R>.C2166a c2166a, Throwable th2) {
            this.f301300c.b(c2166a);
            if (!this.f301302e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f301299b) {
                this.f301305h.dispose();
                this.f301300c.dispose();
            }
            this.f301301d.decrementAndGet();
            b();
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        
            if (getAndIncrement() != 0) goto L30;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void g(io.reactivex.internal.operators.observable.a1.a<T, R>.C2166a r4, R r5) {
            /*
                r3 = this;
                io.reactivex.disposables.b r0 = r3.f301300c
                r0.b(r4)
                r2 = 3
                int r4 = r3.get()
                r2 = 1
                if (r4 != 0) goto L59
                r4 = 0
                r2 = r4
                r0 = 1
                r2 = 5
                boolean r1 = r3.compareAndSet(r4, r0)
                if (r1 == 0) goto L59
                io.reactivex.i0<? super R> r1 = r3.f301298a
                r1.onNext(r5)
                java.util.concurrent.atomic.AtomicInteger r5 = r3.f301301d
                int r5 = r5.decrementAndGet()
                if (r5 != 0) goto L25
                r4 = r0
            L25:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.c<R>> r5 = r3.f301304g
                java.lang.Object r5 = r5.get()
                io.reactivex.internal.queue.c r5 = (io.reactivex.internal.queue.c) r5
                if (r4 == 0) goto L51
                r2 = 3
                if (r5 == 0) goto L3a
                r2 = 0
                boolean r4 = r5.isEmpty()
                r2 = 5
                if (r4 == 0) goto L51
            L3a:
                io.reactivex.internal.util.c r4 = r3.f301302e
                java.lang.Throwable r4 = r4.c()
                r2 = 3
                if (r4 == 0) goto L4a
                io.reactivex.i0<? super R> r3 = r3.f301298a
                r3.onError(r4)
                r2 = 6
                return
            L4a:
                io.reactivex.i0<? super R> r3 = r3.f301298a
                r3.onComplete()
                r2 = 6
                return
            L51:
                int r4 = r3.decrementAndGet()
                if (r4 != 0) goto L70
                r2 = 4
                goto L6e
            L59:
                io.reactivex.internal.queue.c r4 = r3.e()
                monitor-enter(r4)
                r4.offer(r5)     // Catch: java.lang.Throwable -> L74
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L74
                java.util.concurrent.atomic.AtomicInteger r4 = r3.f301301d
                r4.decrementAndGet()
                int r4 = r3.getAndIncrement()
                r2 = 2
                if (r4 == 0) goto L70
            L6e:
                r2 = 2
                return
            L70:
                r3.c()
                return
            L74:
                r3 = move-exception
                r2 = 4
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L74
                r2 = 5
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.a1.a.g(io.reactivex.internal.operators.observable.a1$a$a, java.lang.Object):void");
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301306i;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301301d.decrementAndGet();
            b();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301301d.decrementAndGet();
            if (!this.f301302e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f301299b) {
                this.f301300c.dispose();
            }
            b();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            try {
                io.reactivex.q0 q0Var = (io.reactivex.q0) io.reactivex.internal.functions.b.g(this.f301303f.apply(t10), "The mapper returned a null SingleSource");
                this.f301301d.getAndIncrement();
                C2166a c2166a = new C2166a();
                if (this.f301306i || !this.f301300c.c(c2166a)) {
                    return;
                }
                q0Var.f(c2166a);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301305h.dispose();
                onError(th2);
            }
        }
    }

    public a1(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends io.reactivex.q0<? extends R>> oVar, boolean z10) {
        super(g0Var);
        this.f301295b = oVar;
        this.f301296c = z10;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super R> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301295b, this.f301296c));
    }
}
