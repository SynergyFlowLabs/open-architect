package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class g1<T> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f301599a;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f301601b;

        a(io.reactivex.i0<? super T> i0Var) {
            this.f301600a = i0Var;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301601b.cancel();
            this.f301601b = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301601b == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f301601b, wVar)) {
                this.f301601b = wVar;
                this.f301600a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f301600a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f301600a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f301600a.onNext(t10);
        }
    }

    public g1(org.reactivestreams.u<? extends T> uVar) {
        this.f301599a = uVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301599a.e(new a(i0Var));
    }
}
