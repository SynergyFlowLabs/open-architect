package io.reactivex.internal.operators.maybe;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class d0<T, R> extends io.reactivex.b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends Iterable<? extends R>> f300726b;

    static final class a<T, R> extends io.reactivex.internal.observers.c<R> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f300727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends Iterable<? extends R>> f300728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f300729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile Iterator<? extends R> f300730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f300731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f300732f;

        a(io.reactivex.i0<? super R> i0Var, dj.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f300727a = i0Var;
            this.f300728b = oVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            io.reactivex.i0<? super R> i0Var = this.f300727a;
            try {
                Iterator<? extends R> it = this.f300728b.apply(t10).iterator();
                if (!it.hasNext()) {
                    i0Var.onComplete();
                    return;
                }
                this.f300730d = it;
                if (this.f300732f) {
                    i0Var.onNext(null);
                    i0Var.onComplete();
                    return;
                }
                while (!this.f300731e) {
                    try {
                        i0Var.onNext(it.next());
                        if (this.f300731e) {
                            return;
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
                i0Var.onError(th4);
            }
        }

        @Override // ej.o
        public void clear() {
            this.f300730d = null;
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300729c, cVar)) {
                this.f300729c = cVar;
                this.f300727a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300731e = true;
            this.f300729c.dispose();
            this.f300729c = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f300730d == null;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300731e;
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300727a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300729c = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300727a.onError(th2);
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f300732f = true;
            return 2;
        }

        @Override // ej.o
        @cj.g
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f300730d;
            if (it == null) {
                return null;
            }
            R r10 = (R) io.reactivex.internal.functions.b.g(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f300730d = null;
            }
            return r10;
        }
    }

    public d0(io.reactivex.y<T> yVar, dj.o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f300725a = yVar;
        this.f300726b = oVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super R> i0Var) {
        this.f300725a.a(new a(i0Var, this.f300726b));
    }
}
