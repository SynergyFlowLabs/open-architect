package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class h4<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.r<? super T> f299507c;

    static final class a<T> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super T> f299509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f299510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f299511d;

        a(org.reactivestreams.v<? super T> vVar, dj.r<? super T> rVar) {
            this.f299508a = vVar;
            this.f299509b = rVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299510c.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299510c, wVar)) {
                this.f299510c = wVar;
                this.f299508a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299511d) {
                return;
            }
            this.f299511d = true;
            this.f299508a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299511d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299511d = true;
                this.f299508a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299511d) {
                return;
            }
            try {
                if (this.f299509b.test(t10)) {
                    this.f299508a.onNext(t10);
                    return;
                }
                this.f299511d = true;
                this.f299510c.cancel();
                this.f299508a.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f299510c.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f299510c.request(j10);
        }
    }

    public h4(io.reactivex.l<T> lVar, dj.r<? super T> rVar) {
        super(lVar);
        this.f299507c = rVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299507c));
    }
}
