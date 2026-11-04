package io.reactivex.internal.operators.completable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class r0<R> extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<R> f299019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super R, ? extends io.reactivex.i> f299020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super R> f299021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f299022d;

    static final class a<R> extends AtomicReference<Object> implements io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f299023e = -674404550052917487L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f299024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.g<? super R> f299025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f299026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f299027d;

        a(io.reactivex.f fVar, R r10, dj.g<? super R> gVar, boolean z10) {
            super(r10);
            this.f299024a = fVar;
            this.f299025b = gVar;
            this.f299026c = z10;
        }

        void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f299025b.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f299027d, cVar)) {
                this.f299027d = cVar;
                this.f299024a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f299027d.dispose();
            this.f299027d = io.reactivex.internal.disposables.d.DISPOSED;
            a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f299027d.k();
        }

        @Override // io.reactivex.f
        public void onComplete() {
            this.f299027d = io.reactivex.internal.disposables.d.DISPOSED;
            if (this.f299026c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f299025b.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f299024a.onError(th2);
                    return;
                }
            }
            this.f299024a.onComplete();
            if (this.f299026c) {
                return;
            }
            a();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f299027d = io.reactivex.internal.disposables.d.DISPOSED;
            if (this.f299026c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f299025b.accept(andSet);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    th2 = new io.reactivex.exceptions.a(th2, th3);
                }
            }
            this.f299024a.onError(th2);
            if (this.f299026c) {
                return;
            }
            a();
        }
    }

    public r0(Callable<R> callable, dj.o<? super R, ? extends io.reactivex.i> oVar, dj.g<? super R> gVar, boolean z10) {
        this.f299019a = callable;
        this.f299020b = oVar;
        this.f299021c = gVar;
        this.f299022d = z10;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        try {
            R rCall = this.f299019a.call();
            try {
                ((io.reactivex.i) io.reactivex.internal.functions.b.g(this.f299020b.apply(rCall), "The completableFunction returned a null CompletableSource")).b(new a(fVar, rCall, this.f299021c, this.f299022d));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                if (this.f299022d) {
                    try {
                        this.f299021c.accept(rCall);
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        io.reactivex.internal.disposables.e.e(new io.reactivex.exceptions.a(th2, th3), fVar);
                        return;
                    }
                }
                io.reactivex.internal.disposables.e.e(th2, fVar);
                if (!this.f299022d) {
                    try {
                        this.f299021c.accept(rCall);
                    } catch (Throwable th4) {
                        io.reactivex.exceptions.b.b(th4);
                        io.reactivex.plugins.a.Y(th4);
                    }
                }
            }
        } catch (Throwable th5) {
            io.reactivex.exceptions.b.b(th5);
            io.reactivex.internal.disposables.e.e(th5, fVar);
        }
    }
}
