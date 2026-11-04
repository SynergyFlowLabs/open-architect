package io.reactivex.internal.util;

import androidx.compose.animation.core.z1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Throwable f303486a = new a();

    static final class a extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f303487a = -4649703670690200604L;

        a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    private k() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> boolean a(AtomicReference<Throwable> atomicReference, Throwable th2) {
        Throwable th3;
        do {
            th3 = atomicReference.get();
            if (th3 == f303486a) {
                return false;
            }
        } while (!z1.a(atomicReference, th3, th3 == null ? th2 : new io.reactivex.exceptions.a(th3, th2)));
        return true;
    }

    public static List<Throwable> b(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.offer(th2);
        while (!arrayDeque.isEmpty()) {
            Throwable th3 = (Throwable) arrayDeque.removeFirst();
            if (th3 instanceof io.reactivex.exceptions.a) {
                List<Throwable> listB = ((io.reactivex.exceptions.a) th3).b();
                for (int size = listB.size() - 1; size >= 0; size--) {
                    arrayDeque.offerFirst(listB.get(size));
                }
            } else {
                arrayList.add(th3);
            }
        }
        return arrayList;
    }

    public static <T> Throwable c(AtomicReference<Throwable> atomicReference) {
        Throwable th2 = atomicReference.get();
        Throwable th3 = f303486a;
        return th2 != th3 ? atomicReference.getAndSet(th3) : th2;
    }

    public static <E extends Throwable> Exception d(Throwable th2) throws Throwable {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        throw th2;
    }

    public static String e(long j10, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j10 + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    public static RuntimeException f(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2 instanceof RuntimeException ? (RuntimeException) th2 : new RuntimeException(th2);
    }
}
