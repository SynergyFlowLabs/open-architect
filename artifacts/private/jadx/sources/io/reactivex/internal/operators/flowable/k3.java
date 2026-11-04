package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class k3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<T, T, T> f299653c;

    static final class a<T> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<T, T, T> f299655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f299656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f299657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f299658e;

        a(org.reactivestreams.v<? super T> vVar, dj.c<T, T, T> cVar) {
            this.f299654a = vVar;
            this.f299655b = cVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299656c.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299656c, wVar)) {
                this.f299656c = wVar;
                this.f299654a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299658e) {
                return;
            }
            this.f299658e = true;
            this.f299654a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299658e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299658e = true;
                this.f299654a.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299658e) {
                return;
            }
            org.reactivestreams.v<? super T> vVar = this.f299654a;
            T t11 = this.f299657d;
            if (t11 == null) {
                this.f299657d = t10;
                vVar.onNext(t10);
                return;
            }
            try {
                ?? r10 = (T) io.reactivex.internal.functions.b.g(this.f299655b.apply(t11, t10), "The value returned by the accumulator is null");
                this.f299657d = r10;
                vVar.onNext(r10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f299656c.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f299656c.request(j10);
        }
    }

    public k3(io.reactivex.l<T> lVar, dj.c<T, T, T> cVar) {
        super(lVar);
        this.f299653c = cVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299653c));
    }
}
