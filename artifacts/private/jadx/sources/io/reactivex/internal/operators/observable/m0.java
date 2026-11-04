package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class m0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super T> f301947b;

    static final class a<T> extends io.reactivex.internal.observers.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.g<? super T> f301948f;

        a(io.reactivex.i0<? super T> i0Var, dj.g<? super T> gVar) {
            super(i0Var);
            this.f301948f = gVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f298736a.onNext((Object) t10);
            if (this.f298740e == 0) {
                try {
                    this.f301948f.accept(t10);
                } catch (Throwable th2) {
                    c(th2);
                }
            }
        }

        @Override // ej.k
        public int p(int i10) {
            return e(i10);
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            T tPoll = this.f298738c.poll();
            if (tPoll != null) {
                this.f301948f.accept(tPoll);
            }
            return tPoll;
        }
    }

    public m0(io.reactivex.g0<T> g0Var, dj.g<? super T> gVar) {
        super(g0Var);
        this.f301947b = gVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301947b));
    }
}
