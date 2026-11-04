package io.reactivex.internal.operators.completable;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterable<? extends io.reactivex.i> f298901a;

    static final class a extends AtomicBoolean implements io.reactivex.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f298902d = -7730517613164279224L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.disposables.b f298903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.f f298904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f298905c;

        a(io.reactivex.f fVar, io.reactivex.disposables.b bVar, AtomicInteger atomicInteger) {
            this.f298904b = fVar;
            this.f298903a = bVar;
            this.f298905c = atomicInteger;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            this.f298903a.c(cVar);
        }

        @Override // io.reactivex.f
        public void onComplete() {
            if (this.f298905c.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.f298904b.onComplete();
            }
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f298903a.dispose();
            if (compareAndSet(false, true)) {
                this.f298904b.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    public e0(Iterable<? extends io.reactivex.i> iterable) {
        this.f298901a = iterable;
    }

    @Override // io.reactivex.c
    public void J0(io.reactivex.f fVar) {
        io.reactivex.disposables.b bVar = new io.reactivex.disposables.b();
        fVar.d(bVar);
        try {
            Iterator it = (Iterator) io.reactivex.internal.functions.b.g(this.f298901a.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            a aVar = new a(fVar, bVar, atomicInteger);
            while (!bVar.k()) {
                try {
                    if (!it.hasNext()) {
                        aVar.onComplete();
                        return;
                    }
                    if (bVar.k()) {
                        return;
                    }
                    try {
                        io.reactivex.i iVar = (io.reactivex.i) io.reactivex.internal.functions.b.g(it.next(), "The iterator returned a null CompletableSource");
                        if (bVar.k()) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        iVar.b(aVar);
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        bVar.dispose();
                        aVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    bVar.dispose();
                    aVar.onError(th3);
                    return;
                }
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.b.b(th4);
            fVar.onError(th4);
        }
    }
}
