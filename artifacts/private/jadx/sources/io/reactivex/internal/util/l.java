package io.reactivex.internal.util;

import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class l {
    private l() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(i0<?> i0Var, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thC = cVar.c();
            if (thC != null) {
                i0Var.onError(thC);
            } else {
                i0Var.onComplete();
            }
        }
    }

    public static void b(org.reactivestreams.v<?> vVar, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thC = cVar.c();
            if (thC != null) {
                vVar.onError(thC);
            } else {
                vVar.onComplete();
            }
        }
    }

    public static void c(i0<?> i0Var, Throwable th2, AtomicInteger atomicInteger, c cVar) {
        if (!cVar.a(th2)) {
            io.reactivex.plugins.a.Y(th2);
        } else {
            if (atomicInteger.getAndIncrement() == 0) {
                i0Var.onError(cVar.c());
            }
        }
    }

    public static void d(org.reactivestreams.v<?> vVar, Throwable th2, AtomicInteger atomicInteger, c cVar) {
        if (!cVar.a(th2)) {
            io.reactivex.plugins.a.Y(th2);
        } else {
            if (atomicInteger.getAndIncrement() == 0) {
                vVar.onError(cVar.c());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void e(i0<? super T> i0Var, T t10, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            i0Var.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thC = cVar.c();
                if (thC != null) {
                    i0Var.onError(thC);
                } else {
                    i0Var.onComplete();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void f(org.reactivestreams.v<? super T> vVar, T t10, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            vVar.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thC = cVar.c();
                if (thC != null) {
                    vVar.onError(thC);
                    return;
                }
                vVar.onComplete();
            }
        }
    }
}
