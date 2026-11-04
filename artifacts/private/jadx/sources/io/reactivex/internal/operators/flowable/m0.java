package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class m0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    static final class a<T> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        org.reactivestreams.v<? super T> f299753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f299754b;

        a(org.reactivestreams.v<? super T> vVar) {
            this.f299753a = vVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            org.reactivestreams.w wVar = this.f299754b;
            this.f299754b = io.reactivex.internal.util.h.INSTANCE;
            this.f299753a = io.reactivex.internal.util.h.o();
            wVar.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299754b, wVar)) {
                this.f299754b = wVar;
                this.f299753a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            org.reactivestreams.v<? super T> vVar = this.f299753a;
            this.f299754b = io.reactivex.internal.util.h.INSTANCE;
            this.f299753a = io.reactivex.internal.util.h.o();
            vVar.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            org.reactivestreams.v<? super T> vVar = this.f299753a;
            this.f299754b = io.reactivex.internal.util.h.INSTANCE;
            this.f299753a = io.reactivex.internal.util.h.o();
            vVar.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299753a.onNext(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f299754b.request(j10);
        }
    }

    public m0(io.reactivex.l<T> lVar) {
        super(lVar);
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar));
    }
}
