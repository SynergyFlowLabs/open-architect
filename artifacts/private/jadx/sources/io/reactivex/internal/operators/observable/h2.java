package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class h2<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super io.reactivex.b0<T>, ? extends io.reactivex.g0<R>> f301655b;

    static final class a<T, R> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.subjects.e<T> f301656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301657b;

        a(io.reactivex.subjects.e<T> eVar, AtomicReference<io.reactivex.disposables.c> atomicReference) {
            this.f301656a = eVar;
            this.f301657b = atomicReference;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f301657b, cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301656a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301656a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301656a.onNext(t10);
        }
    }

    static final class b<T, R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<R>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f301658c = 854110278590336484L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f301659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f301660b;

        b(io.reactivex.i0<? super R> i0Var) {
            this.f301659a = i0Var;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301660b, cVar)) {
                this.f301660b = cVar;
                this.f301659a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301660b.dispose();
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301660b.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            io.reactivex.internal.disposables.d.b(this);
            this.f301659a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this);
            this.f301659a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(R r10) {
            this.f301659a.onNext(r10);
        }
    }

    public h2(io.reactivex.g0<T> g0Var, dj.o<? super io.reactivex.b0<T>, ? extends io.reactivex.g0<R>> oVar) {
        super(g0Var);
        this.f301655b = oVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super R> i0Var) {
        io.reactivex.subjects.e eVarN8 = io.reactivex.subjects.e.n8();
        try {
            io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f301655b.apply(eVarN8), "The selector returned a null ObservableSource");
            b bVar = new b(i0Var);
            g0Var.a(bVar);
            this.f301291a.a(new a(eVarN8, bVar));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.l(th2, i0Var);
        }
    }
}
