package io.reactivex.internal.operators.single;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class t0 extends io.reactivex.k0<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f303078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TimeUnit f303079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.j0 f303080c;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f303081b = 8465401857522493082L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Long> f303082a;

        a(io.reactivex.n0<? super Long> n0Var) {
            this.f303082a = n0Var;
        }

        void a(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f303082a.b(0L);
        }
    }

    public t0(long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        this.f303078a = j10;
        this.f303079b = timeUnit;
        this.f303080c = j0Var;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super Long> n0Var) {
        a aVar = new a(n0Var);
        n0Var.d(aVar);
        aVar.a(this.f303080c.f(aVar, this.f303078a, this.f303079b));
    }
}
