package io.sentry;

import androidx.media2.session.SessionCommand;
import java.io.File;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class n8 {
    static final y7 DEFAULT_DIAGNOSTIC_LEVEL = y7.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";

    @lm.a.c
    @NotNull
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;

    @lm.a.b
    @NotNull
    private io.sentry.backpressure.b backpressureMonitor;

    @Nullable
    private a beforeBreadcrumb;

    @Nullable
    private c beforeEnvelopeCallback;

    @Nullable
    private d beforeSend;

    @Nullable
    private d beforeSendFeedback;

    @Nullable
    private e beforeSendReplay;

    @Nullable
    private f beforeSendTransaction;

    @NotNull
    private final Set<String> bundleIds;

    @Nullable
    private String cacheDirPath;

    @lm.a.b
    private boolean captureOpenTelemetryEvents;

    @NotNull
    io.sentry.clientreport.h clientReportRecorder;

    @NotNull
    private io.sentry.m compositePerformanceCollector;

    @NotNull
    private u0 connectionStatusProvider;
    private int connectionTimeoutMillis;

    @NotNull
    private final List<String> contextTags;

    @NotNull
    private v0 continuousProfiler;

    @lm.a.b
    @Nullable
    private g cron;

    @lm.a.c
    @NotNull
    private final io.sentry.util.s<f6> dateProvider;
    private long deadlineTimeout;
    private boolean debug;

    @NotNull
    private io.sentry.internal.debugmeta.a debugMetaLoader;

    @NotNull
    private x4 defaultScopeType;

    @NotNull
    private final List<String> defaultTracePropagationTargets;

    @NotNull
    private y7 diagnosticLevel;

    @Nullable
    private String dist;

    @Nullable
    private String distinctId;

    @NotNull
    private h distribution;

    @NotNull
    private w0 distributionController;

    @Nullable
    private String dsn;

    @Nullable
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;

    @lm.a.b
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;

    @NotNull
    private io.sentry.cache.g envelopeDiskCache;

    @NotNull
    private final io.sentry.util.s<x0> envelopeReader;

    @Nullable
    private String environment;

    @NotNull
    private final List<i0> eventProcessors;

    @NotNull
    private l1 executorService;

    @NotNull
    private final j0 experimental;

    @lm.a.b
    @NotNull
    private ILogger fatalLogger;

    @NotNull
    private t7 feedbackOptions;
    private long flushTimeoutMillis;
    private boolean forceInit;

    @NotNull
    private m0 fullyDisplayedReporter;

    @NotNull
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;

    @Nullable
    private Boolean globalHubMode;

    @Nullable
    private Long idleTimeout;

    @lm.a.b
    @Nullable
    private List<l0> ignoredCheckIns;

    @Nullable
    private List<l0> ignoredErrors;

    @NotNull
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;

    @lm.a.b
    @Nullable
    private List<l0> ignoredSpanOrigins;

    @Nullable
    private List<l0> ignoredTransactions;

    @NotNull
    private final List<String> inAppExcludes;

    @NotNull
    private final List<String> inAppIncludes;

    @NotNull
    private v1 initPriority;

    @NotNull
    private w1 instrumenter;

    @NotNull
    private final List<x1> integrations;

    @Nullable
    private volatile ea internalTracesSampler;

    @NotNull
    protected final io.sentry.util.a lock;

    @NotNull
    private ILogger logger;

    @NotNull
    private i logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;

    @NotNull
    private m maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;

    @NotNull
    private io.sentry.internal.modules.b modulesLoader;

    @NotNull
    private final List<h1> observers;

    @Nullable
    private j onDiscard;

    @NotNull
    private h8 openTelemetryMode;

    @NotNull
    private final List<a1> optionsObservers;

    @NotNull
    private final io.sentry.util.s<a0> parsedDsn;

    @NotNull
    private final List<b1> performanceCollectors;
    private boolean printUncaughtStackTrace;

    @NotNull
    private i4 profileLifecycle;

    @Nullable
    private Double profileSessionSampleRate;

    @Nullable
    private Double profilesSampleRate;

    @Nullable
    private k profilesSampler;

    @Nullable
    private String profilingTracesDirPath;
    private int profilingTracesHz;

    @Nullable
    private String proguardUuid;
    private boolean propagateTraceparent;

    @Nullable
    private l proxy;
    private int readTimeoutMillis;

    @Nullable
    private String release;

    @NotNull
    private o4 replayController;

    @Nullable
    private Double sampleRate;

    @Nullable
    private io.sentry.protocol.p sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;

    @Nullable
    private String sentryClientName;

    @NotNull
    private final io.sentry.util.s<n1> serializer;

    @Nullable
    private String serverName;
    private long sessionFlushTimeoutMillis;

    @NotNull
    private p8 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;

    @NotNull
    private o1 socketTagger;

    @NotNull
    private q1 spanFactory;

    @Nullable
    private String spotlightConnectionUrl;

    @Nullable
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;

    @NotNull
    private final Map<String, String> tags;

    @NotNull
    private io.sentry.util.thread.a threadChecker;
    private boolean traceOptionsRequests;

    @Nullable
    private List<String> tracePropagationTargets;
    private boolean traceSampling;

    @Nullable
    private Double tracesSampleRate;

    @Nullable
    private n tracesSampler;

    @NotNull
    private s1 transactionProfiler;

    @NotNull
    private t1 transportFactory;

    @NotNull
    private io.sentry.transport.r transportGate;

    @NotNull
    private u1 versionDetector;

    @NotNull
    private final List<io.sentry.internal.viewhierarchy.a> viewHierarchyExporters;

    public interface a {
        @Nullable
        io.sentry.f a(@NotNull io.sentry.f fVar, @NotNull n0 n0Var);
    }

    @lm.a.b
    public interface b {
        boolean a(@NotNull String str, @Nullable Map<String, String> map);
    }

    @lm.a.c
    public interface c {
        void a(@NotNull g6 g6Var, @Nullable n0 n0Var);
    }

    public interface d {
        @Nullable
        o7 a(@NotNull o7 o7Var, @NotNull n0 n0Var);
    }

    public interface e {
        @Nullable
        o8 a(@NotNull o8 o8Var, @NotNull n0 n0Var);
    }

    public interface f {
        @Nullable
        io.sentry.protocol.c0 a(@NotNull io.sentry.protocol.c0 c0Var, @NotNull n0 n0Var);
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Long f305920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private Long f305921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private String f305922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private Long f305923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private Long f305924e;

        @Nullable
        public Long a() {
            return this.f305920a;
        }

        @Nullable
        public Long b() {
            return this.f305923d;
        }

        @Nullable
        public Long c() {
            return this.f305921b;
        }

        @Nullable
        public Long d() {
            return this.f305924e;
        }

        @Nullable
        public String e() {
            return this.f305922c;
        }

        public void f(@Nullable Long l10) {
            this.f305920a = l10;
        }

        public void g(@Nullable Long l10) {
            this.f305923d = l10;
        }

        public void h(@Nullable Long l10) {
            this.f305921b = l10;
        }

        public void i(@Nullable Long l10) {
            this.f305924e = l10;
        }

        public void j(@Nullable String str) {
            this.f305922c = str;
        }
    }

    @lm.a.b
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f305925a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f305926b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f305927c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f305928d = "https://sentry.io";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f305929e = null;
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f305930a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private a f305931b;

        public interface a {
            @Nullable
            a8 a(@NotNull a8 a8Var);
        }

        @Nullable
        public a a() {
            return this.f305931b;
        }

        public boolean b() {
            return this.f305930a;
        }

        public void c(@Nullable a aVar) {
            this.f305931b = aVar;
        }

        public void d(boolean z10) {
            this.f305930a = z10;
        }
    }

    public interface j {
        void a(@NotNull io.sentry.clientreport.f fVar, @NotNull o oVar, @NotNull Long l10);
    }

    public interface k {
        @Nullable
        Double a(@NotNull s4 s4Var);
    }

    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f305932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f305933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private String f305934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private String f305935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private Proxy.Type f305936e;

        public l() {
            this(null, null, null, null, null);
        }

        @Nullable
        public String a() {
            return this.f305932a;
        }

        @Nullable
        public String b() {
            return this.f305935d;
        }

        @Nullable
        public String c() {
            return this.f305933b;
        }

        @Nullable
        public Proxy.Type d() {
            return this.f305936e;
        }

        @Nullable
        public String e() {
            return this.f305934c;
        }

        public void f(@Nullable String str) {
            this.f305932a = str;
        }

        public void g(@Nullable String str) {
            this.f305935d = str;
        }

        public void h(@Nullable String str) {
            this.f305933b = str;
        }

        public void i(@Nullable Proxy.Type type) {
            this.f305936e = type;
        }

        public void j(@Nullable String str) {
            this.f305934c = str;
        }

        public l(@Nullable String str, @Nullable String str2) {
            this(str, str2, null, null, null);
        }

        public l(@Nullable String str, @Nullable String str2, @Nullable Proxy.Type type) {
            this(str, str2, type, null, null);
        }

        public l(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this(str, str2, null, str3, str4);
        }

        public l(@Nullable String str, @Nullable String str2, @Nullable Proxy.Type type, @Nullable String str3, @Nullable String str4) {
            this.f305932a = str;
            this.f305933b = str2;
            this.f305936e = type;
            this.f305934c = str3;
            this.f305935d = str4;
        }
    }

    public enum m {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    public interface n {
        @Nullable
        Double a(@NotNull s4 s4Var);
    }

    public n8() {
        this(false);
    }

    public static /* synthetic */ f6 b() {
        return new y5();
    }

    public static /* synthetic */ a0 c(n8 n8Var) {
        return new a0(n8Var.dsn);
    }

    @NotNull
    private io.sentry.protocol.p createSdkVersion() {
        io.sentry.protocol.p pVar = new io.sentry.protocol.p(io.sentry.g.f305444a, "8.23.0");
        pVar.j("8.23.0");
        return pVar;
    }

    public static /* synthetic */ x0 d(n8 n8Var) {
        n8Var.getClass();
        return new d0(n8Var.serializer.a());
    }

    public static /* synthetic */ n1 e(n8 n8Var) {
        n8Var.getClass();
        return new l2(n8Var);
    }

    @lm.a.c
    @NotNull
    public static n8 empty() {
        return new n8(true);
    }

    private void f() {
        w7.e().b("maven:io.sentry:sentry", "8.23.0");
    }

    public void addBundleId(@Nullable String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(@NotNull String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(@NotNull i0 i0Var) {
        this.eventProcessors.add(i0Var);
    }

    @lm.a.b
    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new l0(str));
    }

    public void addIgnoredError(@NotNull String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new l0(str));
    }

    public void addIgnoredExceptionForType(@NotNull Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    @lm.a.b
    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new l0(str));
    }

    @lm.a.b
    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new l0(str));
    }

    public void addInAppExclude(@NotNull String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(@NotNull String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(@NotNull x1 x1Var) {
        this.integrations.add(x1Var);
    }

    public void addOptionsObserver(@NotNull a1 a1Var) {
        this.optionsObservers.add(a1Var);
    }

    @lm.a.c
    public void addPerformanceCollector(@NotNull b1 b1Var) {
        this.performanceCollectors.add(b1Var);
    }

    public void addScopeObserver(@NotNull h1 h1Var) {
        this.observers.add(h1Var);
    }

    boolean containsIgnoredExceptionForType(@NotNull Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    @lm.a.c
    @Nullable
    public io.sentry.cache.w findPersistingScopeObserver() {
        for (h1 h1Var : this.observers) {
            if (h1Var instanceof io.sentry.cache.w) {
                return (io.sentry.cache.w) h1Var;
            }
        }
        return null;
    }

    @lm.a.c
    @NotNull
    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    @Nullable
    public a getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    @lm.a.c
    @Nullable
    public c getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    @Nullable
    public d getBeforeSend() {
        return this.beforeSend;
    }

    @Nullable
    public d getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    @Nullable
    public e getBeforeSendReplay() {
        return this.beforeSendReplay;
    }

    @Nullable
    public f getBeforeSendTransaction() {
        return this.beforeSendTransaction;
    }

    @NotNull
    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    @Nullable
    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    @Nullable
    String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str != null && !str.isEmpty()) {
            return this.cacheDirPath;
        }
        return null;
    }

    @lm.a.c
    @NotNull
    public io.sentry.clientreport.h getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    @lm.a.c
    @NotNull
    public io.sentry.m getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    @NotNull
    public u0 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    @NotNull
    public List<String> getContextTags() {
        return this.contextTags;
    }

    @NotNull
    public v0 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    @Nullable
    public g getCron() {
        return this.cron;
    }

    @lm.a.c
    @NotNull
    public f6 getDateProvider() {
        return this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    @lm.a.c
    @NotNull
    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    @NotNull
    public x4 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    @NotNull
    public y7 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    @Nullable
    public String getDist() {
        return this.dist;
    }

    @Nullable
    public String getDistinctId() {
        return this.distinctId;
    }

    @lm.a.b
    @NotNull
    public h getDistribution() {
        return this.distribution;
    }

    @lm.a.b
    @NotNull
    public w0 getDistributionController() {
        return this.distributionController;
    }

    @Nullable
    public String getDsn() {
        return this.dsn;
    }

    @NotNull
    public io.sentry.cache.g getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    @NotNull
    public x0 getEnvelopeReader() {
        return this.envelopeReader.a();
    }

    @Nullable
    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : "production";
    }

    @NotNull
    public List<i0> getEventProcessors() {
        return this.eventProcessors;
    }

    @lm.a.c
    @NotNull
    public l1 getExecutorService() {
        return this.executorService;
    }

    @NotNull
    public j0 getExperimental() {
        return this.experimental;
    }

    @lm.a.b
    @NotNull
    public ILogger getFatalLogger() {
        return this.fatalLogger;
    }

    @NotNull
    public t7 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    @lm.a.c
    @NotNull
    public m0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    @Nullable
    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    @lm.a.b
    @Nullable
    public List<l0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    @Nullable
    public List<l0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    @NotNull
    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    @lm.a.b
    @Nullable
    public List<l0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    @Nullable
    public List<l0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    @NotNull
    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    @NotNull
    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    @lm.a.c
    @NotNull
    public v1 getInitPriority() {
        return this.initPriority;
    }

    @NotNull
    public w1 getInstrumenter() {
        return this.instrumenter;
    }

    @NotNull
    public List<x1> getIntegrations() {
        return this.integrations;
    }

    @lm.a.c
    @NotNull
    public ea getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            m1 m1VarA = this.lock.a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new ea(this);
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
        return this.internalTracesSampler;
    }

    @NotNull
    public ILogger getLogger() {
        return this.logger;
    }

    @lm.a.b
    @NotNull
    public i getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    @NotNull
    public m getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    @lm.a.b
    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    @lm.a.c
    @NotNull
    public io.sentry.internal.modules.b getModulesLoader() {
        return this.modulesLoader;
    }

    @Nullable
    public j getOnDiscard() {
        return this.onDiscard;
    }

    @NotNull
    public h8 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    @NotNull
    public List<a1> getOptionsObservers() {
        return this.optionsObservers;
    }

    @Nullable
    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    @lm.a.c
    @NotNull
    public List<b1> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    @NotNull
    public i4 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    @Nullable
    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    @Nullable
    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    @Nullable
    public k getProfilesSampler() {
        return this.profilesSampler;
    }

    @Nullable
    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    @lm.a.c
    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    @Nullable
    public String getProguardUuid() {
        return this.proguardUuid;
    }

    @Nullable
    public l getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Nullable
    public String getRelease() {
        return this.release;
    }

    @NotNull
    public o4 getReplayController() {
        return this.replayController;
    }

    @Nullable
    public Double getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public List<h1> getScopeObservers() {
        return this.observers;
    }

    @Nullable
    public io.sentry.protocol.p getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public String getSentryClientName() {
        return this.sentryClientName;
    }

    @NotNull
    public n1 getSerializer() {
        return this.serializer.a();
    }

    @Nullable
    public String getServerName() {
        return this.serverName;
    }

    @lm.a.c
    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    @NotNull
    public p8 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    @NotNull
    public o1 getSocketTagger() {
        return this.socketTagger;
    }

    @lm.a.c
    @NotNull
    public q1 getSpanFactory() {
        return this.spanFactory;
    }

    @lm.a.b
    @Nullable
    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    public Map<String, String> getTags() {
        return this.tags;
    }

    @NotNull
    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    @NotNull
    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    @Nullable
    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    @Nullable
    public n getTracesSampler() {
        return this.tracesSampler;
    }

    @NotNull
    public s1 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    @NotNull
    public t1 getTransportFactory() {
        return this.transportFactory;
    }

    @NotNull
    public io.sentry.transport.r getTransportGate() {
        return this.transportGate;
    }

    @lm.a.c
    @NotNull
    public u1 getVersionDetector() {
        return this.versionDetector;
    }

    @NotNull
    public final List<io.sentry.internal.viewhierarchy.a> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    @lm.a.b
    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    @lm.a.c
    public boolean isContinuousProfilingEnabled() {
        Double d10;
        return this.profilesSampleRate == null && this.profilesSampler == null && (d10 = this.profileSessionSampleRate) != null && d10.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    @lm.a.b
    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    @lm.a.b
    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    @lm.a.b
    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    @Nullable
    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d10 = this.profilesSampleRate;
        return (d10 != null && d10.doubleValue() > 0.0d) || this.profilesSampler != null;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    @lm.a.b
    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        return (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(@NotNull k0 k0Var) {
        if (k0Var.m() != null) {
            setDsn(k0Var.m());
        }
        if (k0Var.p() != null) {
            setEnvironment(k0Var.p());
        }
        if (k0Var.F() != null) {
            setRelease(k0Var.F());
        }
        if (k0Var.l() != null) {
            setDist(k0Var.l());
        }
        if (k0Var.H() != null) {
            setServerName(k0Var.H());
        }
        if (k0Var.E() != null) {
            setProxy(k0Var.E());
        }
        if (k0Var.o() != null) {
            setEnableUncaughtExceptionHandler(k0Var.o().booleanValue());
        }
        if (k0Var.y() != null) {
            setPrintUncaughtStackTrace(k0Var.y().booleanValue());
        }
        if (k0Var.L() != null) {
            setTracesSampleRate(k0Var.L());
        }
        if (k0Var.B() != null) {
            setProfilesSampleRate(k0Var.B());
        }
        if (k0Var.k() != null) {
            setDebug(k0Var.k().booleanValue());
        }
        if (k0Var.n() != null) {
            setEnableDeduplication(k0Var.n().booleanValue());
        }
        if (k0Var.G() != null) {
            setSendClientReports(k0Var.G().booleanValue());
        }
        if (k0Var.S() != null) {
            setForceInit(k0Var.S().booleanValue());
        }
        for (Map.Entry entry : new HashMap(k0Var.J()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(k0Var.w()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(k0Var.v()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(k0Var.t()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (k0Var.K() != null) {
            setTracePropagationTargets(new ArrayList(k0Var.K()));
        }
        Iterator it4 = new ArrayList(k0Var.i()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (k0Var.D() != null) {
            setProguardUuid(k0Var.D());
        }
        if (k0Var.q() != null) {
            setIdleTimeout(k0Var.q());
        }
        Iterator<String> it5 = k0Var.h().iterator();
        while (it5.hasNext()) {
            addBundleId(it5.next());
        }
        if (k0Var.R() != null) {
            setEnabled(k0Var.R().booleanValue());
        }
        if (k0Var.P() != null) {
            setEnablePrettySerializationOutput(k0Var.P().booleanValue());
        }
        if (k0Var.V() != null) {
            setSendModules(k0Var.V().booleanValue());
        }
        if (k0Var.r() != null) {
            setIgnoredCheckIns(new ArrayList(k0Var.r()));
        }
        if (k0Var.u() != null) {
            setIgnoredTransactions(new ArrayList(k0Var.u()));
        }
        if (k0Var.s() != null) {
            setIgnoredErrors(new ArrayList(k0Var.s()));
        }
        if (k0Var.N() != null) {
            setEnableBackpressureHandling(k0Var.N().booleanValue());
        }
        if (k0Var.x() != null) {
            setMaxRequestBodySize(k0Var.x());
        }
        if (k0Var.U() != null) {
            setSendDefaultPii(k0Var.U().booleanValue());
        }
        if (k0Var.M() != null) {
            setCaptureOpenTelemetryEvents(k0Var.M().booleanValue());
        }
        if (k0Var.Q() != null) {
            setEnableSpotlight(k0Var.Q().booleanValue());
        }
        if (k0Var.I() != null) {
            setSpotlightConnectionUrl(k0Var.I());
        }
        if (k0Var.T() != null) {
            setGlobalHubMode(k0Var.T());
        }
        if (k0Var.j() != null) {
            if (getCron() == null) {
                setCron(k0Var.j());
            } else {
                if (k0Var.j().a() != null) {
                    getCron().f(k0Var.j().a());
                }
                if (k0Var.j().c() != null) {
                    getCron().h(k0Var.j().c());
                }
                if (k0Var.j().e() != null) {
                    getCron().j(k0Var.j().e());
                }
                if (k0Var.j().b() != null) {
                    getCron().g(k0Var.j().b());
                }
                if (k0Var.j().d() != null) {
                    getCron().i(k0Var.j().d());
                }
            }
        }
        if (k0Var.O() != null) {
            getLogs().d(k0Var.O().booleanValue());
        }
        if (k0Var.A() != null) {
            setProfileSessionSampleRate(k0Var.A());
        }
        if (k0Var.C() != null) {
            setProfilingTracesDirPath(k0Var.C());
        }
        if (k0Var.z() != null) {
            setProfileLifecycle(k0Var.z());
        }
    }

    @lm.a.c
    @NotNull
    a0 retrieveParsedDsn() throws IllegalArgumentException {
        return this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z10) {
        this.attachServerName = z10;
    }

    public void setAttachStacktrace(boolean z10) {
        this.attachStacktrace = z10;
    }

    public void setAttachThreads(boolean z10) {
        this.attachThreads = z10;
    }

    @lm.a.c
    public void setBackpressureMonitor(@NotNull io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(@Nullable a aVar) {
        this.beforeBreadcrumb = aVar;
    }

    @lm.a.c
    public void setBeforeEnvelopeCallback(@Nullable c cVar) {
        this.beforeEnvelopeCallback = cVar;
    }

    public void setBeforeSend(@Nullable d dVar) {
        this.beforeSend = dVar;
    }

    public void setBeforeSendFeedback(@Nullable d dVar) {
        this.beforeSendFeedback = dVar;
    }

    public void setBeforeSendReplay(@Nullable e eVar) {
        this.beforeSendReplay = eVar;
    }

    public void setBeforeSendTransaction(@Nullable f fVar) {
        this.beforeSendTransaction = fVar;
    }

    public void setCacheDirPath(@Nullable String str) {
        this.cacheDirPath = str;
    }

    @lm.a.b
    public void setCaptureOpenTelemetryEvents(boolean z10) {
        this.captureOpenTelemetryEvents = z10;
    }

    @lm.a.c
    public void setCompositePerformanceCollector(@NotNull io.sentry.m mVar) {
        this.compositePerformanceCollector = mVar;
    }

    public void setConnectionStatusProvider(@NotNull u0 u0Var) {
        this.connectionStatusProvider = u0Var;
    }

    public void setConnectionTimeoutMillis(int i10) {
        this.connectionTimeoutMillis = i10;
    }

    public void setContinuousProfiler(@Nullable v0 v0Var) {
        if (this.continuousProfiler == y2.a() && v0Var != null) {
            this.continuousProfiler = v0Var;
        }
    }

    @lm.a.b
    public void setCron(@Nullable g gVar) {
        this.cron = gVar;
    }

    @lm.a.c
    public void setDateProvider(@NotNull f6 f6Var) {
        this.dateProvider.c(f6Var);
    }

    public void setDeadlineTimeout(long j10) {
        this.deadlineTimeout = j10;
    }

    public void setDebug(boolean z10) {
        this.debug = z10;
    }

    @lm.a.c
    public void setDebugMetaLoader(@Nullable io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.b();
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(@NotNull x4 x4Var) {
        this.defaultScopeType = x4Var;
    }

    public void setDiagnosticLevel(@Nullable y7 y7Var) {
        if (y7Var == null) {
            y7Var = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = y7Var;
    }

    public void setDist(@Nullable String str) {
        this.dist = str;
    }

    public void setDistinctId(@Nullable String str) {
        this.distinctId = str;
    }

    @lm.a.b
    public void setDistribution(@NotNull h hVar) {
        if (hVar == null) {
            hVar = new h();
        }
        this.distribution = hVar;
    }

    @lm.a.b
    public void setDistributionController(@Nullable w0 w0Var) {
        if (w0Var == null) {
            w0Var = z2.d();
        }
        this.distributionController = w0Var;
    }

    public void setDsn(@Nullable String str) {
        this.dsn = str;
        this.parsedDsn.b();
        this.dsnHash = io.sentry.util.h0.b(this.dsn, this.logger);
    }

    public void setEnableAppStartProfiling(boolean z10) {
        this.enableAppStartProfiling = z10;
    }

    public void setEnableAutoSessionTracking(boolean z10) {
        this.enableAutoSessionTracking = z10;
    }

    @lm.a.b
    public void setEnableBackpressureHandling(boolean z10) {
        this.enableBackpressureHandling = z10;
    }

    public void setEnableDeduplication(boolean z10) {
        this.enableDeduplication = z10;
    }

    public void setEnableExternalConfiguration(boolean z10) {
        this.enableExternalConfiguration = z10;
    }

    public void setEnablePrettySerializationOutput(boolean z10) {
        this.enablePrettySerializationOutput = z10;
    }

    public void setEnableScopePersistence(boolean z10) {
        this.enableScopePersistence = z10;
    }

    @lm.a.b
    public void setEnableScreenTracking(boolean z10) {
        this.enableScreenTracking = z10;
    }

    public void setEnableShutdownHook(boolean z10) {
        this.enableShutdownHook = z10;
    }

    @lm.a.b
    public void setEnableSpotlight(boolean z10) {
        this.enableSpotlight = z10;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z10) {
        this.enableTimeToFullDisplayTracing = z10;
    }

    public void setEnableUncaughtExceptionHandler(boolean z10) {
        this.enableUncaughtExceptionHandler = z10;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z10) {
        this.enableUserInteractionBreadcrumbs = z10;
    }

    public void setEnableUserInteractionTracing(boolean z10) {
        this.enableUserInteractionTracing = z10;
    }

    public void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public void setEnvelopeDiskCache(@Nullable io.sentry.cache.g gVar) {
        if (gVar == null) {
            gVar = io.sentry.transport.s.c();
        }
        this.envelopeDiskCache = gVar;
    }

    public void setEnvelopeReader(@Nullable x0 x0Var) {
        io.sentry.util.s<x0> sVar = this.envelopeReader;
        if (x0Var == null) {
            x0Var = a3.b();
        }
        sVar.c(x0Var);
    }

    public void setEnvironment(@Nullable String str) {
        this.environment = str;
    }

    @lm.a.c
    @lm.n
    public void setExecutorService(@NotNull l1 l1Var) {
        if (l1Var != null) {
            this.executorService = l1Var;
        }
    }

    @lm.a.b
    public void setFatalLogger(@Nullable ILogger iLogger) {
        if (iLogger == null) {
            iLogger = c3.e();
        }
        this.fatalLogger = iLogger;
    }

    public void setFeedbackOptions(@NotNull t7 t7Var) {
        this.feedbackOptions = t7Var;
    }

    public void setFlushTimeoutMillis(long j10) {
        this.flushTimeoutMillis = j10;
    }

    public void setForceInit(boolean z10) {
        this.forceInit = z10;
    }

    @lm.a.c
    @lm.n
    public void setFullyDisplayedReporter(@NotNull m0 m0Var) {
        this.fullyDisplayedReporter = m0Var;
    }

    public void setGestureTargetLocators(@NotNull List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(@Nullable Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(@Nullable Long l10) {
        this.idleTimeout = l10;
    }

    @lm.a.b
    public void setIgnoredCheckIns(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new l0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new l0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    @lm.a.b
    public void setIgnoredSpanOrigins(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new l0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    @lm.a.b
    public void setIgnoredTransactions(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new l0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    @lm.a.c
    public void setInitPriority(@NotNull v1 v1Var) {
        this.initPriority = v1Var;
    }

    @Deprecated
    public void setInstrumenter(@NotNull w1 w1Var) {
        this.instrumenter = w1Var;
    }

    public void setLogger(@Nullable ILogger iLogger) {
        this.logger = iLogger == null ? c3.e() : new w(this, iLogger);
    }

    @lm.a.b
    public void setLogs(@NotNull i iVar) {
        this.logs = iVar;
    }

    public void setMaxAttachmentSize(long j10) {
        this.maxAttachmentSize = j10;
    }

    public void setMaxBreadcrumbs(int i10) {
        this.maxBreadcrumbs = i10;
    }

    public void setMaxCacheItems(int i10) {
        this.maxCacheItems = i10;
    }

    public void setMaxDepth(int i10) {
        this.maxDepth = i10;
    }

    public void setMaxQueueSize(int i10) {
        if (i10 > 0) {
            this.maxQueueSize = i10;
        }
    }

    public void setMaxRequestBodySize(@NotNull m mVar) {
        this.maxRequestBodySize = mVar;
    }

    @lm.a.b
    public void setMaxSpans(int i10) {
        this.maxSpans = i10;
    }

    public void setMaxTraceFileSize(long j10) {
        this.maxTraceFileSize = j10;
    }

    @lm.a.c
    public void setModulesLoader(@Nullable io.sentry.internal.modules.b bVar) {
        if (bVar == null) {
            bVar = io.sentry.internal.modules.e.b();
        }
        this.modulesLoader = bVar;
    }

    public void setOnDiscard(@Nullable j jVar) {
        this.onDiscard = jVar;
    }

    public void setOpenTelemetryMode(@NotNull h8 h8Var) {
        this.openTelemetryMode = h8Var;
    }

    public void setPrintUncaughtStackTrace(boolean z10) {
        this.printUncaughtStackTrace = z10;
    }

    public void setProfileLifecycle(@NotNull i4 i4Var) {
        this.profileLifecycle = i4Var;
        if (i4Var != i4.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.c(y7.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(@Nullable Double d10) {
        if (io.sentry.util.d0.c(d10)) {
            this.profileSessionSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilesSampleRate(@Nullable Double d10) {
        if (io.sentry.util.d0.d(d10)) {
            this.profilesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(@Nullable k kVar) {
        this.profilesSampler = kVar;
    }

    public void setProfilingTracesDirPath(@Nullable String str) {
        this.profilingTracesDirPath = str;
    }

    @lm.a.c
    public void setProfilingTracesHz(int i10) {
        this.profilingTracesHz = i10;
    }

    public void setProguardUuid(@Nullable String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z10) {
        this.propagateTraceparent = z10;
    }

    public void setProxy(@Nullable l lVar) {
        this.proxy = lVar;
    }

    public void setReadTimeoutMillis(int i10) {
        this.readTimeoutMillis = i10;
    }

    public void setRelease(@Nullable String str) {
        this.release = str;
    }

    public void setReplayController(@Nullable o4 o4Var) {
        if (o4Var == null) {
            o4Var = e3.a();
        }
        this.replayController = o4Var;
    }

    public void setSampleRate(@Nullable Double d10) {
        if (io.sentry.util.d0.f(d10)) {
            this.sampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    @lm.a.c
    public void setSdkVersion(@Nullable io.sentry.protocol.p pVar) {
        io.sentry.protocol.p pVarI = getSessionReplay().i();
        io.sentry.protocol.p pVar2 = this.sdkVersion;
        if (pVar2 != null && pVarI != null && pVar2.equals(pVarI)) {
            getSessionReplay().y(pVar);
        }
        this.sdkVersion = pVar;
    }

    public void setSendClientReports(boolean z10) {
        this.sendClientReports = z10;
        if (z10) {
            this.clientReportRecorder = new io.sentry.clientreport.e(this);
        } else {
            this.clientReportRecorder = new io.sentry.clientreport.j();
        }
    }

    public void setSendDefaultPii(boolean z10) {
        this.sendDefaultPii = z10;
    }

    public void setSendModules(boolean z10) {
        this.sendModules = z10;
    }

    public void setSentryClientName(@Nullable String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(@Nullable n1 n1Var) {
        io.sentry.util.s<n1> sVar = this.serializer;
        if (n1Var == null) {
            n1Var = q3.g();
        }
        sVar.c(n1Var);
    }

    public void setServerName(@Nullable String str) {
        this.serverName = str;
    }

    @lm.a.c
    public void setSessionFlushTimeoutMillis(long j10) {
        this.sessionFlushTimeoutMillis = j10;
    }

    public void setSessionReplay(@NotNull p8 p8Var) {
        this.sessionReplay = p8Var;
    }

    public void setSessionTrackingIntervalMillis(long j10) {
        this.sessionTrackingIntervalMillis = j10;
    }

    public void setShutdownTimeoutMillis(long j10) {
        this.shutdownTimeoutMillis = j10;
    }

    public void setSocketTagger(@Nullable o1 o1Var) {
        if (o1Var == null) {
            o1Var = r3.c();
        }
        this.socketTagger = o1Var;
    }

    @lm.a.c
    public void setSpanFactory(@NotNull q1 q1Var) {
        this.spanFactory = q1Var;
    }

    @lm.a.b
    public void setSpotlightConnectionUrl(@Nullable String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z10) {
        this.startProfilerOnAppStart = z10;
    }

    public void setTag(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(@NotNull io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTraceOptionsRequests(boolean z10) {
        this.traceOptionsRequests = z10;
    }

    public void setTracePropagationTargets(@Nullable List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z10) {
        this.traceSampling = z10;
    }

    public void setTracesSampleRate(@Nullable Double d10) {
        if (io.sentry.util.d0.g(d10)) {
            this.tracesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(@Nullable n nVar) {
        this.tracesSampler = nVar;
    }

    public void setTransactionProfiler(@Nullable s1 s1Var) {
        if (this.transactionProfiler != v3.c() || s1Var == null) {
            return;
        }
        this.transactionProfiler = s1Var;
    }

    public void setTransportFactory(@Nullable t1 t1Var) {
        if (t1Var == null) {
            t1Var = w3.b();
        }
        this.transportFactory = t1Var;
    }

    public void setTransportGate(@Nullable io.sentry.transport.r rVar) {
        if (rVar == null) {
            rVar = io.sentry.transport.u.a();
        }
        this.transportGate = rVar;
    }

    @lm.a.c
    public void setVersionDetector(@NotNull u1 u1Var) {
        this.versionDetector = u1Var;
    }

    public void setViewHierarchyExporters(@NotNull List<io.sentry.internal.viewhierarchy.a> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    private n8(boolean z10) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        this.ignoredErrors = null;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.parsedDsn = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.i8
            @Override // io.sentry.util.s.a
            public final Object a() {
                return n8.c(this.f305560a);
            }
        });
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = c3.e();
        this.fatalLogger = c3.e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.j8
            @Override // io.sentry.util.s.a
            public final Object a() {
                return n8.e(this.f305656a);
            }
        });
        this.envelopeReader = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.k8
            @Override // io.sentry.util.s.a
            public final Object a() {
                return n8.d(this.f305777a);
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = w3.b();
        this.transportGate = io.sentry.transport.u.a();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = p3.g();
        this.connectionTimeoutMillis = SessionCommand.X;
        this.readTimeoutMillis = SessionCommand.X;
        this.envelopeDiskCache = io.sentry.transport.s.c();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = m.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = androidx.media3.datasource.cache.b.f62302k;
        this.transactionProfiler = v3.c();
        this.continuousProfiler = y2.a();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.idleTimeout = Long.valueOf(androidx.media3.common.j.f60679f2);
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.clientreport.e(this);
        this.modulesLoader = io.sentry.internal.modules.e.b();
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.b();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = w1.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.g();
        this.traceOptionsRequests = true;
        this.dateProvider = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.l8
            @Override // io.sentry.util.s.a
            public final Object a() {
                return n8.b();
            }
        });
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = w2.g();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = m0.a();
        this.connectionStatusProvider = new x2();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.c.b();
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = t3.c();
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = e3.a();
        this.distributionController = z2.d();
        this.enableScreenTracking = true;
        this.defaultScopeType = x4.ISOLATION;
        this.initPriority = v1.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new io.sentry.util.a();
        this.openTelemetryMode = h8.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = x3.b();
        this.profileLifecycle = i4.MANUAL;
        this.startProfilerOnAppStart = false;
        this.deadlineTimeout = 30000L;
        this.logs = new i();
        this.socketTagger = r3.c();
        this.distribution = new h();
        io.sentry.protocol.p pVarCreateSdkVersion = createSdkVersion();
        this.experimental = new j0(z10, pVarCreateSdkVersion);
        this.sessionReplay = new p8(z10, pVarCreateSdkVersion);
        this.feedbackOptions = new t7(new t7.a() { // from class: io.sentry.m8
            @Override // io.sentry.t7.a
            public final void a(io.sentry.protocol.v vVar, t7.b bVar) {
                this.f305882a.logger.c(y7.WARNING, "showDialog() can only be called in Android.", new Object[0]);
            }
        });
        if (z10) {
            return;
        }
        setSpanFactory(r9.a(new io.sentry.util.u(), c3.e()));
        s7 s7Var = new s7(this);
        this.executorService = s7Var;
        s7Var.a();
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new SpotlightIntegration());
        copyOnWriteArrayList.add(new n2(this));
        copyOnWriteArrayList.add(new c0(this));
        if (io.sentry.util.a0.c()) {
            copyOnWriteArrayList.add(new q8());
        }
        setSentryClientName("sentry.java/8.23.0");
        setSdkVersion(pVarCreateSdkVersion);
        f();
    }
}
