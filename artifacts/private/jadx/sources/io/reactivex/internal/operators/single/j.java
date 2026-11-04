package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class j<T, U> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f302975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.q0<U> f302976b;

    static final class a<T, U> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<U>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f302977c = -8565274649390031272L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.q0<T> f302979b;

        a(io.reactivex.n0<? super T> n0Var, io.reactivex.q0<T> q0Var) {
            this.f302978a = n0Var;
            this.f302979b = q0Var;
        }

        @Override // io.reactivex.n0
        public void b(U u10) {
            this.f302979b.f(new io.reactivex.internal.observers.z(this, this.f302978a));
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f302978a.d(this);
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

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f302978a.onError(th2);
        }
    }

    public j(io.reactivex.q0<T> q0Var, io.reactivex.q0<U> q0Var2) {
        this.f302975a = q0Var;
        this.f302976b = q0Var2;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f302976b.f(new a(n0Var, this.f302975a));
    }
}
