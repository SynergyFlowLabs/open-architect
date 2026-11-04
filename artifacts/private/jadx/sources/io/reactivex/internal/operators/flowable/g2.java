package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class g2<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.y<? extends T> f299417c;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f299418o = -4592979584110982903L;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final int f299419s = 1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final int f299420t = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f299422b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C2136a<T> f299423c = new C2136a<>(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f299424d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f299425e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f299426f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f299427g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile ej.n<T> f299428h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        T f299429i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f299430j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f299431k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile int f299432l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f299433m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f299434n;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.g2$a$a, reason: collision with other inner class name */
        static final class C2136a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f299435b = -2935427570954647017L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<T> f299436a;

            C2136a(a<T> aVar) {
                this.f299436a = aVar;
            }

            @Override // io.reactivex.v
            public void b(T t10) {
                this.f299436a.f(t10);
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.v
            public void onComplete() {
                this.f299436a.d();
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                this.f299436a.e(th2);
            }
        }

        a(org.reactivestreams.v<? super T> vVar) {
            this.f299421a = vVar;
            int iY = io.reactivex.l.Y();
            this.f299426f = iY;
            this.f299427g = iY - (iY >> 2);
        }

        void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        void b() {
            org.reactivestreams.v<? super T> vVar = this.f299421a;
            long j10 = this.f299433m;
            int i10 = this.f299434n;
            int i11 = this.f299427g;
            int i12 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.f299425e.get();
                while (j10 != j11) {
                    if (this.f299430j) {
                        this.f299429i = null;
                        this.f299428h = null;
                        return;
                    }
                    if (this.f299424d.get() != null) {
                        this.f299429i = null;
                        this.f299428h = null;
                        vVar.onError(this.f299424d.c());
                        return;
                    }
                    int i13 = this.f299432l;
                    if (i13 == i12) {
                        T t10 = this.f299429i;
                        this.f299429i = null;
                        this.f299432l = 2;
                        vVar.onNext(t10);
                        j10++;
                    } else {
                        boolean z10 = this.f299431k;
                        ej.n<T> nVar = this.f299428h;
                        a0.c cVarPoll = nVar != null ? nVar.poll() : null;
                        boolean z11 = cVarPoll == null;
                        if (z10 && z11 && i13 == 2) {
                            this.f299428h = null;
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
                                this.f299422b.get().request(i11);
                                i10 = 0;
                            }
                            i12 = 1;
                        }
                    }
                }
                if (j10 == j11) {
                    if (this.f299430j) {
                        this.f299429i = null;
                        this.f299428h = null;
                        return;
                    }
                    if (this.f299424d.get() != null) {
                        this.f299429i = null;
                        this.f299428h = null;
                        vVar.onError(this.f299424d.c());
                        return;
                    }
                    boolean z12 = this.f299431k;
                    ej.n<T> nVar2 = this.f299428h;
                    boolean z13 = nVar2 == null || nVar2.isEmpty();
                    if (z12 && z13 && this.f299432l == 2) {
                        this.f299428h = null;
                        vVar.onComplete();
                        return;
                    }
                }
                this.f299433m = j10;
                this.f299434n = i10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i12 = 1;
                }
            }
        }

        ej.n<T> c() {
            ej.n<T> nVar = this.f299428h;
            if (nVar != null) {
                return nVar;
            }
            io.reactivex.internal.queue.b bVar = new io.reactivex.internal.queue.b(io.reactivex.l.Y());
            this.f299428h = bVar;
            return bVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299430j = true;
            io.reactivex.internal.subscriptions.j.b(this.f299422b);
            io.reactivex.internal.disposables.d.b(this.f299423c);
            if (getAndIncrement() == 0) {
                this.f299428h = null;
                this.f299429i = null;
            }
        }

        void d() {
            this.f299432l = 2;
            a();
        }

        void e(Throwable th2) {
            if (!this.f299424d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.subscriptions.j.b(this.f299422b);
                a();
            }
        }

        void f(T t10) {
            if (compareAndSet(0, 1)) {
                long j10 = this.f299433m;
                if (this.f299425e.get() != j10) {
                    this.f299433m = j10 + 1;
                    this.f299421a.onNext(t10);
                    this.f299432l = 2;
                } else {
                    this.f299429i = t10;
                    this.f299432l = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.f299429i = t10;
                this.f299432l = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.o(this.f299422b, wVar, this.f299426f);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299431k = true;
            a();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f299424d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.subscriptions.j.b(this.f299422b);
                a();
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                long j10 = this.f299433m;
                if (this.f299425e.get() != j10) {
                    ej.n<T> nVar = this.f299428h;
                    if (nVar == null || nVar.isEmpty()) {
                        this.f299433m = j10 + 1;
                        this.f299421a.onNext(t10);
                        int i10 = this.f299434n + 1;
                        if (i10 == this.f299427g) {
                            this.f299434n = 0;
                            this.f299422b.get().request(i10);
                        } else {
                            this.f299434n = i10;
                        }
                    } else {
                        nVar.offer(t10);
                    }
                } else {
                    c().offer(t10);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                c().offer(t10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.util.d.a(this.f299425e, j10);
            a();
        }
    }

    public g2(io.reactivex.l<T> lVar, io.reactivex.y<? extends T> yVar) {
        super(lVar);
        this.f299417c = yVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        a aVar = new a(vVar);
        vVar.l(aVar);
        this.f299043b.j6(aVar);
        this.f299417c.a(aVar.f299423c);
    }
}
