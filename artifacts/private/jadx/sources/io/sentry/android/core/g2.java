package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.a4;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.k9;
import io.sentry.n8;
import io.sentry.t5;
import io.sentry.v4;
import io.sentry.y7;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f304158b = "io.sentry.android.fragment.FragmentLifecycleIntegration";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f304159c = "io.sentry.android.timber.SentryTimberIntegration";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f304160d = "io.sentry.android.replay.ReplayIntegration";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f304161e = "io.sentry.android.distribution.DistributionIntegration";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f304162f = "timber.log.Timber";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f304163g = "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f304157a = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    protected static final io.sentry.util.a f304164h = new io.sentry.util.a();

    private g2() {
    }

    public static /* synthetic */ void a(SentryAndroidOptions sentryAndroidOptions) {
    }

    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, io.sentry.g1 g1Var) {
        k9 k9VarL = g1Var.L();
        if (k9VarL == null || k9VarL.p() == null) {
            return;
        }
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void c(ILogger iLogger, Context context, t5.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.u uVar = new io.sentry.util.u();
        boolean zB = uVar.b(f304162f, sentryAndroidOptions);
        boolean z10 = false;
        if (uVar.b(f304163g, sentryAndroidOptions) && uVar.b(f304158b, sentryAndroidOptions)) {
            z10 = true;
        }
        boolean z11 = zB && uVar.b(f304159c, sentryAndroidOptions);
        boolean zB2 = uVar.b(f304160d, sentryAndroidOptions);
        boolean zB3 = uVar.b(f304161e, sentryAndroidOptions);
        u0 u0Var = new u0(iLogger);
        io.sentry.util.u uVar2 = new io.sentry.util.u();
        h hVar = new h(uVar2, sentryAndroidOptions);
        d0.j(sentryAndroidOptions, context, iLogger, u0Var);
        d0.h(context, sentryAndroidOptions, u0Var, uVar2, hVar, z10, z11, zB2, zB3);
        try {
            aVar.a(sentryAndroidOptions);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(y7.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        io.sentry.android.core.performance.h hVarS = io.sentry.android.core.performance.h.s();
        if (sentryAndroidOptions.isEnablePerformanceV2() && u0Var.d() >= 24) {
            io.sentry.android.core.performance.i iVarM = hVarS.m();
            if (iVarM.v()) {
                iVarM.I(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            hVarS.B((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.i iVarT = hVarS.t();
        if (iVarT.v()) {
            iVarT.I(f304157a);
        }
        d0.f(sentryAndroidOptions, context, u0Var, uVar2, hVar);
        d(sentryAndroidOptions, z10, z11);
    }

    private static void d(@NotNull n8 n8Var, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (io.sentry.x1 x1Var : n8Var.getIntegrations()) {
            if (z10 && (x1Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(x1Var);
            }
            if (z11 && (x1Var instanceof SentryTimberIntegration)) {
                arrayList.add(x1Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
                n8Var.getIntegrations().remove((io.sentry.x1) arrayList2.get(i10));
            }
        }
        if (arrayList.size() > 1) {
            for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
                n8Var.getIntegrations().remove((io.sentry.x1) arrayList.get(i11));
            }
        }
    }

    public static void e(@NotNull Context context) {
        f(context, new y());
    }

    public static void f(@NotNull Context context, @NotNull ILogger iLogger) {
        g(context, iLogger, new t5.a() { // from class: io.sentry.android.core.f2
            @Override // io.sentry.t5.a
            public final void a(n8 n8Var) {
                g2.a((SentryAndroidOptions) n8Var);
            }
        });
    }

    @e.a({"NewApi"})
    public static void g(@NotNull final Context context, @NotNull final ILogger iLogger, @NotNull final t5.a<SentryAndroidOptions> aVar) {
        try {
            io.sentry.m1 m1VarA = f304164h.a();
            try {
                int i10 = 7 & 1;
                t5.a0(a4.a(SentryAndroidOptions.class), new t5.a() { // from class: io.sentry.android.core.d2
                    @Override // io.sentry.t5.a
                    public final void a(n8 n8Var) {
                        g2.c(iLogger, context, aVar, (SentryAndroidOptions) n8Var);
                    }
                }, true);
                io.sentry.i1 i1VarR = t5.R();
                if (a1.t()) {
                    if (i1VarR.b().isEnableAutoSessionTracking()) {
                        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        i1VarR.v0(new v4() { // from class: io.sentry.android.core.e2
                            @Override // io.sentry.v4
                            public final void a(io.sentry.g1 g1Var) {
                                g2.b(atomicBoolean, g1Var);
                            }
                        });
                        if (!atomicBoolean.get()) {
                            i1VarR.u();
                        }
                    }
                    i1VarR.b().getReplayController().start();
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
        } catch (IllegalAccessException e10) {
            iLogger.a(y7.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
        } catch (InstantiationException e11) {
            iLogger.a(y7.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        } catch (NoSuchMethodException e12) {
            iLogger.a(y7.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
        } catch (InvocationTargetException e13) {
            iLogger.a(y7.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
        }
    }

    public static void h(@NotNull Context context, @NotNull t5.a<SentryAndroidOptions> aVar) {
        g(context, new y(), aVar);
    }
}
