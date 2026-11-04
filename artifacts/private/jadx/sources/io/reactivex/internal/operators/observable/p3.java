package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class p3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f302123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f302124c;

        a(io.reactivex.i0<? super T> i0Var) {
            this.f302122a = i0Var;
        }

        void a() {
            T t10 = this.f302124c;
            if (t10 != null) {
                this.f302124c = null;
                this.f302122a.onNext(t10);
            }
            this.f302122a.onComplete();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302123b, cVar)) {
                this.f302123b = cVar;
                this.f302122a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302124c = null;
            this.f302123b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302123b.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302124c = null;
            this.f302122a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302124c = t10;
        }
    }

    public p3(io.reactivex.g0<T> g0Var) {
        super(g0Var);
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var));
    }
}
