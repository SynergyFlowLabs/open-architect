package io.reactivex.internal.operators.maybe;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class s1<T, D> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends D> f300957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super D, ? extends io.reactivex.y<? extends T>> f300958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super D> f300959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f300960d;

    static final class a<T, D> extends AtomicReference<Object> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f300961e = -674404550052917487L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.g<? super D> f300963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f300964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f300965d;

        a(io.reactivex.v<? super T> vVar, D d10, dj.g<? super D> gVar, boolean z10) {
            super(d10);
            this.f300962a = vVar;
            this.f300963b = gVar;
            this.f300964c = z10;
        }

        void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f300963b.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0031  */
        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300965d = io.reactivex.internal.disposables.d.DISPOSED;
            if (this.f300964c) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.f300963b.accept(andSet);
                        this.f300962a.b(t10);
                        if (!this.f300964c) {
                            a();
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f300962a.onError(th2);
                    }
                }
            } else {
                this.f300962a.b(t10);
                if (!this.f300964c) {
                    a();
                }
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300965d, cVar)) {
                this.f300965d = cVar;
                this.f300962a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300965d.dispose();
            this.f300965d = io.reactivex.internal.disposables.d.DISPOSED;
            a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300965d.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300965d = io.reactivex.internal.disposables.d.DISPOSED;
            if (this.f300964c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f300963b.accept(andSet);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f300962a.onError(th2);
                    return;
                }
            }
            this.f300962a.onComplete();
            if (this.f300964c) {
                return;
            }
            a();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300965d = io.reactivex.internal.disposables.d.DISPOSED;
            if (this.f300964c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f300963b.accept(andSet);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    th2 = new io.reactivex.exceptions.a(th2, th3);
                }
            }
            this.f300962a.onError(th2);
            if (this.f300964c) {
                return;
            }
            a();
        }
    }

    public s1(Callable<? extends D> callable, dj.o<? super D, ? extends io.reactivex.y<? extends T>> oVar, dj.g<? super D> gVar, boolean z10) {
        this.f300957a = callable;
        this.f300958b = oVar;
        this.f300959c = gVar;
        this.f300960d = z10;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        try {
            D dCall = this.f300957a.call();
            try {
                ((io.reactivex.y) io.reactivex.internal.functions.b.g(this.f300958b.apply(dCall), "The sourceSupplier returned a null MaybeSource")).a(new a(vVar, dCall, this.f300959c, this.f300960d));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                if (this.f300960d) {
                    try {
                        this.f300959c.accept(dCall);
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        io.reactivex.internal.disposables.e.f(new io.reactivex.exceptions.a(th2, th3), vVar);
                        return;
                    }
                }
                io.reactivex.internal.disposables.e.f(th2, vVar);
                if (this.f300960d) {
                    return;
                }
                try {
                    this.f300959c.accept(dCall);
                } catch (Throwable th4) {
                    io.reactivex.exceptions.b.b(th4);
                    io.reactivex.plugins.a.Y(th4);
                }
            }
        } catch (Throwable th5) {
            io.reactivex.exceptions.b.b(th5);
            io.reactivex.internal.disposables.e.f(th5, vVar);
        }
    }
}
