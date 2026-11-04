package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class r1<T> extends io.reactivex.c implements ej.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f300058a;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f300059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f300060b;

        a(io.reactivex.f fVar) {
            this.f300059a = fVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300060b.cancel();
            this.f300060b = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300060b == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300060b, wVar)) {
                this.f300060b = wVar;
                this.f300059a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300060b = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300059a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300060b = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300059a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
        }
    }

    public r1(io.reactivex.l<T> lVar) {
        this.f300058a = lVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f300058a.j6(new a(fVar));
    }

    @Override // ej.b
    public io.reactivex.l<T> e() {
        return io.reactivex.plugins.a.P(new q1(this.f300058a));
    }
}
