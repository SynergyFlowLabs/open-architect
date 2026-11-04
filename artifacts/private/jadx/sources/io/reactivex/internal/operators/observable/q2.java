package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class q2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super io.reactivex.b0<Object>, ? extends io.reactivex.g0<?>> f302180b;

    static final class a<T> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f302181i = 802743776666017014L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302182a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.subjects.i<Object> f302185d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final io.reactivex.g0<T> f302188g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f302189h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicInteger f302183b = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.util.c f302184c = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final a<T>.C2176a f302186e = new C2176a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302187f = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.q2$a$a, reason: collision with other inner class name */
        final class C2176a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f302190b = 3254781284376480842L;

            C2176a() {
            }

            @Override // io.reactivex.i0
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.i0
            public void onComplete() {
                a.this.a();
            }

            @Override // io.reactivex.i0
            public void onError(Throwable th2) {
                a.this.b(th2);
            }

            @Override // io.reactivex.i0
            public void onNext(Object obj) {
                a.this.c();
            }
        }

        a(io.reactivex.i0<? super T> i0Var, io.reactivex.subjects.i<Object> iVar, io.reactivex.g0<T> g0Var) {
            this.f302182a = i0Var;
            this.f302185d = iVar;
            this.f302188g = g0Var;
        }

        void a() {
            io.reactivex.internal.disposables.d.b(this.f302187f);
            io.reactivex.internal.util.l.a(this.f302182a, this, this.f302184c);
        }

        void b(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f302187f);
            io.reactivex.internal.util.l.c(this.f302182a, th2, this, this.f302184c);
        }

        void c() {
            e();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f302187f, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f302187f);
            io.reactivex.internal.disposables.d.b(this.f302186e);
        }

        void e() {
            if (this.f302183b.getAndIncrement() == 0) {
                while (!k()) {
                    if (!this.f302189h) {
                        this.f302189h = true;
                        this.f302188g.a(this);
                    }
                    if (this.f302183b.decrementAndGet() == 0) {
                        break;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f302187f.get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            io.reactivex.internal.disposables.d.d(this.f302187f, null);
            this.f302189h = false;
            this.f302185d.onNext(0);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f302186e);
            io.reactivex.internal.util.l.c(this.f302182a, th2, this, this.f302184c);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            io.reactivex.internal.util.l.e(this.f302182a, t10, this, this.f302184c);
        }
    }

    public q2(io.reactivex.g0<T> g0Var, dj.o<? super io.reactivex.b0<Object>, ? extends io.reactivex.g0<?>> oVar) {
        super(g0Var);
        this.f302180b = oVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.subjects.i<T> iVarL8 = io.reactivex.subjects.e.n8().l8();
        try {
            io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302180b.apply(iVarL8), "The handler returned a null ObservableSource");
            a aVar = new a(i0Var, iVarL8, this.f301291a);
            i0Var.d(aVar);
            g0Var.a(aVar.f302186e);
            aVar.e();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.l(th2, i0Var);
        }
    }
}
