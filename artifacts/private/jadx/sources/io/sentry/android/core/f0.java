package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.e4;
import io.sentry.e9;
import io.sentry.f8;
import io.sentry.y7;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class f0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f304127p = 3000000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f304128q = 30000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final File f304130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f304131c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f304134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.b0 f304135g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final io.sentry.l1 f304140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final ILogger f304141m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f304129a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Future<?> f304132d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private File f304133e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<io.sentry.profilemeasurements.b> f304136h = new ArrayDeque<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<io.sentry.profilemeasurements.b> f304137i = new ArrayDeque<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<io.sentry.profilemeasurements.b> f304138j = new ArrayDeque<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Map<String, io.sentry.profilemeasurements.a> f304139k = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f304142n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.a f304143o = new io.sentry.util.a();

    class a implements io.sentry.android.core.internal.util.b0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f304144a = 0.0f;

        a() {
        }

        @Override // io.sentry.android.core.internal.util.b0.c
        public void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10) {
            long jK = new f8().k();
            long jNanoTime = ((j11 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - f0.this.f304129a;
            if (jNanoTime < 0) {
                return;
            }
            if (z11) {
                f0.this.f304138j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j12), jK));
            } else if (z10) {
                f0.this.f304137i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j12), jK));
            }
            if (f10 != this.f304144a) {
                this.f304144a = f10;
                f0.this.f304136h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Float.valueOf(f10), jK));
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f304146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f304147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final File f304148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Map<String, io.sentry.profilemeasurements.a> f304149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f304150e;

        public b(long j10, long j11, boolean z10, @NotNull File file, @NotNull Map<String, io.sentry.profilemeasurements.a> map) {
            this.f304146a = j10;
            this.f304148c = file;
            this.f304147b = j11;
            this.f304149d = map;
            this.f304150e = z10;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f304151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f304152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Date f304153c;

        public c(long j10, long j11, @NotNull Date date) {
            this.f304151a = j10;
            this.f304152b = j11;
            this.f304153c = date;
        }
    }

    public f0(@NotNull String str, int i10, @NotNull io.sentry.android.core.internal.util.b0 b0Var, @Nullable io.sentry.l1 l1Var, @NotNull ILogger iLogger) {
        this.f304130b = new File((String) io.sentry.util.y.c(str, "TracesFilesDirPath is required"));
        this.f304131c = i10;
        this.f304141m = (ILogger) io.sentry.util.y.c(iLogger, "Logger is required");
        this.f304140l = l1Var;
        this.f304135g = (io.sentry.android.core.internal.util.b0) io.sentry.util.y.c(b0Var, "SentryFrameMetricsCollector is required");
    }

    @e.a({"NewApi"})
    private void h(@Nullable List<e4> list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f304129a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    for (e4 e4Var : list) {
                        long jB = e4Var.b();
                        long j10 = jB + jElapsedRealtimeNanos;
                        Double dA = e4Var.a();
                        Long lC = e4Var.c();
                        Long lD = e4Var.d();
                        if (dA != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), dA, jB));
                        }
                        if (lC != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), lC, jB));
                        }
                        if (lD != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), lD, jB));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f304139k.put(io.sentry.profilemeasurements.a.f306064g, new io.sentry.profilemeasurements.a(io.sentry.profilemeasurements.a.f306071n, arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f304139k.put(io.sentry.profilemeasurements.a.f306065h, new io.sentry.profilemeasurements.a(io.sentry.profilemeasurements.a.f306070m, arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f304139k.put(io.sentry.profilemeasurements.a.f306066i, new io.sentry.profilemeasurements.a(io.sentry.profilemeasurements.a.f306070m, arrayDeque2));
        }
    }

    public void f() {
        io.sentry.m1 m1VarA = this.f304143o.a();
        try {
            Future<?> future = this.f304132d;
            if (future != null) {
                future.cancel(true);
                this.f304132d = null;
            }
            if (this.f304142n) {
                g(true, null);
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

    @e.a({"NewApi"})
    @Nullable
    public b g(boolean z10, @Nullable List<e4> list) {
        io.sentry.m1 m1VarA = this.f304143o.a();
        try {
            if (!this.f304142n) {
                this.f304141m.c(y7.WARNING, "Profiler not running", new Object[0]);
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } catch (Throwable th2) {
                try {
                    this.f304141m.a(y7.ERROR, "Error while stopping profiling: ", th2);
                } catch (Throwable th3) {
                    this.f304142n = false;
                    throw th3;
                }
            }
            this.f304142n = false;
            this.f304135g.m(this.f304134f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.f304133e == null) {
                this.f304141m.c(y7.ERROR, "Trace file does not exists", new Object[0]);
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return null;
            }
            if (!this.f304137i.isEmpty()) {
                this.f304139k.put(io.sentry.profilemeasurements.a.f306062e, new io.sentry.profilemeasurements.a(io.sentry.profilemeasurements.a.f306069l, this.f304137i));
            }
            if (!this.f304138j.isEmpty()) {
                this.f304139k.put(io.sentry.profilemeasurements.a.f306061d, new io.sentry.profilemeasurements.a(io.sentry.profilemeasurements.a.f306069l, this.f304138j));
            }
            if (!this.f304136h.isEmpty()) {
                this.f304139k.put(io.sentry.profilemeasurements.a.f306063f, new io.sentry.profilemeasurements.a(io.sentry.profilemeasurements.a.f306068k, this.f304136h));
            }
            h(list);
            Future<?> future = this.f304132d;
            if (future != null) {
                future.cancel(true);
                this.f304132d = null;
            }
            b bVar = new b(jElapsedRealtimeNanos, elapsedCpuTime, z10, this.f304133e, this.f304139k);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return bVar;
        } catch (Throwable th4) {
            if (m1VarA == null) {
                throw th4;
            }
            try {
                m1VarA.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @e.a({"NewApi"})
    @Nullable
    public c i() {
        io.sentry.m1 m1VarA = this.f304143o.a();
        try {
            int i10 = this.f304131c;
            if (i10 == 0) {
                this.f304141m.c(y7.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i10));
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return null;
            }
            if (this.f304142n) {
                this.f304141m.c(y7.WARNING, "Profiling has already started...", new Object[0]);
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return null;
            }
            this.f304133e = new File(this.f304130b, e9.a() + ".trace");
            this.f304139k.clear();
            this.f304136h.clear();
            this.f304137i.clear();
            this.f304138j.clear();
            this.f304134f = this.f304135g.l(new a());
            try {
                io.sentry.l1 l1Var = this.f304140l;
                if (l1Var != null) {
                    this.f304132d = l1Var.b(new Runnable() { // from class: io.sentry.android.core.e0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f304118a.g(true, null);
                        }
                    }, 30000L);
                }
            } catch (RejectedExecutionException e10) {
                this.f304141m.a(y7.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e10);
            }
            this.f304129a = SystemClock.elapsedRealtimeNanos();
            Date dateD = io.sentry.p.d();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f304133e.getPath(), f304127p, this.f304131c);
                this.f304142n = true;
                c cVar = new c(this.f304129a, elapsedCpuTime, dateD);
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return cVar;
            } catch (Throwable th2) {
                g(false, null);
                this.f304141m.a(y7.ERROR, "Unable to start a profile: ", th2);
                this.f304142n = false;
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            if (m1VarA == null) {
                throw th3;
            }
            try {
                m1VarA.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
