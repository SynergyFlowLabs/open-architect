package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class a1<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.i> f299050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f299051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f299052e;

    static final class a<T> extends io.reactivex.internal.subscriptions.c<T> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f299053j = 8443155186132538303L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299054b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.i> f299056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f299057e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f299059g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        org.reactivestreams.w f299060h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f299061i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.util.c f299055c = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.disposables.b f299058f = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.a1$a$a, reason: collision with other inner class name */
        final class C2128a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f299062b = 8606673141535671828L;

            C2128a() {
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
                a.this.f(this);
            }

            @Override // io.reactivex.f
            public void onError(Throwable th2) {
                a.this.g(this, th2);
            }
        }

        a(org.reactivestreams.v<? super T> vVar, dj.o<? super T, ? extends io.reactivex.i> oVar, boolean z10, int i10) {
            this.f299054b = vVar;
            this.f299056d = oVar;
            this.f299057e = z10;
            this.f299059g = i10;
            lazySet(1);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299061i = true;
            this.f299060h.cancel();
            this.f299058f.dispose();
        }

        @Override // ej.o
        public void clear() {
        }

        void f(a<T>.C2128a c2128a) {
            this.f299058f.b(c2128a);
            onComplete();
        }

        void g(a<T>.C2128a c2128a, Throwable th2) {
            this.f299058f.b(c2128a);
            onError(th2);
        }

        @Override // ej.o
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299060h, wVar)) {
                this.f299060h = wVar;
                this.f299054b.l(this);
                int i10 = this.f299059g;
                if (i10 == Integer.MAX_VALUE) {
                    wVar.request(Long.MAX_VALUE);
                } else {
                    wVar.request(i10);
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (decrementAndGet() != 0) {
                if (this.f299059g != Integer.MAX_VALUE) {
                    this.f299060h.request(1L);
                }
            } else {
                Throwable thC = this.f299055c.c();
                if (thC != null) {
                    this.f299054b.onError(thC);
                } else {
                    this.f299054b.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f299055c.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f299057e) {
                cancel();
                if (getAndSet(0) > 0) {
                    this.f299054b.onError(this.f299055c.c());
                    return;
                }
                return;
            }
            if (decrementAndGet() == 0) {
                this.f299054b.onError(this.f299055c.c());
            } else if (this.f299059g != Integer.MAX_VALUE) {
                this.f299060h.request(1L);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            try {
                io.reactivex.i iVar = (io.reactivex.i) io.reactivex.internal.functions.b.g(this.f299056d.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C2128a c2128a = new C2128a();
                if (this.f299061i || !this.f299058f.c(c2128a)) {
                    return;
                }
                iVar.b(c2128a);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f299060h.cancel();
                onError(th2);
            }
        }

        @Override // ej.k
        public int p(int i10) {
            return i10 & 2;
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            return null;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
        }
    }

    public a1(io.reactivex.l<T> lVar, dj.o<? super T, ? extends io.reactivex.i> oVar, boolean z10, int i10) {
        super(lVar);
        this.f299050c = oVar;
        this.f299052e = z10;
        this.f299051d = i10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299050c, this.f299052e, this.f299051d));
    }
}
