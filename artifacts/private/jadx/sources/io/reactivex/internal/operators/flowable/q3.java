package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class q3<T> extends io.reactivex.s<T> implements ej.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f300015a;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f300017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f300018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f300019d;

        a(io.reactivex.v<? super T> vVar) {
            this.f300016a = vVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300017b.cancel();
            this.f300017b = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300017b == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300017b, wVar)) {
                this.f300017b = wVar;
                this.f300016a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300018c) {
                return;
            }
            this.f300018c = true;
            this.f300017b = io.reactivex.internal.subscriptions.j.CANCELLED;
            T t10 = this.f300019d;
            this.f300019d = null;
            if (t10 == null) {
                this.f300016a.onComplete();
            } else {
                this.f300016a.b(t10);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300018c) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f300018c = true;
            this.f300017b = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300016a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300018c) {
                return;
            }
            if (this.f300019d == null) {
                this.f300019d = t10;
                return;
            }
            this.f300018c = true;
            this.f300017b.cancel();
            this.f300017b = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300016a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    public q3(io.reactivex.l<T> lVar) {
        this.f300015a = lVar;
    }

    @Override // ej.b
    public io.reactivex.l<T> e() {
        return io.reactivex.plugins.a.P(new p3(this.f300015a, null, false));
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300015a.j6(new a(vVar));
    }
}
