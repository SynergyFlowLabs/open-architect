package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class z0<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.y<? extends R>> f302657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f302658c;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f302659j = 8600231336733376951L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f302660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f302661b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.y<? extends R>> f302665f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.disposables.c f302667h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f302668i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.b f302662c = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.util.c f302664e = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f302663d = new AtomicInteger(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<io.reactivex.internal.queue.c<R>> f302666g = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.z0$a$a, reason: collision with other inner class name */
        final class C2182a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<R>, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f302669b = -502562646270949838L;

            C2182a() {
            }

            @Override // io.reactivex.v
            public void b(R r10) {
                a.this.h(this, r10);
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
                a.this.f(this);
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                a.this.g(this, th2);
            }
        }

        a(io.reactivex.i0<? super R> i0Var, dj.o<? super T, ? extends io.reactivex.y<? extends R>> oVar, boolean z10) {
            this.f302660a = i0Var;
            this.f302665f = oVar;
            this.f302661b = z10;
        }

        void a() {
            io.reactivex.internal.queue.c<R> cVar = this.f302666g.get();
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
            io.reactivex.i0<? super R> i0Var = this.f302660a;
            AtomicInteger atomicInteger = this.f302663d;
            AtomicReference<io.reactivex.internal.queue.c<R>> atomicReference = this.f302666g;
            int iAddAndGet = 1;
            while (!this.f302668i) {
                if (!this.f302661b && this.f302664e.get() != null) {
                    Throwable thC = this.f302664e.c();
                    a();
                    i0Var.onError(thC);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                io.reactivex.internal.queue.c<R> cVar = atomicReference.get();
                a0.c cVarPoll = cVar != null ? cVar.poll() : null;
                boolean z11 = cVarPoll == null;
                if (z10 && z11) {
                    Throwable thC2 = this.f302664e.c();
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
            if (io.reactivex.internal.disposables.d.q(this.f302667h, cVar)) {
                this.f302667h = cVar;
                this.f302660a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302668i = true;
            this.f302667h.dispose();
            this.f302662c.dispose();
        }

        io.reactivex.internal.queue.c<R> e() {
            io.reactivex.internal.queue.c<R> cVar;
            do {
                io.reactivex.internal.queue.c<R> cVar2 = this.f302666g.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new io.reactivex.internal.queue.c<>(io.reactivex.b0.T());
            } while (!androidx.compose.animation.core.z1.a(this.f302666g, null, cVar));
            return cVar;
        }

        void f(a<T, R>.C2182a c2182a) {
            this.f302662c.b(c2182a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.f302663d.decrementAndGet() == 0;
                    io.reactivex.internal.queue.c<R> cVar = this.f302666g.get();
                    if (!z10 || (cVar != null && !cVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        c();
                        return;
                    } else {
                        Throwable thC = this.f302664e.c();
                        if (thC != null) {
                            this.f302660a.onError(thC);
                            return;
                        } else {
                            this.f302660a.onComplete();
                            return;
                        }
                    }
                }
            }
            this.f302663d.decrementAndGet();
            b();
        }

        void g(a<T, R>.C2182a c2182a, Throwable th2) {
            this.f302662c.b(c2182a);
            if (!this.f302664e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f302661b) {
                this.f302667h.dispose();
                this.f302662c.dispose();
            }
            this.f302663d.decrementAndGet();
            b();
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0056  */
        /* JADX WARN: Code duplicated, block: B:29:0x006d A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        void h(a<T, R>.C2182a c2182a, R r10) {
            io.reactivex.internal.queue.c<R> cVarE;
            this.f302662c.b(c2182a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    this.f302660a.onNext(r10);
                    boolean z10 = this.f302663d.decrementAndGet() == 0;
                    io.reactivex.internal.queue.c<R> cVar = this.f302666g.get();
                    if (z10 && (cVar == null || cVar.isEmpty())) {
                        Throwable thC = this.f302664e.c();
                        if (thC != null) {
                            this.f302660a.onError(thC);
                            return;
                        } else {
                            this.f302660a.onComplete();
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    cVarE = e();
                    synchronized (cVarE) {
                        try {
                            cVarE.offer(r10);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    this.f302663d.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            } else {
                cVarE = e();
                synchronized (cVarE) {
                    cVarE.offer(r10);
                    this.f302663d.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            }
            c();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302668i;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302663d.decrementAndGet();
            b();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302663d.decrementAndGet();
            if (!this.f302664e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f302661b) {
                this.f302662c.dispose();
            }
            b();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            try {
                io.reactivex.y yVar = (io.reactivex.y) io.reactivex.internal.functions.b.g(this.f302665f.apply(t10), "The mapper returned a null MaybeSource");
                this.f302663d.getAndIncrement();
                C2182a c2182a = new C2182a();
                if (!this.f302668i && this.f302662c.c(c2182a)) {
                    yVar.a(c2182a);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302667h.dispose();
                onError(th2);
            }
        }
    }

    public z0(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends io.reactivex.y<? extends R>> oVar, boolean z10) {
        super(g0Var);
        this.f302657b = oVar;
        this.f302658c = z10;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super R> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302657b, this.f302658c));
    }
}
