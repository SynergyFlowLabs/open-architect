package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class t<T, U> extends io.reactivex.k0<U> implements ej.b<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f300208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends U> f300209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.b<? super U, ? super T> f300210c;

    static final class a<T, U> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super U> f300211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.b<? super U, ? super T> f300212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final U f300213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.w f300214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f300215e;

        a(io.reactivex.n0<? super U> n0Var, U u10, dj.b<? super U, ? super T> bVar) {
            this.f300211a = n0Var;
            this.f300212b = bVar;
            this.f300213c = u10;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300214d.cancel();
            this.f300214d = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300214d == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300214d, wVar)) {
                this.f300214d = wVar;
                this.f300211a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300215e) {
                return;
            }
            this.f300215e = true;
            this.f300214d = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300211a.b(this.f300213c);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300215e) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f300215e = true;
            this.f300214d = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300211a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300215e) {
                return;
            }
            try {
                this.f300212b.accept(this.f300213c, t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300214d.cancel();
                onError(th2);
            }
        }
    }

    public t(io.reactivex.l<T> lVar, Callable<? extends U> callable, dj.b<? super U, ? super T> bVar) {
        this.f300208a = lVar;
        this.f300209b = callable;
        this.f300210c = bVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super U> n0Var) {
        try {
            this.f300208a.j6(new a(n0Var, io.reactivex.internal.functions.b.g(this.f300209b.call(), "The initialSupplier returned a null value"), this.f300210c));
        } catch (Throwable th2) {
            io.reactivex.internal.disposables.e.o(th2, n0Var);
        }
    }

    @Override // ej.b
    public io.reactivex.l<U> e() {
        return io.reactivex.plugins.a.P(new s(this.f300208a, this.f300209b, this.f300210c));
    }
}
