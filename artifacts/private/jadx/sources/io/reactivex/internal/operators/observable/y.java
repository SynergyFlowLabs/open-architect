package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class y<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.y<? extends T> f302602b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<T>, io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f302603d = -1953724749712440952L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.y<? extends T> f302605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f302606c;

        a(io.reactivex.i0<? super T> i0Var, io.reactivex.y<? extends T> yVar) {
            this.f302604a = i0Var;
            this.f302605b = yVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f302604a.onNext(t10);
            this.f302604a.onComplete();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (!io.reactivex.internal.disposables.d.o(this, cVar) || this.f302606c) {
                return;
            }
            this.f302604a.d(this);
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
            if (this.f302606c) {
                this.f302604a.onComplete();
                return;
            }
            this.f302606c = true;
            io.reactivex.internal.disposables.d.d(this, null);
            io.reactivex.y<? extends T> yVar = this.f302605b;
            this.f302605b = null;
            yVar.a(this);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302604a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302604a.onNext(t10);
        }
    }

    public y(io.reactivex.b0<T> b0Var, io.reactivex.y<? extends T> yVar) {
        super(b0Var);
        this.f302602b = yVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302602b));
    }
}
