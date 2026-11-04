package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class p<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.a f303025b;

    static final class a<T> extends AtomicReference<dj.a> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303026c = -8583764624474935784L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f303028b;

        a(io.reactivex.n0<? super T> n0Var, dj.a aVar) {
            this.f303027a = n0Var;
            lazySet(aVar);
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303027a.b(t10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f303028b, cVar)) {
                this.f303028b = cVar;
                this.f303027a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            dj.a andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
                this.f303028b.dispose();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303028b.k();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303027a.onError(th2);
        }
    }

    public p(io.reactivex.q0<T> q0Var, dj.a aVar) {
        this.f303024a = q0Var;
        this.f303025b = aVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f303024a.f(new a(n0Var, this.f303025b));
    }
}
