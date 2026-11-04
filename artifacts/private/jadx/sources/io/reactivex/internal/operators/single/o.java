package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class o<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.a f303014b;

    static final class a<T> extends AtomicInteger implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f303015d = 4109457741734051389L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.a f303017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f303018c;

        a(io.reactivex.n0<? super T> n0Var, dj.a aVar) {
            this.f303016a = n0Var;
            this.f303017b = aVar;
        }

        void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f303017b.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303016a.b(t10);
            a();
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f303018c, cVar)) {
                this.f303018c = cVar;
                this.f303016a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f303018c.dispose();
            a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303018c.k();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303016a.onError(th2);
            a();
        }
    }

    public o(io.reactivex.q0<T> q0Var, dj.a aVar) {
        this.f303013a = q0Var;
        this.f303014b = aVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f303013a.f(new a(n0Var, this.f303014b));
    }
}
