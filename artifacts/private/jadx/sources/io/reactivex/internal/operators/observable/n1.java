package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class n1<T> extends io.reactivex.c implements ej.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f302011a;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f302012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f302013b;

        a(io.reactivex.f fVar) {
            this.f302012a = fVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f302013b = cVar;
            this.f302012a.d(this);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302013b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302013b.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302012a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302012a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
        }
    }

    public n1(io.reactivex.g0<T> g0Var) {
        this.f302011a = g0Var;
    }

    @Override // io.reactivex.c
    public void J0(io.reactivex.f fVar) {
        this.f302011a.a(new a(fVar));
    }

    @Override // ej.d
    public io.reactivex.b0<T> c() {
        return io.reactivex.plugins.a.R(new m1(this.f302011a));
    }
}
