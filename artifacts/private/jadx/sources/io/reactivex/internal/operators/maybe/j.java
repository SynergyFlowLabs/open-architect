package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class j<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.w<T> f300839a;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.u<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f300840b = -2467358622224974244L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300841a;

        a(io.reactivex.v<? super T> vVar) {
            this.f300841a = vVar;
        }

        @Override // io.reactivex.u
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
                this.f300841a.onError(th2);
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

        @Override // io.reactivex.u
        public void b(T t10) {
            io.reactivex.disposables.c andSet;
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar || (andSet = getAndSet(dVar)) == dVar) {
                return;
            }
            try {
                if (t10 == null) {
                    this.f300841a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f300841a.b(t10);
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

        @Override // io.reactivex.u
        public void c(dj.f fVar) {
            d(new io.reactivex.internal.disposables.b(fVar));
        }

        @Override // io.reactivex.u
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.n(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.u, io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.u
        public void onComplete() {
            io.reactivex.disposables.c andSet;
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar != dVar && (andSet = getAndSet(dVar)) != dVar) {
                try {
                    this.f300841a.onComplete();
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
        }

        @Override // io.reactivex.u
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

    public j(io.reactivex.w<T> wVar) {
        this.f300839a = wVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        a aVar = new a(vVar);
        vVar.d(aVar);
        try {
            this.f300839a.a(aVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            aVar.onError(th2);
        }
    }
}
