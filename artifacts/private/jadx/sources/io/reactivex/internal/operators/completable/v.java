package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class v<T> extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f299034a;

    static final class a<T> implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f299035a;

        a(io.reactivex.f fVar) {
            this.f299035a = fVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f299035a.onComplete();
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            this.f299035a.d(cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f299035a.onError(th2);
        }
    }

    public v(io.reactivex.q0<T> q0Var) {
        this.f299034a = q0Var;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f299034a.f(new a(fVar));
    }
}
