package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class l3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<? extends T> f301908b;

    static final class a<T> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? extends T> f301910b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f301912d = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f301911c = new io.reactivex.internal.disposables.h();

        a(io.reactivex.i0<? super T> i0Var, io.reactivex.g0<? extends T> g0Var) {
            this.f301909a = i0Var;
            this.f301910b = g0Var;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f301911c.b(cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (!this.f301912d) {
                this.f301909a.onComplete();
            } else {
                this.f301912d = false;
                this.f301910b.a(this);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301909a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301912d) {
                this.f301912d = false;
            }
            this.f301909a.onNext(t10);
        }
    }

    public l3(io.reactivex.g0<T> g0Var, io.reactivex.g0<? extends T> g0Var2) {
        super(g0Var);
        this.f301908b = g0Var2;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        a aVar = new a(i0Var, this.f301908b);
        i0Var.d(aVar.f301911c);
        this.f301291a.a(aVar);
    }
}
