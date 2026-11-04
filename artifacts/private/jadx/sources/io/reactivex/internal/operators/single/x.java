package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class x<T, R> extends io.reactivex.k0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f303107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.q0<? extends R>> f303108b;

    static final class a<T, R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303109c = 3258103020495908596L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super R> f303110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.q0<? extends R>> f303111b;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.single.x$a$a, reason: collision with other inner class name */
        static final class C2190a<R> implements io.reactivex.n0<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final AtomicReference<io.reactivex.disposables.c> f303112a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final io.reactivex.n0<? super R> f303113b;

            C2190a(AtomicReference<io.reactivex.disposables.c> atomicReference, io.reactivex.n0<? super R> n0Var) {
                this.f303112a = atomicReference;
                this.f303113b = n0Var;
            }

            @Override // io.reactivex.n0
            public void b(R r10) {
                this.f303113b.b(r10);
            }

            @Override // io.reactivex.n0
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.d(this.f303112a, cVar);
            }

            @Override // io.reactivex.n0
            public void onError(Throwable th2) {
                this.f303113b.onError(th2);
            }
        }

        a(io.reactivex.n0<? super R> n0Var, dj.o<? super T, ? extends io.reactivex.q0<? extends R>> oVar) {
            this.f303110a = n0Var;
            this.f303111b = oVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            try {
                io.reactivex.q0 q0Var = (io.reactivex.q0) io.reactivex.internal.functions.b.g(this.f303111b.apply(t10), "The single returned by the mapper is null");
                if (!k()) {
                    q0Var.f(new C2190a(this, this.f303110a));
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f303110a.onError(th2);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f303110a.d(this);
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
            this.f303110a.onError(th2);
        }
    }

    public x(io.reactivex.q0<? extends T> q0Var, dj.o<? super T, ? extends io.reactivex.q0<? extends R>> oVar) {
        this.f303108b = oVar;
        this.f303107a = q0Var;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super R> n0Var) {
        this.f303107a.f(new a(n0Var, this.f303108b));
    }
}
