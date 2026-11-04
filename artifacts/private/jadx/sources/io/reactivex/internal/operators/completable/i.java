package io.reactivex.internal.operators.completable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f298927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f298928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.j0 f298929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f298930e;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, Runnable, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f298931g = 465972761105851022L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f298933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f298934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0 f298935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f298936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Throwable f298937f;

        a(io.reactivex.f fVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, boolean z10) {
            this.f298932a = fVar;
            this.f298933b = j10;
            this.f298934c = timeUnit;
            this.f298935d = j0Var;
            this.f298936e = z10;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f298932a.d(this);
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

        @Override // io.reactivex.f
        public void onComplete() {
            io.reactivex.internal.disposables.d.d(this, this.f298935d.f(this, this.f298933b, this.f298934c));
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f298937f = th2;
            io.reactivex.internal.disposables.d.d(this, this.f298935d.f(this, this.f298936e ? this.f298933b : 0L, this.f298934c));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f298937f;
            this.f298937f = null;
            if (th2 != null) {
                this.f298932a.onError(th2);
            } else {
                this.f298932a.onComplete();
            }
        }
    }

    public i(io.reactivex.i iVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, boolean z10) {
        this.f298926a = iVar;
        this.f298927b = j10;
        this.f298928c = timeUnit;
        this.f298929d = j0Var;
        this.f298930e = z10;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f298926a.b(new a(fVar, this.f298927b, this.f298928c, this.f298929d, this.f298930e));
    }
}
