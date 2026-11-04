package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f298964b;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f298965d = 7000911171163930287L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f298967b = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.i f298968c;

        a(io.reactivex.f fVar, io.reactivex.i iVar) {
            this.f298966a = fVar;
            this.f298968c = iVar;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
            this.f298967b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.f
        public void onComplete() {
            this.f298966a.onComplete();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f298966a.onError(th2);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f298968c.b(this);
        }
    }

    public k0(io.reactivex.i iVar, io.reactivex.j0 j0Var) {
        this.f298963a = iVar;
        this.f298964b = j0Var;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        a aVar = new a(fVar, this.f298963a);
        fVar.d(aVar);
        aVar.f298967b.a(this.f298964b.e(aVar));
    }
}
