package io.sentry.android.core;

import android.app.Activity;
import io.sentry.n8;
import io.sentry.o7;
import io.sentry.t5;
import io.sentry.t7;
import io.sentry.y7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class SentryAndroidOptions extends n8 {
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;

    @Nullable
    private b beforeScreenshotCaptureCallback;

    @Nullable
    private b beforeViewHierarchyCaptureCallback;

    @Nullable
    private io.sentry.android.core.internal.util.b0 frameMetricsCollector;
    private boolean anrEnabled = true;
    private long anrTimeoutIntervalMillis = 5000;
    private boolean anrReportInDebug = false;
    private boolean enableActivityLifecycleBreadcrumbs = true;
    private boolean enableAppLifecycleBreadcrumbs = true;
    private boolean enableSystemEventBreadcrumbs = true;
    private boolean enableAppComponentBreadcrumbs = true;
    private boolean enableNetworkEventBreadcrumbs = true;
    private boolean enableAutoActivityLifecycleTracing = true;
    private boolean enableActivityLifecycleTracingAutoFinish = true;

    @NotNull
    private l1 debugImagesLoader = y1.d();
    private boolean collectAdditionalContext = true;
    private long startupCrashFlushTimeoutMillis = 5000;
    private final long startupCrashDurationThresholdMillis = 2000;
    private boolean enableFramesTracking = true;

    @Nullable
    private String nativeSdkName = null;
    private boolean enableRootCheck = true;
    private boolean enableNdk = true;

    @NotNull
    private x1 ndkHandlerStrategy = x1.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private boolean enableScopeSync = true;
    private boolean enableAutoTraceIdGeneration = true;
    private boolean enableSystemEventBreadcrumbsExtras = false;
    private boolean reportHistoricalAnrs = false;
    private boolean attachAnrThreadDump = false;
    private boolean enablePerformanceV2 = true;

    static class a implements t7.a {
        a() {
        }

        @Override // io.sentry.t7.a
        public void a(@Nullable io.sentry.protocol.v vVar, @Nullable t7.b bVar) {
            Activity activityC = b1.d().c();
            if (activityC == null) {
                t5.R().b().getLogger().c(y7.ERROR, "Cannot show user feedback dialog, no activity is available. Make sure to call SentryAndroid.init() in your Application.onCreate() method.", new Object[0]);
            } else {
                new p2.a(activityC).a(vVar).b(bVar).c().show();
            }
        }
    }

    public interface b {
        boolean a(@NotNull o7 o7Var, @NotNull io.sentry.n0 n0Var, boolean z10);
    }

    public SentryAndroidOptions() {
        setSentryClientName("sentry.java.android/8.23.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    @NotNull
    private io.sentry.protocol.p createSdkVersion() {
        io.sentry.protocol.p pVarK = io.sentry.protocol.p.k(getSdkVersion(), t0.f304514d, "8.23.0");
        pVarK.d("maven:io.sentry:sentry-android-core", "8.23.0");
        return pVarK;
    }

    public void enableAllAutoBreadcrumbs(boolean z10) {
        this.enableActivityLifecycleBreadcrumbs = z10;
        this.enableAppComponentBreadcrumbs = z10;
        this.enableSystemEventBreadcrumbs = z10;
        this.enableAppLifecycleBreadcrumbs = z10;
        this.enableNetworkEventBreadcrumbs = z10;
        setEnableUserInteractionBreadcrumbs(z10);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    @Nullable
    public b getBeforeScreenshotCaptureCallback() {
        return this.beforeScreenshotCaptureCallback;
    }

    @Nullable
    public b getBeforeViewHierarchyCaptureCallback() {
        return this.beforeViewHierarchyCaptureCallback;
    }

    @NotNull
    public l1 getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    @lm.a.c
    @Nullable
    public io.sentry.android.core.internal.util.b0 getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    @lm.a.c
    @Nullable
    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    @lm.a.c
    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    @lm.a.c
    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    @lm.a.c
    long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableAutoTraceIdGeneration() {
        return this.enableAutoTraceIdGeneration;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isEnableSystemEventBreadcrumbsExtras() {
        return this.enableSystemEventBreadcrumbsExtras;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public void setAnrEnabled(boolean z10) {
        this.anrEnabled = z10;
    }

    public void setAnrReportInDebug(boolean z10) {
        this.anrReportInDebug = z10;
    }

    public void setAnrTimeoutIntervalMillis(long j10) {
        this.anrTimeoutIntervalMillis = j10;
    }

    public void setAttachAnrThreadDump(boolean z10) {
        this.attachAnrThreadDump = z10;
    }

    public void setAttachScreenshot(boolean z10) {
        this.attachScreenshot = z10;
    }

    public void setAttachViewHierarchy(boolean z10) {
        this.attachViewHierarchy = z10;
    }

    public void setBeforeScreenshotCaptureCallback(@NotNull b bVar) {
        this.beforeScreenshotCaptureCallback = bVar;
    }

    public void setBeforeViewHierarchyCaptureCallback(@NotNull b bVar) {
        this.beforeViewHierarchyCaptureCallback = bVar;
    }

    public void setCollectAdditionalContext(boolean z10) {
        this.collectAdditionalContext = z10;
    }

    public void setDebugImagesLoader(@NotNull l1 l1Var) {
        if (l1Var == null) {
            l1Var = y1.d();
        }
        this.debugImagesLoader = l1Var;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z10) {
        this.enableActivityLifecycleBreadcrumbs = z10;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z10) {
        this.enableActivityLifecycleTracingAutoFinish = z10;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z10) {
        this.enableAppComponentBreadcrumbs = z10;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z10) {
        this.enableAppLifecycleBreadcrumbs = z10;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z10) {
        this.enableAutoActivityLifecycleTracing = z10;
    }

    public void setEnableAutoTraceIdGeneration(boolean z10) {
        this.enableAutoTraceIdGeneration = z10;
    }

    public void setEnableFramesTracking(boolean z10) {
        this.enableFramesTracking = z10;
    }

    public void setEnableNdk(boolean z10) {
        this.enableNdk = z10;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z10) {
        this.enableNetworkEventBreadcrumbs = z10;
    }

    public void setEnablePerformanceV2(boolean z10) {
        this.enablePerformanceV2 = z10;
    }

    public void setEnableRootCheck(boolean z10) {
        this.enableRootCheck = z10;
    }

    public void setEnableScopeSync(boolean z10) {
        this.enableScopeSync = z10;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z10) {
        this.enableSystemEventBreadcrumbs = z10;
    }

    public void setEnableSystemEventBreadcrumbsExtras(boolean z10) {
        this.enableSystemEventBreadcrumbsExtras = z10;
    }

    @lm.a.c
    public void setFrameMetricsCollector(@Nullable io.sentry.android.core.internal.util.b0 b0Var) {
        this.frameMetricsCollector = b0Var;
    }

    @lm.a.c
    public void setNativeHandlerStrategy(@NotNull x1 x1Var) {
        this.ndkHandlerStrategy = x1Var;
    }

    @lm.a.c
    public void setNativeSdkName(@Nullable String str) {
        this.nativeSdkName = str;
    }

    public void setReportHistoricalAnrs(boolean z10) {
        this.reportHistoricalAnrs = z10;
    }

    @lm.n
    void setStartupCrashFlushTimeoutMillis(long j10) {
        this.startupCrashFlushTimeoutMillis = j10;
    }
}
