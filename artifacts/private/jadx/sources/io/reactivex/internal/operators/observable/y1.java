package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class y1<T> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.a0<T>> {

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super io.reactivex.a0<T>> f302620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f302621b;

        a(io.reactivex.i0<? super io.reactivex.a0<T>> i0Var) {
            this.f302620a = i0Var;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302621b, cVar)) {
                this.f302621b = cVar;
                this.f302620a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302621b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302621b.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302620a.onNext(io.reactivex.a0.a());
            this.f302620a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302620a.onNext(io.reactivex.a0.b(th2));
            this.f302620a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302620a.onNext(io.reactivex.a0.c(t10));
        }
    }

    public y1(io.reactivex.g0<T> g0Var) {
        super(g0Var);
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super io.reactivex.a0<T>> i0Var) {
        this.f301291a.a(new a(i0Var));
    }
}
