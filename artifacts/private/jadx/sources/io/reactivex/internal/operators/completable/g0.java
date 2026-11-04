package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f298916b;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f298917d = 8571289934935992137L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.j0 f298919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Throwable f298920c;

        a(io.reactivex.f fVar, io.reactivex.j0 j0Var) {
            this.f298918a = fVar;
            this.f298919b = j0Var;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f298918a.d(this);
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

        @Override // io.reactivex.f
        public void onComplete() {
            io.reactivex.internal.disposables.d.d(this, this.f298919b.e(this));
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f298920c = th2;
            io.reactivex.internal.disposables.d.d(this, this.f298919b.e(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f298920c;
            if (th2 == null) {
                this.f298918a.onComplete();
            } else {
                this.f298920c = null;
                this.f298918a.onError(th2);
            }
        }
    }

    public g0(io.reactivex.i iVar, io.reactivex.j0 j0Var) {
        this.f298915a = iVar;
        this.f298916b = j0Var;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f298915a.b(new a(fVar, this.f298916b));
    }
}
