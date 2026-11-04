package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.u<? extends io.reactivex.i> f298840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f298841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f298842c;

    static final class a extends AtomicInteger implements io.reactivex.q<io.reactivex.i>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f298843g = -2108443387387077490L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f298845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f298846c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.w f298849f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.disposables.b f298848e = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f298847d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.a0$a$a, reason: collision with other inner class name */
        final class C2123a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f298850b = 251330541679988317L;

            C2123a() {
            }

            @Override // io.reactivex.f
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

            @Override // io.reactivex.f
            public void onComplete() {
                a.this.a(this);
            }

            @Override // io.reactivex.f
            public void onError(Throwable th2) {
                a.this.b(this, th2);
            }
        }

        a(io.reactivex.f fVar, int i10, boolean z10) {
            this.f298844a = fVar;
            this.f298845b = i10;
            this.f298846c = z10;
            lazySet(1);
        }

        void a(C2123a c2123a) {
            this.f298848e.b(c2123a);
            if (decrementAndGet() != 0) {
                if (this.f298845b != Integer.MAX_VALUE) {
                    this.f298849f.request(1L);
                }
            } else {
                Throwable th2 = this.f298847d.get();
                if (th2 != null) {
                    this.f298844a.onError(th2);
                } else {
                    this.f298844a.onComplete();
                }
            }
        }

        void b(C2123a c2123a, Throwable th2) {
            this.f298848e.b(c2123a);
            if (!this.f298846c) {
                this.f298849f.cancel();
                this.f298848e.dispose();
                if (!this.f298847d.a(th2)) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                } else {
                    if (getAndSet(0) > 0) {
                        this.f298844a.onError(this.f298847d.c());
                        return;
                    }
                    return;
                }
            }
            if (!this.f298847d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else if (decrementAndGet() == 0) {
                this.f298844a.onError(this.f298847d.c());
            } else if (this.f298845b != Integer.MAX_VALUE) {
                this.f298849f.request(1L);
            }
        }

        @Override // org.reactivestreams.v
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.i iVar) {
            getAndIncrement();
            C2123a c2123a = new C2123a();
            this.f298848e.c(c2123a);
            iVar.b(c2123a);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f298849f.cancel();
            this.f298848e.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298848e.k();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f298849f, wVar)) {
                this.f298849f = wVar;
                this.f298844a.d(this);
                int i10 = this.f298845b;
                if (i10 == Integer.MAX_VALUE) {
                    wVar.request(Long.MAX_VALUE);
                    return;
                }
                wVar.request(i10);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (decrementAndGet() == 0) {
                if (this.f298847d.get() != null) {
                    this.f298844a.onError(this.f298847d.c());
                } else {
                    this.f298844a.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f298846c) {
                if (!this.f298847d.a(th2)) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                } else {
                    if (decrementAndGet() == 0) {
                        this.f298844a.onError(this.f298847d.c());
                        return;
                    }
                    return;
                }
            }
            this.f298848e.dispose();
            if (!this.f298847d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            int i10 = 5 | 0;
            if (getAndSet(0) > 0) {
                this.f298844a.onError(this.f298847d.c());
            }
        }
    }

    public a0(org.reactivestreams.u<? extends io.reactivex.i> uVar, int i10, boolean z10) {
        this.f298840a = uVar;
        this.f298841b = i10;
        this.f298842c = z10;
    }

    @Override // io.reactivex.c
    public void J0(io.reactivex.f fVar) {
        this.f298840a.e(new a(fVar, this.f298841b, this.f298842c));
    }
}
