package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class b2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f301363b;

    static final class a<T> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f301364j = -4592979584110982903L;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f301365k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f301366l = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301368b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C2168a<T> f301369c = new C2168a<>(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f301370d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile ej.n<T> f301371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        T f301372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f301373g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f301374h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile int f301375i;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.b2$a$a, reason: collision with other inner class name */
        static final class C2168a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f301376b = -2935427570954647017L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<T> f301377a;

            C2168a(a<T> aVar) {
                this.f301377a = aVar;
            }

            @Override // io.reactivex.n0
            public void b(T t10) {
                this.f301377a.f(t10);
            }

            @Override // io.reactivex.n0
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.n0
            public void onError(Throwable th2) {
                this.f301377a.e(th2);
            }
        }

        a(io.reactivex.i0<? super T> i0Var) {
            this.f301367a = i0Var;
        }

        void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        void b() {
            io.reactivex.i0<? super T> i0Var = this.f301367a;
            int iAddAndGet = 1;
            while (!this.f301373g) {
                if (this.f301370d.get() != null) {
                    this.f301372f = null;
                    this.f301371e = null;
                    i0Var.onError(this.f301370d.c());
                    return;
                }
                int i10 = this.f301375i;
                if (i10 == 1) {
                    T t10 = this.f301372f;
                    this.f301372f = null;
                    this.f301375i = 2;
                    i0Var.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.f301374h;
                ej.n<T> nVar = this.f301371e;
                a0.c cVarPoll = nVar != null ? nVar.poll() : null;
                boolean z11 = cVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.f301371e = null;
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
            this.f301372f = null;
            this.f301371e = null;
        }

        ej.n<T> c() {
            ej.n<T> nVar = this.f301371e;
            if (nVar != null) {
                return nVar;
            }
            io.reactivex.internal.queue.c cVar = new io.reactivex.internal.queue.c(io.reactivex.b0.T());
            this.f301371e = cVar;
            return cVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f301368b, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301373g = true;
            io.reactivex.internal.disposables.d.b(this.f301368b);
            io.reactivex.internal.disposables.d.b(this.f301369c);
            if (getAndIncrement() == 0) {
                int i10 = 3 | 0;
                this.f301371e = null;
                this.f301372f = null;
            }
        }

        void e(Throwable th2) {
            if (!this.f301370d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.disposables.d.b(this.f301368b);
                a();
            }
        }

        void f(T t10) {
            if (compareAndSet(0, 1)) {
                this.f301367a.onNext(t10);
                this.f301375i = 2;
            } else {
                this.f301372f = t10;
                this.f301375i = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f301368b.get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301374h = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f301370d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.disposables.d.b(this.f301368b);
                a();
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.f301367a.onNext(t10);
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

    public b2(io.reactivex.b0<T> b0Var, io.reactivex.q0<? extends T> q0Var) {
        super(b0Var);
        this.f301363b = q0Var;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        a aVar = new a(i0Var);
        i0Var.d(aVar);
        this.f301291a.a(aVar);
        this.f301363b.f(aVar.f301369c);
    }
}
