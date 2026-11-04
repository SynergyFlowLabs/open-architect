package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class w1<T, U> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends U> f302529b;

    static final class a<T, U> extends io.reactivex.internal.observers.a<T, U> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.o<? super T, ? extends U> f302530f;

        a(io.reactivex.i0<? super U> i0Var, dj.o<? super T, ? extends U> oVar) {
            super(i0Var);
            this.f302530f = oVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f298739d) {
                return;
            }
            if (this.f298740e != 0) {
                this.f298736a.onNext(null);
                return;
            }
            try {
                this.f298736a.onNext((Object) io.reactivex.internal.functions.b.g(this.f302530f.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // ej.k
        public int p(int i10) {
            return e(i10);
        }

        @Override // ej.o
        @cj.g
        public U poll() throws Exception {
            T tPoll = this.f298738c.poll();
            if (tPoll != null) {
                return (U) io.reactivex.internal.functions.b.g(this.f302530f.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public w1(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends U> oVar) {
        super(g0Var);
        this.f302529b = oVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super U> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302529b));
    }
}
