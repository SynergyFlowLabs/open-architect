package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b(emulated = true)
public final class f0 {
    private f0() {
    }

    public static /* synthetic */ void a(com.google.common.base.s0 s0Var, Runnable runnable) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zI = i((String) s0Var.get(), threadCurrentThread);
        try {
            runnable.run();
        } finally {
            if (zI) {
                i(name, threadCurrentThread);
            }
        }
    }

    public static /* synthetic */ Object c(com.google.common.base.s0 s0Var, Callable callable) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zI = i((String) s0Var.get(), threadCurrentThread);
        try {
            Object objCall = callable.call();
            if (zI) {
            }
            return objCall;
        } finally {
            if (zI) {
                i(name, threadCurrentThread);
            }
        }
    }

    public static /* synthetic */ Object d(Object obj) {
        return obj;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <T> v<T> e(final Callable<T> callable, final x1 listeningExecutorService) {
        com.google.common.base.j0.E(callable);
        com.google.common.base.j0.E(listeningExecutorService);
        return new v() { // from class: com.google.common.util.concurrent.c0
            @Override // com.google.common.util.concurrent.v
            public final t1 call() {
                return listeningExecutorService.submit(callable);
            }
        };
    }

    public static <T> Callable<T> f(@d2 final T value) {
        return new Callable() { // from class: com.google.common.util.concurrent.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f0.d(value);
            }
        };
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    static Runnable g(final Runnable task, final com.google.common.base.s0<String> nameSupplier) {
        com.google.common.base.j0.E(nameSupplier);
        com.google.common.base.j0.E(task);
        return new Runnable() { // from class: com.google.common.util.concurrent.e0
            @Override // java.lang.Runnable
            public final void run() {
                f0.a(nameSupplier, task);
            }
        };
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    static <T> Callable<T> h(final Callable<T> callable, final com.google.common.base.s0<String> nameSupplier) {
        com.google.common.base.j0.E(nameSupplier);
        com.google.common.base.j0.E(callable);
        return new Callable() { // from class: com.google.common.util.concurrent.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f0.c(nameSupplier, callable);
            }
        };
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static boolean i(String threadName, Thread currentThread) {
        try {
            currentThread.setName(threadName);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
