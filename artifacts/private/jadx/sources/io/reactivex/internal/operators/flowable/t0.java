package io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class t0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f300216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final T f300217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f300218e;

    static final class a<T> extends io.reactivex.internal.subscriptions.f<T> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final long f300219w = 4066607327284737757L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final long f300220m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final T f300221n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final boolean f300222o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        org.reactivestreams.w f300223s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f300224t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f300225v;

        a(org.reactivestreams.v<? super T> vVar, long j10, T t10, boolean z10) {
            super(vVar);
            this.f300220m = j10;
            this.f300221n = t10;
            this.f300222o = z10;
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f300223s.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300223s, wVar)) {
                this.f300223s = wVar;
                this.f303450b.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300225v) {
                return;
            }
            this.f300225v = true;
            T t10 = this.f300221n;
            if (t10 != null) {
                f(t10);
            } else if (this.f300222o) {
                this.f303450b.onError(new NoSuchElementException());
            } else {
                this.f303450b.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300225v) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300225v = true;
                this.f303450b.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300225v) {
                return;
            }
            long j10 = this.f300224t;
            if (j10 != this.f300220m) {
                this.f300224t = j10 + 1;
                return;
            }
            this.f300225v = true;
            this.f300223s.cancel();
            f(t10);
        }
    }

    public t0(io.reactivex.l<T> lVar, long j10, T t10, boolean z10) {
        super(lVar);
        this.f300216c = j10;
        this.f300217d = t10;
        this.f300218e = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f300216c, this.f300217d, this.f300218e));
    }
}
