package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.ILogger;
import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.h8;
import io.sentry.l5;
import io.sentry.m5;
import io.sentry.r3;
import io.sentry.v3;
import io.sentry.w2;
import io.sentry.x2;
import io.sentry.x3;
import io.sentry.x4;
import io.sentry.y2;
import io.sentry.y7;
import java.io.File;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f304106a = 4000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f304107b = "io.sentry.compose.gestures.ComposeGestureTargetLocator";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f304108c = "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f304109d = "androidx.compose.ui.node.Owner";

    private d0() {
    }

    @NotNull
    static File d(@NotNull Context context) {
        return new File(context.getCacheDir(), "sentry");
    }

    @NotNull
    private static String e(@NotNull PackageInfo packageInfo, @NotNull String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + org.slf4j.h.f339615a3 + str;
    }

    static void f(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull u0 u0Var, @NotNull io.sentry.util.u uVar, @NotNull h hVar) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.s)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.b(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof x2) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.e(context, sentryAndroidOptions, u0Var, io.sentry.android.core.internal.util.f.b()));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.w(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.h(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.q(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new e1(context, u0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new z1(sentryAndroidOptions, hVar));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, u0Var));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new n0(context, sentryAndroidOptions, u0Var));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.u) {
            sentryAndroidOptions.setTransportGate(new j0(sentryAndroidOptions));
        }
        io.sentry.android.core.performance.h hVarS = io.sentry.android.core.performance.h.s();
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.b(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.android.core.internal.debugmeta.a(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof x3) {
            sentryAndroidOptions.setVersionDetector(new io.sentry.v(sentryAndroidOptions));
        }
        boolean zB = uVar.b("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean zB2 = uVar.b(f304109d, sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(zB));
            if (zB2 && uVar.b(f304107b, sentryAndroidOptions)) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zB2 && uVar.b(f304108c, sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.h.h());
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof r3) {
            sentryAndroidOptions.setSocketTagger(g0.c());
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new z());
            sentryAndroidOptions.addPerformanceCollector(new v(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                sentryAndroidOptions.addPerformanceCollector(new r2(sentryAndroidOptions, (io.sentry.android.core.internal.util.b0) io.sentry.util.y.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof w2) {
            sentryAndroidOptions.setCompositePerformanceCollector(new io.sentry.s(sentryAndroidOptions));
        }
        io.sentry.m1 m1VarA = io.sentry.android.core.performance.h.f304451t.a();
        try {
            io.sentry.s1 s1VarK = hVarS.k();
            io.sentry.v0 v0VarJ = hVarS.j();
            hVarS.E(null);
            hVarS.D(null);
            if (m1VarA != null) {
                m1VarA.close();
            }
            l(sentryAndroidOptions, context, u0Var, s1VarK, v0VarJ, sentryAndroidOptions.getCompositePerformanceCollector());
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

    @lm.n
    static void g(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull io.sentry.util.u uVar, @NotNull h hVar) {
        f(sentryAndroidOptions, context, new u0(new y()), uVar, hVar);
    }

    static void h(@NotNull Context context, @NotNull final SentryAndroidOptions sentryAndroidOptions, @NotNull u0 u0Var, @NotNull io.sentry.util.u uVar, @NotNull h hVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        io.sentry.util.s sVar = new io.sentry.util.s(new io.sentry.util.s.a() { // from class: io.sentry.android.core.a0
            @Override // io.sentry.util.s.a
            public final Object a() {
                return Boolean.valueOf(io.sentry.android.core.cache.b.U(sentryAndroidOptions));
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new l5(new SendCachedEnvelopeFireAndForgetIntegration.b() { // from class: io.sentry.android.core.b0
            @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.b
            public final String a() {
                return sentryAndroidOptions.getCacheDirPath();
            }
        }), sVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(uVar.c(NdkIntegration.f303974c, sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.b());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new m5(new SendCachedEnvelopeFireAndForgetIntegration.b() { // from class: io.sentry.android.core.c0
            @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.b
            public final String a() {
                return sentryAndroidOptions.getOutboxPath();
            }
        }), sVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(m0.a(context, u0Var));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, u0Var, hVar));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, uVar));
            if (z10) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().c(y7.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z11) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, u0Var));
        if (z12) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context, io.sentry.transport.n.b());
            replayIntegration.e(new io.sentry.android.replay.b());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z13) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().x(new SentryAndroidOptions.a());
    }

    @lm.n
    static void i(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context) {
        y yVar = new y();
        j(sentryAndroidOptions, context, yVar, new u0(yVar));
    }

    static void j(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull ILogger iLogger, @NotNull u0 u0Var) {
        io.sentry.util.y.c(context, "The context is required.");
        Context contextG = a1.g(context);
        io.sentry.util.y.c(sentryAndroidOptions, "The options object is required.");
        io.sentry.util.y.c(iLogger, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(iLogger);
        sentryAndroidOptions.setFatalLogger(new x());
        sentryAndroidOptions.setDefaultScopeType(x4.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(h8.OFF);
        sentryAndroidOptions.setDateProvider(new h2());
        sentryAndroidOptions.setFlushTimeoutMillis(f304106a);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.b0(contextG, iLogger, u0Var));
        w1.a(contextG, sentryAndroidOptions, u0Var);
        sentryAndroidOptions.setCacheDirPath(d(contextG).getAbsolutePath());
        k(sentryAndroidOptions, contextG, u0Var);
        s0.g().l(sentryAndroidOptions);
    }

    private static void k(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull u0 u0Var) {
        PackageInfo packageInfoP = a1.p(context, u0Var);
        if (packageInfoP != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(e(packageInfoP, a1.q(packageInfoP, u0Var)));
            }
            String str = packageInfoP.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(m1.a(context));
            } catch (RuntimeException e10) {
                sentryAndroidOptions.getLogger().a(y7.ERROR, "Could not generate distinct Id.", e10);
            }
        }
    }

    private static void l(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull u0 u0Var, @Nullable io.sentry.s1 s1Var, @Nullable io.sentry.v0 v0Var, @NotNull io.sentry.m mVar) {
        if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
            sentryAndroidOptions.setContinuousProfiler(y2.a());
            if (v0Var != null) {
                v0Var.i(true);
            }
            if (s1Var != null) {
                sentryAndroidOptions.setTransactionProfiler(s1Var);
                return;
            } else {
                sentryAndroidOptions.setTransactionProfiler(new i0(context, sentryAndroidOptions, u0Var, (io.sentry.android.core.internal.util.b0) io.sentry.util.y.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
                return;
            }
        }
        sentryAndroidOptions.setTransactionProfiler(v3.c());
        if (s1Var != null) {
            s1Var.close();
        }
        if (v0Var == null) {
            sentryAndroidOptions.setContinuousProfiler(new u(u0Var, (io.sentry.android.core.internal.util.b0) io.sentry.util.y.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required"), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
            return;
        }
        sentryAndroidOptions.setContinuousProfiler(v0Var);
        io.sentry.protocol.v vVarL = v0Var.l();
        if (v0Var.isRunning() && !vVarL.equals(io.sentry.protocol.v.f306474b)) {
            mVar.f(vVarL.toString());
        }
    }
}
