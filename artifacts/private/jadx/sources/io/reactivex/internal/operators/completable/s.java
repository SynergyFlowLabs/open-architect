package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class s<T> extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f299028a;

    static final class a<T> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f299029a;

        a(io.reactivex.f fVar) {
            this.f299029a = fVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f299029a.d(cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f299029a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f299029a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
        }
    }

    public s(io.reactivex.g0<T> g0Var) {
        this.f299028a = g0Var;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f299028a.a(new a(fVar));
    }
}
