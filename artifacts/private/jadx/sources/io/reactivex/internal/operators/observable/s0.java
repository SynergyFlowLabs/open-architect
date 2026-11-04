package io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class s0<T> extends io.reactivex.k0<T> implements ej.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f302316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f302318c;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T f302321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f302322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f302323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f302324f;

        a(io.reactivex.n0<? super T> n0Var, long j10, T t10) {
            this.f302319a = n0Var;
            this.f302320b = j10;
            this.f302321c = t10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302322d, cVar)) {
                this.f302322d = cVar;
                this.f302319a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302322d.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302322d.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302324f) {
                return;
            }
            this.f302324f = true;
            T t10 = this.f302321c;
            if (t10 != null) {
                this.f302319a.b(t10);
            } else {
                this.f302319a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302324f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302324f = true;
                this.f302319a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302324f) {
                return;
            }
            long j10 = this.f302323e;
            if (j10 != this.f302320b) {
                this.f302323e = j10 + 1;
                return;
            }
            this.f302324f = true;
            this.f302322d.dispose();
            this.f302319a.b(t10);
        }
    }

    public s0(io.reactivex.g0<T> g0Var, long j10, T t10) {
        this.f302316a = g0Var;
        this.f302317b = j10;
        this.f302318c = t10;
    }

    @Override // ej.d
    public io.reactivex.b0<T> c() {
        return io.reactivex.plugins.a.R(new q0(this.f302316a, this.f302317b, this.f302318c, true));
    }

    @Override // io.reactivex.k0
    public void d1(io.reactivex.n0<? super T> n0Var) {
        this.f302316a.a(new a(n0Var, this.f302317b, this.f302318c));
    }
}
