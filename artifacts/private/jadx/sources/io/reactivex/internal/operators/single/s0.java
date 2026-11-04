package io.reactivex.internal.operators.single;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class s0<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f303061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f303062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.j0 f303063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f303064e;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T>, Runnable, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f303065g = 37497744973048446L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f303067b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C2189a<T> f303068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.q0<? extends T> f303069d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f303070e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final TimeUnit f303071f;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.single.s0$a$a, reason: collision with other inner class name */
        static final class C2189a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f303072b = 2071387740092105509L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final io.reactivex.n0<? super T> f303073a;

            C2189a(io.reactivex.n0<? super T> n0Var) {
                this.f303073a = n0Var;
            }

            @Override // io.reactivex.n0
            public void b(T t10) {
                this.f303073a.b(t10);
            }

            @Override // io.reactivex.n0
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.n0
            public void onError(Throwable th2) {
                this.f303073a.onError(th2);
            }
        }

        a(io.reactivex.n0<? super T> n0Var, io.reactivex.q0<? extends T> q0Var, long j10, TimeUnit timeUnit) {
            this.f303066a = n0Var;
            this.f303069d = q0Var;
            this.f303070e = j10;
            this.f303071f = timeUnit;
            if (q0Var != null) {
                this.f303068c = new C2189a<>(n0Var);
            } else {
                this.f303068c = null;
            }
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar || !compareAndSet(cVar, dVar)) {
                return;
            }
            io.reactivex.internal.disposables.d.b(this.f303067b);
            this.f303066a.b(t10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
            io.reactivex.internal.disposables.d.b(this.f303067b);
            C2189a<T> c2189a = this.f303068c;
            if (c2189a != null) {
                io.reactivex.internal.disposables.d.b(c2189a);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar || !compareAndSet(cVar, dVar)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.disposables.d.b(this.f303067b);
                this.f303066a.onError(th2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar || !compareAndSet(cVar, dVar)) {
                return;
            }
            if (cVar != null) {
                cVar.dispose();
            }
            io.reactivex.q0<? extends T> q0Var = this.f303069d;
            if (q0Var == null) {
                this.f303066a.onError(new TimeoutException(io.reactivex.internal.util.k.e(this.f303070e, this.f303071f)));
            } else {
                this.f303069d = null;
                q0Var.f(this.f303068c);
            }
        }
    }

    public s0(io.reactivex.q0<T> q0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, io.reactivex.q0<? extends T> q0Var2) {
        this.f303060a = q0Var;
        this.f303061b = j10;
        this.f303062c = timeUnit;
        this.f303063d = j0Var;
        this.f303064e = q0Var2;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        a aVar = new a(n0Var, this.f303064e, this.f303061b, this.f303062c);
        n0Var.d(aVar);
        io.reactivex.internal.disposables.d.d(aVar.f303067b, this.f303063d.f(aVar, this.f303061b, this.f303062c));
        this.f303060a.f(aVar);
    }
}
