package io.reactivex.internal.operators.maybe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class l1 extends io.reactivex.s<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f300882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TimeUnit f300883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.j0 f300884c;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f300885b = 2875964065294031672L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super Long> f300886a;

        a(io.reactivex.v<? super Long> vVar) {
            this.f300886a = vVar;
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
            this.f300886a.b(0L);
        }
    }

    public l1(long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        this.f300882a = j10;
        this.f300883b = timeUnit;
        this.f300884c = j0Var;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super Long> vVar) {
        a aVar = new a(vVar);
        vVar.d(aVar);
        aVar.a(this.f300884c.f(aVar, this.f300882a, this.f300883b));
    }
}
