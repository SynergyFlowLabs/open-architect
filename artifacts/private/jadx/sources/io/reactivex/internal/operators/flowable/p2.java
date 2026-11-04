package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class p2<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super Throwable, ? extends org.reactivestreams.u<? extends T>> f299967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f299968d;

    static final class a<T> extends io.reactivex.internal.subscriptions.i implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final long f299969s = 4063763155303814625L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299970j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final dj.o<? super Throwable, ? extends org.reactivestreams.u<? extends T>> f299971k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final boolean f299972l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f299973m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f299974n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f299975o;

        a(org.reactivestreams.v<? super T> vVar, dj.o<? super Throwable, ? extends org.reactivestreams.u<? extends T>> oVar, boolean z10) {
            super(false);
            this.f299970j = vVar;
            this.f299971k = oVar;
            this.f299972l = z10;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            h(wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299974n) {
                return;
            }
            this.f299974n = true;
            this.f299973m = true;
            this.f299970j.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299973m) {
                if (this.f299974n) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                } else {
                    this.f299970j.onError(th2);
                    return;
                }
            }
            this.f299973m = true;
            if (this.f299972l && !(th2 instanceof Exception)) {
                this.f299970j.onError(th2);
                return;
            }
            try {
                org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f299971k.apply(th2), "The nextSupplier returned a null Publisher");
                long j10 = this.f299975o;
                if (j10 != 0) {
                    g(j10);
                }
                uVar.e(this);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f299970j.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299974n) {
                return;
            }
            if (!this.f299973m) {
                this.f299975o++;
            }
            this.f299970j.onNext(t10);
        }
    }

    public p2(io.reactivex.l<T> lVar, dj.o<? super Throwable, ? extends org.reactivestreams.u<? extends T>> oVar, boolean z10) {
        super(lVar);
        this.f299967c = oVar;
        this.f299968d = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        a aVar = new a(vVar, this.f299967c, this.f299968d);
        vVar.l(aVar);
        this.f299043b.j6(aVar);
    }
}
