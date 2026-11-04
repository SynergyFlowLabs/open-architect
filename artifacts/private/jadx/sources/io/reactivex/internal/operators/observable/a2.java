package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class a2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.y<? extends T> f301309b;

    static final class a<T> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f301310j = -4592979584110982903L;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f301311k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f301312l = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301314b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C2167a<T> f301315c = new C2167a<>(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f301316d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile ej.n<T> f301317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        T f301318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f301319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f301320h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile int f301321i;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.a2$a$a, reason: collision with other inner class name */
        static final class C2167a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f301322b = -2935427570954647017L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<T> f301323a;

            C2167a(a<T> aVar) {
                this.f301323a = aVar;
            }

            @Override // io.reactivex.v
            public void b(T t10) {
                this.f301323a.g(t10);
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.v
            public void onComplete() {
                this.f301323a.e();
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                this.f301323a.f(th2);
            }
        }

        a(io.reactivex.i0<? super T> i0Var) {
            this.f301313a = i0Var;
        }

        void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        void b() {
            io.reactivex.i0<? super T> i0Var = this.f301313a;
            int iAddAndGet = 1;
            while (!this.f301319g) {
                if (this.f301316d.get() != null) {
                    this.f301318f = null;
                    this.f301317e = null;
                    i0Var.onError(this.f301316d.c());
                    return;
                }
                int i10 = this.f301321i;
                if (i10 == 1) {
                    T t10 = this.f301318f;
                    this.f301318f = null;
                    this.f301321i = 2;
                    i0Var.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.f301320h;
                ej.n<T> nVar = this.f301317e;
                a0.c cVarPoll = nVar != null ? nVar.poll() : null;
                boolean z11 = cVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.f301317e = null;
                    i0Var.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    i0Var.onNext(cVarPoll);
                }
            }
            this.f301318f = null;
            this.f301317e = null;
        }

        ej.n<T> c() {
            ej.n<T> nVar = this.f301317e;
            if (nVar != null) {
                return nVar;
            }
            io.reactivex.internal.queue.c cVar = new io.reactivex.internal.queue.c(io.reactivex.b0.T());
            this.f301317e = cVar;
            return cVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f301314b, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301319g = true;
            io.reactivex.internal.disposables.d.b(this.f301314b);
            io.reactivex.internal.disposables.d.b(this.f301315c);
            if (getAndIncrement() == 0) {
                this.f301317e = null;
                this.f301318f = null;
            }
        }

        void e() {
            this.f301321i = 2;
            a();
        }

        void f(Throwable th2) {
            if (!this.f301316d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.disposables.d.b(this.f301314b);
                a();
            }
        }

        void g(T t10) {
            if (compareAndSet(0, 1)) {
                this.f301313a.onNext(t10);
                this.f301321i = 2;
            } else {
                this.f301318f = t10;
                this.f301321i = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f301314b.get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301320h = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f301316d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.disposables.d.b(this.f301314b);
                a();
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.f301313a.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                c().offer(t10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }
    }

    public a2(io.reactivex.b0<T> b0Var, io.reactivex.y<? extends T> yVar) {
        super(b0Var);
        this.f301309b = yVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        a aVar = new a(i0Var);
        i0Var.d(aVar);
        this.f301291a.a(aVar);
        this.f301309b.a(aVar.f301315c);
    }
}
