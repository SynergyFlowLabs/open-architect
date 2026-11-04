package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class t3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super T> f302359b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super T> f302361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f302362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f302363d;

        a(io.reactivex.i0<? super T> i0Var, dj.r<? super T> rVar) {
            this.f302360a = i0Var;
            this.f302361b = rVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302362c, cVar)) {
                this.f302362c = cVar;
                this.f302360a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302362c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302362c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302363d) {
                return;
            }
            this.f302363d = true;
            this.f302360a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302363d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302363d = true;
                this.f302360a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302363d) {
                return;
            }
            try {
                if (this.f302361b.test(t10)) {
                    this.f302360a.onNext(t10);
                    return;
                }
                this.f302363d = true;
                this.f302362c.dispose();
                this.f302360a.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302362c.dispose();
                onError(th2);
            }
        }
    }

    public t3(io.reactivex.g0<T> g0Var, dj.r<? super T> rVar) {
        super(g0Var);
        this.f302359b = rVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302359b));
    }
}
