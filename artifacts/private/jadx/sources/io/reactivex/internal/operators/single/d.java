package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class d<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.o0<T> f302921a;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.m0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f302922b = -2467358622224974244L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302923a;

        a(io.reactivex.n0<? super T> n0Var) {
            this.f302923a = n0Var;
        }

        @Override // io.reactivex.m0
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
                this.f302923a.onError(th2);
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

        @Override // io.reactivex.m0
        public void b(T t10) {
            io.reactivex.disposables.c andSet;
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar || (andSet = getAndSet(dVar)) == dVar) {
                return;
            }
            try {
                if (t10 == null) {
                    this.f302923a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f302923a.b(t10);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th2) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th2;
            }
        }

        @Override // io.reactivex.m0
        public void c(dj.f fVar) {
            d(new io.reactivex.internal.disposables.b(fVar));
        }

        @Override // io.reactivex.m0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.n(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.m0, io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.m0
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

    public d(io.reactivex.o0<T> o0Var) {
        this.f302921a = o0Var;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        a aVar = new a(n0Var);
        n0Var.d(aVar);
        try {
            this.f302921a.a(aVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            aVar.onError(th2);
        }
    }
}
