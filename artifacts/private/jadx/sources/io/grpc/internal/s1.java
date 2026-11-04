package io.grpc.internal;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class s1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c f289788i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f289789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f289790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.a
    private ScheduledFuture<?> f289791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f289792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScheduledExecutorService f289793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f289794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f289795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f289796h;

    class a implements c {
        a() {
        }

        @Override // io.grpc.internal.s1.c
        public long a() {
            return System.nanoTime();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScheduledExecutorService f289797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f289798b;

        b(ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            this.f289797a = scheduledExecutorService;
            this.f289798b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!s1.this.f289795g) {
                this.f289798b.run();
                s1.this.f289791c = null;
            } else {
                if (s1.this.f289796h) {
                    return;
                }
                s1 s1Var = s1.this;
                s1Var.f289791c = this.f289797a.schedule(s1Var.f289792d, s1.this.f289794f - s1.this.f289790b.a(), TimeUnit.NANOSECONDS);
                s1.this.f289795g = false;
            }
        }
    }

    @com.google.common.annotations.e
    public interface c {
        long a();
    }

    public s1(long j10) {
        this(j10, f289788i);
    }

    public void h() {
        this.f289796h = true;
        this.f289795g = true;
    }

    public void i() {
        this.f289796h = false;
        ScheduledFuture<?> scheduledFuture = this.f289791c;
        if (scheduledFuture == null) {
            return;
        }
        if (!scheduledFuture.isDone()) {
            this.f289794f = this.f289790b.a() + this.f289789a;
        } else {
            this.f289795g = false;
            this.f289791c = this.f289793e.schedule(this.f289792d, this.f289789a, TimeUnit.NANOSECONDS);
        }
    }

    public void j() {
        ScheduledFuture<?> scheduledFuture = this.f289791c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f289791c = null;
        }
    }

    public void k(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f289793e = scheduledExecutorService;
        this.f289794f = this.f289790b.a() + this.f289789a;
        k1 k1Var = new k1(new b(scheduledExecutorService, runnable));
        this.f289792d = k1Var;
        this.f289791c = scheduledExecutorService.schedule(k1Var, this.f289789a, TimeUnit.NANOSECONDS);
    }

    @com.google.common.annotations.e
    public s1(long j10, c cVar) {
        this.f289789a = j10;
        this.f289790b = cVar;
    }
}
