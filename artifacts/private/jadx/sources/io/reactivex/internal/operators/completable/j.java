package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298948a;

    static final class a implements io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        io.reactivex.f f298949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f298950b;

        a(io.reactivex.f fVar) {
            this.f298949a = fVar;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f298950b, cVar)) {
                this.f298950b = cVar;
                this.f298949a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f298949a = null;
            this.f298950b.dispose();
            this.f298950b = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298950b.k();
        }

        @Override // io.reactivex.f
        public void onComplete() {
            this.f298950b = io.reactivex.internal.disposables.d.DISPOSED;
            io.reactivex.f fVar = this.f298949a;
            if (fVar != null) {
                this.f298949a = null;
                fVar.onComplete();
            }
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f298950b = io.reactivex.internal.disposables.d.DISPOSED;
            io.reactivex.f fVar = this.f298949a;
            if (fVar != null) {
                this.f298949a = null;
                fVar.onError(th2);
            }
        }
    }

    public j(io.reactivex.i iVar) {
        this.f298948a = iVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f298948a.b(new a(fVar));
    }
}
