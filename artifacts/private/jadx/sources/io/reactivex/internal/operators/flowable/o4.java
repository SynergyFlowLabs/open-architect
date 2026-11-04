package io.reactivex.internal.operators.flowable;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class o4<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<U> f299956c;

    static final class a<T, U extends Collection<? super T>> extends io.reactivex.internal.subscriptions.f<U> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final long f299957n = -8134157938864266736L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        org.reactivestreams.w f299958m;

        /* JADX WARN: Multi-variable type inference failed */
        a(org.reactivestreams.v<? super U> vVar, U u10) {
            super(vVar);
            this.f303451c = u10;
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f299958m.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299958m, wVar)) {
                this.f299958m = wVar;
                this.f303450b.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            f(this.f303451c);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f303451c = null;
            this.f303450b.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            Collection collection = (Collection) this.f303451c;
            if (collection != null) {
                collection.add(t10);
            }
        }
    }

    public o4(io.reactivex.l<T> lVar, Callable<U> callable) {
        super(lVar);
        this.f299956c = callable;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super U> vVar) {
        try {
            this.f299043b.j6(new a(vVar, (Collection) io.reactivex.internal.functions.b.g(this.f299956c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
