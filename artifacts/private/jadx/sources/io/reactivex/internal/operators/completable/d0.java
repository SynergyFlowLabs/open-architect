package io.reactivex.internal.operators.completable;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterable<? extends io.reactivex.i> f298894a;

    public d0(Iterable<? extends io.reactivex.i> iterable) {
        this.f298894a = iterable;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    @Override // io.reactivex.c
    public void J0(io.reactivex.f fVar) {
        Throwable thC;
        io.reactivex.disposables.b bVar = new io.reactivex.disposables.b();
        fVar.d(bVar);
        try {
            Iterator it = (Iterator) io.reactivex.internal.functions.b.g(this.f298894a.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            io.reactivex.internal.util.c cVar = new io.reactivex.internal.util.c();
            while (true) {
                if (!bVar.k()) {
                    try {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!bVar.k()) {
                            try {
                                io.reactivex.i iVar = (io.reactivex.i) io.reactivex.internal.functions.b.g(it.next(), "The iterator returned a null CompletableSource");
                                if (!bVar.k()) {
                                    atomicInteger.getAndIncrement();
                                    iVar.b(new c0.a(fVar, bVar, cVar, atomicInteger));
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                cVar.a(th2);
                                if (atomicInteger.decrementAndGet() == 0) {
                                    thC = cVar.c();
                                    if (thC == null) {
                                        fVar.onComplete();
                                    } else {
                                        fVar.onError(thC);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        cVar.a(th3);
                    }
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                thC = cVar.c();
                if (thC == null) {
                    fVar.onComplete();
                } else {
                    fVar.onError(thC);
                }
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.b.b(th4);
            fVar.onError(th4);
        }
    }
}
