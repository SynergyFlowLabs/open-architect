package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class n0<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f303007b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f303008e = 3528003840217436037L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.j0 f303010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f303011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Throwable f303012d;

        a(io.reactivex.n0<? super T> n0Var, io.reactivex.j0 j0Var) {
            this.f303009a = n0Var;
            this.f303010b = j0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303011c = t10;
            io.reactivex.internal.disposables.d.d(this, this.f303010b.e(this));
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f303009a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303012d = th2;
            io.reactivex.internal.disposables.d.d(this, this.f303010b.e(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f303012d;
            if (th2 != null) {
                this.f303009a.onError(th2);
            } else {
                this.f303009a.b(this.f303011c);
            }
        }
    }

    public n0(io.reactivex.q0<T> q0Var, io.reactivex.j0 j0Var) {
        this.f303006a = q0Var;
        this.f303007b = j0Var;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f303006a.f(new a(n0Var, this.f303007b));
    }
}
