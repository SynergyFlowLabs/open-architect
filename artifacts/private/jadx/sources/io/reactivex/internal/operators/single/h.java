package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class h<T, U> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f302953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<U> f302954b;

    static final class a<T, U> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<U>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f302955d = -8565274649390031272L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.q0<T> f302957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f302958c;

        a(io.reactivex.n0<? super T> n0Var, io.reactivex.q0<T> q0Var) {
            this.f302956a = n0Var;
            this.f302957b = q0Var;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.n(this, cVar)) {
                this.f302956a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302958c) {
                return;
            }
            this.f302958c = true;
            this.f302957b.f(new io.reactivex.internal.observers.z(this, this.f302956a));
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302958c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302958c = true;
                this.f302956a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(U u10) {
            get().dispose();
            onComplete();
        }
    }

    public h(io.reactivex.q0<T> q0Var, io.reactivex.g0<U> g0Var) {
        this.f302953a = q0Var;
        this.f302954b = g0Var;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f302954b.a(new a(n0Var, this.f302953a));
    }
}
