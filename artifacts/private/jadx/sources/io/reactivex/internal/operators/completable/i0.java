package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super io.reactivex.disposables.c> f298939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super Throwable> f298940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.a f298941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final dj.a f298942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final dj.a f298943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final dj.a f298944g;

    final class a implements io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f298946b;

        a(io.reactivex.f fVar) {
            this.f298945a = fVar;
        }

        void a() {
            try {
                i0.this.f298943f.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            try {
                i0.this.f298939b.accept(cVar);
                if (io.reactivex.internal.disposables.d.q(this.f298946b, cVar)) {
                    this.f298946b = cVar;
                    this.f298945a.d(this);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                cVar.dispose();
                this.f298946b = io.reactivex.internal.disposables.d.DISPOSED;
                io.reactivex.internal.disposables.e.e(th2, this.f298945a);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            try {
                i0.this.f298944g.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
            this.f298946b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298946b.k();
        }

        @Override // io.reactivex.f
        public void onComplete() {
            if (this.f298946b == io.reactivex.internal.disposables.d.DISPOSED) {
                return;
            }
            try {
                i0.this.f298941d.run();
                i0.this.f298942e.run();
                this.f298945a.onComplete();
                a();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f298945a.onError(th2);
            }
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            if (this.f298946b == io.reactivex.internal.disposables.d.DISPOSED) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            try {
                i0.this.f298940c.accept(th2);
                i0.this.f298942e.run();
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                th2 = new io.reactivex.exceptions.a(th2, th3);
            }
            this.f298945a.onError(th2);
            a();
        }
    }

    public i0(io.reactivex.i iVar, dj.g<? super io.reactivex.disposables.c> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, dj.a aVar2, dj.a aVar3, dj.a aVar4) {
        this.f298938a = iVar;
        this.f298939b = gVar;
        this.f298940c = gVar2;
        this.f298941d = aVar;
        this.f298942e = aVar2;
        this.f298943f = aVar3;
        this.f298944g = aVar4;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f298938a.b(new a(fVar));
    }
}
