package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class n<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<U> f300899b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f300900b = 706635022205076709L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300901a;

        a(io.reactivex.v<? super T> vVar) {
            this.f300901a = vVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300901a.b(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300901a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300901a.onError(th2);
        }
    }

    static final class b<T> implements io.reactivex.q<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<T> f300902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.y<T> f300903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f300904c;

        b(io.reactivex.v<? super T> vVar, io.reactivex.y<T> yVar) {
            this.f300902a = new a<>(vVar);
            this.f300903b = yVar;
        }

        void a() {
            io.reactivex.y<T> yVar = this.f300903b;
            this.f300903b = null;
            yVar.a(this.f300902a);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300904c.cancel();
            this.f300904c = io.reactivex.internal.subscriptions.j.CANCELLED;
            io.reactivex.internal.disposables.d.b(this.f300902a);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f300902a.get());
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300904c, wVar)) {
                this.f300904c = wVar;
                this.f300902a.f300901a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            org.reactivestreams.w wVar = this.f300904c;
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (wVar != jVar) {
                this.f300904c = jVar;
                a();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            org.reactivestreams.w wVar = this.f300904c;
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (wVar == jVar) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300904c = jVar;
                this.f300902a.f300901a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            org.reactivestreams.w wVar = this.f300904c;
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (wVar != jVar) {
                wVar.cancel();
                this.f300904c = jVar;
                a();
            }
        }
    }

    public n(io.reactivex.y<T> yVar, org.reactivestreams.u<U> uVar) {
        super(yVar);
        this.f300899b = uVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300899b.e(new b(vVar, this.f300667a));
    }
}
