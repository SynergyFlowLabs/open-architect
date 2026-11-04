package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class p0<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f303029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super Throwable, ? extends io.reactivex.q0<? extends T>> f303030b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303031c = -5314538511045349925L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super Throwable, ? extends io.reactivex.q0<? extends T>> f303033b;

        a(io.reactivex.n0<? super T> n0Var, dj.o<? super Throwable, ? extends io.reactivex.q0<? extends T>> oVar) {
            this.f303032a = n0Var;
            this.f303033b = oVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303032a.b(t10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f303032a.d(this);
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
            try {
                ((io.reactivex.q0) io.reactivex.internal.functions.b.g(this.f303033b.apply(th2), "The nextFunction returned a null SingleSource.")).f(new io.reactivex.internal.observers.z(this, this.f303032a));
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f303032a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }
    }

    public p0(io.reactivex.q0<? extends T> q0Var, dj.o<? super Throwable, ? extends io.reactivex.q0<? extends T>> oVar) {
        this.f303029a = q0Var;
        this.f303030b = oVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f303029a.f(new a(n0Var, this.f303030b));
    }
}
