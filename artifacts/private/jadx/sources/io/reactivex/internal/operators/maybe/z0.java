package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class z0<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f301031b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f301032e = 8571289934935992137L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f301033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.j0 f301034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f301035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Throwable f301036d;

        a(io.reactivex.v<? super T> vVar, io.reactivex.j0 j0Var) {
            this.f301033a = vVar;
            this.f301034b = j0Var;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f301035c = t10;
            io.reactivex.internal.disposables.d.d(this, this.f301034b.e(this));
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f301033a.d(this);
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
            io.reactivex.internal.disposables.d.d(this, this.f301034b.e(this));
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f301036d = th2;
            io.reactivex.internal.disposables.d.d(this, this.f301034b.e(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f301036d;
            if (th2 != null) {
                this.f301036d = null;
                this.f301033a.onError(th2);
                return;
            }
            T t10 = this.f301035c;
            if (t10 == null) {
                this.f301033a.onComplete();
            } else {
                this.f301035c = null;
                this.f301033a.b(t10);
            }
        }
    }

    public z0(io.reactivex.y<T> yVar, io.reactivex.j0 j0Var) {
        super(yVar);
        this.f301031b = j0Var;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this.f301031b));
    }
}
