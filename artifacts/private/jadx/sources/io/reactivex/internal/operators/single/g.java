package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class g<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f302945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.i f302946b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f302947c = -8565274649390031272L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.q0<T> f302949b;

        a(io.reactivex.n0<? super T> n0Var, io.reactivex.q0<T> q0Var) {
            this.f302948a = n0Var;
            this.f302949b = q0Var;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f302948a.d(this);
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

        @Override // io.reactivex.f
        public void onComplete() {
            this.f302949b.f(new io.reactivex.internal.observers.z(this, this.f302948a));
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f302948a.onError(th2);
        }
    }

    public g(io.reactivex.q0<T> q0Var, io.reactivex.i iVar) {
        this.f302945a = q0Var;
        this.f302946b = iVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f302946b.b(new a(n0Var, this.f302945a));
    }
}
