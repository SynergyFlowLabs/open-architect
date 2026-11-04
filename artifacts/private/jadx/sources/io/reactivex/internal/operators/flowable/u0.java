package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class u0<T> extends io.reactivex.s<T> implements ej.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f300293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f300294b;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f300296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f300297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f300298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f300299e;

        a(io.reactivex.v<? super T> vVar, long j10) {
            this.f300295a = vVar;
            this.f300296b = j10;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300297c.cancel();
            this.f300297c = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300297c == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300297c, wVar)) {
                this.f300297c = wVar;
                this.f300295a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300297c = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (this.f300299e) {
                return;
            }
            this.f300299e = true;
            this.f300295a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300299e) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f300299e = true;
            this.f300297c = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300295a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300299e) {
                return;
            }
            long j10 = this.f300298d;
            if (j10 != this.f300296b) {
                this.f300298d = j10 + 1;
                return;
            }
            this.f300299e = true;
            this.f300297c.cancel();
            this.f300297c = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300295a.b(t10);
        }
    }

    public u0(io.reactivex.l<T> lVar, long j10) {
        this.f300293a = lVar;
        this.f300294b = j10;
    }

    @Override // ej.b
    public io.reactivex.l<T> e() {
        return io.reactivex.plugins.a.P(new t0(this.f300293a, this.f300294b, null, false));
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300293a.j6(new a(vVar, this.f300294b));
    }
}
