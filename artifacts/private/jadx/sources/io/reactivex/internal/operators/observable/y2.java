package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class y2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.c<T, T, T> f302622b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<T, T, T> f302624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f302625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f302626d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f302627e;

        a(io.reactivex.i0<? super T> i0Var, dj.c<T, T, T> cVar) {
            this.f302623a = i0Var;
            this.f302624b = cVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302625c, cVar)) {
                this.f302625c = cVar;
                this.f302623a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302625c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302625c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302627e) {
                return;
            }
            this.f302627e = true;
            this.f302623a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302627e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302627e = true;
                this.f302623a.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302627e) {
                return;
            }
            io.reactivex.i0<? super T> i0Var = this.f302623a;
            T t11 = this.f302626d;
            if (t11 == null) {
                this.f302626d = t10;
                i0Var.onNext(t10);
                return;
            }
            try {
                ?? r10 = (T) io.reactivex.internal.functions.b.g(this.f302624b.apply(t11, t10), "The value returned by the accumulator is null");
                this.f302626d = r10;
                i0Var.onNext(r10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302625c.dispose();
                onError(th2);
            }
        }
    }

    public y2(io.reactivex.g0<T> g0Var, dj.c<T, T, T> cVar) {
        super(g0Var);
        this.f302622b = cVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302622b));
    }
}
