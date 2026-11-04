package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class h1<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.y<U> f300823b;

    static final class a<T, U> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f300824c = -2187421758664251153L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C2151a<U> f300826b = new C2151a<>(this);

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.h1$a$a, reason: collision with other inner class name */
        static final class C2151a<U> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<U> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f300827b = -1266041316834525931L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, U> f300828a;

            C2151a(a<?, U> aVar) {
                this.f300828a = aVar;
            }

            @Override // io.reactivex.v
            public void b(Object obj) {
                this.f300828a.a();
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.v
            public void onComplete() {
                this.f300828a.a();
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                this.f300828a.c(th2);
            }
        }

        a(io.reactivex.v<? super T> vVar) {
            this.f300825a = vVar;
        }

        void a() {
            if (io.reactivex.internal.disposables.d.b(this)) {
                this.f300825a.onComplete();
            }
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            io.reactivex.internal.disposables.d.b(this.f300826b);
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f300825a.b(t10);
            }
        }

        void c(Throwable th2) {
            if (io.reactivex.internal.disposables.d.b(this)) {
                this.f300825a.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
            io.reactivex.internal.disposables.d.b(this.f300826b);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.v
        public void onComplete() {
            io.reactivex.internal.disposables.d.b(this.f300826b);
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f300825a.onComplete();
            }
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f300826b);
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f300825a.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    public h1(io.reactivex.y<T> yVar, io.reactivex.y<U> yVar2) {
        super(yVar);
        this.f300823b = yVar2;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        a aVar = new a(vVar);
        vVar.d(aVar);
        this.f300823b.a(aVar.f300826b);
        this.f300667a.a(aVar);
    }
}
