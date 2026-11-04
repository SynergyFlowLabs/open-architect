package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
abstract class j4 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f109149a = new h4(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f109150b = new h4(null);

    j4() {
    }

    private final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        g4 g4Var = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof g4)) {
                if (runnable != f109150b) {
                    break;
                }
            } else {
                g4Var = (g4) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f109150b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(g4Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    abstract Object a() throws Exception;

    abstract String b();

    abstract void c(Throwable th2);

    abstract void d(Object obj);

    final void e() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            g4 g4Var = new g4(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, g4Var)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(f109149a)) == f109150b) {
                    }
                } finally {
                    if (((Runnable) getAndSet(f109149a)) == f109150b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean f();

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zF = f();
            if (!zF) {
                try {
                    objA = a();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, f109149a)) {
                            g(threadCurrentThread);
                        }
                        c(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, f109149a)) {
                            g(threadCurrentThread);
                        }
                        d(null);
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f109149a)) {
                g(threadCurrentThread);
            }
            if (zF) {
                return;
            }
            d(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f109149a) {
            str = "running=[DONE]";
        } else if (runnable instanceof g4) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
