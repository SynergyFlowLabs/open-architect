package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class y3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f300546c;

    static final class a<T> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.u<? extends T> f300548b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f300550d = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.subscriptions.i f300549c = new io.reactivex.internal.subscriptions.i(false);

        a(org.reactivestreams.v<? super T> vVar, org.reactivestreams.u<? extends T> uVar) {
            this.f300547a = vVar;
            this.f300548b = uVar;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            this.f300549c.h(wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (!this.f300550d) {
                this.f300547a.onComplete();
            } else {
                this.f300550d = false;
                this.f300548b.e(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300547a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300550d) {
                this.f300550d = false;
            }
            this.f300547a.onNext(t10);
        }
    }

    public y3(io.reactivex.l<T> lVar, org.reactivestreams.u<? extends T> uVar) {
        super(lVar);
        this.f300546c = uVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        a aVar = new a(vVar, this.f300546c);
        vVar.l(aVar.f300549c);
        this.f299043b.j6(aVar);
    }
}
