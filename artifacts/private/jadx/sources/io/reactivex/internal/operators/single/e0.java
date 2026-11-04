package io.reactivex.internal.operators.single;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class e0<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f302926a;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f302928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f302929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f302930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f302931e;

        a(io.reactivex.n0<? super T> n0Var) {
            this.f302927a = n0Var;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302931e = true;
            this.f302928b.cancel();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302931e;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302928b, wVar)) {
                this.f302928b = wVar;
                this.f302927a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302930d) {
                return;
            }
            this.f302930d = true;
            T t10 = this.f302929c;
            this.f302929c = null;
            if (t10 == null) {
                this.f302927a.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                this.f302927a.b(t10);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302930d) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302930d = true;
            this.f302929c = null;
            this.f302927a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f302930d) {
                return;
            }
            if (this.f302929c == null) {
                this.f302929c = t10;
                return;
            }
            this.f302928b.cancel();
            this.f302930d = true;
            this.f302929c = null;
            this.f302927a.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
        }
    }

    public e0(org.reactivestreams.u<? extends T> uVar) {
        this.f302926a = uVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f302926a.e(new a(n0Var));
    }
}
