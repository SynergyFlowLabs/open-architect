package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import io.sentry.ILogger;
import io.sentry.i4;
import io.sentry.t7;
import io.sentry.w7;
import io.sentry.y7;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class w1 {
    static final String A = "io.sentry.traces.activity.auto-finish.enable";
    static final String B = "io.sentry.traces.user-interaction.enable";
    static final String C = "io.sentry.traces.time-to-full-display.enable";
    static final String D = "io.sentry.traces.profiling.sample-rate";
    static final String E = "io.sentry.traces.profiling.session-sample-rate";
    static final String F = "io.sentry.traces.profiling.lifecycle";
    static final String G = "io.sentry.traces.profiling.start-on-app-start";

    @lm.a.b
    static final String H = "io.sentry.traces.trace-sampling";
    static final String I = "io.sentry.traces.trace-propagation-targets";
    static final String J = "io.sentry.attach-threads";
    static final String K = "io.sentry.proguard-uuid";
    static final String L = "io.sentry.traces.idle-timeout";
    static final String M = "io.sentry.attach-screenshot";
    static final String N = "io.sentry.attach-view-hierarchy";
    static final String O = "io.sentry.send-client-reports";
    static final String P = "io.sentry.additional-context";
    static final String Q = "io.sentry.send-default-pii";
    static final String R = "io.sentry.traces.frames-tracking";
    static final String S = "io.sentry.gradle-plugin-integrations";
    static final String T = "io.sentry.enable-root-check";
    static final String U = "io.sentry.enabled";
    static final String V = "io.sentry.send-modules";
    static final String W = "io.sentry.performance-v2.enable";
    static final String X = "io.sentry.profiling.enable-app-start";
    static final String Y = "io.sentry.enable-scope-persistence";
    static final String Z = "io.sentry.session-replay.session-sample-rate";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f304572a = "io.sentry.dsn";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final String f304573a0 = "io.sentry.session-replay.on-error-sample-rate";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f304574b = "io.sentry.debug";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final String f304575b0 = "io.sentry.session-replay.mask-all-text";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f304576c = "io.sentry.debug.level";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    static final String f304577c0 = "io.sentry.session-replay.mask-all-images";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f304578d = "io.sentry.sample-rate";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    static final String f304579d0 = "io.sentry.session-replay.debug";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f304580e = "io.sentry.anr.enable";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    static final String f304581e0 = "io.sentry.force-init";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f304582f = "io.sentry.anr.report-debug";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    static final String f304583f0 = "io.sentry.max-breadcrumbs";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f304584g = "io.sentry.anr.timeout-interval-millis";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    static final String f304585g0 = "io.sentry.ignored-errors";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f304586h = "io.sentry.anr.attach-thread-dumps";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    static final String f304587h0 = "io.sentry.in-app-includes";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f304588i = "io.sentry.auto-init";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    static final String f304589i0 = "io.sentry.in-app-excludes";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f304590j = "io.sentry.ndk.enable";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    static final String f304591j0 = "io.sentry.logs.enabled";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f304592k = "io.sentry.ndk.scope-sync.enable";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    static final String f304593k0 = "io.sentry.traces.enable-auto-id-generation";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f304594l = "io.sentry.release";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    static final String f304595l0 = "io.sentry.traces.deadline-timeout";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f304596m = "io.sentry.environment";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    static final String f304597m0 = "io.sentry.feedback.is-name-required";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f304598n = "io.sentry.sdk.name";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    static final String f304599n0 = "io.sentry.feedback.show-name";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final String f304600o = "io.sentry.sdk.version";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final String f304601o0 = "io.sentry.feedback.is-email-required";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final String f304602p = "io.sentry.auto-session-tracking.enable";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final String f304603p0 = "io.sentry.feedback.show-email";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f304604q = "io.sentry.session-tracking.timeout-interval-millis";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    static final String f304605q0 = "io.sentry.feedback.use-sentry-user";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final String f304606r = "io.sentry.breadcrumbs.activity-lifecycle";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    static final String f304607r0 = "io.sentry.feedback.show-branding";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final String f304608s = "io.sentry.breadcrumbs.app-lifecycle";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f304609t = "io.sentry.breadcrumbs.system-events";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final String f304610u = "io.sentry.breadcrumbs.network-events";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final String f304611v = "io.sentry.breadcrumbs.app-components";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final String f304612w = "io.sentry.breadcrumbs.user-interaction";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final String f304613x = "io.sentry.uncaught-exception-handler.enable";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final String f304614y = "io.sentry.traces.sample-rate";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final String f304615z = "io.sentry.traces.activity.enable";

    private w1() {
    }

    static void a(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull u0 u0Var) {
        io.sentry.util.y.c(context, "The application context is required.");
        io.sentry.util.y.c(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle bundleB = b(context, sentryAndroidOptions.getLogger(), u0Var);
            ILogger logger = sentryAndroidOptions.getLogger();
            if (bundleB != null) {
                sentryAndroidOptions.setDebug(d(bundleB, logger, f304574b, sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strH = h(bundleB, logger, f304576c, strName.toLowerCase(locale));
                    if (strH != null) {
                        sentryAndroidOptions.setDiagnosticLevel(y7.valueOf(strH.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(d(bundleB, logger, f304580e, sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(d(bundleB, logger, f304602p, sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double dE = e(bundleB, logger, f304578d);
                    if (dE != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(dE));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(d(bundleB, logger, f304582f, sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(g(bundleB, logger, f304584g, sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(d(bundleB, logger, f304586h, sentryAndroidOptions.isAttachAnrThreadDump()));
                String strH2 = h(bundleB, logger, f304572a, sentryAndroidOptions.getDsn());
                boolean zD = d(bundleB, logger, U, sentryAndroidOptions.isEnabled());
                if (!zD || (strH2 != null && strH2.isEmpty())) {
                    sentryAndroidOptions.getLogger().c(y7.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strH2 == null) {
                    sentryAndroidOptions.getLogger().c(y7.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zD);
                sentryAndroidOptions.setDsn(strH2);
                sentryAndroidOptions.setEnableNdk(d(bundleB, logger, f304590j, sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(d(bundleB, logger, f304592k, sentryAndroidOptions.isEnableScopeSync()));
                sentryAndroidOptions.setRelease(h(bundleB, logger, f304594l, sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(h(bundleB, logger, f304596m, sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(g(bundleB, logger, f304604q, sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) g(bundleB, logger, f304583f0, sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(d(bundleB, logger, f304606r, sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(d(bundleB, logger, f304608s, sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(d(bundleB, logger, f304609t, sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(d(bundleB, logger, f304611v, sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(d(bundleB, logger, f304612w, sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(d(bundleB, logger, f304610u, sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(d(bundleB, logger, f304613x, sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(d(bundleB, logger, J, sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(d(bundleB, logger, M, sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(d(bundleB, logger, N, sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(d(bundleB, logger, O, sentryAndroidOptions.isSendClientReports()));
                if (d(bundleB, logger, f304588i, true)) {
                    sentryAndroidOptions.setInitPriority(io.sentry.v1.LOW);
                }
                sentryAndroidOptions.setForceInit(d(bundleB, logger, f304581e0, sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(d(bundleB, logger, P, sentryAndroidOptions.isCollectAdditionalContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double dE2 = e(bundleB, logger, f304614y);
                    if (dE2 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dE2));
                    }
                }
                sentryAndroidOptions.setTraceSampling(d(bundleB, logger, H, sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(d(bundleB, logger, f304615z, sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(d(bundleB, logger, A, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double dE3 = e(bundleB, logger, D);
                    if (dE3 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dE3));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double dE4 = e(bundleB, logger, E);
                    if (dE4 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dE4));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String strH3 = h(bundleB, logger, F, strName2.toLowerCase(locale2));
                if (strH3 != null) {
                    sentryAndroidOptions.setProfileLifecycle(i4.valueOf(strH3.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(d(bundleB, logger, G, sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(d(bundleB, logger, B, sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(d(bundleB, logger, C, sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jG = g(bundleB, logger, L, -1L);
                if (jG != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jG));
                }
                List<String> listF = f(bundleB, logger, I);
                if (bundleB.containsKey(I) && listF == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (listF != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listF);
                }
                sentryAndroidOptions.setEnableFramesTracking(d(bundleB, logger, R, true));
                sentryAndroidOptions.setProguardUuid(h(bundleB, logger, K, sentryAndroidOptions.getProguardUuid()));
                io.sentry.protocol.p sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new io.sentry.protocol.p("", "");
                }
                sdkVersion.i(i(bundleB, logger, f304598n, sdkVersion.f()));
                sdkVersion.j(i(bundleB, logger, f304600o, sdkVersion.h()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(d(bundleB, logger, Q, sentryAndroidOptions.isSendDefaultPii()));
                List<String> listF2 = f(bundleB, logger, S);
                if (listF2 != null) {
                    Iterator<String> it = listF2.iterator();
                    while (it.hasNext()) {
                        w7.e().a(it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(d(bundleB, logger, T, sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(d(bundleB, logger, V, sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(d(bundleB, logger, W, sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(d(bundleB, logger, X, sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(d(bundleB, logger, Y, sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(d(bundleB, logger, f304593k0, sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(g(bundleB, logger, f304595l0, sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().k() == null) {
                    double dE5 = e(bundleB, logger, Z);
                    if (dE5 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().z(Double.valueOf(dE5));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().g() == null) {
                    double dE6 = e(bundleB, logger, f304573a0);
                    if (dE6 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().w(Double.valueOf(dE6));
                    }
                }
                sentryAndroidOptions.getSessionReplay().u(d(bundleB, logger, f304575b0, true));
                sentryAndroidOptions.getSessionReplay().t(d(bundleB, logger, f304577c0, true));
                sentryAndroidOptions.getSessionReplay().s(d(bundleB, logger, f304579d0, false));
                sentryAndroidOptions.setIgnoredErrors(f(bundleB, logger, f304585g0));
                List<String> listF3 = f(bundleB, logger, f304587h0);
                if (listF3 != null && !listF3.isEmpty()) {
                    Iterator<String> it2 = listF3.iterator();
                    while (it2.hasNext()) {
                        sentryAndroidOptions.addInAppInclude(it2.next());
                    }
                }
                List<String> listF4 = f(bundleB, logger, f304589i0);
                if (listF4 != null && !listF4.isEmpty()) {
                    Iterator<String> it3 = listF4.iterator();
                    while (it3.hasNext()) {
                        sentryAndroidOptions.addInAppExclude(it3.next());
                    }
                }
                sentryAndroidOptions.getLogs().d(d(bundleB, logger, f304591j0, sentryAndroidOptions.getLogs().b()));
                t7 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.H(d(bundleB, logger, f304597m0, feedbackOptions.r()));
                feedbackOptions.O(d(bundleB, logger, f304599n0, feedbackOptions.u()));
                feedbackOptions.A(d(bundleB, logger, f304601o0, feedbackOptions.q()));
                feedbackOptions.N(d(bundleB, logger, f304603p0, feedbackOptions.t()));
                feedbackOptions.R(d(bundleB, logger, f304605q0, feedbackOptions.v()));
                feedbackOptions.M(d(bundleB, logger, f304607r0, feedbackOptions.s()));
            }
            sentryAndroidOptions.getLogger().c(y7.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(y7.ERROR, "Failed to read configuration from android manifest metadata.", th2);
        }
    }

    @Nullable
    private static Bundle b(@NotNull Context context, @NotNull ILogger iLogger, @Nullable u0 u0Var) {
        if (u0Var == null) {
            u0Var = new u0(iLogger);
        }
        ApplicationInfo applicationInfoH = a1.h(context, u0Var);
        if (applicationInfoH != null) {
            return applicationInfoH.metaData;
        }
        return null;
    }

    static boolean c(@NotNull Context context, @NotNull ILogger iLogger) {
        io.sentry.util.y.c(context, "The application context is required.");
        try {
            Bundle bundleB = b(context, iLogger, null);
            if (bundleB != null) {
                return d(bundleB, iLogger, f304588i, true);
            }
            return true;
        } catch (Throwable th2) {
            iLogger.a(y7.ERROR, "Failed to read auto-init from android manifest metadata.", th2);
            return true;
        }
    }

    private static boolean d(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, boolean z10) {
        boolean z11 = bundle.getBoolean(str, z10);
        iLogger.c(y7.DEBUG, str + " read: " + z11, new Object[0]);
        return z11;
    }

    private static double e(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        iLogger.c(y7.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
        return dDoubleValue;
    }

    @Nullable
    private static List<String> f(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str) {
        String string = bundle.getString(str);
        iLogger.c(y7.DEBUG, str + " read: " + string, new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    private static long g(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, long j10) {
        long j11 = bundle.getInt(str, (int) j10);
        iLogger.c(y7.DEBUG, str + " read: " + j11, new Object[0]);
        return j11;
    }

    @Nullable
    private static String h(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, @Nullable String str2) {
        String string = bundle.getString(str, str2);
        iLogger.c(y7.DEBUG, str + " read: " + string, new Object[0]);
        return string;
    }

    @NotNull
    private static String i(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, @NotNull String str2) {
        String string = bundle.getString(str, str2);
        iLogger.c(y7.DEBUG, str + " read: " + string, new Object[0]);
        return string;
    }
}
