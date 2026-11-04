package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class w3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.r<? super T> f300461c;

    static final class a<T> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super T> f300463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f300464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f300465d;

        a(org.reactivestreams.v<? super T> vVar, dj.r<? super T> rVar) {
            this.f300462a = vVar;
            this.f300463b = rVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300464c.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300464c, wVar)) {
                this.f300464c = wVar;
                this.f300462a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300462a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300462a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300465d) {
                this.f300462a.onNext(t10);
                return;
            }
            try {
                if (this.f300463b.test(t10)) {
                    this.f300464c.request(1L);
                } else {
                    this.f300465d = true;
                    this.f300462a.onNext(t10);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300464c.cancel();
                this.f300462a.onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f300464c.request(j10);
        }
    }

    public w3(io.reactivex.l<T> lVar, dj.r<? super T> rVar) {
        super(lVar);
        this.f300461c = rVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f300461c));
    }
}
