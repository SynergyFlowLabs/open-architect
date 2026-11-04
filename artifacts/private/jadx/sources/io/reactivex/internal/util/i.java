package io.reactivex.internal.util;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class i {
    private i() {
        throw new IllegalStateException("No instances!");
    }

    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        io.reactivex.plugins.a.Y(new io.reactivex.exceptions.e(a(cls.getName())));
    }

    public static boolean c(AtomicReference<io.reactivex.disposables.c> atomicReference, io.reactivex.disposables.c cVar, Class<?> cls) {
        io.reactivex.internal.functions.b.g(cVar, "next is null");
        if (z1.a(atomicReference, null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() != io.reactivex.internal.disposables.d.DISPOSED) {
            b(cls);
        }
        return false;
    }

    public static boolean d(AtomicReference<org.reactivestreams.w> atomicReference, org.reactivestreams.w wVar, Class<?> cls) {
        io.reactivex.internal.functions.b.g(wVar, "next is null");
        if (z1.a(atomicReference, null, wVar)) {
            return true;
        }
        wVar.cancel();
        if (atomicReference.get() != io.reactivex.internal.subscriptions.j.CANCELLED) {
            b(cls);
        }
        return false;
    }

    public static boolean e(io.reactivex.disposables.c cVar, io.reactivex.disposables.c cVar2, Class<?> cls) {
        io.reactivex.internal.functions.b.g(cVar2, "next is null");
        if (cVar == null) {
            return true;
        }
        cVar2.dispose();
        if (cVar != io.reactivex.internal.disposables.d.DISPOSED) {
            b(cls);
        }
        return false;
    }

    public static boolean f(org.reactivestreams.w wVar, org.reactivestreams.w wVar2, Class<?> cls) {
        io.reactivex.internal.functions.b.g(wVar2, "next is null");
        if (wVar == null) {
            return true;
        }
        wVar2.cancel();
        if (wVar == io.reactivex.internal.subscriptions.j.CANCELLED) {
            return false;
        }
        b(cls);
        return false;
    }
}
