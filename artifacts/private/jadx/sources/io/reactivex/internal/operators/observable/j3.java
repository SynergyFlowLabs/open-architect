package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class j3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super T> f301813b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super T> f301815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f301817d;

        a(io.reactivex.i0<? super T> i0Var, dj.r<? super T> rVar) {
            this.f301814a = i0Var;
            this.f301815b = rVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301816c, cVar)) {
                this.f301816c = cVar;
                this.f301814a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301816c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301816c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301814a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301814a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301817d) {
                this.f301814a.onNext(t10);
                return;
            }
            try {
                if (this.f301815b.test(t10)) {
                    return;
                }
                this.f301817d = true;
                this.f301814a.onNext(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301816c.dispose();
                this.f301814a.onError(th2);
            }
        }
    }

    public j3(io.reactivex.g0<T> g0Var, dj.r<? super T> rVar) {
        super(g0Var);
        this.f301813b = rVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301813b));
    }
}
