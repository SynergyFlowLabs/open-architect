package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class z<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f302652b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<T>, io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f302653d = -1953724749712440952L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.q0<? extends T> f302655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f302656c;

        a(io.reactivex.i0<? super T> i0Var, io.reactivex.q0<? extends T> q0Var) {
            this.f302654a = i0Var;
            this.f302655b = q0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f302654a.onNext(t10);
            this.f302654a.onComplete();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (!io.reactivex.internal.disposables.d.o(this, cVar) || this.f302656c) {
                return;
            }
            this.f302654a.d(this);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302656c = true;
            io.reactivex.internal.disposables.d.d(this, null);
            io.reactivex.q0<? extends T> q0Var = this.f302655b;
            this.f302655b = null;
            q0Var.f(this);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302654a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302654a.onNext(t10);
        }
    }

    public z(io.reactivex.b0<T> b0Var, io.reactivex.q0<? extends T> q0Var) {
        super(b0Var);
        this.f302652b = q0Var;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302652b));
    }
}
