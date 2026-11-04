package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class x0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.i> f302555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f302556c;

    static final class a<T> extends io.reactivex.internal.observers.b<T> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f302557i = 8443155186132538303L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302558b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.i> f302560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f302561e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.c f302563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f302564h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.util.c f302559c = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.disposables.b f302562f = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.x0$a$a, reason: collision with other inner class name */
        final class C2180a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f302565b = 8606673141535671828L;

            C2180a() {
            }

            @Override // io.reactivex.f
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.disposables.c
            public void dispose() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.disposables.c
            public boolean k() {
                return io.reactivex.internal.disposables.d.c(get());
            }

            @Override // io.reactivex.f
            public void onComplete() {
                a.this.a(this);
            }

            @Override // io.reactivex.f
            public void onError(Throwable th2) {
                a.this.c(this, th2);
            }
        }

        a(io.reactivex.i0<? super T> i0Var, dj.o<? super T, ? extends io.reactivex.i> oVar, boolean z10) {
            this.f302558b = i0Var;
            this.f302560d = oVar;
            this.f302561e = z10;
            int i10 = 6 << 1;
            lazySet(1);
        }

        void a(a<T>.C2180a c2180a) {
            this.f302562f.b(c2180a);
            onComplete();
        }

        void c(a<T>.C2180a c2180a, Throwable th2) {
            this.f302562f.b(c2180a);
            onError(th2);
        }

        @Override // ej.o
        public void clear() {
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302563g, cVar)) {
                this.f302563g = cVar;
                this.f302558b.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302564h = true;
            this.f302563g.dispose();
            this.f302562f.dispose();
        }

        @Override // ej.o
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302563g.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thC = this.f302559c.c();
                if (thC != null) {
                    this.f302558b.onError(thC);
                } else {
                    this.f302558b.onComplete();
                }
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f302559c.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f302561e) {
                if (decrementAndGet() == 0) {
                    this.f302558b.onError(this.f302559c.c());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f302558b.onError(this.f302559c.c());
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            try {
                io.reactivex.i iVar = (io.reactivex.i) io.reactivex.internal.functions.b.g(this.f302560d.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C2180a c2180a = new C2180a();
                if (!this.f302564h && this.f302562f.c(c2180a)) {
                    iVar.b(c2180a);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302563g.dispose();
                onError(th2);
            }
        }

        @Override // ej.k
        public int p(int i10) {
            return i10 & 2;
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            return null;
        }
    }

    public x0(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends io.reactivex.i> oVar, boolean z10) {
        super(g0Var);
        this.f302555b = oVar;
        this.f302556c = z10;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302555b, this.f302556c));
    }
}
