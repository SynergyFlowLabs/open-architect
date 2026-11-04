package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends AtomicReferenceArray<io.reactivex.disposables.c> implements io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f298680a = 2746389416410565408L;

    public a(int i10) {
        super(i10);
    }

    public io.reactivex.disposables.c a(int i10, io.reactivex.disposables.c cVar) {
        io.reactivex.disposables.c cVar2;
        do {
            cVar2 = get(i10);
            if (cVar2 == d.DISPOSED) {
                cVar.dispose();
                return null;
            }
        } while (!compareAndSet(i10, cVar2, cVar));
        return cVar2;
    }

    public boolean b(int i10, io.reactivex.disposables.c cVar) {
        io.reactivex.disposables.c cVar2;
        do {
            cVar2 = get(i10);
            if (cVar2 == d.DISPOSED) {
                cVar.dispose();
                return false;
            }
        } while (!compareAndSet(i10, cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.dispose();
        return true;
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.disposables.c andSet;
        if (get(0) != d.DISPOSED) {
            int length = length();
            for (int i10 = 0; i10 < length; i10++) {
                io.reactivex.disposables.c cVar = get(i10);
                d dVar = d.DISPOSED;
                if (cVar != dVar && (andSet = getAndSet(i10, dVar)) != dVar && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return get(0) == d.DISPOSED;
    }
}
