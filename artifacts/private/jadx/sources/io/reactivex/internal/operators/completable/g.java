package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g f298912a;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.e, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f298913b = -2467358622224974244L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298914a;

        a(io.reactivex.f fVar) {
            this.f298914a = fVar;
        }

        @Override // io.reactivex.e
        public boolean a(Throwable th2) {
            io.reactivex.disposables.c andSet;
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar || (andSet = getAndSet(dVar)) == dVar) {
                return false;
            }
            try {
                this.f298914a.onError(th2);
                if (andSet != null) {
                    andSet.dispose();
                }
                return true;
            } catch (Throwable th3) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th3;
            }
        }

        @Override // io.reactivex.e
        public void c(dj.f fVar) {
            d(new io.reactivex.internal.disposables.b(fVar));
        }

        @Override // io.reactivex.e
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.n(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.e, io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.e
        public void onComplete() {
            io.reactivex.disposables.c andSet;
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar || (andSet = getAndSet(dVar)) == dVar) {
                return;
            }
            try {
                this.f298914a.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.e
        public void onError(Throwable th2) {
            if (a(th2)) {
                return;
            }
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public g(io.reactivex.g gVar) {
        this.f298912a = gVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        a aVar = new a(fVar);
        fVar.d(aVar);
        try {
            this.f298912a.a(aVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            aVar.onError(th2);
        }
    }
}
