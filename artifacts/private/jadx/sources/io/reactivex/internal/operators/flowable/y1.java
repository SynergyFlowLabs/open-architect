package io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class y1<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.u<T> f300537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T f300538b;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f300539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f300540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f300541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f300542d;

        a(io.reactivex.n0<? super T> n0Var, T t10) {
            this.f300539a = n0Var;
            this.f300540b = t10;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300541c.cancel();
            this.f300541c = io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            if (this.f300541c != io.reactivex.internal.subscriptions.j.CANCELLED) {
                return false;
            }
            int i10 = 2 & 1;
            return true;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300541c, wVar)) {
                this.f300541c = wVar;
                this.f300539a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300541c = io.reactivex.internal.subscriptions.j.CANCELLED;
            T t10 = this.f300542d;
            if (t10 != null) {
                this.f300542d = null;
                this.f300539a.b(t10);
                return;
            }
            T t11 = this.f300540b;
            if (t11 != null) {
                this.f300539a.b(t11);
            } else {
                this.f300539a.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300541c = io.reactivex.internal.subscriptions.j.CANCELLED;
            this.f300542d = null;
            this.f300539a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f300542d = t10;
        }
    }

    public y1(org.reactivestreams.u<T> uVar, T t10) {
        this.f300537a = uVar;
        this.f300538b = t10;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f300537a.e(new a(n0Var, this.f300538b));
    }
}
