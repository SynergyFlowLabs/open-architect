package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class n3<T> extends io.reactivex.k0<Boolean> implements ej.b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f299886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f299887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.d<? super T, ? super T> f299888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f299889d;

    static final class a<T> extends AtomicInteger implements io.reactivex.disposables.c, m3.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f299890h = -6178010334400373240L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Boolean> f299891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.d<? super T, ? super T> f299892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final m3.c<T> f299893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final m3.c<T> f299894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.util.c f299895e = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        T f299896f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        T f299897g;

        a(io.reactivex.n0<? super Boolean> n0Var, int i10, dj.d<? super T, ? super T> dVar) {
            this.f299891a = n0Var;
            this.f299892b = dVar;
            this.f299893c = new m3.c<>(this, i10);
            this.f299894d = new m3.c<>(this, i10);
        }

        @Override // io.reactivex.internal.operators.flowable.m3.b
        public void a(Throwable th2) {
            if (this.f299895e.a(th2)) {
                c();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        void b() {
            this.f299893c.a();
            this.f299893c.b();
            this.f299894d.a();
            this.f299894d.b();
        }

        @Override // io.reactivex.internal.operators.flowable.m3.b
        public void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                ej.o<T> oVar = this.f299893c.f299788e;
                ej.o<T> oVar2 = this.f299894d.f299788e;
                if (oVar != null && oVar2 != null) {
                    while (true) {
                        if (k()) {
                            this.f299893c.b();
                            this.f299894d.b();
                            return;
                        }
                        if (this.f299895e.get() != null) {
                            b();
                            this.f299891a.onError(this.f299895e.c());
                            return;
                        }
                        boolean z10 = this.f299893c.f299789f;
                        T tPoll = this.f299896f;
                        if (tPoll == null) {
                            try {
                                tPoll = oVar.poll();
                                this.f299896f = tPoll;
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                b();
                                this.f299895e.a(th2);
                                this.f299891a.onError(this.f299895e.c());
                                return;
                            }
                        }
                        boolean z11 = tPoll == null;
                        boolean z12 = this.f299894d.f299789f;
                        T tPoll2 = this.f299897g;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = oVar2.poll();
                                this.f299897g = tPoll2;
                            } catch (Throwable th3) {
                                io.reactivex.exceptions.b.b(th3);
                                b();
                                this.f299895e.a(th3);
                                this.f299891a.onError(this.f299895e.c());
                                return;
                            }
                        }
                        boolean z13 = tPoll2 == null;
                        if (z10 && z12 && z11 && z13) {
                            this.f299891a.b(Boolean.TRUE);
                            return;
                        }
                        if (!z10 || !z12 || z11 == z13) {
                            if (z11 || z13) {
                                break;
                                break;
                            }
                            try {
                                if (!this.f299892b.test(tPoll, tPoll2)) {
                                    b();
                                    this.f299891a.b(Boolean.FALSE);
                                    return;
                                } else {
                                    this.f299896f = null;
                                    this.f299897g = null;
                                    this.f299893c.c();
                                    this.f299894d.c();
                                }
                            } catch (Throwable th4) {
                                io.reactivex.exceptions.b.b(th4);
                                b();
                                this.f299895e.a(th4);
                                this.f299891a.onError(this.f299895e.c());
                                return;
                            }
                        } else {
                            b();
                            this.f299891a.b(Boolean.FALSE);
                            return;
                        }
                    }
                } else if (k()) {
                    this.f299893c.b();
                    this.f299894d.b();
                    return;
                } else if (this.f299895e.get() != null) {
                    b();
                    this.f299891a.onError(this.f299895e.c());
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        void d(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2) {
            uVar.e(this.f299893c);
            uVar2.e(this.f299894d);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f299893c.a();
            this.f299894d.a();
            if (getAndIncrement() == 0) {
                this.f299893c.b();
                this.f299894d.b();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f299893c.get() == io.reactivex.internal.subscriptions.j.CANCELLED;
        }
    }

    public n3(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2, dj.d<? super T, ? super T> dVar, int i10) {
        this.f299886a = uVar;
        this.f299887b = uVar2;
        this.f299888c = dVar;
        this.f299889d = i10;
    }

    @Override // io.reactivex.k0
    public void d1(io.reactivex.n0<? super Boolean> n0Var) {
        a aVar = new a(n0Var, this.f299889d, this.f299888c);
        n0Var.d(aVar);
        aVar.d(this.f299886a, this.f299887b);
    }

    @Override // ej.b
    public io.reactivex.l<Boolean> e() {
        return io.reactivex.plugins.a.P(new m3(this.f299886a, this.f299887b, this.f299888c, this.f299889d));
    }
}
