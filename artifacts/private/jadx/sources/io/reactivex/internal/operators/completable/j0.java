package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super Throwable, ? extends io.reactivex.i> f298952b;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f298953d = 5018523762564524046L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super Throwable, ? extends io.reactivex.i> f298955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f298956c;

        a(io.reactivex.f fVar, dj.o<? super Throwable, ? extends io.reactivex.i> oVar) {
            this.f298954a = fVar;
            this.f298955b = oVar;
        }

        @Override // io.reactivex.f
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

        @Override // io.reactivex.f
        public void onComplete() {
            this.f298954a.onComplete();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            if (this.f298956c) {
                this.f298954a.onError(th2);
                return;
            }
            this.f298956c = true;
            try {
                ((io.reactivex.i) io.reactivex.internal.functions.b.g(this.f298955b.apply(th2), "The errorMapper returned a null CompletableSource")).b(this);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f298954a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }
    }

    public j0(io.reactivex.i iVar, dj.o<? super Throwable, ? extends io.reactivex.i> oVar) {
        this.f298951a = iVar;
        this.f298952b = oVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        a aVar = new a(fVar, this.f298952b);
        fVar.d(aVar);
        this.f298951a.b(aVar);
    }
}
