package io.reactivex.internal.operators.single;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class x0<T, U> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<U> f303114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super U, ? extends io.reactivex.q0<? extends T>> f303115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super U> f303116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f303117d;

    static final class a<T, U> extends AtomicReference<Object> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f303118e = -5331524057054083935L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.g<? super U> f303120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f303121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f303122d;

        a(io.reactivex.n0<? super T> n0Var, U u10, boolean z10, dj.g<? super U> gVar) {
            super(u10);
            this.f303119a = n0Var;
            this.f303121c = z10;
            this.f303120b = gVar;
        }

        void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f303120b.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303122d = io.reactivex.internal.disposables.d.DISPOSED;
            if (this.f303121c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f303120b.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f303119a.onError(th2);
                    return;
                }
            }
            this.f303119a.b(t10);
            if (this.f303121c) {
                return;
            }
            a();
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f303122d, cVar)) {
                this.f303122d = cVar;
                this.f303119a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f303122d.dispose();
            this.f303122d = io.reactivex.internal.disposables.d.DISPOSED;
            a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303122d.k();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303122d = io.reactivex.internal.disposables.d.DISPOSED;
            if (this.f303121c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f303120b.accept(andSet);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    th2 = new io.reactivex.exceptions.a(th2, th3);
                }
            }
            this.f303119a.onError(th2);
            if (this.f303121c) {
                return;
            }
            a();
        }
    }

    public x0(Callable<U> callable, dj.o<? super U, ? extends io.reactivex.q0<? extends T>> oVar, dj.g<? super U> gVar, boolean z10) {
        this.f303114a = callable;
        this.f303115b = oVar;
        this.f303116c = gVar;
        this.f303117d = z10;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        try {
            U uCall = this.f303114a.call();
            try {
                ((io.reactivex.q0) io.reactivex.internal.functions.b.g(this.f303115b.apply(uCall), "The singleFunction returned a null SingleSource")).f(new a(n0Var, uCall, this.f303117d, this.f303116c));
            } catch (Throwable th2) {
                th = th2;
                io.reactivex.exceptions.b.b(th);
                if (this.f303117d) {
                    try {
                        this.f303116c.accept(uCall);
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        th = new io.reactivex.exceptions.a(th, th3);
                    }
                }
                io.reactivex.internal.disposables.e.o(th, n0Var);
                if (this.f303117d) {
                    return;
                }
                try {
                    this.f303116c.accept(uCall);
                } catch (Throwable th4) {
                    io.reactivex.exceptions.b.b(th4);
                    io.reactivex.plugins.a.Y(th4);
                }
            }
        } catch (Throwable th5) {
            io.reactivex.exceptions.b.b(th5);
            io.reactivex.internal.disposables.e.o(th5, n0Var);
        }
    }
}
