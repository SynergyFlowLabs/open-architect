package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class a0<T> extends io.reactivex.internal.operators.observable.a<T, Long> {

    static final class a implements io.reactivex.i0<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super Long> f301292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f301293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f301294c;

        a(io.reactivex.i0<? super Long> i0Var) {
            this.f301292a = i0Var;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301293b, cVar)) {
                this.f301293b = cVar;
                this.f301292a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301293b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301293b.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301292a.onNext(Long.valueOf(this.f301294c));
            this.f301292a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301292a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(Object obj) {
            this.f301294c++;
        }
    }

    public a0(io.reactivex.g0<T> g0Var) {
        super(g0Var);
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super Long> i0Var) {
        this.f301291a.a(new a(i0Var));
    }
}
