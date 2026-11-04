package io.sentry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class t5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f306818d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @lm.a.c
    @NotNull
    public static final String f306820f = "app_start_profiling_config";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static volatile j1 f306815a = k3.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static volatile i1 f306816b = i3.r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final g1 f306817c = new t4(n8.empty());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile boolean f306819e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Charset f306821g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f306822h = System.currentTimeMillis();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final io.sentry.util.a f306823i = new io.sentry.util.a();

    public interface a<T extends n8> {
        void a(@NotNull T t10);
    }

    private t5() {
    }

    @NotNull
    public static io.sentry.protocol.v A(@NotNull String str, @NotNull y7 y7Var) {
        return R().j0(str, y7Var);
    }

    @NotNull
    private static fa A0(@NotNull n8 n8Var) {
        ga gaVar = new ga("app.launch", "profile");
        gaVar.H(true);
        return n8Var.getInternalTracesSampler().a(new s4(gaVar, null, Double.valueOf(io.sentry.util.f0.a().g()), null));
    }

    @NotNull
    public static io.sentry.protocol.v B(@NotNull String str, @NotNull y7 y7Var, @NotNull v4 v4Var) {
        return R().J0(str, y7Var, v4Var);
    }

    @lm.a.c
    @Deprecated
    @NotNull
    public static m1 B0(@NotNull z0 z0Var) {
        return C0(z0Var);
    }

    public static void C(@NotNull na naVar) {
        R().t0(naVar);
    }

    @lm.a.c
    @NotNull
    public static m1 C0(@NotNull i1 i1Var) {
        return U().a(i1Var);
    }

    public static void D() {
        R().o();
    }

    public static void D0(@Nullable String str, @Nullable String str2) {
        R().d(str, str2);
    }

    public static void E() {
        m1 m1VarA = f306823i.a();
        try {
            i1 i1VarR = R();
            f306816b = i3.r();
            U().close();
            i1VarR.i(false);
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

    public static void E0(@NotNull List<String> list) {
        R().v(list);
    }

    public static void F(@NotNull v4 v4Var) {
        G(null, v4Var);
    }

    public static void F0(@Nullable y7 y7Var) {
        R().h(y7Var);
    }

    public static void G(@Nullable x4 x4Var, @NotNull v4 v4Var) {
        R().T0(x4Var, v4Var);
    }

    public static void G0(@Nullable String str, @Nullable String str2) {
        R().a(str, str2);
    }

    @Nullable
    public static ga H(@Nullable String str, @Nullable List<String> list) {
        return R().h1(str, list);
    }

    public static void H0(@Nullable String str) {
        R().l(str);
    }

    @NotNull
    public static w0 I() {
        return R().getScope().b().getDistributionController();
    }

    public static void I0(@Nullable io.sentry.protocol.g0 g0Var) {
        R().j(g0Var);
    }

    public static void J() {
        R().y();
    }

    public static void J0() {
        K0(null);
    }

    private static void K(@NotNull n8 n8Var, @NotNull i1 i1Var) {
        try {
            n8Var.getExecutorService().submit(new f4(n8Var, i1Var));
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.DEBUG, "Failed to finalize previous session.", th2);
        }
    }

    public static void K0(@Nullable t7.b bVar) {
        L0(null, bVar);
    }

    public static void L(long j10) {
        R().w(j10);
    }

    public static void L0(@Nullable io.sentry.protocol.v vVar, @Nullable t7.b bVar) {
        R().b().getFeedbackOptions().b().a(vVar, bVar);
    }

    @NotNull
    public static i1 M(@NotNull String str) {
        return R().W0(str);
    }

    @lm.a.b
    public static void M0() {
        R().a1();
    }

    @lm.a.c
    @NotNull
    public static i1 N(@NotNull String str) {
        return f306819e ? f306816b : f306816b.k1(str);
    }

    public static void N0() {
        R().u();
    }

    @NotNull
    public static i1 O(@NotNull String str) {
        return R().k1(str);
    }

    @NotNull
    public static r1 O0(@NotNull ga gaVar) {
        return R().c1(gaVar);
    }

    @Nullable
    public static e P() {
        return R().M0();
    }

    @NotNull
    public static r1 P0(@NotNull ga gaVar, @NotNull ia iaVar) {
        return R().E0(gaVar, iaVar);
    }

    @lm.a.c
    @Deprecated
    @NotNull
    public static z0 Q() {
        return new t0(R());
    }

    @NotNull
    public static r1 Q0(@NotNull String str, @NotNull String str2) {
        return R().D0(str, str2);
    }

    @lm.a.c
    @NotNull
    public static i1 R() {
        if (f306819e) {
            return f306816b;
        }
        i1 i1Var = U().get();
        if (i1Var != null && !i1Var.n0()) {
            return i1Var;
        }
        i1 i1VarK1 = f306816b.k1("getCurrentScopes");
        U().a(i1VarK1);
        return i1VarK1;
    }

    @NotNull
    public static r1 R0(@NotNull String str, @NotNull String str2, @NotNull ia iaVar) {
        return R().i1(str, str2, iaVar);
    }

    @NotNull
    public static g1 S() {
        return f306817c;
    }

    @NotNull
    public static r1 S0(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull ia iaVar) {
        r1 r1VarI1 = R().i1(str, str2, iaVar);
        r1VarI1.w(str3);
        return r1VarI1;
    }

    @NotNull
    public static io.sentry.protocol.v T() {
        return R().z();
    }

    @lm.a.b
    public static void T0() {
        R().u0();
    }

    @NotNull
    private static j1 U() {
        return f306815a;
    }

    public static void U0(@NotNull v4 v4Var) {
        R().C0(v4Var);
    }

    @Nullable
    public static p1 V() {
        return (f306819e && io.sentry.util.a0.a()) ? R().p() : R().e();
    }

    public static void V0(@NotNull v4 v4Var) {
        R().g1(v4Var);
    }

    @Nullable
    public static w8 W() {
        return R().P0();
    }

    private static void X(@NotNull final n8 n8Var, @NotNull l1 l1Var) {
        try {
            l1Var.submit(new Runnable() { // from class: io.sentry.n5
                @Override // java.lang.Runnable
                public final void run() {
                    t5.a(n8Var);
                }
            });
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th2);
        }
    }

    public static void Y() {
        c0(new a() { // from class: io.sentry.p5
            @Override // io.sentry.t5.a
            public final void a(n8 n8Var) {
                n8Var.setEnableExternalConfiguration(true);
            }
        }, false);
    }

    public static <T extends n8> void Z(@NotNull a4<T> a4Var, @NotNull a<T> aVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        a0(a4Var, aVar, false);
    }

    public static /* synthetic */ void a(n8 n8Var) {
        String cacheDirPathWithoutDsn = n8Var.getCacheDirPathWithoutDsn();
        if (cacheDirPathWithoutDsn != null) {
            File file = new File(cacheDirPathWithoutDsn, f306820f);
            try {
                io.sentry.util.i.a(file);
                if (n8Var.isEnableAppStartProfiling() || n8Var.isStartProfilerOnAppStart()) {
                    if (!n8Var.isStartProfilerOnAppStart() && !n8Var.isTracingEnabled()) {
                        n8Var.getLogger().c(y7.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                        return;
                    }
                    if (file.createNewFile()) {
                        u5 u5Var = new u5(n8Var, n8Var.isEnableAppStartProfiling() ? A0(n8Var) : new fa(Boolean.FALSE));
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f306821g));
                            try {
                                n8Var.getSerializer().a(u5Var, bufferedWriter);
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    bufferedWriter.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    }
                }
            } catch (Throwable th6) {
                n8Var.getLogger().a(y7.ERROR, "Unable to create app start profiling config file. ", th6);
            }
        }
    }

    public static <T extends n8> void a0(@NotNull a4<T> a4Var, @NotNull a<T> aVar, boolean z10) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        T tB = a4Var.b();
        k(aVar, tB);
        e0(tB, z10);
    }

    public static void b0(@NotNull a<n8> aVar) {
        c0(aVar, false);
    }

    public static void c0(@NotNull a<n8> aVar, boolean z10) {
        n8 n8Var = new n8();
        k(aVar, n8Var);
        e0(n8Var, z10);
    }

    public static /* synthetic */ void d(n8 n8Var) {
        for (a1 a1Var : n8Var.getOptionsObservers()) {
            a1Var.h(n8Var.getRelease());
            a1Var.e(n8Var.getProguardUuid());
            a1Var.f(n8Var.getSdkVersion());
            a1Var.c(n8Var.getDist());
            a1Var.d(n8Var.getEnvironment());
            a1Var.b(n8Var.getTags());
            a1Var.g(n8Var.getSessionReplay().g());
        }
        io.sentry.cache.w wVarFindPersistingScopeObserver = n8Var.findPersistingScopeObserver();
        if (wVarFindPersistingScopeObserver != null) {
            wVarFindPersistingScopeObserver.I();
        }
    }

    @lm.a.c
    public static void d0(@NotNull n8 n8Var) {
        e0(n8Var, false);
    }

    private static void e0(@NotNull final n8 n8Var, boolean z10) {
        m1 m1VarA = f306823i.a();
        try {
            if (!n8Var.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.a0.a()) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. " + n8Var.getClass().getName());
            }
            if (!t0(n8Var)) {
                if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
                return;
            }
            Boolean boolIsGlobalHubMode = n8Var.isGlobalHubMode();
            if (boolIsGlobalHubMode != null) {
                z10 = boolIsGlobalHubMode.booleanValue();
            }
            n8Var.getLogger().c(y7.INFO, "GlobalHubMode: '%s'", String.valueOf(z10));
            f306819e = z10;
            h0(n8Var);
            g1 g1Var = f306817c;
            if (io.sentry.util.p.a(g1Var.b(), n8Var, n0())) {
                if (n0()) {
                    n8Var.getLogger().c(y7.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                R().i(true);
                g1Var.U(n8Var);
                f306816b = new g5(new t4(n8Var), new t4(n8Var), g1Var, "Sentry.init");
                k0(n8Var);
                i0(n8Var);
                U().a(f306816b);
                g0(n8Var);
                g1Var.s(new c6(n8Var));
                if (n8Var.getExecutorService().isClosed()) {
                    n8Var.setExecutorService(new s7(n8Var));
                    n8Var.getExecutorService().a();
                }
                try {
                    n8Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.r5
                        @Override // java.lang.Runnable
                        public final void run() {
                            n8Var.loadLazyFields();
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    n8Var.getLogger().a(y7.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e10);
                }
                q0(n8Var);
                for (x1 x1Var : n8Var.getIntegrations()) {
                    try {
                        x1Var.c(h5.q(), n8Var);
                    } catch (Throwable th2) {
                        n8Var.getLogger().a(y7.WARNING, "Failed to register the integration " + x1Var.getClass().getName(), th2);
                    }
                }
                r0(n8Var);
                K(n8Var, h5.q());
                X(n8Var, n8Var.getExecutorService());
                ILogger logger = n8Var.getLogger();
                y7 y7Var = y7.DEBUG;
                logger.c(y7Var, "Using openTelemetryMode %s", n8Var.getOpenTelemetryMode());
                n8Var.getLogger().c(y7Var, "Using span factory %s", n8Var.getSpanFactory().getClass().getName());
                n8Var.getLogger().c(y7Var, "Using scopes storage %s", f306815a.getClass().getName());
            } else {
                n8Var.getLogger().c(y7.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th3) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static /* synthetic */ void f(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.lastModified() < f306822h - TimeUnit.MINUTES.toMillis(5L)) {
                io.sentry.util.i.a(file2);
            }
        }
    }

    public static void f0(@NotNull final String str) {
        b0(new a() { // from class: io.sentry.s5
            @Override // io.sentry.t5.a
            public final void a(n8 n8Var) {
                n8Var.setDsn(str);
            }
        });
    }

    public static void g(@NotNull f fVar) {
        R().k(fVar);
    }

    private static void g0(@NotNull n8 n8Var) {
        ILogger logger = n8Var.getLogger();
        y7 y7Var = y7.INFO;
        logger.c(y7Var, "Initializing SDK with DSN: '%s'", n8Var.getDsn());
        String outboxPath = n8Var.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.c(y7Var, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = n8Var.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (n8Var.getEnvelopeDiskCache() instanceof io.sentry.transport.s) {
                n8Var.setEnvelopeDiskCache(io.sentry.cache.f.C(n8Var));
            }
        }
        String profilingTracesDirPath = n8Var.getProfilingTracesDirPath();
        if ((n8Var.isProfilingEnabled() || n8Var.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            final File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                n8Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.o5
                    @Override // java.lang.Runnable
                    public final void run() {
                        t5.f(file);
                    }
                });
            } catch (RejectedExecutionException e10) {
                n8Var.getLogger().a(y7.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e10);
            }
        }
        io.sentry.internal.modules.b modulesLoader = n8Var.getModulesLoader();
        if (!n8Var.isSendModules()) {
            n8Var.setModulesLoader(io.sentry.internal.modules.e.b());
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            n8Var.setModulesLoader(new io.sentry.internal.modules.a(Arrays.asList(new io.sentry.internal.modules.c(n8Var.getLogger()), new io.sentry.internal.modules.f(n8Var.getLogger())), n8Var.getLogger()));
        }
        if (n8Var.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            n8Var.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(n8Var.getLogger()));
        }
        io.sentry.util.e.a(n8Var, n8Var.getDebugMetaLoader().a());
        if (n8Var.getThreadChecker() instanceof io.sentry.util.thread.b) {
            n8Var.setThreadChecker(io.sentry.util.thread.c.g());
        }
        if (n8Var.getPerformanceCollectors().isEmpty()) {
            n8Var.addPerformanceCollector(new z1());
        }
        if (n8Var.isEnableBackpressureHandling() && io.sentry.util.a0.c()) {
            if (n8Var.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                n8Var.setBackpressureMonitor(new io.sentry.backpressure.a(n8Var, h5.q()));
            }
            n8Var.getBackpressureMonitor().start();
        }
        j0(n8Var);
        n8Var.getLogger().c(y7.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(n8Var.isContinuousProfilingEnabled()), n8Var.getProfileLifecycle());
    }

    public static void h(@NotNull f fVar, @Nullable n0 n0Var) {
        R().m(fVar, n0Var);
    }

    private static void h0(@NotNull n8 n8Var) {
        if (n8Var.getFatalLogger() instanceof c3) {
            n8Var.setFatalLogger(new ca());
        }
    }

    public static void i(@NotNull String str) {
        R().z0(str);
    }

    private static void i0(n8 n8Var) {
        io.sentry.opentelemetry.a.c(n8Var, new io.sentry.util.u());
        if (h8.OFF == n8Var.getOpenTelemetryMode()) {
            n8Var.setSpanFactory(new u());
        }
        l0(n8Var);
        io.sentry.opentelemetry.a.a(n8Var);
    }

    public static void j(@NotNull String str, @NotNull String str2) {
        R().L0(str, str2);
    }

    private static void j0(@NotNull n8 n8Var) {
        if (n8Var.isContinuousProfilingEnabled() && n8Var.getContinuousProfiler() == y2.a()) {
            try {
                String profilingTracesDirPath = n8Var.getProfilingTracesDirPath();
                if (profilingTracesDirPath == null) {
                    File file = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
                    if (!file.mkdirs() && !file.exists()) {
                        throw new IllegalArgumentException("Creating a fallback directory for profiling failed in " + file.getAbsolutePath());
                    }
                    profilingTracesDirPath = file.getAbsolutePath();
                    n8Var.setProfilingTracesDirPath(profilingTracesDirPath);
                }
                n8Var.setContinuousProfiler(io.sentry.profiling.c.a(new ca(), profilingTracesDirPath, n8Var.getProfilingTracesHz(), n8Var.getExecutorService()));
            } catch (Exception e10) {
                n8Var.getLogger().a(y7.ERROR, "Failed to create default profiling traces directory", e10);
            }
        }
    }

    private static <T extends n8> void k(a<T> aVar, T t10) {
        try {
            aVar.a(t10);
        } catch (Throwable th2) {
            t10.getLogger().a(y7.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
    }

    private static void k0(@NotNull n8 n8Var) {
        if (n8Var.isDebug() && (n8Var.getLogger() instanceof c3)) {
            n8Var.setLogger(new ca());
        }
    }

    public static void l(@NotNull k1 k1Var) {
        R().s(k1Var);
    }

    private static void l0(n8 n8Var) {
        U().close();
        if (h8.OFF == n8Var.getOpenTelemetryMode()) {
            f306815a = new t();
        } else {
            f306815a = i5.a(new io.sentry.util.u(), c3.e());
        }
    }

    @NotNull
    public static io.sentry.protocol.v m(@NotNull h hVar) {
        return R().K0(hVar);
    }

    @Nullable
    public static Boolean m0() {
        return R().H0();
    }

    @NotNull
    public static io.sentry.protocol.v n(@NotNull o7 o7Var) {
        return R().l0(o7Var);
    }

    public static boolean n0() {
        return R().isEnabled();
    }

    @NotNull
    public static io.sentry.protocol.v o(@NotNull o7 o7Var, @Nullable n0 n0Var) {
        return R().o0(o7Var, n0Var);
    }

    public static boolean o0() {
        return R().L();
    }

    @NotNull
    public static io.sentry.protocol.v p(@NotNull o7 o7Var, @Nullable n0 n0Var, @NotNull v4 v4Var) {
        return R().I0(o7Var, n0Var, v4Var);
    }

    @NotNull
    public static io.sentry.logger.a p0() {
        return R().V0();
    }

    @NotNull
    public static io.sentry.protocol.v q(@NotNull o7 o7Var, @NotNull v4 v4Var) {
        return R().Z0(o7Var, v4Var);
    }

    private static void q0(@NotNull n8 n8Var) {
        try {
            n8Var.getExecutorService().submit(new v2(n8Var));
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.DEBUG, "Failed to move previous session.", th2);
        }
    }

    @NotNull
    public static io.sentry.protocol.v r(@NotNull Throwable th2) {
        return R().m0(th2);
    }

    private static void r0(@NotNull final n8 n8Var) {
        try {
            n8Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.q5
                @Override // java.lang.Runnable
                public final void run() {
                    t5.d(n8Var);
                }
            });
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.DEBUG, "Failed to notify options observers.", th2);
        }
    }

    @NotNull
    public static io.sentry.protocol.v s(@NotNull Throwable th2, @Nullable n0 n0Var) {
        return R().r0(th2, n0Var);
    }

    @Deprecated
    public static void s0() {
        if (!f306819e) {
            R().y0();
        }
    }

    @NotNull
    public static io.sentry.protocol.v t(@NotNull Throwable th2, @Nullable n0 n0Var, @NotNull v4 v4Var) {
        return R().R0(th2, n0Var, v4Var);
    }

    private static boolean t0(@NotNull n8 n8Var) {
        if (n8Var.isEnableExternalConfiguration()) {
            n8Var.merge(k0.g(io.sentry.config.h.a(), n8Var.getLogger()));
        }
        String dsn = n8Var.getDsn();
        if (!n8Var.isEnabled() || (dsn != null && dsn.isEmpty())) {
            E();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        n8Var.retrieveParsedDsn();
        return true;
    }

    @NotNull
    public static io.sentry.protocol.v u(@NotNull Throwable th2, @NotNull v4 v4Var) {
        return R().F0(th2, v4Var);
    }

    @NotNull
    public static m1 u0() {
        return !f306819e ? R().j1() : j3.a();
    }

    @NotNull
    public static io.sentry.protocol.v v(@NotNull io.sentry.protocol.f fVar) {
        return R().Q0(fVar);
    }

    @NotNull
    public static m1 v0() {
        return !f306819e ? R().U0() : j3.a();
    }

    @NotNull
    public static io.sentry.protocol.v w(@NotNull io.sentry.protocol.f fVar, @Nullable n0 n0Var) {
        return R().B0(fVar, n0Var);
    }

    public static void w0(@Nullable String str) {
        R().c(str);
    }

    @NotNull
    public static io.sentry.protocol.v x(@NotNull io.sentry.protocol.f fVar, @Nullable n0 n0Var, @Nullable v4 v4Var) {
        return R().x0(fVar, n0Var, v4Var);
    }

    public static void x0(@Nullable String str) {
        R().f(str);
    }

    @NotNull
    public static io.sentry.protocol.v y(@NotNull String str) {
        return R().X0(str);
    }

    @NotNull
    public static f1 y0() {
        return R().getScope().b().getReplayController();
    }

    @NotNull
    public static io.sentry.protocol.v z(@NotNull String str, @NotNull v4 v4Var) {
        return R().A0(str, v4Var);
    }

    public static void z0() {
        R().d1();
    }
}
