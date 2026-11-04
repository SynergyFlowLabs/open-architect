package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes5.dex */
@o0
@r9.h(r9.h.a.FULL)
@com.google.common.annotations.b(emulated = true)
abstract class p1<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f120265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f120266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f120267c = 1000;

    @com.google.common.annotations.e
    static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p1<?> f120268a;

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        @com.google.common.annotations.e
        @fj.a
        Thread b() {
            return super.getExclusiveOwnerThread();
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return this.f120268a.toString();
        }

        private b(p1<?> task) {
            this.f120268a = task;
        }
    }

    private static final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f120265a = new c();
        f120266b = new c();
    }

    p1() {
    }

    private void g(Thread currentThread) {
        Runnable runnable = get();
        b bVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof b;
            if (!z11 && runnable != f120266b) {
                break;
            }
            if (z11) {
                bVar = (b) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f120266b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z10) {
            currentThread.interrupt();
        }
    }

    abstract void a(Throwable error);

    abstract void b(@d2 T result);

    final void c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.c(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (getAndSet(f120265a) == f120266b) {
                        Thread thread = (Thread) runnable;
                    }
                } finally {
                    if (getAndSet(f120265a) == f120266b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean d();

    @d2
    abstract T e() throws Exception;

    abstract String f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th2) {
                    try {
                        f2.b(th2);
                        if (!compareAndSet(threadCurrentThread, f120265a)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, f120265a)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(b2.a(null));
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f120265a)) {
                g(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(b2.a(objE));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f120265a) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + f();
    }
}
