package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class j0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        io.reactivex.i0<? super T> f301779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f301780b;

        a(io.reactivex.i0<? super T> i0Var) {
            this.f301779a = i0Var;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301780b, cVar)) {
                this.f301780b = cVar;
                this.f301779a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.disposables.c cVar = this.f301780b;
            this.f301780b = io.reactivex.internal.util.h.INSTANCE;
            this.f301779a = io.reactivex.internal.util.h.n();
            cVar.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301780b.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            io.reactivex.i0<? super T> i0Var = this.f301779a;
            this.f301780b = io.reactivex.internal.util.h.INSTANCE;
            this.f301779a = io.reactivex.internal.util.h.n();
            i0Var.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.i0<? super T> i0Var = this.f301779a;
            this.f301780b = io.reactivex.internal.util.h.INSTANCE;
            this.f301779a = io.reactivex.internal.util.h.n();
            i0Var.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301779a.onNext(t10);
        }
    }

    public j0(io.reactivex.g0<T> g0Var) {
        super(g0Var);
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var));
    }
}
