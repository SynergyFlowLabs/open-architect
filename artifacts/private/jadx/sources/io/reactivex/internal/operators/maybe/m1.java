package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class m1<T> extends io.reactivex.l<T> implements ej.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.y<T> f300896b;

    static final class a<T> extends io.reactivex.internal.subscriptions.f<T> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final long f300897n = 7603343402964826922L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        io.reactivex.disposables.c f300898m;

        a(org.reactivestreams.v<? super T> vVar) {
            super(vVar);
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            f(t10);
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f300898m.dispose();
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300898m, cVar)) {
                this.f300898m = cVar;
                this.f303450b.l(this);
            }
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f303450b.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f303450b.onError(th2);
        }
    }

    public m1(io.reactivex.y<T> yVar) {
        this.f300896b = yVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f300896b.a(new a(vVar));
    }

    @Override // ej.f
    public io.reactivex.y<T> source() {
        return this.f300896b;
    }
}
