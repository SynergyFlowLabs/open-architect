package io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class r3<T> extends io.reactivex.k0<T> implements ej.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f300083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T f300084b;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f300085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f300086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f300087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f300088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        T f300089e;

        a(io.reactivex.n0<? super T> n0Var, T t10) {
            this.f300085a = n0Var;
            this.f300086b = t10;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300087c.cancel();
            this.f300087c = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300087c == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300087c, wVar)) {
                this.f300087c = wVar;
                this.f300085a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300088d) {
                return;
            }
            this.f300088d = true;
            this.f300087c = io.reactivex.internal.subscriptions.j.CANCELLED;
            T t10 = this.f300089e;
            this.f300089e = null;
            if (t10 == null) {
                t10 = this.f300086b;
            }
            if (t10 != null) {
                this.f300085a.b(t10);
            } else {
                this.f300085a.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300088d) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f300088d = true;
            this.f300087c = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300085a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300088d) {
                return;
            }
            if (this.f300089e == null) {
                this.f300089e = t10;
                return;
            }
            this.f300088d = true;
            this.f300087c.cancel();
            this.f300087c = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300085a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    public r3(io.reactivex.l<T> lVar, T t10) {
        this.f300083a = lVar;
        this.f300084b = t10;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f300083a.j6(new a(n0Var, this.f300084b));
    }

    @Override // ej.b
    public io.reactivex.l<T> e() {
        return io.reactivex.plugins.a.P(new p3(this.f300083a, this.f300084b, true));
    }
}
