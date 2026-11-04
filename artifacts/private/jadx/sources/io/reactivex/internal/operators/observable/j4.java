package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class j4<T, U, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.c<? super T, ? super U, ? extends R> f301818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.g0<? extends U> f301819c;

    static final class a<T, U, R> extends AtomicReference<U> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f301820e = -312246233408980075L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f301821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<? super T, ? super U, ? extends R> f301822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301823c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301824d = new AtomicReference<>();

        a(io.reactivex.i0<? super R> i0Var, dj.c<? super T, ? super U, ? extends R> cVar) {
            this.f301821a = i0Var;
            this.f301822b = cVar;
        }

        public void a(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f301823c);
            this.f301821a.onError(th2);
        }

        public boolean b(io.reactivex.disposables.c cVar) {
            return io.reactivex.internal.disposables.d.o(this.f301824d, cVar);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f301823c, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f301823c);
            io.reactivex.internal.disposables.d.b(this.f301824d);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f301823c.get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            io.reactivex.internal.disposables.d.b(this.f301824d);
            this.f301821a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f301824d);
            this.f301821a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            U u10 = get();
            if (u10 != null) {
                try {
                    this.f301821a.onNext(io.reactivex.internal.functions.b.g(this.f301822b.apply(t10, u10), "The combiner returned a null value"));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    dispose();
                    this.f301821a.onError(th2);
                }
            }
        }
    }

    final class b implements io.reactivex.i0<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<T, U, R> f301825a;

        b(a<T, U, R> aVar) {
            this.f301825a = aVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f301825a.b(cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301825a.a(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(U u10) {
            this.f301825a.lazySet(u10);
        }
    }

    public j4(io.reactivex.g0<T> g0Var, dj.c<? super T, ? super U, ? extends R> cVar, io.reactivex.g0<? extends U> g0Var2) {
        super(g0Var);
        this.f301818b = cVar;
        this.f301819c = g0Var2;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super R> i0Var) {
        io.reactivex.observers.m mVar = new io.reactivex.observers.m(i0Var);
        a aVar = new a(mVar, this.f301818b);
        mVar.d(aVar);
        this.f301819c.a(new b(aVar));
        this.f301291a.a(aVar);
    }
}
