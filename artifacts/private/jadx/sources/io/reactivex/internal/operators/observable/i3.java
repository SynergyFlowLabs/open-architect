package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class i3<T, U> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<U> f301722b;

    final class a implements io.reactivex.i0<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.internal.disposables.a f301723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T> f301724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.observers.m<T> f301725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f301726d;

        a(io.reactivex.internal.disposables.a aVar, b<T> bVar, io.reactivex.observers.m<T> mVar) {
            this.f301723a = aVar;
            this.f301724b = bVar;
            this.f301725c = mVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301726d, cVar)) {
                this.f301726d = cVar;
                this.f301723a.b(1, cVar);
            }
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301724b.f301731d = true;
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301723a.dispose();
            this.f301725c.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(U u10) {
            this.f301726d.dispose();
            this.f301724b.f301731d = true;
        }
    }

    static final class b<T> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.disposables.a f301729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f301731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f301732e;

        b(io.reactivex.i0<? super T> i0Var, io.reactivex.internal.disposables.a aVar) {
            this.f301728a = i0Var;
            this.f301729b = aVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301730c, cVar)) {
                this.f301730c = cVar;
                this.f301729b.b(0, cVar);
            }
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301729b.dispose();
            this.f301728a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301729b.dispose();
            this.f301728a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301732e) {
                this.f301728a.onNext(t10);
            } else if (this.f301731d) {
                this.f301732e = true;
                this.f301728a.onNext(t10);
            }
        }
    }

    public i3(io.reactivex.g0<T> g0Var, io.reactivex.g0<U> g0Var2) {
        super(g0Var);
        this.f301722b = g0Var2;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.observers.m mVar = new io.reactivex.observers.m(i0Var);
        io.reactivex.internal.disposables.a aVar = new io.reactivex.internal.disposables.a(2);
        mVar.d(aVar);
        b bVar = new b(mVar, aVar);
        this.f301722b.a(new a(aVar, bVar, mVar));
        this.f301291a.a(bVar);
    }
}
