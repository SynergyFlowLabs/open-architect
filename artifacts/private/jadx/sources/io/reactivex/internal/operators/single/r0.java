package io.reactivex.internal.operators.single;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class r0<T, U> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<U> f303049b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303050c = -622603812305745221L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b f303052b = new b(this);

        a(io.reactivex.n0<? super T> n0Var) {
            this.f303051a = n0Var;
        }

        void a(Throwable th2) {
            io.reactivex.disposables.c andSet;
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar || (andSet = getAndSet(dVar)) == dVar) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.f303051a.onError(th2);
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303052b.a();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f303051a.b(t10);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
            this.f303052b.a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303052b.a();
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar || getAndSet(dVar) == dVar) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f303051a.onError(th2);
            }
        }
    }

    static final class b extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f303053b = 5170026210238877381L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<?> f303054a;

        b(a<?> aVar) {
            this.f303054a = aVar;
        }

        public void a() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            org.reactivestreams.w wVar = get();
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (wVar != jVar) {
                lazySet(jVar);
                this.f303054a.a(new CancellationException());
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f303054a.a(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            if (io.reactivex.internal.subscriptions.j.b(this)) {
                this.f303054a.a(new CancellationException());
            }
        }
    }

    public r0(io.reactivex.q0<T> q0Var, org.reactivestreams.u<U> uVar) {
        this.f303048a = q0Var;
        this.f303049b = uVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        a aVar = new a(n0Var);
        n0Var.d(aVar);
        this.f303049b.e(aVar.f303052b);
        this.f303048a.f(aVar);
    }
}
