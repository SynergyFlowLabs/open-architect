package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class t1<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f302347a;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f302348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f302349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f302350c;

        a(io.reactivex.v<? super T> vVar) {
            this.f302348a = vVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302349b, cVar)) {
                this.f302349b = cVar;
                this.f302348a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302349b.dispose();
            this.f302349b = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302349b == io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302349b = io.reactivex.internal.disposables.d.DISPOSED;
            T t10 = this.f302350c;
            if (t10 == null) {
                this.f302348a.onComplete();
            } else {
                this.f302350c = null;
                this.f302348a.b(t10);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302349b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f302350c = null;
            this.f302348a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302350c = t10;
        }
    }

    public t1(io.reactivex.g0<T> g0Var) {
        this.f302347a = g0Var;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f302347a.a(new a(vVar));
    }
}
