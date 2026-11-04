package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class m3<T> extends io.reactivex.l<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f299772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f299773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.d<? super T, ? super T> f299774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f299775e;

    static final class a<T> extends io.reactivex.internal.subscriptions.f<Boolean> implements b {
        private static final long X = -6178010334400373240L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final dj.d<? super T, ? super T> f299776m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final c<T> f299777n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final c<T> f299778o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final io.reactivex.internal.util.c f299779s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final AtomicInteger f299780t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        T f299781v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        T f299782w;

        a(org.reactivestreams.v<? super Boolean> vVar, int i10, dj.d<? super T, ? super T> dVar) {
            super(vVar);
            this.f299776m = dVar;
            this.f299780t = new AtomicInteger();
            this.f299777n = new c<>(this, i10);
            this.f299778o = new c<>(this, i10);
            this.f299779s = new io.reactivex.internal.util.c();
        }

        @Override // io.reactivex.internal.operators.flowable.m3.b
        public void a(Throwable th2) {
            if (this.f299779s.a(th2)) {
                c();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.m3.b
        public void c() {
            if (this.f299780t.getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    ej.o<T> oVar = this.f299777n.f299788e;
                    ej.o<T> oVar2 = this.f299778o.f299788e;
                    if (oVar != null && oVar2 != null) {
                        while (true) {
                            if (g()) {
                                this.f299777n.b();
                                this.f299778o.b();
                                return;
                            }
                            if (this.f299779s.get() != null) {
                                i();
                                this.f303450b.onError(this.f299779s.c());
                                return;
                            }
                            boolean z10 = this.f299777n.f299789f;
                            T tPoll = this.f299781v;
                            if (tPoll == null) {
                                try {
                                    tPoll = oVar.poll();
                                    this.f299781v = tPoll;
                                } catch (Throwable th2) {
                                    io.reactivex.exceptions.b.b(th2);
                                    i();
                                    this.f299779s.a(th2);
                                    this.f303450b.onError(this.f299779s.c());
                                    return;
                                }
                            }
                            boolean z11 = tPoll == null;
                            boolean z12 = this.f299778o.f299789f;
                            T tPoll2 = this.f299782w;
                            if (tPoll2 == null) {
                                try {
                                    tPoll2 = oVar2.poll();
                                    this.f299782w = tPoll2;
                                } catch (Throwable th3) {
                                    io.reactivex.exceptions.b.b(th3);
                                    i();
                                    this.f299779s.a(th3);
                                    this.f303450b.onError(this.f299779s.c());
                                    return;
                                }
                            }
                            boolean z13 = tPoll2 == null;
                            if (z10 && z12 && z11 && z13) {
                                f(Boolean.TRUE);
                                return;
                            }
                            if (z10 && z12 && z11 != z13) {
                                i();
                                f(Boolean.FALSE);
                                return;
                            }
                            if (z11 || z13) {
                                break;
                            }
                            try {
                                if (!this.f299776m.test(tPoll, tPoll2)) {
                                    i();
                                    f(Boolean.FALSE);
                                    return;
                                } else {
                                    this.f299781v = null;
                                    this.f299782w = null;
                                    this.f299777n.c();
                                    this.f299778o.c();
                                }
                            } catch (Throwable th4) {
                                io.reactivex.exceptions.b.b(th4);
                                i();
                                this.f299779s.a(th4);
                                this.f303450b.onError(this.f299779s.c());
                                return;
                            }
                        }
                    } else if (g()) {
                        this.f299777n.b();
                        this.f299778o.b();
                        return;
                    } else if (this.f299779s.get() != null) {
                        i();
                        this.f303450b.onError(this.f299779s.c());
                        return;
                    }
                    iAddAndGet = this.f299780t.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f299777n.a();
            this.f299778o.a();
            if (this.f299780t.getAndIncrement() == 0) {
                this.f299777n.b();
                this.f299778o.b();
            }
        }

        void i() {
            this.f299777n.a();
            this.f299777n.b();
            this.f299778o.a();
            this.f299778o.b();
        }

        void j(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2) {
            uVar.e(this.f299777n);
            uVar2.e(this.f299778o);
        }
    }

    interface b {
        void a(Throwable th2);

        void c();
    }

    static final class c<T> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f299783h = 4804128302091633067L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f299784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f299785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f299786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f299787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile ej.o<T> f299788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f299789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f299790g;

        c(b bVar, int i10) {
            this.f299784a = bVar;
            this.f299786c = i10 - (i10 >> 2);
            this.f299785b = i10;
        }

        public void a() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        void b() {
            ej.o<T> oVar = this.f299788e;
            if (oVar != null) {
                oVar.clear();
            }
        }

        public void c() {
            if (this.f299790g != 1) {
                long j10 = this.f299787d + 1;
                if (j10 >= this.f299786c) {
                    this.f299787d = 0L;
                    get().request(j10);
                    return;
                }
                this.f299787d = j10;
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.n(this, wVar)) {
                if (wVar instanceof ej.l) {
                    ej.l lVar = (ej.l) wVar;
                    int iP = lVar.p(3);
                    if (iP == 1) {
                        this.f299790g = iP;
                        this.f299788e = lVar;
                        this.f299789f = true;
                        this.f299784a.c();
                        return;
                    }
                    if (iP == 2) {
                        this.f299790g = iP;
                        this.f299788e = lVar;
                        wVar.request(this.f299785b);
                        return;
                    }
                }
                this.f299788e = new io.reactivex.internal.queue.b(this.f299785b);
                wVar.request(this.f299785b);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299789f = true;
            this.f299784a.c();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299784a.a(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299790g != 0 || this.f299788e.offer(t10)) {
                this.f299784a.c();
            } else {
                onError(new io.reactivex.exceptions.c());
            }
        }
    }

    public m3(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2, dj.d<? super T, ? super T> dVar, int i10) {
        this.f299772b = uVar;
        this.f299773c = uVar2;
        this.f299774d = dVar;
        this.f299775e = i10;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super Boolean> vVar) {
        a aVar = new a(vVar, this.f299775e, this.f299774d);
        vVar.l(aVar);
        aVar.j(this.f299772b, this.f299773c);
    }
}
