package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class h0<T, U> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<? extends T> f301647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<U> f301648b;

    final class a implements io.reactivex.i0<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f301649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f301651c;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.h0$a$a, reason: collision with other inner class name */
        final class C2173a implements io.reactivex.i0<T> {
            C2173a() {
            }

            @Override // io.reactivex.i0
            public void d(io.reactivex.disposables.c cVar) {
                a.this.f301649a.b(cVar);
            }

            @Override // io.reactivex.i0
            public void onComplete() {
                a.this.f301650b.onComplete();
            }

            @Override // io.reactivex.i0
            public void onError(Throwable th2) {
                a.this.f301650b.onError(th2);
            }

            @Override // io.reactivex.i0
            public void onNext(T t10) {
                a.this.f301650b.onNext(t10);
            }
        }

        a(io.reactivex.internal.disposables.h hVar, io.reactivex.i0<? super T> i0Var) {
            this.f301649a = hVar;
            this.f301650b = i0Var;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f301649a.b(cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301651c) {
                return;
            }
            this.f301651c = true;
            h0.this.f301647a.a(new C2173a());
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301651c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301651c = true;
                this.f301650b.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(U u10) {
            onComplete();
        }
    }

    public h0(io.reactivex.g0<? extends T> g0Var, io.reactivex.g0<U> g0Var2) {
        this.f301647a = g0Var;
        this.f301648b = g0Var2;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.internal.disposables.h hVar = new io.reactivex.internal.disposables.h();
        i0Var.d(hVar);
        this.f301648b.a(new a(hVar, i0Var));
    }
}
