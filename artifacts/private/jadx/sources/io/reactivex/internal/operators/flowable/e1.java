package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class e1<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.q0<? extends R>> f299286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f299287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f299288e;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f299289l = 8600231336733376951L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f299290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f299291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f299292c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.q0<? extends R>> f299297h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        org.reactivestreams.w f299299j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f299300k;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f299293d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.disposables.b f299294e = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final io.reactivex.internal.util.c f299296g = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f299295f = new AtomicInteger(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicReference<io.reactivex.internal.queue.c<R>> f299298i = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.e1$a$a, reason: collision with other inner class name */
        final class C2132a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<R>, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f299301b = -502562646270949838L;

            C2132a() {
            }

            @Override // io.reactivex.n0
            public void b(R r10) {
                a.this.f(this, r10);
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
                a.this.e(this, th2);
            }
        }

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends io.reactivex.q0<? extends R>> oVar, boolean z10, int i10) {
            this.f299290a = vVar;
            this.f299297h = oVar;
            this.f299291b = z10;
            this.f299292c = i10;
        }

        void a() {
            io.reactivex.internal.queue.c<R> cVar = this.f299298i.get();
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
            org.reactivestreams.v<? super R> vVar = this.f299290a;
            AtomicInteger atomicInteger = this.f299295f;
            AtomicReference<io.reactivex.internal.queue.c<R>> atomicReference = this.f299298i;
            int iAddAndGet = 1;
            do {
                long j10 = this.f299293d.get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (this.f299300k) {
                        a();
                        return;
                    }
                    if (!this.f299291b && this.f299296g.get() != null) {
                        Throwable thC = this.f299296g.c();
                        a();
                        vVar.onError(thC);
                        return;
                    }
                    boolean z10 = atomicInteger.get() == 0;
                    io.reactivex.internal.queue.c<R> cVar = atomicReference.get();
                    a0.c cVarPoll = cVar != null ? cVar.poll() : null;
                    boolean z11 = cVarPoll == null;
                    if (z10 && z11) {
                        Throwable thC2 = this.f299296g.c();
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
                    if (this.f299300k) {
                        a();
                        return;
                    }
                    if (!this.f299291b && this.f299296g.get() != null) {
                        Throwable thC3 = this.f299296g.c();
                        a();
                        vVar.onError(thC3);
                        return;
                    }
                    boolean z12 = atomicInteger.get() == 0;
                    io.reactivex.internal.queue.c<R> cVar2 = atomicReference.get();
                    boolean z13 = cVar2 == null || cVar2.isEmpty();
                    if (z12 && z13) {
                        Throwable thC4 = this.f299296g.c();
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
                    io.reactivex.internal.util.d.e(this.f299293d, j11);
                    if (this.f299292c != Integer.MAX_VALUE) {
                        this.f299299j.request(j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299300k = true;
            this.f299299j.cancel();
            this.f299294e.dispose();
        }

        io.reactivex.internal.queue.c<R> d() {
            io.reactivex.internal.queue.c<R> cVar;
            do {
                io.reactivex.internal.queue.c<R> cVar2 = this.f299298i.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new io.reactivex.internal.queue.c<>(io.reactivex.l.Y());
            } while (!androidx.compose.animation.core.z1.a(this.f299298i, null, cVar));
            return cVar;
        }

        void e(a<T, R>.C2132a c2132a, Throwable th2) {
            this.f299294e.b(c2132a);
            if (!this.f299296g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f299291b) {
                this.f299299j.cancel();
                this.f299294e.dispose();
            } else if (this.f299292c != Integer.MAX_VALUE) {
                this.f299299j.request(1L);
            }
            this.f299295f.decrementAndGet();
            b();
        }

        /* JADX WARN: Code duplicated, block: B:37:0x008b  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:50:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        void f(a<T, R>.C2132a c2132a, R r10) {
            io.reactivex.internal.queue.c<R> cVarD;
            this.f299294e.b(c2132a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.f299295f.decrementAndGet() == 0;
                    if (this.f299293d.get() != 0) {
                        this.f299290a.onNext(r10);
                        io.reactivex.internal.queue.c<R> cVar = this.f299298i.get();
                        if (z10 && (cVar == null || cVar.isEmpty())) {
                            Throwable thC = this.f299296g.c();
                            if (thC != null) {
                                this.f299290a.onError(thC);
                                return;
                            } else {
                                this.f299290a.onComplete();
                                return;
                            }
                        }
                        io.reactivex.internal.util.d.e(this.f299293d, 1L);
                        if (this.f299292c != Integer.MAX_VALUE) {
                            this.f299299j.request(1L);
                        }
                    } else {
                        io.reactivex.internal.queue.c<R> cVarD2 = d();
                        synchronized (cVarD2) {
                            try {
                                cVarD2.offer(r10);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    cVarD = d();
                    synchronized (cVarD) {
                        try {
                            cVarD.offer(r10);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    this.f299295f.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            } else {
                cVarD = d();
                synchronized (cVarD) {
                    cVarD.offer(r10);
                    this.f299295f.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            }
            c();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299299j, wVar)) {
                this.f299299j = wVar;
                this.f299290a.l(this);
                int i10 = this.f299292c;
                if (i10 == Integer.MAX_VALUE) {
                    wVar.request(Long.MAX_VALUE);
                } else {
                    wVar.request(i10);
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299295f.decrementAndGet();
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299295f.decrementAndGet();
            if (!this.f299296g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f299291b) {
                this.f299294e.dispose();
            }
            b();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            try {
                io.reactivex.q0 q0Var = (io.reactivex.q0) io.reactivex.internal.functions.b.g(this.f299297h.apply(t10), "The mapper returned a null SingleSource");
                this.f299295f.getAndIncrement();
                C2132a c2132a = new C2132a();
                if (this.f299300k || !this.f299294e.c(c2132a)) {
                    return;
                }
                q0Var.f(c2132a);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f299299j.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299293d, j10);
                b();
            }
        }
    }

    public e1(io.reactivex.l<T> lVar, dj.o<? super T, ? extends io.reactivex.q0<? extends R>> oVar, boolean z10, int i10) {
        super(lVar);
        this.f299286c = oVar;
        this.f299287d = z10;
        this.f299288e = i10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        this.f299043b.j6(new a(vVar, this.f299286c, this.f299287d, this.f299288e));
    }
}
