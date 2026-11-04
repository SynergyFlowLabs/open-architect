package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class t<T> extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.u<T> f299030a;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f299031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f299032b;

        a(io.reactivex.f fVar) {
            this.f299031a = fVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f299032b.cancel();
            this.f299032b = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f299032b == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299032b, wVar)) {
                this.f299032b = wVar;
                this.f299031a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299031a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299031a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
        }
    }

    public t(org.reactivestreams.u<T> uVar) {
        this.f299030a = uVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f299030a.e(new a(fVar));
    }
}
