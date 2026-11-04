package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class f<T> extends io.reactivex.internal.operators.flowable.a<T, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.r<? super T> f299314c;

    static final class a<T> extends io.reactivex.internal.subscriptions.f<Boolean> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final long f299315s = -3521127104134758517L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final dj.r<? super T> f299316m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        org.reactivestreams.w f299317n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f299318o;

        a(org.reactivestreams.v<? super Boolean> vVar, dj.r<? super T> rVar) {
            super(vVar);
            this.f299316m = rVar;
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f299317n.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299317n, wVar)) {
                this.f299317n = wVar;
                this.f303450b.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299318o) {
                return;
            }
            this.f299318o = true;
            f(Boolean.TRUE);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299318o) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299318o = true;
                this.f303450b.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299318o) {
                return;
            }
            try {
                if (this.f299316m.test(t10)) {
                    return;
                }
                this.f299318o = true;
                this.f299317n.cancel();
                f(Boolean.FALSE);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f299317n.cancel();
                onError(th2);
            }
        }
    }

    public f(io.reactivex.l<T> lVar, dj.r<? super T> rVar) {
        super(lVar);
        this.f299314c = rVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super Boolean> vVar) {
        this.f299043b.j6(new a(vVar, this.f299314c));
    }
}
