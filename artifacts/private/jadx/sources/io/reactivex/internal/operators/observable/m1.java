package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class m1<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f301950b;

        a(io.reactivex.i0<? super T> i0Var) {
            this.f301949a = i0Var;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f301950b = cVar;
            this.f301949a.d(this);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301950b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301950b.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301949a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301949a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
        }
    }

    public m1(io.reactivex.g0<T> g0Var) {
        super(g0Var);
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var));
    }
}
