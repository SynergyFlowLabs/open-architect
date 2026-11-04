package io.reactivex.internal.operators.maybe;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class f0<T, R> extends io.reactivex.k0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.q0<? extends R>> f300778b;

    static final class a<T, R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f300779c = 4827726964688405508L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super R> f300780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.q0<? extends R>> f300781b;

        a(io.reactivex.n0<? super R> n0Var, dj.o<? super T, ? extends io.reactivex.q0<? extends R>> oVar) {
            this.f300780a = n0Var;
            this.f300781b = oVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            try {
                io.reactivex.q0 q0Var = (io.reactivex.q0) io.reactivex.internal.functions.b.g(this.f300781b.apply(t10), "The mapper returned a null SingleSource");
                if (!k()) {
                    q0Var.f(new b(this, this.f300780a));
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                onError(th2);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f300780a.d(this);
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

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300780a.onError(new NoSuchElementException());
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300780a.onError(th2);
        }
    }

    static final class b<R> implements io.reactivex.n0<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f300782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.n0<? super R> f300783b;

        b(AtomicReference<io.reactivex.disposables.c> atomicReference, io.reactivex.n0<? super R> n0Var) {
            this.f300782a = atomicReference;
            this.f300783b = n0Var;
        }

        @Override // io.reactivex.n0
        public void b(R r10) {
            this.f300783b.b(r10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this.f300782a, cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f300783b.onError(th2);
        }
    }

    public f0(io.reactivex.y<T> yVar, dj.o<? super T, ? extends io.reactivex.q0<? extends R>> oVar) {
        this.f300777a = yVar;
        this.f300778b = oVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super R> n0Var) {
        this.f300777a.a(new a(n0Var, this.f300778b));
    }
}
