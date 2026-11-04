package io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class e3<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<? extends T> f301512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T f301513b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f301514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f301515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f301517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f301518e;

        a(io.reactivex.n0<? super T> n0Var, T t10) {
            this.f301514a = n0Var;
            this.f301515b = t10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301516c, cVar)) {
                this.f301516c = cVar;
                this.f301514a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301516c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301516c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301518e) {
                return;
            }
            this.f301518e = true;
            T t10 = this.f301517d;
            this.f301517d = null;
            if (t10 == null) {
                t10 = this.f301515b;
            }
            if (t10 != null) {
                this.f301514a.b(t10);
            } else {
                this.f301514a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301518e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301518e = true;
                this.f301514a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301518e) {
                return;
            }
            if (this.f301517d == null) {
                this.f301517d = t10;
                return;
            }
            this.f301518e = true;
            this.f301516c.dispose();
            this.f301514a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    public e3(io.reactivex.g0<? extends T> g0Var, T t10) {
        this.f301512a = g0Var;
        this.f301513b = t10;
    }

    @Override // io.reactivex.k0
    public void d1(io.reactivex.n0<? super T> n0Var) {
        this.f301512a.a(new a(n0Var, this.f301513b));
    }
}
