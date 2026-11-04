package io.reactivex.internal.operators.observable;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class b1<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends Iterable<? extends R>> f301359b;

    static final class a<T, R> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f301360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends Iterable<? extends R>> f301361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301362c;

        a(io.reactivex.i0<? super R> i0Var, dj.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f301360a = i0Var;
            this.f301361b = oVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301362c, cVar)) {
                this.f301362c = cVar;
                this.f301360a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301362c.dispose();
            this.f301362c = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301362c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            io.reactivex.disposables.c cVar = this.f301362c;
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar) {
                return;
            }
            this.f301362c = dVar;
            this.f301360a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.disposables.c cVar = this.f301362c;
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301362c = dVar;
                this.f301360a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301362c == io.reactivex.internal.disposables.d.DISPOSED) {
                return;
            }
            try {
                Iterator<? extends R> it = this.f301361b.apply(t10).iterator();
                io.reactivex.i0<? super R> i0Var = this.f301360a;
                while (it.hasNext()) {
                    try {
                        try {
                            i0Var.onNext((Object) io.reactivex.internal.functions.b.g(it.next(), "The iterator returned a null value"));
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.b.b(th2);
                            this.f301362c.dispose();
                            onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        this.f301362c.dispose();
                        onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                this.f301362c.dispose();
                onError(th4);
            }
        }
    }

    public b1(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends Iterable<? extends R>> oVar) {
        super(g0Var);
        this.f301359b = oVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super R> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301359b));
    }
}
