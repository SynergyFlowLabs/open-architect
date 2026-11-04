package io.grpc.internal;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class j1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f289278l = TimeUnit.SECONDS.toNanos(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f289279m = TimeUnit.MILLISECONDS.toNanos(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f289280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @gj.a("this")
    private final com.google.common.base.q0 f289281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f289282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f289283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @gj.a("this")
    private e f289284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @gj.a("this")
    private ScheduledFuture<?> f289285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @gj.a("this")
    private ScheduledFuture<?> f289286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f289287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f289288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f289289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f289290k;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            synchronized (j1.this) {
                try {
                    e eVar = j1.this.f289284e;
                    e eVar2 = e.DISCONNECTED;
                    if (eVar != eVar2) {
                        j1.this.f289284e = eVar2;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                j1.this.f289282c.a();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            synchronized (j1.this) {
                try {
                    j1.this.f289286g = null;
                    e eVar = j1.this.f289284e;
                    e eVar2 = e.PING_SCHEDULED;
                    if (eVar == eVar2) {
                        j1.this.f289284e = e.PING_SENT;
                        j1 j1Var = j1.this;
                        j1Var.f289285f = j1Var.f289280a.schedule(j1.this.f289287h, j1.this.f289290k, TimeUnit.NANOSECONDS);
                        z10 = true;
                    } else {
                        if (j1.this.f289284e == e.PING_DELAYED) {
                            j1 j1Var2 = j1.this;
                            ScheduledExecutorService scheduledExecutorService = j1Var2.f289280a;
                            Runnable runnable = j1.this.f289288i;
                            long j10 = j1.this.f289289j;
                            com.google.common.base.q0 q0Var = j1.this.f289281b;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            j1Var2.f289286g = scheduledExecutorService.schedule(runnable, j10 - q0Var.g(timeUnit), timeUnit);
                            j1.this.f289284e = eVar2;
                        }
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                j1.this.f289282c.b();
            }
        }
    }

    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f289293a;

        class a implements u.a {
            a() {
            }

            @Override // io.grpc.internal.u.a
            public void a(long j10) {
            }

            @Override // io.grpc.internal.u.a
            public void onFailure(Throwable th2) {
                c.this.f289293a.a(io.grpc.y2.f291465t.u("Keepalive failed. The connection is likely gone"));
            }
        }

        public c(x xVar) {
            this.f289293a = xVar;
        }

        @Override // io.grpc.internal.j1.d
        public void a() {
            this.f289293a.a(io.grpc.y2.f291465t.u("Keepalive failed. The connection is likely gone"));
        }

        @Override // io.grpc.internal.j1.d
        public void b() {
            this.f289293a.d(new a(), com.google.common.util.concurrent.a2.c());
        }
    }

    public interface d {
        void a();

        void b();
    }

    private enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED;

        static {
            int i10 = 4 << 4;
        }
    }

    public j1(d dVar, ScheduledExecutorService scheduledExecutorService, long j10, long j11, boolean z10) {
        this(dVar, scheduledExecutorService, com.google.common.base.q0.e(), j10, j11, z10);
    }

    public static long l(long j10) {
        return Math.max(j10, f289278l);
    }

    public static long m(long j10) {
        return Math.max(j10, f289279m);
    }

    public synchronized void n() {
        try {
            this.f289281b.j().k();
            e eVar = this.f289284e;
            e eVar2 = e.PING_SCHEDULED;
            if (eVar == eVar2) {
                this.f289284e = e.PING_DELAYED;
            } else if (eVar == e.PING_SENT || eVar == e.IDLE_AND_PING_SENT) {
                ScheduledFuture<?> scheduledFuture = this.f289285f;
                boolean z10 = false;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f289284e == e.IDLE_AND_PING_SENT) {
                    this.f289284e = e.IDLE;
                    return;
                }
                this.f289284e = eVar2;
                if (this.f289286g == null) {
                    z10 = true;
                    int i10 = 4 | 1;
                }
                com.google.common.base.j0.h0(z10, "There should be no outstanding pingFuture");
                this.f289286g = this.f289280a.schedule(this.f289288i, this.f289289j, TimeUnit.NANOSECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void o() {
        try {
            e eVar = this.f289284e;
            if (eVar == e.IDLE) {
                this.f289284e = e.PING_SCHEDULED;
                if (this.f289286g == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f289280a;
                    Runnable runnable = this.f289288i;
                    long j10 = this.f289289j;
                    com.google.common.base.q0 q0Var = this.f289281b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f289286g = scheduledExecutorService.schedule(runnable, j10 - q0Var.g(timeUnit), timeUnit);
                }
            } else if (eVar == e.IDLE_AND_PING_SENT) {
                this.f289284e = e.PING_SENT;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void p() {
        try {
            if (this.f289283d) {
                return;
            }
            e eVar = this.f289284e;
            if (eVar == e.PING_SCHEDULED || eVar == e.PING_DELAYED) {
                this.f289284e = e.IDLE;
            }
            if (this.f289284e == e.PING_SENT) {
                this.f289284e = e.IDLE_AND_PING_SENT;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void q() {
        try {
            if (this.f289283d) {
                o();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void r() {
        try {
            e eVar = this.f289284e;
            e eVar2 = e.DISCONNECTED;
            if (eVar != eVar2) {
                this.f289284e = eVar2;
                ScheduledFuture<?> scheduledFuture = this.f289285f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture<?> scheduledFuture2 = this.f289286g;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.f289286g = null;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @com.google.common.annotations.e
    j1(d dVar, ScheduledExecutorService scheduledExecutorService, com.google.common.base.q0 q0Var, long j10, long j11, boolean z10) {
        this.f289284e = e.IDLE;
        this.f289287h = new k1(new a());
        this.f289288i = new k1(new b());
        this.f289282c = (d) com.google.common.base.j0.F(dVar, "keepAlivePinger");
        this.f289280a = (ScheduledExecutorService) com.google.common.base.j0.F(scheduledExecutorService, "scheduler");
        this.f289281b = (com.google.common.base.q0) com.google.common.base.j0.F(q0Var, androidx.core.app.w.W0);
        this.f289289j = j10;
        this.f289290k = j11;
        this.f289283d = z10;
        q0Var.j().k();
    }
}
