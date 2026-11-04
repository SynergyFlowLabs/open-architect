package io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class p3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f299976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f299977d;

    static final class a<T> extends io.reactivex.internal.subscriptions.f<T> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final long f299978t = -5526049321428043809L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final T f299979m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final boolean f299980n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        org.reactivestreams.w f299981o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f299982s;

        a(org.reactivestreams.v<? super T> vVar, T t10, boolean z10) {
            super(vVar);
            this.f299979m = t10;
            this.f299980n = z10;
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f299981o.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299981o, wVar)) {
                this.f299981o = wVar;
                this.f303450b.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299982s) {
                return;
            }
            this.f299982s = true;
            T t10 = this.f303451c;
            this.f303451c = null;
            if (t10 == null) {
                t10 = this.f299979m;
            }
            if (t10 != null) {
                f(t10);
            } else if (this.f299980n) {
                this.f303450b.onError(new NoSuchElementException());
            } else {
                this.f303450b.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299982s) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299982s = true;
                this.f303450b.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299982s) {
                return;
            }
            if (this.f303451c == null) {
                this.f303451c = t10;
                return;
            }
            this.f299982s = true;
            this.f299981o.cancel();
            this.f303450b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    public p3(io.reactivex.l<T> lVar, T t10, boolean z10) {
        super(lVar);
        this.f299976c = t10;
        this.f299977d = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299976c, this.f299977d));
    }
}
