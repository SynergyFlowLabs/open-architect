package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class x1<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.u<T> f300497a;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f300499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f300500c;

        a(io.reactivex.v<? super T> vVar) {
            this.f300498a = vVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300499b.cancel();
            this.f300499b = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300499b == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300499b, wVar)) {
                this.f300499b = wVar;
                this.f300498a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300499b = io.reactivex.internal.subscriptions.j.CANCELLED;
            T t10 = this.f300500c;
            if (t10 == null) {
                this.f300498a.onComplete();
            } else {
                this.f300500c = null;
                this.f300498a.b(t10);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300499b = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300500c = null;
            this.f300498a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f300500c = t10;
        }
    }

    public x1(org.reactivestreams.u<T> uVar) {
        this.f300497a = uVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300497a.e(new a(vVar));
    }
}
