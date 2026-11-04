package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.a f298970b;

    static final class a extends AtomicInteger implements io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f298971d = 4109457741734051389L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.a f298973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f298974c;

        a(io.reactivex.f fVar, dj.a aVar) {
            this.f298972a = fVar;
            this.f298973b = aVar;
        }

        void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f298973b.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f298974c, cVar)) {
                this.f298974c = cVar;
                this.f298972a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f298974c.dispose();
            a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298974c.k();
        }

        @Override // io.reactivex.f
        public void onComplete() {
            this.f298972a.onComplete();
            a();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f298972a.onError(th2);
            a();
        }
    }

    public l(io.reactivex.i iVar, dj.a aVar) {
        this.f298969a = iVar;
        this.f298970b = aVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f298969a.b(new a(fVar, this.f298970b));
    }
}
