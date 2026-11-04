package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.u<? extends io.reactivex.i> f298878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f298879b;

    static final class a extends AtomicInteger implements io.reactivex.q<io.reactivex.i>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f298880l = 9032184911934499404L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f298882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f298883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final C2125a f298884d = new C2125a(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicBoolean f298885e = new AtomicBoolean();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f298886f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f298887g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ej.o<io.reactivex.i> f298888h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        org.reactivestreams.w f298889i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f298890j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f298891k;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.d$a$a, reason: collision with other inner class name */
        static final class C2125a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f298892b = -5454794857847146511L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a f298893a;

            C2125a(a aVar) {
                this.f298893a = aVar;
            }

            @Override // io.reactivex.f
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.d(this, cVar);
            }

            @Override // io.reactivex.f
            public void onComplete() {
                this.f298893a.b();
            }

            @Override // io.reactivex.f
            public void onError(Throwable th2) {
                this.f298893a.c(th2);
            }
        }

        a(io.reactivex.f fVar, int i10) {
            this.f298881a = fVar;
            this.f298882b = i10;
            this.f298883c = i10 - (i10 >> 2);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!k()) {
                if (!this.f298891k) {
                    boolean z10 = this.f298890j;
                    try {
                        io.reactivex.i iVarPoll = this.f298888h.poll();
                        boolean z11 = iVarPoll == null;
                        if (z10 && z11) {
                            if (this.f298885e.compareAndSet(false, true)) {
                                this.f298881a.onComplete();
                                return;
                            }
                            return;
                        } else if (!z11) {
                            this.f298891k = true;
                            iVarPoll.b(this.f298884d);
                            e();
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        c(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        void b() {
            this.f298891k = false;
            a();
        }

        void c(Throwable th2) {
            if (!this.f298885e.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f298889i.cancel();
                this.f298881a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.i iVar) {
            if (this.f298886f != 0 || this.f298888h.offer(iVar)) {
                a();
            } else {
                onError(new io.reactivex.exceptions.c());
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f298889i.cancel();
            io.reactivex.internal.disposables.d.b(this.f298884d);
        }

        void e() {
            if (this.f298886f != 1) {
                int i10 = this.f298887g + 1;
                if (i10 != this.f298883c) {
                    this.f298887g = i10;
                } else {
                    this.f298887g = 0;
                    this.f298889i.request(i10);
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f298884d.get());
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f298889i, wVar)) {
                this.f298889i = wVar;
                int i10 = this.f298882b;
                long j10 = i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10;
                if (wVar instanceof ej.l) {
                    ej.l lVar = (ej.l) wVar;
                    int iP = lVar.p(3);
                    if (iP == 1) {
                        this.f298886f = iP;
                        this.f298888h = lVar;
                        this.f298890j = true;
                        this.f298881a.d(this);
                        a();
                        return;
                    }
                    if (iP == 2) {
                        this.f298886f = iP;
                        this.f298888h = lVar;
                        this.f298881a.d(this);
                        wVar.request(j10);
                        return;
                    }
                }
                if (this.f298882b == Integer.MAX_VALUE) {
                    this.f298888h = new io.reactivex.internal.queue.c(io.reactivex.l.Y());
                } else {
                    this.f298888h = new io.reactivex.internal.queue.b(this.f298882b);
                }
                this.f298881a.d(this);
                wVar.request(j10);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f298890j = true;
            a();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            boolean z10 = true & false;
            if (!this.f298885e.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.disposables.d.b(this.f298884d);
                this.f298881a.onError(th2);
            }
        }
    }

    public d(org.reactivestreams.u<? extends io.reactivex.i> uVar, int i10) {
        this.f298878a = uVar;
        this.f298879b = i10;
    }

    @Override // io.reactivex.c
    public void J0(io.reactivex.f fVar) {
        this.f298878a.e(new a(fVar, this.f298879b));
    }
}
