package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class i<T> extends io.reactivex.internal.operators.flowable.a<T, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.r<? super T> f299512c;

    static final class a<T> extends io.reactivex.internal.subscriptions.f<Boolean> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final long f299513s = -2311252482644620661L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final dj.r<? super T> f299514m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        org.reactivestreams.w f299515n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f299516o;

        a(org.reactivestreams.v<? super Boolean> vVar, dj.r<? super T> rVar) {
            super(vVar);
            this.f299514m = rVar;
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f299515n.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299515n, wVar)) {
                this.f299515n = wVar;
                this.f303450b.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299516o) {
                return;
            }
            this.f299516o = true;
            f(Boolean.FALSE);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299516o) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299516o = true;
                this.f303450b.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (!this.f299516o) {
                try {
                    if (this.f299514m.test(t10)) {
                        this.f299516o = true;
                        this.f299515n.cancel();
                        f(Boolean.TRUE);
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f299515n.cancel();
                    onError(th2);
                }
            }
        }
    }

    public i(io.reactivex.l<T> lVar, dj.r<? super T> rVar) {
        super(lVar);
        this.f299512c = rVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super Boolean> vVar) {
        this.f299043b.j6(new a(vVar, this.f299512c));
    }
}
