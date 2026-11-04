package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class i1<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<U> f300833b;

    static final class a<T, U> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f300834c = -2187421758664251153L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C2152a<U> f300836b = new C2152a<>(this);

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.i1$a$a, reason: collision with other inner class name */
        static final class C2152a<U> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<U> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f300837b = -1266041316834525931L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, U> f300838a;

            C2152a(a<?, U> aVar) {
                this.f300838a = aVar;
            }

            @Override // io.reactivex.q, org.reactivestreams.v
            public void l(org.reactivestreams.w wVar) {
                io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.v
            public void onComplete() {
                this.f300838a.a();
            }

            @Override // org.reactivestreams.v
            public void onError(Throwable th2) {
                this.f300838a.c(th2);
            }

            @Override // org.reactivestreams.v
            public void onNext(Object obj) {
                io.reactivex.internal.subscriptions.j.b(this);
                this.f300838a.a();
            }
        }

        a(io.reactivex.v<? super T> vVar) {
            this.f300835a = vVar;
        }

        void a() {
            if (io.reactivex.internal.disposables.d.b(this)) {
                this.f300835a.onComplete();
            }
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            io.reactivex.internal.subscriptions.j.b(this.f300836b);
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f300835a.b(t10);
            }
        }

        void c(Throwable th2) {
            if (io.reactivex.internal.disposables.d.b(this)) {
                this.f300835a.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
            io.reactivex.internal.subscriptions.j.b(this.f300836b);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.v
        public void onComplete() {
            io.reactivex.internal.subscriptions.j.b(this.f300836b);
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f300835a.onComplete();
            }
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            io.reactivex.internal.subscriptions.j.b(this.f300836b);
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f300835a.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    public i1(io.reactivex.y<T> yVar, org.reactivestreams.u<U> uVar) {
        super(yVar);
        this.f300833b = uVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        a aVar = new a(vVar);
        vVar.d(aVar);
        this.f300833b.e(aVar.f300836b);
        this.f300667a.a(aVar);
    }
}
