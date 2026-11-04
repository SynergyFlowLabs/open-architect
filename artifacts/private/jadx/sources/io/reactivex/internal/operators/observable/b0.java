package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class b0<T> extends io.reactivex.k0<Long> implements ej.d<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f301355a;

    static final class a implements io.reactivex.i0<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Long> f301356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f301357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f301358c;

        a(io.reactivex.n0<? super Long> n0Var) {
            this.f301356a = n0Var;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301357b, cVar)) {
                this.f301357b = cVar;
                this.f301356a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301357b.dispose();
            this.f301357b = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301357b.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301357b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f301356a.b(Long.valueOf(this.f301358c));
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301357b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f301356a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(Object obj) {
            this.f301358c++;
        }
    }

    public b0(io.reactivex.g0<T> g0Var) {
        this.f301355a = g0Var;
    }

    @Override // ej.d
    public io.reactivex.b0<Long> c() {
        return io.reactivex.plugins.a.R(new a0(this.f301355a));
    }

    @Override // io.reactivex.k0
    public void d1(io.reactivex.n0<? super Long> n0Var) {
        this.f301355a.a(new a(n0Var));
    }
}
