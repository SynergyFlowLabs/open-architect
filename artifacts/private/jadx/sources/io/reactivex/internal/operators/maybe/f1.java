package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class f1<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.y<? extends T> f300784b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f300785c = -2223459372976438024L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.y<? extends T> f300787b;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.f1$a$a, reason: collision with other inner class name */
        static final class C2148a<T> implements io.reactivex.v<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final io.reactivex.v<? super T> f300788a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final AtomicReference<io.reactivex.disposables.c> f300789b;

            C2148a(io.reactivex.v<? super T> vVar, AtomicReference<io.reactivex.disposables.c> atomicReference) {
                this.f300788a = vVar;
                this.f300789b = atomicReference;
            }

            @Override // io.reactivex.v
            public void b(T t10) {
                this.f300788a.b(t10);
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this.f300789b, cVar);
            }

            @Override // io.reactivex.v
            public void onComplete() {
                this.f300788a.onComplete();
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                this.f300788a.onError(th2);
            }
        }

        a(io.reactivex.v<? super T> vVar, io.reactivex.y<? extends T> yVar) {
            this.f300786a = vVar;
            this.f300787b = yVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300786a.b(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f300786a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.v
        public void onComplete() {
            io.reactivex.disposables.c cVar = get();
            if (cVar == io.reactivex.internal.disposables.d.DISPOSED || !compareAndSet(cVar, null)) {
                return;
            }
            this.f300787b.a(new C2148a(this.f300786a, this));
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300786a.onError(th2);
        }
    }

    public f1(io.reactivex.y<T> yVar, io.reactivex.y<? extends T> yVar2) {
        super(yVar);
        this.f300784b = yVar2;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this.f300784b));
    }
}
