package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class x2 {

    public static final class a<T> extends AtomicInteger implements ej.j<T>, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f302575c = 3880992722410194083L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f302576d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f302577e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f302578f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f302579g = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f302581b;

        public a(io.reactivex.i0<? super T> i0Var, T t10) {
            this.f302580a = i0Var;
            this.f302581b = t10;
        }

        @Override // ej.o
        public void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            set(3);
        }

        @Override // ej.o
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == 3;
        }

        @Override // ej.o
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f302581b;
        }

        @Override // ej.o
        public boolean r(T t10, T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f302580a.onNext(this.f302581b);
                if (get() == 2) {
                    lazySet(3);
                    this.f302580a.onComplete();
                }
            }
        }
    }

    static final class b<T, R> extends io.reactivex.b0<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f302582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.g0<? extends R>> f302583b;

        b(T t10, dj.o<? super T, ? extends io.reactivex.g0<? extends R>> oVar) {
            this.f302582a = t10;
            this.f302583b = oVar;
        }

        @Override // io.reactivex.b0
        public void H5(io.reactivex.i0<? super R> i0Var) {
            try {
                io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302583b.apply(this.f302582a), "The mapper returned a null ObservableSource");
                if (!(g0Var instanceof Callable)) {
                    g0Var.a(i0Var);
                    return;
                }
                try {
                    Object objCall = ((Callable) g0Var).call();
                    if (objCall == null) {
                        io.reactivex.internal.disposables.e.d(i0Var);
                        return;
                    }
                    a aVar = new a(i0Var, objCall);
                    i0Var.d(aVar);
                    aVar.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.internal.disposables.e.l(th2, i0Var);
                }
            } catch (Throwable th3) {
                io.reactivex.internal.disposables.e.l(th3, i0Var);
            }
        }
    }

    private x2() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> io.reactivex.b0<U> a(T t10, dj.o<? super T, ? extends io.reactivex.g0<? extends U>> oVar) {
        return io.reactivex.plugins.a.R(new b(t10, oVar));
    }

    public static <T, R> boolean b(io.reactivex.g0<T> g0Var, io.reactivex.i0<? super R> i0Var, dj.o<? super T, ? extends io.reactivex.g0<? extends R>> oVar) {
        if (!(g0Var instanceof Callable)) {
            return false;
        }
        try {
            a0.b bVar = (Object) ((Callable) g0Var).call();
            if (bVar == null) {
                io.reactivex.internal.disposables.e.d(i0Var);
                return true;
            }
            try {
                io.reactivex.g0 g0Var2 = (io.reactivex.g0) io.reactivex.internal.functions.b.g(oVar.apply(bVar), "The mapper returned a null ObservableSource");
                if (g0Var2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) g0Var2).call();
                        if (objCall == null) {
                            io.reactivex.internal.disposables.e.d(i0Var);
                            return true;
                        }
                        a aVar = new a(i0Var, objCall);
                        i0Var.d(aVar);
                        aVar.run();
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        io.reactivex.internal.disposables.e.l(th2, i0Var);
                        return true;
                    }
                } else {
                    g0Var2.a(i0Var);
                }
                return true;
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                io.reactivex.internal.disposables.e.l(th3, i0Var);
                return true;
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.b.b(th4);
            io.reactivex.internal.disposables.e.l(th4, i0Var);
            return true;
        }
    }
}
