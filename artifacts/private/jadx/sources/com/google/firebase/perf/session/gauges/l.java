package com.google.firebase.perf.session.gauges;

import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.m;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124118f = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f124119g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f124120h = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f124121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue<com.google.firebase.perf.v1.c> f124122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runtime f124123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private ScheduledFuture f124124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f124125e;

    @e.a({"ThreadPoolCreation"})
    l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    public static /* synthetic */ void a(l lVar, Timer timer) {
        com.google.firebase.perf.v1.c cVarJ = lVar.j(timer);
        if (cVarJ != null) {
            lVar.f124122b.add(cVarJ);
        }
    }

    public static /* synthetic */ void b(l lVar, Timer timer) {
        com.google.firebase.perf.v1.c cVarJ = lVar.j(timer);
        if (cVarJ != null) {
            lVar.f124122b.add(cVarJ);
        }
    }

    private int d() {
        return m.d(com.google.firebase.perf.util.j.f124248f.p(this.f124123c.totalMemory() - this.f124123c.freeMemory()));
    }

    public static boolean e(long j10) {
        return j10 <= 0;
    }

    private synchronized void f(final Timer timer) {
        try {
            try {
                this.f124121a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.b(this.f124116a, timer);
                    }
                }, 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                f124118f.l("Unable to collect Memory Metric: " + e10.getMessage());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void g(long j10, final Timer timer) {
        try {
            this.f124125e = j10;
            try {
                this.f124124d = this.f124121a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.a(this.f124114a, timer);
                    }
                }, 0L, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                f124118f.l("Unable to start collecting Memory Metrics: " + e10.getMessage());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @p0
    private com.google.firebase.perf.v1.c j(Timer timer) {
        if (timer == null) {
            return null;
        }
        return com.google.firebase.perf.v1.c.hm().Ql(timer.b()).Rl(d()).build();
    }

    public void c(Timer timer) {
        f(timer);
    }

    public void h(long j10, Timer timer) {
        if (e(j10)) {
            return;
        }
        if (this.f124124d == null) {
            g(j10, timer);
        } else if (this.f124125e != j10) {
            i();
            g(j10, timer);
        }
    }

    public void i() {
        ScheduledFuture scheduledFuture = this.f124124d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f124124d = null;
        this.f124125e = -1L;
    }

    @l1
    l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f124124d = null;
        this.f124125e = -1L;
        this.f124121a = scheduledExecutorService;
        this.f124122b = new ConcurrentLinkedQueue<>();
        this.f124123c = runtime;
    }
}
