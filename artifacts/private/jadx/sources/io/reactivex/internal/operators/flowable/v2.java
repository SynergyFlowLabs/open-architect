package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class v2<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<T, T, T> f300389c;

    static final class a<T> extends io.reactivex.internal.subscriptions.f<T> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f300390o = -4663883003264602070L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final dj.c<T, T, T> f300391m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        org.reactivestreams.w f300392n;

        a(org.reactivestreams.v<? super T> vVar, dj.c<T, T, T> cVar) {
            super(vVar);
            this.f300391m = cVar;
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f300392n.cancel();
            this.f300392n = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300392n, wVar)) {
                this.f300392n = wVar;
                this.f303450b.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            org.reactivestreams.w wVar = this.f300392n;
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (wVar == jVar) {
                return;
            }
            this.f300392n = jVar;
            T t10 = this.f303451c;
            if (t10 != null) {
                f(t10);
            } else {
                this.f303450b.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            org.reactivestreams.w wVar = this.f300392n;
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (wVar == jVar) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300392n = jVar;
                this.f303450b.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300392n == io.reactivex.internal.subscriptions.j.CANCELLED) {
                return;
            }
            T t11 = this.f303451c;
            if (t11 == null) {
                this.f303451c = t10;
                return;
            }
            try {
                this.f303451c = (T) io.reactivex.internal.functions.b.g(this.f300391m.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300392n.cancel();
                onError(th2);
            }
        }
    }

    public v2(io.reactivex.l<T> lVar, dj.c<T, T, T> cVar) {
        super(lVar);
        this.f300389c = cVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f300389c));
    }
}
