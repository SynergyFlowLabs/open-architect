package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super Throwable> f298923b;

    final class a implements io.reactivex.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.f f298924a;

        a(io.reactivex.f fVar) {
            this.f298924a = fVar;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            this.f298924a.d(cVar);
        }

        @Override // io.reactivex.f
        public void onComplete() {
            this.f298924a.onComplete();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            try {
                if (h0.this.f298923b.test(th2)) {
                    this.f298924a.onComplete();
                } else {
                    this.f298924a.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f298924a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }
    }

    public h0(io.reactivex.i iVar, dj.r<? super Throwable> rVar) {
        this.f298922a = iVar;
        this.f298923b = rVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f298922a.b(new a(fVar));
    }
}
