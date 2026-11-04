package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.i f298853b;

    static final class a implements io.reactivex.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f298854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.f f298855b;

        public a(AtomicReference<io.reactivex.disposables.c> atomicReference, io.reactivex.f fVar) {
            this.f298854a = atomicReference;
            this.f298855b = fVar;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this.f298854a, cVar);
        }

        @Override // io.reactivex.f
        public void onComplete() {
            this.f298855b.onComplete();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f298855b.onError(th2);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.b$b, reason: collision with other inner class name */
    static final class C2124b extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f298856c = -4101678820158072998L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.i f298858b;

        C2124b(io.reactivex.f fVar, io.reactivex.i iVar) {
            this.f298857a = fVar;
            this.f298858b = iVar;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f298857a.d(this);
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
            this.f298858b.b(new a(this, this.f298857a));
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f298857a.onError(th2);
        }
    }

    public b(io.reactivex.i iVar, io.reactivex.i iVar2) {
        this.f298852a = iVar;
        this.f298853b = iVar2;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f298852a.b(new C2124b(fVar, this.f298853b));
    }
}
