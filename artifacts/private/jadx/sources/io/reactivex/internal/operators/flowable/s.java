package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class s<T, U> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends U> f300100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.b<? super U, ? super T> f300101d;

    static final class a<T, U> extends io.reactivex.internal.subscriptions.f<U> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final long f300102t = -3589550218733891694L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final dj.b<? super U, ? super T> f300103m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final U f300104n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        org.reactivestreams.w f300105o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f300106s;

        a(org.reactivestreams.v<? super U> vVar, U u10, dj.b<? super U, ? super T> bVar) {
            super(vVar);
            this.f300103m = bVar;
            this.f300104n = u10;
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f300105o.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300105o, wVar)) {
                this.f300105o = wVar;
                this.f303450b.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300106s) {
                return;
            }
            this.f300106s = true;
            f(this.f300104n);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300106s) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300106s = true;
                this.f303450b.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300106s) {
                return;
            }
            try {
                this.f300103m.accept(this.f300104n, t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300105o.cancel();
                onError(th2);
            }
        }
    }

    public s(io.reactivex.l<T> lVar, Callable<? extends U> callable, dj.b<? super U, ? super T> bVar) {
        super(lVar);
        this.f300100c = callable;
        this.f300101d = bVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super U> vVar) {
        try {
            this.f299043b.j6(new a(vVar, io.reactivex.internal.functions.b.g(this.f300100c.call(), "The initial value supplied is null"), this.f300101d));
        } catch (Throwable th2) {
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
