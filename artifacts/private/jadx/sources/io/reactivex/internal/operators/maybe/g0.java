package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class g0<T, R> extends io.reactivex.s<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.q0<? extends R>> f300799b;

    static final class a<T, R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f300800c = 4827726964688405508L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super R> f300801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.q0<? extends R>> f300802b;

        a(io.reactivex.v<? super R> vVar, dj.o<? super T, ? extends io.reactivex.q0<? extends R>> oVar) {
            this.f300801a = vVar;
            this.f300802b = oVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            try {
                ((io.reactivex.q0) io.reactivex.internal.functions.b.g(this.f300802b.apply(t10), "The mapper returned a null SingleSource")).f(new b(this, this.f300801a));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                onError(th2);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f300801a.d(this);
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
            this.f300801a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300801a.onError(th2);
        }
    }

    static final class b<R> implements io.reactivex.n0<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f300803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.v<? super R> f300804b;

        b(AtomicReference<io.reactivex.disposables.c> atomicReference, io.reactivex.v<? super R> vVar) {
            this.f300803a = atomicReference;
            this.f300804b = vVar;
        }

        @Override // io.reactivex.n0
        public void b(R r10) {
            this.f300804b.b(r10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this.f300803a, cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f300804b.onError(th2);
        }
    }

    public g0(io.reactivex.y<T> yVar, dj.o<? super T, ? extends io.reactivex.q0<? extends R>> oVar) {
        this.f300798a = yVar;
        this.f300799b = oVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super R> vVar) {
        this.f300798a.a(new a(vVar, this.f300799b));
    }
}
