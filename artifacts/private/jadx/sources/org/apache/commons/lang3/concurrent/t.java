package org.apache.commons.lang3.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public class t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f337129l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f337130m = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f337131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f337132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeUnit f337133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f337134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScheduledFuture<?> f337135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f337136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f337137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f337138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f337139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f337140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f337141k;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.c();
        }
    }

    public t(long j10, TimeUnit timeUnit, int i10) {
        this(null, j10, timeUnit, i10);
    }

    private boolean b() {
        if (i() > 0 && this.f337139i >= i()) {
            return false;
        }
        this.f337139i++;
        return true;
    }

    private void m() {
        if (l()) {
            throw new IllegalStateException("TimedSemaphore is shut down!");
        }
        if (this.f337135e == null) {
            this.f337135e = p();
        }
    }

    public synchronized void a() throws InterruptedException {
        boolean zB;
        m();
        do {
            zB = b();
            if (!zB) {
                wait();
            }
        } while (!zB);
    }

    synchronized void c() {
        try {
            int i10 = this.f337139i;
            this.f337140j = i10;
            this.f337136f += (long) i10;
            this.f337137g++;
            this.f337139i = 0;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int d() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f337139i;
    }

    public synchronized int e() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return i() - d();
    }

    public synchronized double f() {
        long j10;
        j10 = this.f337137g;
        return j10 == 0 ? 0.0d : this.f337136f / j10;
    }

    protected ScheduledExecutorService g() {
        return this.f337131a;
    }

    public synchronized int h() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f337140j;
    }

    public final synchronized int i() {
        return this.f337138h;
    }

    public long j() {
        return this.f337132b;
    }

    public TimeUnit k() {
        return this.f337133c;
    }

    public synchronized boolean l() {
        return this.f337141k;
    }

    public final synchronized void n(int i10) {
        this.f337138h = i10;
    }

    public synchronized void o() {
        try {
            if (!this.f337141k) {
                if (this.f337134d) {
                    g().shutdownNow();
                }
                ScheduledFuture<?> scheduledFuture = this.f337135e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f337141k = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected ScheduledFuture<?> p() {
        return g().scheduleAtFixedRate(new a(), j(), j(), k());
    }

    public synchronized boolean q() {
        m();
        return b();
    }

    public t(ScheduledExecutorService scheduledExecutorService, long j10, TimeUnit timeUnit, int i10) {
        c0.l(1L, Long.MAX_VALUE, j10, "Time period must be greater than 0!");
        this.f337132b = j10;
        this.f337133c = timeUnit;
        if (scheduledExecutorService != null) {
            this.f337131a = scheduledExecutorService;
            this.f337134d = false;
        } else {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            scheduledThreadPoolExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            this.f337131a = scheduledThreadPoolExecutor;
            this.f337134d = true;
        }
        n(i10);
    }
}
