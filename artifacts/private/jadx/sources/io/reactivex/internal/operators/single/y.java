package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class y<T> extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.i> f303124b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T>, io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303125c = -2177128922851101253L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f303126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.i> f303127b;

        a(io.reactivex.f fVar, dj.o<? super T, ? extends io.reactivex.i> oVar) {
            this.f303126a = fVar;
            this.f303127b = oVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            try {
                io.reactivex.i iVar = (io.reactivex.i) io.reactivex.internal.functions.b.g(this.f303127b.apply(t10), "The mapper returned a null CompletableSource");
                if (k()) {
                    return;
                }
                iVar.b(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                onError(th2);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this, cVar);
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
            this.f303126a.onComplete();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303126a.onError(th2);
        }
    }

    public y(io.reactivex.q0<T> q0Var, dj.o<? super T, ? extends io.reactivex.i> oVar) {
        this.f303123a = q0Var;
        this.f303124b = oVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        a aVar = new a(fVar, this.f303124b);
        fVar.d(aVar);
        this.f303123a.f(aVar);
    }
}
