package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class i<T, U> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f302967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<U> f302968b;

    static final class a<T, U> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.q<U>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302969e = -8565274649390031272L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.q0<T> f302971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f302972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.w f302973d;

        a(io.reactivex.n0<? super T> n0Var, io.reactivex.q0<T> q0Var) {
            this.f302970a = n0Var;
            this.f302971b = q0Var;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302973d.cancel();
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302973d, wVar)) {
                this.f302973d = wVar;
                this.f302970a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302972c) {
                return;
            }
            this.f302972c = true;
            this.f302971b.f(new io.reactivex.internal.observers.z(this, this.f302970a));
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302972c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302972c = true;
                this.f302970a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(U u10) {
            this.f302973d.cancel();
            onComplete();
        }
    }

    public i(io.reactivex.q0<T> q0Var, org.reactivestreams.u<U> uVar) {
        this.f302967a = q0Var;
        this.f302968b = uVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f302968b.e(new a(n0Var, this.f302967a));
    }
}
