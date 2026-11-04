package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class d1<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super io.reactivex.disposables.c> f300733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super T> f300734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.g<? super Throwable> f300735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final dj.a f300736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final dj.a f300737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final dj.a f300738g;

    static final class a<T> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d1<T> f300740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f300741c;

        a(io.reactivex.v<? super T> vVar, d1<T> d1Var) {
            this.f300739a = vVar;
            this.f300740b = d1Var;
        }

        void a() {
            try {
                this.f300740b.f300737f.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            io.reactivex.disposables.c cVar = this.f300741c;
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar) {
                return;
            }
            try {
                this.f300740b.f300734c.accept(t10);
                this.f300741c = dVar;
                this.f300739a.b(t10);
                a();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                c(th2);
            }
        }

        void c(Throwable th2) {
            try {
                this.f300740b.f300735d.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                th2 = new io.reactivex.exceptions.a(th2, th3);
            }
            this.f300741c = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300739a.onError(th2);
            a();
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300741c, cVar)) {
                try {
                    this.f300740b.f300733b.accept(cVar);
                    this.f300741c = cVar;
                    this.f300739a.d(this);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    cVar.dispose();
                    this.f300741c = io.reactivex.internal.disposables.d.DISPOSED;
                    io.reactivex.internal.disposables.e.f(th2, this.f300739a);
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            try {
                this.f300740b.f300738g.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
            this.f300741c.dispose();
            this.f300741c = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300741c.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            io.reactivex.disposables.c cVar = this.f300741c;
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar) {
                return;
            }
            try {
                this.f300740b.f300736e.run();
                this.f300741c = dVar;
                this.f300739a.onComplete();
                a();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                c(th2);
            }
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            if (this.f300741c == io.reactivex.internal.disposables.d.DISPOSED) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                c(th2);
            }
        }
    }

    public d1(io.reactivex.y<T> yVar, dj.g<? super io.reactivex.disposables.c> gVar, dj.g<? super T> gVar2, dj.g<? super Throwable> gVar3, dj.a aVar, dj.a aVar2, dj.a aVar3) {
        super(yVar);
        this.f300733b = gVar;
        this.f300734c = gVar2;
        this.f300735d = gVar3;
        this.f300736e = aVar;
        this.f300737f = aVar2;
        this.f300738g = aVar3;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this));
    }
}
