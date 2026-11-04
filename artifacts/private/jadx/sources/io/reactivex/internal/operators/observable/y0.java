package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class y0<T> extends io.reactivex.c implements ej.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f302607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.i> f302608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f302609c;

    static final class a<T> extends AtomicInteger implements io.reactivex.disposables.c, io.reactivex.i0<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f302610h = 8443155186132538303L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f302611a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.i> f302613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f302614d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.c f302616f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f302617g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.util.c f302612b = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.disposables.b f302615e = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.y0$a$a, reason: collision with other inner class name */
        final class C2181a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f302618b = 8606673141535671828L;

            C2181a() {
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
                a.this.b(this, th2);
            }
        }

        a(io.reactivex.f fVar, dj.o<? super T, ? extends io.reactivex.i> oVar, boolean z10) {
            this.f302611a = fVar;
            this.f302613c = oVar;
            this.f302614d = z10;
            lazySet(1);
        }

        void a(a<T>.C2181a c2181a) {
            this.f302615e.b(c2181a);
            onComplete();
        }

        void b(a<T>.C2181a c2181a, Throwable th2) {
            this.f302615e.b(c2181a);
            onError(th2);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302616f, cVar)) {
                this.f302616f = cVar;
                this.f302611a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302617g = true;
            this.f302616f.dispose();
            this.f302615e.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302616f.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thC = this.f302612b.c();
                if (thC != null) {
                    this.f302611a.onError(thC);
                } else {
                    this.f302611a.onComplete();
                }
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f302612b.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f302614d) {
                if (decrementAndGet() == 0) {
                    this.f302611a.onError(this.f302612b.c());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f302611a.onError(this.f302612b.c());
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            try {
                io.reactivex.i iVar = (io.reactivex.i) io.reactivex.internal.functions.b.g(this.f302613c.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C2181a c2181a = new C2181a();
                if (this.f302617g || !this.f302615e.c(c2181a)) {
                    return;
                }
                iVar.b(c2181a);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302616f.dispose();
                onError(th2);
            }
        }
    }

    public y0(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends io.reactivex.i> oVar, boolean z10) {
        this.f302607a = g0Var;
        this.f302608b = oVar;
        this.f302609c = z10;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f302607a.a(new a(fVar, this.f302608b, this.f302609c));
    }

    @Override // ej.d
    public io.reactivex.b0<T> c() {
        return io.reactivex.plugins.a.R(new x0(this.f302607a, this.f302608b, this.f302609c));
    }
}
