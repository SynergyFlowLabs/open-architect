package io.reactivex.internal.operators.observable;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class m4<T, U, V> extends io.reactivex.b0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.b0<? extends T> f301975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<U> f301976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<? super T, ? super U, ? extends V> f301977c;

    static final class a<T, U, V> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super V> f301978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator<U> f301979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.c<? super T, ? super U, ? extends V> f301980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f301981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f301982e;

        a(io.reactivex.i0<? super V> i0Var, Iterator<U> it, dj.c<? super T, ? super U, ? extends V> cVar) {
            this.f301978a = i0Var;
            this.f301979b = it;
            this.f301980c = cVar;
        }

        void a(Throwable th2) {
            this.f301982e = true;
            this.f301981d.dispose();
            this.f301978a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301981d, cVar)) {
                this.f301981d = cVar;
                this.f301978a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301981d.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301981d.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301982e) {
                return;
            }
            this.f301982e = true;
            this.f301978a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301982e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301982e = true;
                this.f301978a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (!this.f301982e) {
                try {
                    try {
                        this.f301978a.onNext(io.reactivex.internal.functions.b.g(this.f301980c.apply(t10, io.reactivex.internal.functions.b.g(this.f301979b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                        try {
                            if (!this.f301979b.hasNext()) {
                                this.f301982e = true;
                                this.f301981d.dispose();
                                this.f301978a.onComplete();
                            }
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.b.b(th2);
                            a(th2);
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        a(th3);
                    }
                } catch (Throwable th4) {
                    io.reactivex.exceptions.b.b(th4);
                    a(th4);
                }
            }
        }
    }

    public m4(io.reactivex.b0<? extends T> b0Var, Iterable<U> iterable, dj.c<? super T, ? super U, ? extends V> cVar) {
        this.f301975a = b0Var;
        this.f301976b = iterable;
        this.f301977c = cVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super V> i0Var) {
        try {
            Iterator it = (Iterator) io.reactivex.internal.functions.b.g(this.f301976b.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.f301975a.a(new a(i0Var, it, this.f301977c));
                } else {
                    io.reactivex.internal.disposables.e.d(i0Var);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.internal.disposables.e.l(th2, i0Var);
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.internal.disposables.e.l(th3, i0Var);
        }
    }
}
