package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class b0<T, R> extends io.reactivex.s<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f302902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.y<? extends R>> f302903b;

    static final class a<R> implements io.reactivex.v<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.v<? super R> f302905b;

        a(AtomicReference<io.reactivex.disposables.c> atomicReference, io.reactivex.v<? super R> vVar) {
            this.f302904a = atomicReference;
            this.f302905b = vVar;
        }

        @Override // io.reactivex.v
        public void b(R r10) {
            this.f302905b.b(r10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this.f302904a, cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f302905b.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f302905b.onError(th2);
        }
    }

    static final class b<T, R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f302906c = -5843758257109742742L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super R> f302907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.y<? extends R>> f302908b;

        b(io.reactivex.v<? super R> vVar, dj.o<? super T, ? extends io.reactivex.y<? extends R>> oVar) {
            this.f302907a = vVar;
            this.f302908b = oVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            try {
                io.reactivex.y yVar = (io.reactivex.y) io.reactivex.internal.functions.b.g(this.f302908b.apply(t10), "The mapper returned a null MaybeSource");
                if (k()) {
                    return;
                }
                yVar.a(new a(this, this.f302907a));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                onError(th2);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f302907a.d(this);
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
            this.f302907a.onError(th2);
        }
    }

    public b0(io.reactivex.q0<? extends T> q0Var, dj.o<? super T, ? extends io.reactivex.y<? extends R>> oVar) {
        this.f302903b = oVar;
        this.f302902a = q0Var;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super R> vVar) {
        this.f302902a.f(new b(vVar, this.f302903b));
    }
}
