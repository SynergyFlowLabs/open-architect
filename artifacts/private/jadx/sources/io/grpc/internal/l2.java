package io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f289320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f289321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f289322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.common.base.q0 f289323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f289324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f289325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScheduledFuture<?> f289326g;

    private final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!l2.this.f289325f) {
                l2.this.f289326g = null;
                return;
            }
            long jK = l2.this.k();
            if (l2.this.f289324e - jK > 0) {
                l2 l2Var = l2.this;
                l2Var.f289326g = l2Var.f289320a.schedule(new c(), l2.this.f289324e - jK, TimeUnit.NANOSECONDS);
            } else {
                l2.this.f289325f = false;
                l2.this.f289326g = null;
                l2.this.f289322c.run();
            }
        }
    }

    private final class c implements Runnable {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            return l2.this.f289325f;
        }

        @Override // java.lang.Runnable
        public void run() {
            l2.this.f289321b.execute(new b());
        }
    }

    l2(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, com.google.common.base.q0 q0Var) {
        this.f289322c = runnable;
        this.f289321b = executor;
        this.f289320a = scheduledExecutorService;
        this.f289323d = q0Var;
        q0Var.k();
    }

    @com.google.common.annotations.e
    static boolean j(Runnable runnable) {
        return ((c) runnable).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long k() {
        return this.f289323d.g(TimeUnit.NANOSECONDS);
    }

    void i(boolean z10) {
        ScheduledFuture<?> scheduledFuture;
        this.f289325f = false;
        if (!z10 || (scheduledFuture = this.f289326g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f289326g = null;
    }

    void l(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        long jK = k() + nanos;
        int i10 = 2 >> 1;
        this.f289325f = true;
        if (jK - this.f289324e < 0 || this.f289326g == null) {
            ScheduledFuture<?> scheduledFuture = this.f289326g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f289326g = this.f289320a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f289324e = jK;
    }
}
