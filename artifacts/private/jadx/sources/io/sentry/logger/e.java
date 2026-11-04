package io.sentry.logger;

import io.sentry.a8;
import io.sentry.c8;
import io.sentry.k1;
import io.sentry.l1;
import io.sentry.m1;
import io.sentry.n8;
import io.sentry.s7;
import io.sentry.transport.b0;
import io.sentry.y7;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements io.sentry.logger.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f305850h = 5000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f305851i = 100;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f305852j = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f305853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k1 f305854b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final l1 f305856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private volatile Future<?> f305857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f305858f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final b0 f305859g = new b0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Queue<a8> f305855c = new ConcurrentLinkedQueue();

    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    public e(@NotNull n8 n8Var, @NotNull k1 k1Var) {
        this.f305853a = n8Var;
        this.f305854b = k1Var;
        this.f305856d = new s7(n8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        f();
        m1 m1VarA = f305852j.a();
        try {
            if (this.f305855c.isEmpty()) {
                this.f305858f = false;
            } else {
                g(true, false);
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void e() {
        ArrayList arrayList = new ArrayList(100);
        do {
            a8 a8VarPoll = this.f305855c.poll();
            if (a8VarPoll != null) {
                arrayList.add(a8VarPoll);
            }
            if (this.f305855c.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f305854b.o(new c8(arrayList));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f305859g.a();
        }
    }

    private void f() {
        do {
            e();
        } while (this.f305855c.size() >= 100);
    }

    private void g(boolean z10, boolean z11) {
        if (!this.f305858f || z10) {
            m1 m1VarA = f305852j.a();
            try {
                Future<?> future = this.f305857e;
                if (z10 || future == null || future.isDone() || future.isCancelled()) {
                    this.f305858f = true;
                    try {
                        this.f305857e = this.f305856d.b(new b(), z11 ? 0 : 5000);
                    } catch (RejectedExecutionException e10) {
                        this.f305858f = false;
                        this.f305853a.getLogger().a(y7.WARNING, "Logs batch processor flush task rejected", e10);
                    }
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.logger.b
    public void a(@NotNull a8 a8Var) {
        this.f305859g.c();
        this.f305855c.offer(a8Var);
        g(false, false);
    }

    @Override // io.sentry.logger.b
    public void i(boolean z10) {
        if (z10) {
            g(true, true);
            this.f305856d.submit(new Runnable() { // from class: io.sentry.logger.d
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = this.f305849a;
                    eVar.f305856d.c(eVar.f305853a.getShutdownTimeoutMillis());
                }
            });
        } else {
            this.f305856d.c(this.f305853a.getShutdownTimeoutMillis());
            while (!this.f305855c.isEmpty()) {
                e();
            }
        }
    }

    @Override // io.sentry.logger.b
    public void w(long j10) {
        g(true, true);
        try {
            this.f305859g.e(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.f305853a.getLogger().a(y7.ERROR, "Failed to flush log events", e10);
            Thread.currentThread().interrupt();
        }
    }
}
