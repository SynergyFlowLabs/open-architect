package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class c4<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f301421b;

    static final class a<T> extends AtomicBoolean implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f301422d = 1015244841293359600L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.j0 f301424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301425c;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.c4$a$a, reason: collision with other inner class name */
        final class RunnableC2169a implements Runnable {
            RunnableC2169a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f301425c.dispose();
            }
        }

        a(io.reactivex.i0<? super T> i0Var, io.reactivex.j0 j0Var) {
            this.f301423a = i0Var;
            this.f301424b = j0Var;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301425c, cVar)) {
                this.f301425c = cVar;
                this.f301423a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f301424b.e(new RunnableC2169a());
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (!get()) {
                this.f301423a.onComplete();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (get()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301423a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (get()) {
                return;
            }
            this.f301423a.onNext(t10);
        }
    }

    public c4(io.reactivex.g0<T> g0Var, io.reactivex.j0 j0Var) {
        super(g0Var);
        this.f301421b = j0Var;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301421b));
    }
}
