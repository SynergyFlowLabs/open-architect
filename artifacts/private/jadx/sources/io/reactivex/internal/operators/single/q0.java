package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class q0<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f303038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f303039b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f303040d = 7000911171163930287L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f303042b = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.q0<? extends T> f303043c;

        a(io.reactivex.n0<? super T> n0Var, io.reactivex.q0<? extends T> q0Var) {
            this.f303041a = n0Var;
            this.f303043c = q0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303041a.b(t10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
            this.f303042b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303041a.onError(th2);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f303043c.f(this);
        }
    }

    public q0(io.reactivex.q0<? extends T> q0Var, io.reactivex.j0 j0Var) {
        this.f303038a = q0Var;
        this.f303039b = j0Var;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        a aVar = new a(n0Var, this.f303038a);
        n0Var.d(aVar);
        aVar.f303042b.a(this.f303039b.e(aVar));
    }
}
