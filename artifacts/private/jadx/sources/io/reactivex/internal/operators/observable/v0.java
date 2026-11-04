package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class v0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super T> f302447b;

    static final class a<T> extends io.reactivex.internal.observers.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.r<? super T> f302448f;

        a(io.reactivex.i0<? super T> i0Var, dj.r<? super T> rVar) {
            super(i0Var);
            this.f302448f = rVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f298740e != 0) {
                this.f298736a.onNext(null);
                return;
            }
            try {
                if (this.f302448f.test(t10)) {
                    this.f298736a.onNext((Object) t10);
                }
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
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f298738c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f302448f.test(tPoll));
            return tPoll;
        }
    }

    public v0(io.reactivex.g0<T> g0Var, dj.r<? super T> rVar) {
        super(g0Var);
        this.f302447b = rVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302447b));
    }
}
