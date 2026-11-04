package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends AtomicReferenceArray<w> implements io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f303434a = 2746389416410565408L;

    public a(int i10) {
        super(i10);
    }

    public w a(int i10, w wVar) {
        w wVar2;
        do {
            wVar2 = get(i10);
            if (wVar2 == j.CANCELLED) {
                if (wVar != null) {
                    wVar.cancel();
                }
                return null;
            }
        } while (!compareAndSet(i10, wVar2, wVar));
        return wVar2;
    }

    public boolean b(int i10, w wVar) {
        w wVar2;
        do {
            wVar2 = get(i10);
            if (wVar2 == j.CANCELLED) {
                if (wVar == null) {
                    return false;
                }
                wVar.cancel();
                return false;
            }
        } while (!compareAndSet(i10, wVar2, wVar));
        if (wVar2 != null) {
            wVar2.cancel();
        }
        return true;
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        w andSet;
        if (get(0) != j.CANCELLED) {
            int length = length();
            for (int i10 = 0; i10 < length; i10++) {
                w wVar = get(i10);
                j jVar = j.CANCELLED;
                if (wVar != jVar && (andSet = getAndSet(i10, jVar)) != jVar && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return get(0) == j.CANCELLED;
    }
}
