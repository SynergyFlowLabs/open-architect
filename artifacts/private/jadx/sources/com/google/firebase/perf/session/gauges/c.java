package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f124089h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f124090i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f124091j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f124092k = 13;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f124093l = 14;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f124094m = 15;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f124095n = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue<com.google.firebase.perf.v1.h> f124097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f124098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f124099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f124100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private ScheduledFuture f124101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f124102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124088g = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f124096o = TimeUnit.SECONDS.toMicros(1);

    @e.a({"ThreadPoolCreation"})
    c() {
        this.f124101e = null;
        this.f124102f = -1L;
        this.f124097a = new ConcurrentLinkedQueue<>();
        this.f124098b = Executors.newSingleThreadScheduledExecutor();
        this.f124099c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
        this.f124100d = e();
    }

    public static /* synthetic */ void a(c cVar, Timer timer) {
        com.google.firebase.perf.v1.h hVarK = cVar.k(timer);
        if (hVarK != null) {
            cVar.f124097a.add(hVarK);
        }
    }

    public static /* synthetic */ void b(c cVar, Timer timer) {
        com.google.firebase.perf.v1.h hVarK = cVar.k(timer);
        if (hVarK != null) {
            cVar.f124097a.add(hVarK);
        }
    }

    private long d(long j10) {
        return Math.round((j10 / this.f124100d) * f124096o);
    }

    private long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean f(long j10) {
        return j10 <= 0;
    }

    private synchronized void g(final Timer timer) {
        try {
            this.f124098b.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.b(this.f124086a, timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f124088g.l("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    private synchronized void h(long j10, final Timer timer) {
        this.f124102f = j10;
        try {
            this.f124101e = this.f124098b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(this.f124084a, timer);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f124088g.l("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    @p0
    private com.google.firebase.perf.v1.h k(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f124099c));
                try {
                    long jB = timer.b();
                    String[] strArrSplit = bufferedReader.readLine().split(" ");
                    com.google.firebase.perf.v1.h hVarBuild = com.google.firebase.perf.v1.h.km().Rl(jB).Sl(d(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).Tl(d(Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[15]))).build();
                    bufferedReader.close();
                    return hVarBuild;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e10) {
                f124088g.l("Unexpected '/proc/[pid]/stat' file format encountered: " + e10.getMessage());
                return null;
            }
        } catch (IOException e11) {
            f124088g.l("Unable to read 'proc/[pid]/stat' file: " + e11.getMessage());
            return null;
        }
    }

    public void c(Timer timer) {
        g(timer);
    }

    public void i(long j10, Timer timer) {
        long j11 = this.f124100d;
        if (j11 == -1 || j11 == 0 || f(j10)) {
            return;
        }
        if (this.f124101e == null) {
            h(j10, timer);
        } else if (this.f124102f != j10) {
            j();
            h(j10, timer);
        }
    }

    public void j() {
        ScheduledFuture scheduledFuture = this.f124101e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f124101e = null;
        this.f124102f = -1L;
    }

    @l1
    c(ScheduledExecutorService scheduledExecutorService, String str, long j10) {
        this.f124101e = null;
        this.f124102f = -1L;
        this.f124097a = new ConcurrentLinkedQueue<>();
        this.f124098b = scheduledExecutorService;
        this.f124099c = str;
        this.f124100d = j10;
    }
}
