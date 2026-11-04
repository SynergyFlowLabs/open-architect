package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class u2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super io.reactivex.b0<Throwable>, ? extends io.reactivex.g0<?>> f302391b;

    static final class a<T> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f302392i = 802743776666017014L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302393a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.subjects.i<Throwable> f302396d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final io.reactivex.g0<T> f302399g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f302400h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicInteger f302394b = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.util.c f302395c = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final a<T>.C2178a f302397e = new C2178a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302398f = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.u2$a$a, reason: collision with other inner class name */
        final class C2178a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f302401b = 3254781284376480842L;

            C2178a() {
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

        a(io.reactivex.i0<? super T> i0Var, io.reactivex.subjects.i<Throwable> iVar, io.reactivex.g0<T> g0Var) {
            this.f302393a = i0Var;
            this.f302396d = iVar;
            this.f302399g = g0Var;
        }

        void a() {
            io.reactivex.internal.disposables.d.b(this.f302398f);
            io.reactivex.internal.util.l.a(this.f302393a, this, this.f302395c);
        }

        void b(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f302398f);
            io.reactivex.internal.util.l.c(this.f302393a, th2, this, this.f302395c);
        }

        void c() {
            e();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this.f302398f, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f302398f);
            io.reactivex.internal.disposables.d.b(this.f302397e);
        }

        void e() {
            if (this.f302394b.getAndIncrement() == 0) {
                while (!k()) {
                    if (!this.f302400h) {
                        this.f302400h = true;
                        this.f302399g.a(this);
                    }
                    if (this.f302394b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f302398f.get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            io.reactivex.internal.disposables.d.b(this.f302397e);
            io.reactivex.internal.util.l.a(this.f302393a, this, this.f302395c);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            boolean z10 = true | false;
            io.reactivex.internal.disposables.d.d(this.f302398f, null);
            this.f302400h = false;
            this.f302396d.onNext(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            io.reactivex.internal.util.l.e(this.f302393a, t10, this, this.f302395c);
        }
    }

    public u2(io.reactivex.g0<T> g0Var, dj.o<? super io.reactivex.b0<Throwable>, ? extends io.reactivex.g0<?>> oVar) {
        super(g0Var);
        this.f302391b = oVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.subjects.i<T> iVarL8 = io.reactivex.subjects.e.n8().l8();
        try {
            io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302391b.apply(iVarL8), "The handler returned a null ObservableSource");
            a aVar = new a(i0Var, iVarL8, this.f301291a);
            i0Var.d(aVar);
            g0Var.a(aVar.f302397e);
            aVar.e();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.l(th2, i0Var);
        }
    }
}
