package io.reactivex.internal.subscriptions;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public enum j implements w {
    CANCELLED;

    public static boolean b(AtomicReference<w> atomicReference) {
        w andSet;
        w wVar = atomicReference.get();
        j jVar = CANCELLED;
        if (wVar == jVar || (andSet = atomicReference.getAndSet(jVar)) == jVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void c(AtomicReference<w> atomicReference, AtomicLong atomicLong, long j10) {
        w wVar = atomicReference.get();
        if (wVar != null) {
            wVar.request(j10);
            return;
        }
        if (p(j10)) {
            io.reactivex.internal.util.d.a(atomicLong, j10);
            w wVar2 = atomicReference.get();
            if (wVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    wVar2.request(andSet);
                }
            }
        }
    }

    public static boolean d(AtomicReference<w> atomicReference, AtomicLong atomicLong, w wVar) {
        if (!n(atomicReference, wVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet != 0) {
            wVar.request(andSet);
        }
        return true;
    }

    public static boolean e(AtomicReference<w> atomicReference, w wVar) {
        w wVar2;
        do {
            wVar2 = atomicReference.get();
            if (wVar2 == CANCELLED) {
                if (wVar == null) {
                    return false;
                }
                wVar.cancel();
                return false;
            }
        } while (!z1.a(atomicReference, wVar2, wVar));
        return true;
    }

    public static void f(long j10) {
        io.reactivex.plugins.a.Y(new io.reactivex.exceptions.e("More produced than requested: " + j10));
    }

    public static void k() {
        io.reactivex.plugins.a.Y(new io.reactivex.exceptions.e("Subscription already set!"));
    }

    public static boolean l(AtomicReference<w> atomicReference, w wVar) {
        w wVar2;
        do {
            wVar2 = atomicReference.get();
            if (wVar2 == CANCELLED) {
                if (wVar == null) {
                    return false;
                }
                wVar.cancel();
                return false;
            }
        } while (!z1.a(atomicReference, wVar2, wVar));
        if (wVar2 != null) {
            wVar2.cancel();
        }
        return true;
    }

    public static boolean n(AtomicReference<w> atomicReference, w wVar) {
        io.reactivex.internal.functions.b.g(wVar, "s is null");
        if (z1.a(atomicReference, null, wVar)) {
            return true;
        }
        wVar.cancel();
        if (atomicReference.get() != CANCELLED) {
            k();
        }
        return false;
    }

    public static boolean o(AtomicReference<w> atomicReference, w wVar, long j10) {
        if (!n(atomicReference, wVar)) {
            return false;
        }
        wVar.request(j10);
        return true;
    }

    public static boolean p(long j10) {
        if (j10 > 0) {
            return true;
        }
        io.reactivex.plugins.a.Y(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    public static boolean q(w wVar, w wVar2) {
        if (wVar2 == null) {
            io.reactivex.plugins.a.Y(new NullPointerException("next is null"));
            return false;
        }
        if (wVar == null) {
            return true;
        }
        wVar2.cancel();
        k();
        return false;
    }

    @Override // org.reactivestreams.w
    public void cancel() {
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
    }
}
