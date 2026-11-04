package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class f<T> extends io.reactivex.internal.operators.observable.a<T, Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super T> f301541b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super Boolean> f301542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super T> f301543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f301545d;

        a(io.reactivex.i0<? super Boolean> i0Var, dj.r<? super T> rVar) {
            this.f301542a = i0Var;
            this.f301543b = rVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301544c, cVar)) {
                this.f301544c = cVar;
                this.f301542a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301544c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301544c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301545d) {
                return;
            }
            this.f301545d = true;
            this.f301542a.onNext(Boolean.TRUE);
            this.f301542a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301545d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301545d = true;
                this.f301542a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301545d) {
                return;
            }
            try {
                if (this.f301543b.test(t10)) {
                    return;
                }
                this.f301545d = true;
                this.f301544c.dispose();
                this.f301542a.onNext(Boolean.FALSE);
                this.f301542a.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301544c.dispose();
                onError(th2);
            }
        }
    }

    public f(io.reactivex.g0<T> g0Var, dj.r<? super T> rVar) {
        super(g0Var);
        this.f301541b = rVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super Boolean> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301541b));
    }
}
