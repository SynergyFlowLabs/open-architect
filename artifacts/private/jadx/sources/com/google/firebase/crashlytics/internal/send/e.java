package com.google.firebase.crashlytics.internal.send;

import android.os.SystemClock;
import com.google.android.datatransport.f;
import com.google.android.datatransport.h;
import com.google.android.datatransport.l;
import com.google.android.datatransport.n;
import com.google.android.datatransport.runtime.m;
import com.google.firebase.crashlytics.internal.common.h1;
import com.google.firebase.crashlytics.internal.common.s0;
import com.google.firebase.crashlytics.internal.g;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f121821l = 1000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f121822m = 60000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f121823n = 3600000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f121824o = 2000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f121825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f121826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f121827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f121828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f121829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue<Runnable> f121830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f121831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l<f0> f121832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s0 f121833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f121834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f121835k;

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.firebase.crashlytics.internal.common.f0 f121836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.gms.tasks.l<com.google.firebase.crashlytics.internal.common.f0> f121837b;

        @Override // java.lang.Runnable
        public void run() {
            e.this.n(this.f121836a, this.f121837b);
            e.this.f121833i.e();
            double dG = e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f121836a.d());
            e.o(dG);
        }

        private b(com.google.firebase.crashlytics.internal.common.f0 f0Var, com.google.android.gms.tasks.l<com.google.firebase.crashlytics.internal.common.f0> lVar) {
            this.f121836a = f0Var;
            this.f121837b = lVar;
        }
    }

    e(l<f0> lVar, com.google.firebase.crashlytics.internal.settings.d dVar, s0 s0Var) {
        this(dVar.f121865f, dVar.f121866g, ((long) dVar.f121867h) * 1000, lVar, s0Var);
    }

    public static /* synthetic */ void a(e eVar, com.google.android.gms.tasks.l lVar, boolean z10, com.google.firebase.crashlytics.internal.common.f0 f0Var, Exception exc) {
        eVar.getClass();
        if (exc != null) {
            lVar.d(exc);
            return;
        }
        if (z10) {
            eVar.j();
        }
        lVar.e(f0Var);
    }

    public static /* synthetic */ void b(e eVar, CountDownLatch countDownLatch) {
        eVar.getClass();
        try {
            m.a(eVar.f121832h, h.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f121825a) * Math.pow(this.f121826b, h()));
    }

    private int h() {
        if (this.f121835k == 0) {
            this.f121835k = m();
        }
        int iM = (int) ((m() - this.f121835k) / this.f121827c);
        int iMin = l() ? Math.min(100, this.f121834j + iM) : Math.max(0, this.f121834j - iM);
        if (this.f121834j != iMin) {
            this.f121834j = iMin;
            this.f121835k = m();
        }
        return iMin;
    }

    private boolean k() {
        return this.f121830f.size() < this.f121829e;
    }

    private boolean l() {
        return this.f121830f.size() == this.f121829e;
    }

    private long m() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(final com.google.firebase.crashlytics.internal.common.f0 f0Var, final com.google.android.gms.tasks.l<com.google.firebase.crashlytics.internal.common.f0> lVar) {
        g.f().b("Sending report through Google DataTransport: " + f0Var.d());
        final boolean z10 = SystemClock.elapsedRealtime() - this.f121828d < 2000;
        this.f121832h.a(f.z(f0Var.b()), new n() { // from class: com.google.firebase.crashlytics.internal.send.d
            @Override // com.google.android.datatransport.n
            public final void a(Exception exc) {
                e.a(this.f121817a, lVar, z10, f0Var, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    com.google.android.gms.tasks.l<com.google.firebase.crashlytics.internal.common.f0> i(com.google.firebase.crashlytics.internal.common.f0 f0Var, boolean z10) {
        synchronized (this.f121830f) {
            try {
                com.google.android.gms.tasks.l<com.google.firebase.crashlytics.internal.common.f0> lVar = new com.google.android.gms.tasks.l<>();
                if (!z10) {
                    n(f0Var, lVar);
                    return lVar;
                }
                this.f121833i.d();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + f0Var.d());
                    this.f121833i.c();
                    lVar.e(f0Var);
                    return lVar;
                }
                g.f().b("Enqueueing report: " + f0Var.d());
                g.f().b("Queue size: " + this.f121830f.size());
                this.f121831g.execute(new b(f0Var, lVar));
                g.f().b("Closing task for report: " + f0Var.d());
                lVar.e(f0Var);
                return lVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @e.a({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.c
            @Override // java.lang.Runnable
            public final void run() {
                e.b(this.f121815a, countDownLatch);
            }
        }).start();
        h1.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    @e.a({"ThreadPoolCreation"})
    e(double d10, double d11, long j10, l<f0> lVar, s0 s0Var) {
        this.f121825a = d10;
        this.f121826b = d11;
        this.f121827c = j10;
        this.f121832h = lVar;
        this.f121833i = s0Var;
        this.f121828d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f121829e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f121830f = arrayBlockingQueue;
        this.f121831g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f121834j = 0;
        this.f121835k = 0L;
    }
}
