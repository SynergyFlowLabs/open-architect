package com.google.android.gms.measurement.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class d7 extends l8 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicLong f109876l = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private c7 f109877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private c7 f109878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f109879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue f109880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f109881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f109882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f109883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Semaphore f109884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f109885k;

    d7(h7 h7Var) {
        super(h7Var);
        this.f109883i = new Object();
        this.f109884j = new Semaphore(2);
        this.f109879e = new PriorityBlockingQueue();
        this.f109880f = new LinkedBlockingQueue();
        this.f109881g = new a7(this, "Thread death: Uncaught exception on worker thread");
        this.f109882h = new a7(this, "Thread death: Uncaught exception on network thread");
    }

    private final void F(b7 b7Var) {
        synchronized (this.f109883i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f109879e;
                priorityBlockingQueue.add(b7Var);
                c7 c7Var = this.f109877c;
                if (c7Var == null) {
                    c7 c7Var2 = new c7(this, "Measurement Worker", priorityBlockingQueue);
                    this.f109877c = c7Var2;
                    c7Var2.setUncaughtExceptionHandler(this.f109881g);
                    this.f109877c.start();
                } else {
                    c7Var.a();
                }
            } finally {
            }
        }
    }

    final /* synthetic */ void A(c7 c7Var) {
        this.f109878d = null;
    }

    final /* synthetic */ Object B() {
        return this.f109883i;
    }

    final /* synthetic */ Semaphore C() {
        return this.f109884j;
    }

    final /* synthetic */ boolean D() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.k8
    public final void g() {
        if (Thread.currentThread() != this.f109878d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.k8
    public final void h() {
        if (Thread.currentThread() != this.f109877c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.l8
    protected final boolean i() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() == this.f109877c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean p() {
        return Thread.currentThread() == this.f109877c;
    }

    public final boolean q() {
        return Thread.currentThread() == this.f109878d;
    }

    public final Future r(Callable callable) throws IllegalStateException {
        l();
        com.google.android.gms.common.internal.w.r(callable);
        b7 b7Var = new b7(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f109877c) {
            F(b7Var);
            return b7Var;
        }
        if (!this.f109879e.isEmpty()) {
            this.f110184a.a().r().a("Callable skipped the worker queue.");
        }
        b7Var.run();
        return b7Var;
    }

    public final Future s(Callable callable) throws IllegalStateException {
        l();
        com.google.android.gms.common.internal.w.r(callable);
        b7 b7Var = new b7(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f109877c) {
            b7Var.run();
            return b7Var;
        }
        F(b7Var);
        return b7Var;
    }

    public final void t(Runnable runnable) throws IllegalStateException {
        l();
        com.google.android.gms.common.internal.w.r(runnable);
        F(new b7(this, runnable, false, "Task exception on worker thread"));
    }

    @androidx.annotation.p0
    final Object u(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            try {
                this.f110184a.b().t(runnable);
                try {
                    atomicReference.wait(j10);
                } catch (InterruptedException unused) {
                    u5 u5VarR = this.f110184a.a().r();
                    StringBuilder sb2 = new StringBuilder(str.length() + 24);
                    sb2.append("Interrupted waiting for ");
                    sb2.append(str);
                    u5VarR.a(sb2.toString());
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f110184a.a().r().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void v(Runnable runnable) throws IllegalStateException {
        l();
        com.google.android.gms.common.internal.w.r(runnable);
        F(new b7(this, runnable, true, "Task exception on worker thread"));
    }

    public final void w(Runnable runnable) throws IllegalStateException {
        l();
        com.google.android.gms.common.internal.w.r(runnable);
        b7 b7Var = new b7(this, runnable, false, "Task exception on network thread");
        synchronized (this.f109883i) {
            try {
                BlockingQueue blockingQueue = this.f109880f;
                blockingQueue.add(b7Var);
                c7 c7Var = this.f109878d;
                if (c7Var == null) {
                    c7 c7Var2 = new c7(this, "Measurement Network", blockingQueue);
                    this.f109878d = c7Var2;
                    c7Var2.setUncaughtExceptionHandler(this.f109882h);
                    this.f109878d.start();
                } else {
                    c7Var.a();
                }
            } finally {
            }
        }
    }

    final /* synthetic */ c7 x() {
        return this.f109877c;
    }

    final /* synthetic */ void y(c7 c7Var) {
        this.f109877c = null;
    }

    final /* synthetic */ c7 z() {
        return this.f109878d;
    }
}
