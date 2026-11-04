package io.reactivex.internal.operators.completable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f299001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TimeUnit f299002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.j0 f299003c;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f299004b = 3167244060586201109L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f299005a;

        a(io.reactivex.f fVar) {
            this.f299005a = fVar;
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
            this.f299005a.onComplete();
        }
    }

    public n0(long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        this.f299001a = j10;
        this.f299002b = timeUnit;
        this.f299003c = j0Var;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        a aVar = new a(fVar);
        fVar.d(aVar);
        aVar.a(this.f299003c.f(aVar, this.f299001a, this.f299002b));
    }
}
