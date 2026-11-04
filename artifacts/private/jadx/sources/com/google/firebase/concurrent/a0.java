package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes5.dex */
class a0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f120834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Semaphore f120835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedBlockingQueue<Runnable> f120836c = new LinkedBlockingQueue<>();

    a0(Executor executor, int i10) {
        com.google.firebase.components.i0.a(i10 > 0, "concurrency must be positive.");
        this.f120834a = executor;
        this.f120835b = new Semaphore(i10, true);
    }

    public static /* synthetic */ void a(a0 a0Var, Runnable runnable) {
        a0Var.getClass();
        try {
            runnable.run();
            a0Var.f120835b.release();
            a0Var.c();
        } catch (Throwable th2) {
            a0Var.f120835b.release();
            a0Var.c();
            throw th2;
        }
    }

    private Runnable b(final Runnable runnable) {
        return new Runnable() { // from class: com.google.firebase.concurrent.z
            @Override // java.lang.Runnable
            public final void run() {
                a0.a(this.f120917a, runnable);
            }
        };
    }

    private void c() {
        while (this.f120835b.tryAcquire()) {
            Runnable runnablePoll = this.f120836c.poll();
            if (runnablePoll == null) {
                this.f120835b.release();
                break;
            }
            this.f120834a.execute(b(runnablePoll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f120836c.offer(runnable);
        c();
    }
}
