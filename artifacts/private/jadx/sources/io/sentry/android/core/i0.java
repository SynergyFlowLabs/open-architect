package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.e4;
import io.sentry.h5;
import io.sentry.k4;
import io.sentry.l4;
import io.sentry.n8;
import io.sentry.y7;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class i0 implements io.sentry.s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f304188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ILogger f304189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f304190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f304191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f304192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.l1 f304193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final u0 f304194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f304195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f304196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.b0 f304197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private l4 f304198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private f0 f304199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f304200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f304201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private Date f304202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304203p;

    public i0(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull u0 u0Var, @NotNull io.sentry.android.core.internal.util.b0 b0Var) {
        this(context, u0Var, b0Var, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    private void e() {
        if (this.f304195h) {
            return;
        }
        this.f304195h = true;
        if (!this.f304191d) {
            this.f304189b.c(y7.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.f304190c;
        if (str == null) {
            this.f304189b.c(y7.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.f304192e;
        if (i10 <= 0) {
            this.f304189b.c(y7.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.f304199l = new f0(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f304192e, this.f304197j, this.f304193f, this.f304189b);
        }
    }

    @e.a({"NewApi"})
    private boolean f() {
        f0.c cVarI;
        f0 f0Var = this.f304199l;
        if (f0Var == null || (cVarI = f0Var.i()) == null) {
            return false;
        }
        this.f304200m = cVarI.f304151a;
        this.f304201n = cVarI.f304152b;
        this.f304202o = cVarI.f304153c;
        return true;
    }

    @e.a({"NewApi"})
    @Nullable
    private k4 g(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z10, @Nullable List<e4> list, @NotNull n8 n8Var) {
        io.sentry.m1 m1VarA = this.f304203p.a();
        try {
            if (this.f304199l == null) {
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return null;
            }
            if (this.f304194g.d() < 22) {
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return null;
            }
            l4 l4Var = this.f304198k;
            if (l4Var != null && l4Var.h().equals(str2)) {
                int i10 = this.f304196i;
                if (i10 > 0) {
                    this.f304196i = i10 - 1;
                }
                this.f304189b.c(y7.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.f304196i != 0) {
                    l4 l4Var2 = this.f304198k;
                    if (l4Var2 != null) {
                        l4Var2.o(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f304200m), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.f304201n));
                    }
                    if (m1VarA != null) {
                        m1VarA.close();
                    }
                    return null;
                }
                boolean z11 = false;
                f0.b bVarG = this.f304199l.g(false, list);
                if (bVarG == null) {
                    if (m1VarA != null) {
                        m1VarA.close();
                    }
                    return null;
                }
                long j10 = bVarG.f304146a - this.f304200m;
                ArrayList arrayList = new ArrayList(1);
                l4 l4Var3 = this.f304198k;
                if (l4Var3 != null) {
                    arrayList.add(l4Var3);
                }
                this.f304198k = null;
                this.f304196i = 0;
                String string = com.facebook.appevents.p.f99189d0;
                Long lQ = n8Var instanceof SentryAndroidOptions ? h1.i(this.f304188a, (SentryAndroidOptions) n8Var).q() : null;
                if (lQ != null) {
                    string = Long.toString(lQ.longValue());
                }
                String str4 = string;
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l4) it.next()).o(Long.valueOf(bVarG.f304146a), Long.valueOf(this.f304200m), Long.valueOf(bVarG.f304147b), Long.valueOf(this.f304201n));
                    str4 = str4;
                    z11 = z11;
                    j10 = j10;
                }
                k4 k4Var = new k4(bVarG.f304148c, this.f304202o, arrayList, str, str2, str3, Long.toString(j10), this.f304194g.d(), (strArr == null || strArr.length <= 0) ? "" : strArr[z11 ? 1 : 0], new Callable() { // from class: io.sentry.android.core.h0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return io.sentry.android.core.internal.util.l.b().d();
                    }
                }, this.f304194g.b(), this.f304194g.c(), this.f304194g.e(), this.f304194g.f(), str4, n8Var.getProguardUuid(), n8Var.getRelease(), n8Var.getEnvironment(), (bVarG.f304150e || z10) ? k4.f305718l3 : "normal", bVarG.f304149d);
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return k4Var;
            }
            this.f304189b.c(y7.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return null;
        } catch (Throwable th2) {
            if (m1VarA == null) {
                throw th2;
            }
            try {
                m1VarA.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.s1
    public void a(@NotNull io.sentry.r1 r1Var) {
        io.sentry.m1 m1VarA = this.f304203p.a();
        try {
            if (this.f304196i > 0 && this.f304198k == null) {
                this.f304198k = new l4(r1Var, Long.valueOf(this.f304200m), Long.valueOf(this.f304201n));
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

    @Override // io.sentry.s1
    @Nullable
    public k4 b(@NotNull io.sentry.r1 r1Var, @Nullable List<e4> list, @NotNull n8 n8Var) {
        io.sentry.m1 m1VarA = this.f304203p.a();
        try {
            k4 k4VarG = g(r1Var.getName(), r1Var.x().toString(), r1Var.m().p().toString(), false, list, n8Var);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return k4VarG;
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

    @Override // io.sentry.s1
    public void close() {
        i0 i0Var;
        l4 l4Var = this.f304198k;
        if (l4Var != null) {
            i0Var = this;
            i0Var.g(l4Var.i(), this.f304198k.h(), this.f304198k.n(), true, null, h5.q().b());
        } else {
            i0Var = this;
            int i10 = i0Var.f304196i;
            if (i10 != 0) {
                i0Var.f304196i = i10 - 1;
            }
        }
        f0 f0Var = i0Var.f304199l;
        if (f0Var != null) {
            f0Var.f();
        }
    }

    @lm.n
    int d() {
        return this.f304196i;
    }

    @Override // io.sentry.s1
    public boolean isRunning() {
        return this.f304196i != 0;
    }

    @Override // io.sentry.s1
    public void start() {
        io.sentry.m1 m1VarA = this.f304203p.a();
        try {
            if (this.f304194g.d() < 22) {
                if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
                return;
            }
            e();
            int i10 = this.f304196i + 1;
            this.f304196i = i10;
            if (i10 == 1 && f()) {
                this.f304189b.c(y7.DEBUG, "Profiler started.", new Object[0]);
            } else {
                this.f304196i--;
                this.f304189b.c(y7.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
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

    public i0(@NotNull Context context, @NotNull u0 u0Var, @NotNull io.sentry.android.core.internal.util.b0 b0Var, @NotNull ILogger iLogger, @Nullable String str, boolean z10, int i10, @NotNull io.sentry.l1 l1Var) {
        this.f304195h = false;
        this.f304196i = 0;
        this.f304199l = null;
        this.f304203p = new io.sentry.util.a();
        this.f304188a = (Context) io.sentry.util.y.c(a1.g(context), "The application context is required");
        this.f304189b = (ILogger) io.sentry.util.y.c(iLogger, "ILogger is required");
        this.f304197j = (io.sentry.android.core.internal.util.b0) io.sentry.util.y.c(b0Var, "SentryFrameMetricsCollector is required");
        this.f304194g = (u0) io.sentry.util.y.c(u0Var, "The BuildInfoProvider is required.");
        this.f304190c = str;
        this.f304191d = z10;
        this.f304192e = i10;
        this.f304193f = (io.sentry.l1) io.sentry.util.y.c(l1Var, "The ISentryExecutorService is required.");
        this.f304202o = io.sentry.p.d();
    }
}
