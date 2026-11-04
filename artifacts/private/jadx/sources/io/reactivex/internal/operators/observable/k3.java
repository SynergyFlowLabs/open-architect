package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class k3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f301871b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f301872c = 8094547886072529208L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301874b = new AtomicReference<>();

        a(io.reactivex.i0<? super T> i0Var) {
            this.f301873a = i0Var;
        }

        void a(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f301874b, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f301874b);
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301873a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301873a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301873a.onNext(t10);
        }
    }

    final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<T> f301875a;

        b(a<T> aVar) {
            this.f301875a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k3.this.f301291a.a(this.f301875a);
        }
    }

    public k3(io.reactivex.g0<T> g0Var, io.reactivex.j0 j0Var) {
        super(g0Var);
        this.f301871b = j0Var;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        a aVar = new a(i0Var);
        i0Var.d(aVar);
        aVar.a(this.f301871b.e(new b(aVar)));
    }
}
