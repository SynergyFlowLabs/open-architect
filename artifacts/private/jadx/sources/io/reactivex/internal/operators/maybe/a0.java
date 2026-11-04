package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class a0<T, U, R> extends io.reactivex.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.y<? extends U>> f300668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<? super T, ? super U, ? extends R> f300669c;

    static final class a<T, U, R> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.y<? extends U>> f300670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C2145a<T, U, R> f300671b;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.a0$a$a, reason: collision with other inner class name */
        static final class C2145a<T, U, R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<U> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final long f300672d = -2897979525538174559L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final io.reactivex.v<? super R> f300673a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final dj.c<? super T, ? super U, ? extends R> f300674b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            T f300675c;

            C2145a(io.reactivex.v<? super R> vVar, dj.c<? super T, ? super U, ? extends R> cVar) {
                this.f300673a = vVar;
                this.f300674b = cVar;
            }

            @Override // io.reactivex.v
            public void b(U u10) {
                T t10 = this.f300675c;
                this.f300675c = null;
                try {
                    this.f300673a.b(io.reactivex.internal.functions.b.g(this.f300674b.apply(t10, u10), "The resultSelector returned a null value"));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f300673a.onError(th2);
                }
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.v
            public void onComplete() {
                this.f300673a.onComplete();
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                this.f300673a.onError(th2);
            }
        }

        a(io.reactivex.v<? super R> vVar, dj.o<? super T, ? extends io.reactivex.y<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar) {
            this.f300671b = new C2145a<>(vVar, cVar);
            this.f300670a = oVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            try {
                io.reactivex.y yVar = (io.reactivex.y) io.reactivex.internal.functions.b.g(this.f300670a.apply(t10), "The mapper returned a null MaybeSource");
                if (io.reactivex.internal.disposables.d.d(this.f300671b, null)) {
                    C2145a<T, U, R> c2145a = this.f300671b;
                    c2145a.f300675c = t10;
                    yVar.a(c2145a);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300671b.f300673a.onError(th2);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this.f300671b, cVar)) {
                this.f300671b.f300673a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f300671b);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f300671b.get());
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300671b.f300673a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300671b.f300673a.onError(th2);
        }
    }

    public a0(io.reactivex.y<T> yVar, dj.o<? super T, ? extends io.reactivex.y<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar) {
        super(yVar);
        this.f300668b = oVar;
        this.f300669c = cVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super R> vVar) {
        this.f300667a.a(new a(vVar, this.f300668b, this.f300669c));
    }
}
