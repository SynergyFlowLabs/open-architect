package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super Throwable> f298984b;

    final class a implements io.reactivex.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.f f298985a;

        a(io.reactivex.f fVar) {
            this.f298985a = fVar;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            this.f298985a.d(cVar);
        }

        @Override // io.reactivex.f
        public void onComplete() {
            try {
                m.this.f298984b.accept(null);
                this.f298985a.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f298985a.onError(th2);
            }
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            try {
                m.this.f298984b.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                th2 = new io.reactivex.exceptions.a(th2, th3);
            }
            this.f298985a.onError(th2);
        }
    }

    public m(io.reactivex.i iVar, dj.g<? super Throwable> gVar) {
        this.f298983a = iVar;
        this.f298984b = gVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f298983a.b(new a(fVar));
    }
}
