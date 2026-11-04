package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class q1<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    static final class a<T> implements io.reactivex.q<T>, ej.l<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f300011b;

        a(org.reactivestreams.v<? super T> vVar) {
            this.f300010a = vVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300011b.cancel();
        }

        @Override // ej.o
        public void clear() {
        }

        @Override // ej.o
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300011b, wVar)) {
                this.f300011b = wVar;
                this.f300010a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // ej.o
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300010a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300010a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
        }

        @Override // ej.k
        public int p(int i10) {
            return i10 & 2;
        }

        @Override // ej.o
        @cj.g
        public T poll() {
            return null;
        }

        @Override // ej.o
        public boolean r(T t10, T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
        }
    }

    public q1(io.reactivex.l<T> lVar) {
        super(lVar);
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar));
    }
}
