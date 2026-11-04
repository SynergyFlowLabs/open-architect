package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class w0<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f303102b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f303103d = 3256698449646456986L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.j0 f303105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f303106c;

        a(io.reactivex.n0<? super T> n0Var, io.reactivex.j0 j0Var) {
            this.f303104a = n0Var;
            this.f303105b = j0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303104a.b(t10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f303104a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            io.reactivex.disposables.c andSet = getAndSet(dVar);
            if (andSet != dVar) {
                this.f303106c = andSet;
                this.f303105b.e(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303104a.onError(th2);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f303106c.dispose();
        }
    }

    public w0(io.reactivex.q0<T> q0Var, io.reactivex.j0 j0Var) {
        this.f303101a = q0Var;
        this.f303102b = j0Var;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f303101a.f(new a(n0Var, this.f303102b));
    }
}
