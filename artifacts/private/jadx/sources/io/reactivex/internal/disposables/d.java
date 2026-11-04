package io.reactivex.internal.disposables;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public enum d implements io.reactivex.disposables.c {
    DISPOSED;

    public static boolean b(AtomicReference<io.reactivex.disposables.c> atomicReference) {
        io.reactivex.disposables.c andSet;
        io.reactivex.disposables.c cVar = atomicReference.get();
        d dVar = DISPOSED;
        if (cVar == dVar || (andSet = atomicReference.getAndSet(dVar)) == dVar) {
            return false;
        }
        if (andSet != null) {
            andSet.dispose();
        }
        return true;
    }

    public static boolean c(io.reactivex.disposables.c cVar) {
        return cVar == DISPOSED;
    }

    public static boolean d(AtomicReference<io.reactivex.disposables.c> atomicReference, io.reactivex.disposables.c cVar) {
        io.reactivex.disposables.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
        } while (!z1.a(atomicReference, cVar2, cVar));
        return true;
    }

    public static void l() {
        io.reactivex.plugins.a.Y(new io.reactivex.exceptions.e("Disposable already set!"));
    }

    public static boolean n(AtomicReference<io.reactivex.disposables.c> atomicReference, io.reactivex.disposables.c cVar) {
        io.reactivex.disposables.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar != null) {
                    cVar.dispose();
                }
                return false;
            }
        } while (!z1.a(atomicReference, cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.dispose();
        return true;
    }

    public static boolean o(AtomicReference<io.reactivex.disposables.c> atomicReference, io.reactivex.disposables.c cVar) {
        io.reactivex.internal.functions.b.g(cVar, "d is null");
        if (z1.a(atomicReference, null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() != DISPOSED) {
            l();
        }
        return false;
    }

    public static boolean p(AtomicReference<io.reactivex.disposables.c> atomicReference, io.reactivex.disposables.c cVar) {
        if (z1.a(atomicReference, null, cVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        cVar.dispose();
        return false;
    }

    public static boolean q(io.reactivex.disposables.c cVar, io.reactivex.disposables.c cVar2) {
        if (cVar2 == null) {
            io.reactivex.plugins.a.Y(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.dispose();
        l();
        return false;
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return true;
    }
}
