package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class b0<T> extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.i> f300687b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f300688c = -2177128922851101253L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f300689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.i> f300690b;

        a(io.reactivex.f fVar, dj.o<? super T, ? extends io.reactivex.i> oVar) {
            this.f300689a = fVar;
            this.f300690b = oVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            try {
                io.reactivex.i iVar = (io.reactivex.i) io.reactivex.internal.functions.b.g(this.f300690b.apply(t10), "The mapper returned a null CompletableSource");
                if (k()) {
                    return;
                }
                iVar.b(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                onError(th2);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this, cVar);
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
            this.f300689a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300689a.onError(th2);
        }
    }

    public b0(io.reactivex.y<T> yVar, dj.o<? super T, ? extends io.reactivex.i> oVar) {
        this.f300686a = yVar;
        this.f300687b = oVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        a aVar = new a(fVar, this.f300687b);
        fVar.d(aVar);
        this.f300686a.a(aVar);
    }
}
