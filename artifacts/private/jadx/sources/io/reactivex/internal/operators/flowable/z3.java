package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class z3<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> f300622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f300623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f300624e;

    static final class a<T, R> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<R> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f300625g = 3837284832786408377L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T, R> f300626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f300627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f300628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile ej.o<R> f300629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f300630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f300631f;

        a(b<T, R> bVar, long j10, int i10) {
            this.f300626a = bVar;
            this.f300627b = j10;
            this.f300628c = i10;
        }

        public void a() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.n(this, wVar)) {
                if (wVar instanceof ej.l) {
                    ej.l lVar = (ej.l) wVar;
                    int iP = lVar.p(7);
                    if (iP == 1) {
                        this.f300631f = iP;
                        this.f300629d = lVar;
                        this.f300630e = true;
                        this.f300626a.b();
                        return;
                    }
                    if (iP == 2) {
                        this.f300631f = iP;
                        this.f300629d = lVar;
                        wVar.request(this.f300628c);
                        return;
                    }
                }
                this.f300629d = new io.reactivex.internal.queue.b(this.f300628c);
                wVar.request(this.f300628c);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            b<T, R> bVar = this.f300626a;
            if (this.f300627b == bVar.f300644k) {
                this.f300630e = true;
                bVar.b();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            b<T, R> bVar = this.f300626a;
            if (this.f300627b != bVar.f300644k || !bVar.f300639f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!bVar.f300637d) {
                bVar.f300641h.cancel();
            }
            this.f300630e = true;
            bVar.b();
        }

        @Override // org.reactivestreams.v
        public void onNext(R r10) {
            b<T, R> bVar = this.f300626a;
            if (this.f300627b == bVar.f300644k) {
                if (this.f300631f != 0 || this.f300629d.offer(r10)) {
                    bVar.b();
                } else {
                    onError(new io.reactivex.exceptions.c("Queue full?!"));
                }
            }
        }
    }

    static final class b<T, R> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f300632l = -3491074160481096299L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final a<Object, Object> f300633m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f300634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> f300635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f300636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f300637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f300638e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f300640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        org.reactivestreams.w f300641h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile long f300644k;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicReference<a<T, R>> f300642i = new AtomicReference<>();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicLong f300643j = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.util.c f300639f = new io.reactivex.internal.util.c();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            f300633m = aVar;
            aVar.a();
        }

        b(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, boolean z10) {
            this.f300634a = vVar;
            this.f300635b = oVar;
            this.f300636c = i10;
            this.f300637d = z10;
        }

        void a() {
            a<T, R> andSet;
            a<T, R> aVar = this.f300642i.get();
            a<Object, Object> aVar2 = f300633m;
            if (aVar != aVar2 && (andSet = this.f300642i.getAndSet((a<T, R>) aVar2)) != aVar2 && andSet != null) {
                andSet.a();
            }
        }

        void b() {
            boolean z10;
            a0.c cVarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.v<? super R> vVar = this.f300634a;
            int iAddAndGet = 1;
            while (!this.f300640g) {
                if (this.f300638e) {
                    if (this.f300637d) {
                        if (this.f300642i.get() == null) {
                            if (this.f300639f.get() != null) {
                                vVar.onError(this.f300639f.c());
                                return;
                            } else {
                                vVar.onComplete();
                                return;
                            }
                        }
                    } else if (this.f300639f.get() != null) {
                        a();
                        vVar.onError(this.f300639f.c());
                        return;
                    } else if (this.f300642i.get() == null) {
                        vVar.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = this.f300642i.get();
                ej.o<R> oVar = aVar != null ? aVar.f300629d : null;
                if (oVar != null) {
                    if (aVar.f300630e) {
                        if (this.f300637d) {
                            if (oVar.isEmpty()) {
                                androidx.compose.animation.core.z1.a(this.f300642i, aVar, null);
                            }
                        } else if (this.f300639f.get() != null) {
                            a();
                            vVar.onError(this.f300639f.c());
                            return;
                        } else if (oVar.isEmpty()) {
                            androidx.compose.animation.core.z1.a(this.f300642i, aVar, null);
                        }
                    }
                    long j10 = this.f300643j.get();
                    long j11 = 0;
                    while (true) {
                        z10 = false;
                        if (j11 != j10) {
                            if (!this.f300640g) {
                                boolean z11 = aVar.f300630e;
                                try {
                                    cVarPoll = oVar.poll();
                                } catch (Throwable th2) {
                                    io.reactivex.exceptions.b.b(th2);
                                    aVar.a();
                                    this.f300639f.a(th2);
                                    cVarPoll = null;
                                    z11 = true;
                                }
                                boolean z12 = cVarPoll == null;
                                if (aVar == this.f300642i.get()) {
                                    if (z11) {
                                        if (this.f300637d) {
                                            if (z12) {
                                                androidx.compose.animation.core.z1.a(this.f300642i, aVar, null);
                                            }
                                        } else if (this.f300639f.get() != null) {
                                            vVar.onError(this.f300639f.c());
                                            return;
                                        } else if (z12) {
                                            androidx.compose.animation.core.z1.a(this.f300642i, aVar, null);
                                        }
                                    }
                                    if (z12) {
                                        break;
                                    }
                                    vVar.onNext(cVarPoll);
                                    j11++;
                                }
                                z10 = true;
                                break;
                            }
                            return;
                        }
                        break;
                    }
                    if (j11 != 0 && !this.f300640g) {
                        if (j10 != Long.MAX_VALUE) {
                            this.f300643j.addAndGet(-j11);
                        }
                        aVar.get().request(j11);
                    }
                    if (z10) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f300642i.lazySet(null);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f300640g) {
                return;
            }
            this.f300640g = true;
            this.f300641h.cancel();
            a();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300641h, wVar)) {
                this.f300641h = wVar;
                this.f300634a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300638e) {
                return;
            }
            this.f300638e = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300638e || !this.f300639f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f300637d) {
                a();
            }
            this.f300638e = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            a<T, R> aVar;
            if (this.f300638e) {
                return;
            }
            long j10 = this.f300644k + 1;
            this.f300644k = j10;
            a<T, R> aVar2 = this.f300642i.get();
            if (aVar2 != null) {
                aVar2.a();
            }
            try {
                org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300635b.apply(t10), "The publisher returned is null");
                a aVar3 = new a(this, j10, this.f300636c);
                do {
                    aVar = this.f300642i.get();
                    if (aVar == f300633m) {
                        return;
                    }
                } while (!androidx.compose.animation.core.z1.a(this.f300642i, aVar, aVar3));
                uVar.e(aVar3);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300641h.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f300643j, j10);
                if (this.f300644k == 0) {
                    this.f300641h.request(Long.MAX_VALUE);
                    return;
                }
                b();
            }
        }
    }

    public z3(io.reactivex.l<T> lVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, boolean z10) {
        super(lVar);
        this.f300622c = oVar;
        this.f300623d = i10;
        this.f300624e = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        if (j3.b(this.f299043b, vVar, this.f300622c)) {
            return;
        }
        this.f299043b.j6(new b(vVar, this.f300622c, this.f300623d, this.f300624e));
    }
}
