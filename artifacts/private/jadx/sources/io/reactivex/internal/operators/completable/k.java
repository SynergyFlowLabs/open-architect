package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f298958b;

    static final class a implements io.reactivex.f, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.j0 f298960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f298961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f298962d;

        a(io.reactivex.f fVar, io.reactivex.j0 j0Var) {
            this.f298959a = fVar;
            this.f298960b = j0Var;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f298961c, cVar)) {
                this.f298961c = cVar;
                this.f298959a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f298962d = true;
            this.f298960b.e(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298962d;
        }

        @Override // io.reactivex.f
        public void onComplete() {
            if (this.f298962d) {
                return;
            }
            this.f298959a.onComplete();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            if (this.f298962d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f298959a.onError(th2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f298961c.dispose();
            this.f298961c = io.reactivex.internal.disposables.d.DISPOSED;
        }
    }

    public k(io.reactivex.i iVar, io.reactivex.j0 j0Var) {
        this.f298957a = iVar;
        this.f298958b = j0Var;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f298957a.b(new a(fVar, this.f298958b));
    }
}
