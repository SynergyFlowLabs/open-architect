package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class f2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super Throwable, ? extends T> f301554b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super Throwable, ? extends T> f301556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301557c;

        a(io.reactivex.i0<? super T> i0Var, dj.o<? super Throwable, ? extends T> oVar) {
            this.f301555a = i0Var;
            this.f301556b = oVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301557c, cVar)) {
                this.f301557c = cVar;
                this.f301555a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301557c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301557c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301555a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            try {
                T tApply = this.f301556b.apply(th2);
                if (tApply != null) {
                    this.f301555a.onNext(tApply);
                    this.f301555a.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th2);
                    this.f301555a.onError(nullPointerException);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f301555a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301555a.onNext(t10);
        }
    }

    public f2(io.reactivex.g0<T> g0Var, dj.o<? super Throwable, ? extends T> oVar) {
        super(g0Var);
        this.f301554b = oVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301554b));
    }
}
