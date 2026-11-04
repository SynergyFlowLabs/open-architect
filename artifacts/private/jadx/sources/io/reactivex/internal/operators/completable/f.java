package io.reactivex.internal.operators.completable;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterable<? extends io.reactivex.i> f298906a;

    static final class a extends AtomicInteger implements io.reactivex.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f298907d = -7965400327305809232L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator<? extends io.reactivex.i> f298909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f298910c = new io.reactivex.internal.disposables.h();

        a(io.reactivex.f fVar, Iterator<? extends io.reactivex.i> it) {
            this.f298908a = fVar;
            this.f298909b = it;
        }

        void a() {
            if (!this.f298910c.k() && getAndIncrement() == 0) {
                Iterator<? extends io.reactivex.i> it = this.f298909b;
                while (!this.f298910c.k()) {
                    try {
                        if (!it.hasNext()) {
                            this.f298908a.onComplete();
                            return;
                        }
                        try {
                            ((io.reactivex.i) io.reactivex.internal.functions.b.g(it.next(), "The CompletableSource returned is null")).b(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.b.b(th2);
                            this.f298908a.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        this.f298908a.onError(th3);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            this.f298910c.a(cVar);
        }

        @Override // io.reactivex.f
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f298908a.onError(th2);
        }
    }

    public f(Iterable<? extends io.reactivex.i> iterable) {
        this.f298906a = iterable;
    }

    @Override // io.reactivex.c
    public void J0(io.reactivex.f fVar) {
        try {
            a aVar = new a(fVar, (Iterator) io.reactivex.internal.functions.b.g(this.f298906a.iterator(), "The iterator returned is null"));
            fVar.d(aVar.f298910c);
            aVar.a();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.e(th2, fVar);
        }
    }
}
