package io.reactivex.internal.operators.single;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class a0<T, R> extends io.reactivex.b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f302883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends Iterable<? extends R>> f302884b;

    static final class a<T, R> extends io.reactivex.internal.observers.b<R> implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f302885h = -8938804753851907758L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.i0<? super R> f302886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super T, ? extends Iterable<? extends R>> f302887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f302888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile Iterator<? extends R> f302889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f302890f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f302891g;

        a(io.reactivex.i0<? super R> i0Var, dj.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f302886b = i0Var;
            this.f302887c = oVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            io.reactivex.i0<? super R> i0Var = this.f302886b;
            try {
                Iterator<? extends R> it = this.f302887c.apply(t10).iterator();
                if (!it.hasNext()) {
                    i0Var.onComplete();
                    return;
                }
                if (this.f302891g) {
                    this.f302889e = it;
                    i0Var.onNext(null);
                    i0Var.onComplete();
                    return;
                }
                while (!this.f302890f) {
                    try {
                        i0Var.onNext(it.next());
                        if (this.f302890f) {
                            break;
                        }
                        try {
                            if (!it.hasNext()) {
                                i0Var.onComplete();
                                return;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.b.b(th2);
                            i0Var.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        i0Var.onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                this.f302886b.onError(th4);
            }
        }

        @Override // ej.o
        public void clear() {
            this.f302889e = null;
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302888d, cVar)) {
                this.f302888d = cVar;
                this.f302886b.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302890f = true;
            this.f302888d.dispose();
            this.f302888d = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // ej.o
        public boolean isEmpty() {
            if (this.f302889e != null) {
                return false;
            }
            int i10 = 7 >> 1;
            return true;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302890f;
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f302888d = io.reactivex.internal.disposables.d.DISPOSED;
            this.f302886b.onError(th2);
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f302891g = true;
            return 2;
        }

        @Override // ej.o
        @cj.g
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f302889e;
            if (it == null) {
                return null;
            }
            R r10 = (R) io.reactivex.internal.functions.b.g(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f302889e = null;
            }
            return r10;
        }
    }

    public a0(io.reactivex.q0<T> q0Var, dj.o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f302883a = q0Var;
        this.f302884b = oVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super R> i0Var) {
        this.f302883a.f(new a(i0Var, this.f302884b));
    }
}
