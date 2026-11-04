package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class e1<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f300761b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f300762c = 8571289934935992137L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f300763a = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.v<? super T> f300764b;

        a(io.reactivex.v<? super T> vVar) {
            this.f300764b = vVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300764b.b(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
            this.f300763a.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300764b.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300764b.onError(th2);
        }
    }

    static final class b<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.y<T> f300766b;

        b(io.reactivex.v<? super T> vVar, io.reactivex.y<T> yVar) {
            this.f300765a = vVar;
            this.f300766b = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f300766b.a(this.f300765a);
        }
    }

    public e1(io.reactivex.y<T> yVar, io.reactivex.j0 j0Var) {
        super(yVar);
        this.f300761b = j0Var;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        a aVar = new a(vVar);
        vVar.d(aVar);
        aVar.f300763a.a(this.f300761b.e(new b(aVar, this.f300667a)));
    }
}
