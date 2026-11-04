package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class r3<T, U> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<? extends U> f302301b;

    static final class a<T, U> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302302e = 1418547743690811973L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302304b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a<T, U>.C2177a f302305c = new C2177a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f302306d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.r3$a$a, reason: collision with other inner class name */
        final class C2177a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<U> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f302307b = -8693423678067375039L;

            C2177a() {
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
            public void onNext(U u10) {
                io.reactivex.internal.disposables.d.b(this);
                a.this.a();
            }
        }

        a(io.reactivex.i0<? super T> i0Var) {
            this.f302303a = i0Var;
        }

        void a() {
            io.reactivex.internal.disposables.d.b(this.f302304b);
            io.reactivex.internal.util.l.a(this.f302303a, this, this.f302306d);
        }

        void b(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f302304b);
            io.reactivex.internal.util.l.c(this.f302303a, th2, this, this.f302306d);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f302304b, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f302304b);
            io.reactivex.internal.disposables.d.b(this.f302305c);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f302304b.get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            io.reactivex.internal.disposables.d.b(this.f302305c);
            io.reactivex.internal.util.l.a(this.f302303a, this, this.f302306d);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f302305c);
            io.reactivex.internal.util.l.c(this.f302303a, th2, this, this.f302306d);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            io.reactivex.internal.util.l.e(this.f302303a, t10, this, this.f302306d);
        }
    }

    public r3(io.reactivex.g0<T> g0Var, io.reactivex.g0<? extends U> g0Var2) {
        super(g0Var);
        this.f302301b = g0Var2;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        a aVar = new a(i0Var);
        i0Var.d(aVar);
        this.f302301b.a(aVar.f302305c);
        this.f301291a.a(aVar);
    }
}
