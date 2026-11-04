package io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class v0<T> extends io.reactivex.k0<T> implements ej.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f300357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f300358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f300359c;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f300360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f300361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T f300362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.w f300363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f300364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f300365f;

        a(io.reactivex.n0<? super T> n0Var, long j10, T t10) {
            this.f300360a = n0Var;
            this.f300361b = j10;
            this.f300362c = t10;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300363d.cancel();
            this.f300363d = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300363d == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300363d, wVar)) {
                this.f300363d = wVar;
                this.f300360a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300363d = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (this.f300365f) {
                return;
            }
            this.f300365f = true;
            T t10 = this.f300362c;
            if (t10 != null) {
                this.f300360a.b(t10);
            } else {
                this.f300360a.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300365f) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f300365f = true;
            this.f300363d = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300360a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300365f) {
                return;
            }
            long j10 = this.f300364e;
            if (j10 != this.f300361b) {
                this.f300364e = j10 + 1;
                return;
            }
            this.f300365f = true;
            this.f300363d.cancel();
            this.f300363d = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300360a.b(t10);
        }
    }

    public v0(io.reactivex.l<T> lVar, long j10, T t10) {
        this.f300357a = lVar;
        this.f300358b = j10;
        this.f300359c = t10;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f300357a.j6(new a(n0Var, this.f300358b, this.f300359c));
    }

    @Override // ej.b
    public io.reactivex.l<T> e() {
        return io.reactivex.plugins.a.P(new t0(this.f300357a, this.f300358b, this.f300359c, true));
    }
}
