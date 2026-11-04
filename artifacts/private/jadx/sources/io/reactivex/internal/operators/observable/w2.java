package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class w2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<?> f302531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f302532c;

    static final class a<T> extends c<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f302533h = -3029755663834015785L;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f302534f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f302535g;

        a(io.reactivex.i0<? super T> i0Var, io.reactivex.g0<?> g0Var) {
            super(i0Var, g0Var);
            this.f302534f = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.observable.w2.c
        void b() {
            this.f302535g = true;
            if (this.f302534f.getAndIncrement() == 0) {
                e();
                this.f302538a.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.w2.c
        void c() {
            this.f302535g = true;
            if (this.f302534f.getAndIncrement() == 0) {
                e();
                this.f302538a.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.w2.c
        void g() {
            if (this.f302534f.getAndIncrement() == 0) {
                do {
                    boolean z10 = this.f302535g;
                    e();
                    if (z10) {
                        this.f302538a.onComplete();
                        return;
                    }
                } while (this.f302534f.decrementAndGet() != 0);
            }
        }
    }

    static final class b<T> extends c<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f302536f = -3029755663834015785L;

        b(io.reactivex.i0<? super T> i0Var, io.reactivex.g0<?> g0Var) {
            super(i0Var, g0Var);
        }

        @Override // io.reactivex.internal.operators.observable.w2.c
        void b() {
            this.f302538a.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.w2.c
        void c() {
            this.f302538a.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.w2.c
        void g() {
            e();
        }
    }

    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302537e = -3517602651313910099L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<?> f302539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302540c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f302541d;

        c(io.reactivex.i0<? super T> i0Var, io.reactivex.g0<?> g0Var) {
            this.f302538a = i0Var;
            this.f302539b = g0Var;
        }

        public void a() {
            this.f302541d.dispose();
            c();
        }

        abstract void b();

        abstract void c();

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302541d, cVar)) {
                this.f302541d = cVar;
                this.f302538a.d(this);
                if (this.f302540c.get() == null) {
                    this.f302539b.a(new d(this));
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f302540c);
            this.f302541d.dispose();
        }

        void e() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f302538a.onNext(andSet);
            }
        }

        public void f(Throwable th2) {
            this.f302541d.dispose();
            this.f302538a.onError(th2);
        }

        abstract void g();

        boolean h(io.reactivex.disposables.c cVar) {
            return io.reactivex.internal.disposables.d.o(this.f302540c, cVar);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302540c.get() == io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            io.reactivex.internal.disposables.d.b(this.f302540c);
            b();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f302540c);
            this.f302538a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            lazySet(t10);
        }
    }

    static final class d<T> implements io.reactivex.i0<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c<T> f302542a;

        d(c<T> cVar) {
            this.f302542a = cVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f302542a.h(cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302542a.a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302542a.f(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(Object obj) {
            this.f302542a.g();
        }
    }

    public w2(io.reactivex.g0<T> g0Var, io.reactivex.g0<?> g0Var2, boolean z10) {
        super(g0Var);
        this.f302531b = g0Var2;
        this.f302532c = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.observers.m mVar = new io.reactivex.observers.m(i0Var);
        if (this.f302532c) {
            this.f301291a.a(new a(mVar, this.f302531b));
        } else {
            this.f301291a.a(new b(mVar, this.f302531b));
        }
    }
}
