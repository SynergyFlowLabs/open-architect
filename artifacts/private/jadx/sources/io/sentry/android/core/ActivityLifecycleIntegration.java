package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.sentry.e6;
import io.sentry.f8;
import io.sentry.fa;
import io.sentry.ga;
import io.sentry.ha;
import io.sentry.ia;
import io.sentry.n8;
import io.sentry.t4;
import io.sentry.u3;
import io.sentry.v4;
import io.sentry.w9;
import io.sentry.x9;
import io.sentry.y7;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class ActivityLifecycleIntegration implements io.sentry.x1, Closeable, Application.ActivityLifecycleCallbacks {
    static final String H1 = "ui.load.full_display";
    static final String Y = "ui.load";
    static final String Z = "app.start.warm";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final String f303914g3 = "auto.ui.activity";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final String f303915p0 = "app.start.cold";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    static final String f303916p1 = "ui.load.initial_display";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    static final long f303917p2 = 25000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f303918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final u0 f303919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private io.sentry.i1 f303920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private SentryAndroidOptions f303921d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f303924g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private io.sentry.p1 f303927j;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final h f303934t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f303922e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f303923f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f303925h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private io.sentry.m0 f303926i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<Activity, io.sentry.p1> f303928k = new WeakHashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<Activity, io.sentry.p1> f303929l = new WeakHashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<Activity, io.sentry.android.core.performance.b> f303930m = new WeakHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private e6 f303931n = new f8(new Date(0), 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private Future<?> f303932o = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<Activity, io.sentry.r1> f303933s = new WeakHashMap<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f303935v = new io.sentry.util.a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f303936w = false;

    @NotNull
    private final io.sentry.util.a X = new io.sentry.util.a();

    public ActivityLifecycleIntegration(@NotNull Application application, @NotNull u0 u0Var, @NotNull h hVar) {
        this.f303918a = (Application) io.sentry.util.y.c(application, "Application is required");
        this.f303919b = (u0) io.sentry.util.y.c(u0Var, "BuildInfoProvider is required");
        this.f303934t = (h) io.sentry.util.y.c(hVar, "ActivityFramesTracker is required");
        if (u0Var.d() >= 29) {
            this.f303924g = true;
        }
    }

    private boolean B0(@NotNull Activity activity) {
        return this.f303933s.containsKey(activity);
    }

    private void E(@Nullable io.sentry.p1 p1Var) {
        if (p1Var != null && !p1Var.isFinished()) {
            p1Var.u();
        }
    }

    private void H(@Nullable io.sentry.p1 p1Var, @NotNull e6 e6Var) {
        I(p1Var, e6Var, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(@Nullable io.sentry.p1 p1Var, @Nullable io.sentry.p1 p1Var2) {
        io.sentry.android.core.performance.h hVarS = io.sentry.android.core.performance.h.s();
        io.sentry.android.core.performance.i iVarM = hVarS.m();
        io.sentry.android.core.performance.i iVarT = hVarS.t();
        if (iVarM.x() && iVarM.w()) {
            iVarM.O();
        }
        if (iVarT.x() && iVarT.w()) {
            iVarT.O();
        }
        x();
        io.sentry.m1 m1VarA = this.X.a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.f303921d;
            if (sentryAndroidOptions == null || p1Var2 == null) {
                E(p1Var2);
                if (this.f303936w) {
                    E(p1Var);
                }
            } else {
                e6 e6VarA = sentryAndroidOptions.getDateProvider().a();
                long millis = TimeUnit.NANOSECONDS.toMillis(e6VarA.c(p1Var2.Q()));
                Long lValueOf = Long.valueOf(millis);
                io.sentry.p2.b bVar = io.sentry.p2.b.MILLISECOND;
                p1Var2.G(io.sentry.protocol.i.f306309j, lValueOf, bVar);
                if (p1Var != null && this.f303936w) {
                    this.f303936w = false;
                    p1Var2.G(io.sentry.protocol.i.f306310k, Long.valueOf(millis), bVar);
                    p1Var.G(io.sentry.protocol.i.f306310k, Long.valueOf(millis), bVar);
                    H(p1Var, e6VarA);
                }
                H(p1Var2, e6VarA);
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

    private void I(@Nullable io.sentry.p1 p1Var, @NotNull e6 e6Var, @Nullable x9 x9Var) {
        if (p1Var != null && !p1Var.isFinished()) {
            if (x9Var == null) {
                x9Var = p1Var.t() != null ? p1Var.t() : x9.OK;
            }
            p1Var.n(x9Var, e6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(@NotNull io.sentry.p1 p1Var, @NotNull io.sentry.p1 p1Var2) {
        q();
        io.sentry.m1 m1VarA = this.X.a();
        try {
            if (!p1Var.isFinished()) {
                this.f303936w = true;
                if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
                return;
            }
            SentryAndroidOptions sentryAndroidOptions = this.f303921d;
            if (sentryAndroidOptions != null) {
                e6 e6VarA = sentryAndroidOptions.getDateProvider().a();
                p1Var2.G(io.sentry.protocol.i.f306310k, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(e6VarA.c(p1Var2.Q()))), io.sentry.p2.b.MILLISECOND);
                H(p1Var2, e6VarA);
            } else {
                E(p1Var2);
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

    private void N(@Nullable io.sentry.p1 p1Var, @NotNull x9 x9Var) {
        if (p1Var != null && !p1Var.isFinished()) {
            p1Var.E(x9Var);
        }
    }

    private void Q0(@NotNull w9 w9Var) {
        w9Var.h(f303914g3);
    }

    private void R(@Nullable final io.sentry.r1 r1Var, @Nullable io.sentry.p1 p1Var, @Nullable io.sentry.p1 p1Var2) {
        if (r1Var != null && !r1Var.isFinished()) {
            N(p1Var, x9.DEADLINE_EXCEEDED);
            y(p1Var2, p1Var);
            q();
            x9 x9VarT = r1Var.t();
            if (x9VarT == null) {
                x9VarT = x9.OK;
            }
            r1Var.E(x9VarT);
            io.sentry.i1 i1Var = this.f303920c;
            if (i1Var != null) {
                i1Var.v0(new v4() { // from class: io.sentry.android.core.q
                    @Override // io.sentry.v4
                    public final void a(io.sentry.g1 g1Var) {
                        this.f304471a.t(g1Var, r1Var);
                    }
                });
            }
        }
    }

    private void R0(@NotNull Activity activity) {
        Boolean boolValueOf;
        e6 e6Var;
        e6 e6Var2;
        final io.sentry.r1 r1Var;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f303920c == null || B0(activity)) {
            return;
        }
        if (!this.f303922e) {
            this.f303933s.put(activity, u3.R());
            if (this.f303921d.isEnableAutoTraceIdGeneration()) {
                io.sentry.util.o0.m(this.f303920c);
                return;
            }
            return;
        }
        T0();
        final String strY = Y(activity);
        io.sentry.android.core.performance.i iVarN = io.sentry.android.core.performance.h.s().n(this.f303921d);
        fa faVar = null;
        if (a1.t() && iVarN.x()) {
            e6 e6VarQ = iVarN.q();
            boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.h.s().o() == io.sentry.android.core.performance.h.a.COLD);
            e6Var = e6VarQ;
        } else {
            boolValueOf = null;
            e6Var = null;
        }
        ia iaVar = new ia();
        long deadlineTimeout = this.f303921d.getDeadlineTimeout();
        iaVar.x(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        if (this.f303921d.isEnableActivityLifecycleTracingAutoFinish()) {
            iaVar.y(this.f303921d.getIdleTimeout());
            iaVar.k(true);
        }
        iaVar.B(true);
        iaVar.A(new ha() { // from class: io.sentry.android.core.j
            @Override // io.sentry.ha
            public final void a(io.sentry.r1 r1Var2) {
                ActivityLifecycleIntegration.j(this.f304353a, weakReference, strY, r1Var2);
            }
        });
        if (this.f303925h || e6Var == null || boolValueOf == null) {
            e6Var2 = this.f303931n;
        } else {
            fa faVarL = io.sentry.android.core.performance.h.s().l();
            io.sentry.android.core.performance.h.s().F(null);
            faVar = faVarL;
            e6Var2 = e6Var;
        }
        iaVar.j(e6Var2);
        iaVar.u(faVar != null);
        Q0(iaVar);
        io.sentry.r1 r1VarE0 = this.f303920c.E0(new ga(strY, io.sentry.protocol.f0.COMPONENT, Y, faVar), iaVar);
        w9 w9Var = new w9();
        Q0(w9Var);
        if (this.f303925h || e6Var == null || boolValueOf == null) {
            r1Var = r1VarE0;
        } else {
            r1Var = r1VarE0;
            this.f303927j = r1Var.I(g0(boolValueOf.booleanValue()), f0(boolValueOf.booleanValue()), e6Var, io.sentry.w1.SENTRY, w9Var);
            x();
        }
        String strW0 = w0(strY);
        io.sentry.w1 w1Var = io.sentry.w1.SENTRY;
        e6 e6Var3 = e6Var2;
        final io.sentry.p1 p1VarI = r1Var.I(f303916p1, strW0, e6Var3, w1Var, w9Var);
        this.f303928k.put(activity, p1VarI);
        if (this.f303923f && this.f303926i != null && this.f303921d != null) {
            final io.sentry.p1 p1VarI2 = r1Var.I(H1, o0(strY), e6Var3, w1Var, w9Var);
            try {
                this.f303929l.put(activity, p1VarI2);
                this.f303932o = this.f303921d.getExecutorService().b(new Runnable() { // from class: io.sentry.android.core.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f304367a.y(p1VarI2, p1VarI);
                    }
                }, f303917p2);
            } catch (RejectedExecutionException e10) {
                this.f303921d.getLogger().a(y7.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e10);
            }
        }
        this.f303920c.v0(new v4() { // from class: io.sentry.android.core.l
            @Override // io.sentry.v4
            public final void a(io.sentry.g1 g1Var) {
                this.f304378a.o(g1Var, r1Var);
            }
        });
        this.f303933s.put(activity, r1Var);
    }

    private void T0() {
        for (Map.Entry<Activity, io.sentry.r1> entry : this.f303933s.entrySet()) {
            R(entry.getValue(), this.f303928k.get(entry.getKey()), this.f303929l.get(entry.getKey()));
        }
    }

    private void U0(@NotNull Activity activity, boolean z10) {
        if (this.f303922e && z10) {
            R(this.f303933s.get(activity), null, null);
        }
    }

    @NotNull
    private String Y(@NotNull Activity activity) {
        return activity.getClass().getSimpleName();
    }

    public static /* synthetic */ void f(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.g1 g1Var, io.sentry.r1 r1Var, io.sentry.r1 r1Var2) {
        if (r1Var2 == null) {
            activityLifecycleIntegration.getClass();
            g1Var.F(r1Var);
        } else {
            SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f303921d;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(y7.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", r1Var.getName());
            }
        }
    }

    @NotNull
    private String f0(boolean z10) {
        return z10 ? "Cold Start" : "Warm Start";
    }

    @NotNull
    private String g0(boolean z10) {
        return z10 ? f303915p0 : Z;
    }

    public static /* synthetic */ void j(ActivityLifecycleIntegration activityLifecycleIntegration, WeakReference weakReference, String str, io.sentry.r1 r1Var) {
        activityLifecycleIntegration.getClass();
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            activityLifecycleIntegration.f303934t.j(activity, r1Var.x());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f303921d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(y7.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    @NotNull
    private String k0(@NotNull io.sentry.p1 p1Var) {
        String description = p1Var.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return p1Var.getDescription() + " - Deadline Exceeded";
    }

    public static /* synthetic */ void l(io.sentry.r1 r1Var, io.sentry.g1 g1Var, io.sentry.r1 r1Var2) {
        if (r1Var2 == r1Var) {
            g1Var.J();
        }
    }

    @NotNull
    private String o0(@NotNull String str) {
        return str + " full display";
    }

    private void q() {
        Future<?> future = this.f303932o;
        if (future != null) {
            future.cancel(false);
            this.f303932o = null;
        }
    }

    private void r() {
        this.f303925h = false;
        this.f303931n = new f8(new Date(0L), 0L);
        this.f303930m.clear();
    }

    @NotNull
    private String w0(@NotNull String str) {
        return str + " initial display";
    }

    private void x() {
        e6 e6VarN = io.sentry.android.core.performance.h.s().n(this.f303921d).n();
        if (this.f303922e && e6VarN != null) {
            H(this.f303927j, e6VarN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(@Nullable io.sentry.p1 p1Var, @Nullable io.sentry.p1 p1Var2) {
        if (p1Var != null && !p1Var.isFinished()) {
            p1Var.w(k0(p1Var));
            e6 e6VarN = p1Var2 != null ? p1Var2.N() : null;
            if (e6VarN == null) {
                e6VarN = p1Var.Q();
            }
            I(p1Var, e6VarN, x9.DEADLINE_EXCEEDED);
        }
    }

    private boolean y0(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    @lm.n
    void O0(boolean z10) {
        this.f303925h = z10;
    }

    @lm.n
    @NotNull
    WeakHashMap<Activity, io.sentry.r1> T() {
        return this.f303933s;
    }

    @lm.n
    @NotNull
    h X() {
        return this.f303934t;
    }

    @Override // io.sentry.x1
    public void c(@NotNull io.sentry.i1 i1Var, @NotNull n8 n8Var) {
        this.f303921d = (SentryAndroidOptions) io.sentry.util.y.c(n8Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) n8Var : null, "SentryAndroidOptions is required");
        this.f303920c = (io.sentry.i1) io.sentry.util.y.c(i1Var, "Scopes are required");
        this.f303922e = y0(this.f303921d);
        this.f303926i = this.f303921d.getFullyDisplayedReporter();
        this.f303923f = this.f303921d.isEnableTimeToFullDisplayTracing();
        this.f303918a.registerActivityLifecycleCallbacks(this);
        this.f303921d.getLogger().c(y7.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.q.a("ActivityLifecycle");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f303918a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f303921d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(y7.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f303934t.l();
    }

    @lm.n
    @NotNull
    WeakHashMap<Activity, io.sentry.android.core.performance.b> d0() {
        return this.f303930m;
    }

    @lm.n
    @Nullable
    io.sentry.p1 j0() {
        return this.f303927j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @lm.r
    public void o(@NotNull final io.sentry.g1 g1Var, @NotNull final io.sentry.r1 r1Var) {
        g1Var.h0(new t4.c() { // from class: io.sentry.android.core.r
            @Override // io.sentry.t4.c
            public final void a(io.sentry.r1 r1Var2) {
                ActivityLifecycleIntegration.f(this.f304475a, g1Var, r1Var, r1Var2);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        io.sentry.m0 m0Var;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.f303924g) {
            onActivityPreCreated(activity, bundle);
        }
        io.sentry.m1 m1VarA = this.f303935v.a();
        try {
            if (this.f303920c != null && (sentryAndroidOptions = this.f303921d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                final String strA = io.sentry.android.core.internal.util.j.a(activity);
                this.f303920c.v0(new v4() { // from class: io.sentry.android.core.m
                    @Override // io.sentry.v4
                    public final void a(io.sentry.g1 g1Var) {
                        g1Var.N(strA);
                    }
                });
            }
            R0(activity);
            final io.sentry.p1 p1Var = this.f303928k.get(activity);
            final io.sentry.p1 p1Var2 = this.f303929l.get(activity);
            this.f303925h = true;
            if (this.f303922e && p1Var != null && p1Var2 != null && (m0Var = this.f303926i) != null) {
                m0Var.b(new io.sentry.m0.a() { // from class: io.sentry.android.core.n
                    @Override // io.sentry.m0.a
                    public final void a() {
                        this.f304397a.M0(p1Var, p1Var2);
                    }
                });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        io.sentry.m1 m1VarA = this.f303935v.a();
        try {
            io.sentry.android.core.performance.b bVarRemove = this.f303930m.remove(activity);
            if (bVarRemove != null) {
                bVarRemove.a();
            }
            if (this.f303922e) {
                N(this.f303927j, x9.CANCELLED);
                io.sentry.p1 p1Var = this.f303928k.get(activity);
                io.sentry.p1 p1Var2 = this.f303929l.get(activity);
                N(p1Var, x9.DEADLINE_EXCEEDED);
                y(p1Var2, p1Var);
                q();
                U0(activity, true);
                this.f303927j = null;
                this.f303928k.remove(activity);
                this.f303929l.remove(activity);
            }
            this.f303933s.remove(activity);
            if (this.f303933s.isEmpty() && !activity.isChangingConfigurations()) {
                r();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        io.sentry.m1 m1VarA = this.f303935v.a();
        try {
            if (!this.f303924g) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        io.sentry.android.core.performance.b bVar = this.f303930m.get(activity);
        if (bVar != null) {
            io.sentry.r1 r1Var = this.f303927j;
            if (r1Var == null) {
                r1Var = this.f303933s.get(activity);
            }
            bVar.b(r1Var);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(@NotNull Activity activity) {
        io.sentry.android.core.performance.b bVar = this.f303930m.get(activity);
        if (bVar != null) {
            io.sentry.r1 r1Var = this.f303927j;
            if (r1Var == null) {
                r1Var = this.f303933s.get(activity);
            }
            bVar.c(r1Var);
            bVar.i();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.f303930m.put(activity, bVar);
        if (this.f303925h) {
            return;
        }
        io.sentry.i1 i1Var = this.f303920c;
        e6 e6VarA = i1Var != null ? i1Var.b().getDateProvider().a() : w.a();
        this.f303931n = e6VarA;
        bVar.k(e6VarA);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(@NotNull Activity activity) {
        this.f303925h = true;
        io.sentry.i1 i1Var = this.f303920c;
        this.f303931n = i1Var != null ? i1Var.b().getDateProvider().a() : w.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(@NotNull Activity activity) {
        io.sentry.android.core.performance.b bVar = this.f303930m.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f303921d;
            bVar.l(sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().a() : w.a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        io.sentry.m1 m1VarA = this.f303935v.a();
        try {
            if (!this.f303924g) {
                onActivityPostStarted(activity);
            }
            if (this.f303922e) {
                final io.sentry.p1 p1Var = this.f303928k.get(activity);
                final io.sentry.p1 p1Var2 = this.f303929l.get(activity);
                if (activity.getWindow() != null) {
                    io.sentry.android.core.internal.util.q.d(activity, new Runnable() { // from class: io.sentry.android.core.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f304407a.H0(p1Var2, p1Var);
                        }
                    }, this.f303919b);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f304419a.H0(p1Var2, p1Var);
                        }
                    });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        io.sentry.m1 m1VarA = this.f303935v.a();
        try {
            if (!this.f303924g) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f303922e) {
                this.f303934t.e(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
    }

    @lm.n
    @NotNull
    WeakHashMap<Activity, io.sentry.p1> r0() {
        return this.f303929l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @lm.r
    public void t(@NotNull final io.sentry.g1 g1Var, @NotNull final io.sentry.r1 r1Var) {
        g1Var.h0(new t4.c() { // from class: io.sentry.android.core.i
            @Override // io.sentry.t4.c
            public final void a(io.sentry.r1 r1Var2) {
                ActivityLifecycleIntegration.l(r1Var, g1Var, r1Var2);
            }
        });
    }

    @lm.n
    @NotNull
    WeakHashMap<Activity, io.sentry.p1> x0() {
        return this.f303928k;
    }
}
