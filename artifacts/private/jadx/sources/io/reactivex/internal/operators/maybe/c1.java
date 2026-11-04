package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class c1<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super Throwable, ? extends T> f300717b;

    static final class a<T> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super Throwable, ? extends T> f300719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f300720c;

        a(io.reactivex.v<? super T> vVar, dj.o<? super Throwable, ? extends T> oVar) {
            this.f300718a = vVar;
            this.f300719b = oVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300718a.b(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300720c, cVar)) {
                this.f300720c = cVar;
                this.f300718a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300720c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300720c.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300718a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            try {
                this.f300718a.b(io.reactivex.internal.functions.b.g(this.f300719b.apply(th2), "The valueSupplier returned a null value"));
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f300718a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }
    }

    public c1(io.reactivex.y<T> yVar, dj.o<? super Throwable, ? extends T> oVar) {
        super(yVar);
        this.f300717b = oVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this.f300717b));
    }
}
