package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class b1<T> extends io.reactivex.c implements ej.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f299106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.i> f299107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f299108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f299109d;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f299110i = 8443155186132538303L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f299111a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.i> f299113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f299114d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f299116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.w f299117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f299118h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.util.c f299112b = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.disposables.b f299115e = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.b1$a$a, reason: collision with other inner class name */
        final class C2129a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f299119b = 8606673141535671828L;

            C2129a() {
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

        a(io.reactivex.f fVar, dj.o<? super T, ? extends io.reactivex.i> oVar, boolean z10, int i10) {
            this.f299111a = fVar;
            this.f299113c = oVar;
            this.f299114d = z10;
            this.f299116f = i10;
            lazySet(1);
        }

        void a(a<T>.C2129a c2129a) {
            this.f299115e.b(c2129a);
            onComplete();
        }

        void b(a<T>.C2129a c2129a, Throwable th2) {
            this.f299115e.b(c2129a);
            onError(th2);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f299118h = true;
            this.f299117g.cancel();
            this.f299115e.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f299115e.k();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299117g, wVar)) {
                this.f299117g = wVar;
                this.f299111a.d(this);
                int i10 = this.f299116f;
                if (i10 == Integer.MAX_VALUE) {
                    wVar.request(Long.MAX_VALUE);
                    return;
                }
                wVar.request(i10);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (decrementAndGet() != 0) {
                if (this.f299116f != Integer.MAX_VALUE) {
                    this.f299117g.request(1L);
                }
            } else {
                Throwable thC = this.f299112b.c();
                if (thC != null) {
                    this.f299111a.onError(thC);
                } else {
                    this.f299111a.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f299112b.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f299114d) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f299111a.onError(this.f299112b.c());
                    return;
                }
                return;
            }
            if (decrementAndGet() == 0) {
                this.f299111a.onError(this.f299112b.c());
            } else if (this.f299116f != Integer.MAX_VALUE) {
                this.f299117g.request(1L);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            try {
                io.reactivex.i iVar = (io.reactivex.i) io.reactivex.internal.functions.b.g(this.f299113c.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C2129a c2129a = new C2129a();
                if (!this.f299118h && this.f299115e.c(c2129a)) {
                    iVar.b(c2129a);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f299117g.cancel();
                onError(th2);
            }
        }
    }

    public b1(io.reactivex.l<T> lVar, dj.o<? super T, ? extends io.reactivex.i> oVar, boolean z10, int i10) {
        this.f299106a = lVar;
        this.f299107b = oVar;
        this.f299109d = z10;
        this.f299108c = i10;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f299106a.j6(new a(fVar, this.f299107b, this.f299109d, this.f299108c));
    }

    @Override // ej.b
    public io.reactivex.l<T> e() {
        return io.reactivex.plugins.a.P(new a1(this.f299106a, this.f299107b, this.f299109d, this.f299108c));
    }
}
