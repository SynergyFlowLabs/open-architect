package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class a1<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super Throwable> f300676b;

    static final class a<T> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super Throwable> f300678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f300679c;

        a(io.reactivex.v<? super T> vVar, dj.r<? super Throwable> rVar) {
            this.f300677a = vVar;
            this.f300678b = rVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300677a.b(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300679c, cVar)) {
                this.f300679c = cVar;
                this.f300677a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300679c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300679c.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300677a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            try {
                if (this.f300678b.test(th2)) {
                    this.f300677a.onComplete();
                } else {
                    this.f300677a.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f300677a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }
    }

    public a1(io.reactivex.y<T> yVar, dj.r<? super Throwable> rVar) {
        super(yVar);
        this.f300676b = rVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this.f300676b));
    }
}
