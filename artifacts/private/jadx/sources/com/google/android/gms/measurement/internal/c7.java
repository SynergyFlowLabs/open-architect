package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
final class c7 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f109838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f109839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("threadLifeCycleLock")
    private boolean f109840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ d7 f109841d;

    public c7(d7 d7Var, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(d7Var);
        this.f109841d = d7Var;
        this.f109840c = false;
        com.google.android.gms.common.internal.w.r(str);
        com.google.android.gms.common.internal.w.r(blockingQueue);
        this.f109838a = new Object();
        this.f109839b = blockingQueue;
        setName(str);
    }

    private final void b() {
        d7 d7Var = this.f109841d;
        synchronized (d7Var.B()) {
            try {
                if (!this.f109840c) {
                    d7Var.C().release();
                    d7Var.B().notifyAll();
                    if (this == d7Var.x()) {
                        d7Var.y(null);
                    } else if (this == d7Var.z()) {
                        d7Var.A(null);
                    } else {
                        d7Var.f110184a.a().o().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f109840c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.f109841d.f110184a.a().r().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        Object obj = this.f109838a;
        synchronized (obj) {
            try {
                obj.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f109841d.C().acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f109839b;
                b7 b7Var = (b7) blockingQueue.poll();
                if (b7Var != null) {
                    Process.setThreadPriority(true != b7Var.f109781b ? 10 : threadPriority);
                    b7Var.run();
                } else {
                    Object obj = this.f109838a;
                    synchronized (obj) {
                        try {
                            if (blockingQueue.peek() == null) {
                                this.f109841d.D();
                                try {
                                    obj.wait(30000L);
                                } catch (InterruptedException e11) {
                                    c(e11);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    synchronized (this.f109841d.B()) {
                        if (this.f109839b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            b();
            throw th3;
        }
    }
}
