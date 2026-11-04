package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public final class q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s1 f120280c = new s1(q0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a8.a("this")
    @fj.a
    private a f120281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.a("this")
    private boolean f120282b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f120283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f120284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        a f120285c;

        a(Runnable runnable, Executor executor, @fj.a a next) {
            this.f120283a = runnable;
            this.f120284b = executor;
            this.f120285c = next;
        }
    }

    private static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f120280c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        com.google.common.base.j0.F(runnable, "Runnable was null.");
        com.google.common.base.j0.F(executor, "Executor was null.");
        synchronized (this) {
            try {
                if (this.f120282b) {
                    c(runnable, executor);
                } else {
                    this.f120281a = new a(runnable, executor, this.f120281a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        synchronized (this) {
            try {
                if (this.f120282b) {
                    return;
                }
                this.f120282b = true;
                a aVar = this.f120281a;
                a aVar2 = null;
                this.f120281a = null;
                while (aVar != null) {
                    a aVar3 = aVar.f120285c;
                    aVar.f120285c = aVar2;
                    aVar2 = aVar;
                    aVar = aVar3;
                }
                while (aVar2 != null) {
                    c(aVar2.f120283a, aVar2.f120284b);
                    aVar2 = aVar2.f120285c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
