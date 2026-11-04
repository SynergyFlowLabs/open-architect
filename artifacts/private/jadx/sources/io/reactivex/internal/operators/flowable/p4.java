package io.reactivex.internal.operators.flowable;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class p4<T, U extends Collection<? super T>> extends io.reactivex.k0<U> implements ej.b<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f299983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<U> f299984b;

    static final class a<T, U extends Collection<? super T>> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super U> f299985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f299986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        U f299987c;

        a(io.reactivex.n0<? super U> n0Var, U u10) {
            this.f299985a = n0Var;
            this.f299987c = u10;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f299986b.cancel();
            this.f299986b = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f299986b == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299986b, wVar)) {
                this.f299986b = wVar;
                this.f299985a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299986b = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f299985a.b(this.f299987c);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299987c = null;
            this.f299986b = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f299985a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299987c.add(t10);
        }
    }

    public p4(io.reactivex.l<T> lVar) {
        this(lVar, io.reactivex.internal.util.b.k());
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super U> n0Var) {
        try {
            this.f299983a.j6(new a(n0Var, (Collection) io.reactivex.internal.functions.b.g(this.f299984b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.o(th2, n0Var);
        }
    }

    @Override // ej.b
    public io.reactivex.l<U> e() {
        return io.reactivex.plugins.a.P(new o4(this.f299983a, this.f299984b));
    }

    public p4(io.reactivex.l<T> lVar, Callable<U> callable) {
        this.f299983a = lVar;
        this.f299984b = callable;
    }
}
