package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class r1<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f300945b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f300946d = 3256698449646456986L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.j0 f300948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f300949c;

        a(io.reactivex.v<? super T> vVar, io.reactivex.j0 j0Var) {
            this.f300947a = vVar;
            this.f300948b = j0Var;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300947a.b(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f300947a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            io.reactivex.disposables.c andSet = getAndSet(dVar);
            if (andSet != dVar) {
                this.f300949c = andSet;
                this.f300948b.e(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300947a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300947a.onError(th2);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f300949c.dispose();
        }
    }

    public r1(io.reactivex.y<T> yVar, io.reactivex.j0 j0Var) {
        super(yVar);
        this.f300945b = j0Var;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this.f300945b));
    }
}
