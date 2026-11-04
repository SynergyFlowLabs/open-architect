package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f299037a;

    static final class a implements io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f299038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f299039b;

        a(io.reactivex.f fVar) {
            this.f299038a = fVar;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f299039b, cVar)) {
                this.f299039b = cVar;
                this.f299038a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f299039b.dispose();
            this.f299039b = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f299039b.k();
        }

        @Override // io.reactivex.f
        public void onComplete() {
            this.f299038a.onComplete();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f299038a.onError(th2);
        }
    }

    public x(io.reactivex.i iVar) {
        this.f299037a = iVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f299037a.b(new a(fVar));
    }
}
