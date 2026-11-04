package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class z3 extends io.reactivex.b0<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.j0 f302688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f302690c;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f302691b = -2809475196591179431L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super Long> f302692a;

        a(io.reactivex.i0<? super Long> i0Var) {
            this.f302692a = i0Var;
        }

        public void a(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.p(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k()) {
                return;
            }
            this.f302692a.onNext(0L);
            lazySet(io.reactivex.internal.disposables.e.INSTANCE);
            this.f302692a.onComplete();
        }
    }

    public z3(long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        this.f302689b = j10;
        this.f302690c = timeUnit;
        this.f302688a = j0Var;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super Long> i0Var) {
        a aVar = new a(i0Var);
        i0Var.d(aVar);
        aVar.a(this.f302688a.f(aVar, this.f302689b, this.f302690c));
    }
}
