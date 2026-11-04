package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class s3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super T> f302333b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super T> f302335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f302336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f302337d;

        a(io.reactivex.i0<? super T> i0Var, dj.r<? super T> rVar) {
            this.f302334a = i0Var;
            this.f302335b = rVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302336c, cVar)) {
                this.f302336c = cVar;
                this.f302334a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302336c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302336c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302337d) {
                return;
            }
            this.f302337d = true;
            this.f302334a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302337d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302337d = true;
                this.f302334a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (!this.f302337d) {
                this.f302334a.onNext(t10);
                try {
                    if (this.f302335b.test(t10)) {
                        this.f302337d = true;
                        this.f302336c.dispose();
                        this.f302334a.onComplete();
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f302336c.dispose();
                    onError(th2);
                }
            }
        }
    }

    public s3(io.reactivex.g0<T> g0Var, dj.r<? super T> rVar) {
        super(g0Var);
        this.f302333b = rVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302333b));
    }
}
