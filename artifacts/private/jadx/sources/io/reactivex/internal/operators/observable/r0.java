package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class r0<T> extends io.reactivex.s<T> implements ej.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f302229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302230b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f302231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f302233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f302234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f302235e;

        a(io.reactivex.v<? super T> vVar, long j10) {
            this.f302231a = vVar;
            this.f302232b = j10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302233c, cVar)) {
                this.f302233c = cVar;
                this.f302231a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302233c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302233c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (!this.f302235e) {
                this.f302235e = true;
                this.f302231a.onComplete();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302235e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302235e = true;
                this.f302231a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302235e) {
                return;
            }
            long j10 = this.f302234d;
            if (j10 != this.f302232b) {
                this.f302234d = j10 + 1;
                return;
            }
            this.f302235e = true;
            this.f302233c.dispose();
            this.f302231a.b(t10);
        }
    }

    public r0(io.reactivex.g0<T> g0Var, long j10) {
        this.f302229a = g0Var;
        this.f302230b = j10;
    }

    @Override // ej.d
    public io.reactivex.b0<T> c() {
        return io.reactivex.plugins.a.R(new q0(this.f302229a, this.f302230b, null, false));
    }

    @Override // io.reactivex.s
    public void s1(io.reactivex.v<? super T> vVar) {
        this.f302229a.a(new a(vVar, this.f302230b));
    }
}
