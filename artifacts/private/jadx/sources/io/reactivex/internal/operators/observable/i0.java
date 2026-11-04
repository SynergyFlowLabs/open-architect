package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class i0<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.a0<R>> f301700b;

    static final class a<T, R> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f301701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.a0<R>> f301702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f301703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f301704d;

        a(io.reactivex.i0<? super R> i0Var, dj.o<? super T, ? extends io.reactivex.a0<R>> oVar) {
            this.f301701a = i0Var;
            this.f301702b = oVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301704d, cVar)) {
                this.f301704d = cVar;
                this.f301701a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301704d.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301704d.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301703c) {
                return;
            }
            this.f301703c = true;
            this.f301701a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301703c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301703c = true;
                this.f301701a.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301703c) {
                if (t10 instanceof io.reactivex.a0) {
                    io.reactivex.a0 a0Var = (io.reactivex.a0) t10;
                    if (a0Var.g()) {
                        io.reactivex.plugins.a.Y(a0Var.d());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                io.reactivex.a0 a0Var2 = (io.reactivex.a0) io.reactivex.internal.functions.b.g(this.f301702b.apply(t10), "The selector returned a null Notification");
                if (a0Var2.g()) {
                    this.f301704d.dispose();
                    onError(a0Var2.d());
                } else if (!a0Var2.f()) {
                    this.f301701a.onNext((Object) a0Var2.e());
                } else {
                    this.f301704d.dispose();
                    onComplete();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301704d.dispose();
                onError(th2);
            }
        }
    }

    public i0(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends io.reactivex.a0<R>> oVar) {
        super(g0Var);
        this.f301700b = oVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super R> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301700b));
    }
}
