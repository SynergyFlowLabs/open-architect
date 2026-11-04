package io.sentry;

import java.io.Closeable;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class g5 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f305486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g1 f305487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g1 f305488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final g5 f305489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f305490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final m f305491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final l f305492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final io.sentry.logger.a f305493h;

    public g5(@NotNull g1 g1Var, @NotNull g1 g1Var2, @NotNull g1 g1Var3, @NotNull String str) {
        this(g1Var, g1Var2, g1Var3, null, str);
    }

    private void F(@NotNull o7 o7Var) {
        N().Q(o7Var);
    }

    @NotNull
    private g1 G(@NotNull g1 g1Var, @Nullable v4 v4Var) {
        if (v4Var != null) {
            try {
                g1 g1VarM777clone = g1Var.m781clone();
                v4Var.a(g1VarM777clone);
                return g1VarM777clone;
            } catch (Throwable th2) {
                b().getLogger().a(y7.ERROR, "Error in the 'ScopeCallback' callback.", th2);
            }
        }
        return g1Var;
    }

    @NotNull
    private io.sentry.protocol.v H(@NotNull o7 o7Var, @Nullable n0 n0Var, @Nullable v4 v4Var) {
        io.sentry.protocol.v vVarR = io.sentry.protocol.v.f306474b;
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return vVarR;
        }
        if (o7Var == null) {
            b().getLogger().c(y7.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return vVarR;
        }
        try {
            F(o7Var);
            vVarR = M().r(o7Var, G(N(), v4Var), n0Var);
            Q(vVarR);
            return vVarR;
        } catch (Throwable th2) {
            b().getLogger().a(y7.ERROR, "Error while capturing event with id: " + o7Var.I(), th2);
            return vVarR;
        }
    }

    @NotNull
    private io.sentry.protocol.v I(@NotNull Throwable th2, @Nullable n0 n0Var, @Nullable v4 v4Var) {
        io.sentry.protocol.v vVarR = io.sentry.protocol.v.f306474b;
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th2 == null) {
            b().getLogger().c(y7.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                o7 o7Var = new o7(th2);
                F(o7Var);
                vVarR = M().r(o7Var, G(N(), v4Var), n0Var);
            } catch (Throwable th3) {
                b().getLogger().a(y7.ERROR, "Error while capturing exception: " + th2.getMessage(), th3);
            }
        }
        Q(vVarR);
        return vVarR;
    }

    @NotNull
    private io.sentry.protocol.v J(@NotNull String str, @NotNull y7 y7Var, @Nullable v4 v4Var) {
        io.sentry.protocol.v vVarQ = io.sentry.protocol.v.f306474b;
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            b().getLogger().c(y7.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                vVarQ = M().q(str, y7Var, G(N(), v4Var));
            } catch (Throwable th2) {
                b().getLogger().a(y7.ERROR, "Error while capturing message: " + str, th2);
            }
        }
        Q(vVarQ);
        return vVarQ;
    }

    @NotNull
    private r1 K(@NotNull ga gaVar, @NotNull ia iaVar) {
        r1 r1VarR;
        io.sentry.util.y.c(gaVar, "transactionContext is required");
        gaVar.u(iaVar.a());
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            r1VarR = u3.R();
        } else if (io.sentry.util.g0.b(b().getIgnoredSpanOrigins(), gaVar.g())) {
            b().getLogger().c(y7.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", gaVar.g());
            r1VarR = u3.R();
        } else if (!b().getInstrumenter().equals(gaVar.e())) {
            b().getLogger().c(y7.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", gaVar.e(), b().getInstrumenter());
            r1VarR = u3.R();
        } else if (b().isTracingEnabled()) {
            fa faVarA = b().getInternalTracesSampler().a(new s4(gaVar, iaVar.m(), P(gaVar), null));
            gaVar.y(faVarA);
            q1 q1VarP = iaVar.p();
            if (q1VarP == null) {
                q1VarP = b().getSpanFactory();
            }
            if (faVarA.e().booleanValue() && b().isContinuousProfilingEnabled()) {
                i4 profileLifecycle = b().getProfileLifecycle();
                i4 i4Var = i4.TRACE;
                if (profileLifecycle == i4Var && gaVar.j().equals(io.sentry.protocol.v.f306474b)) {
                    b().getContinuousProfiler().j(i4Var, b().getInternalTracesSampler());
                }
            }
            r1 r1VarB = q1VarP.b(gaVar, this, iaVar, this.f305491f);
            if (faVarA.e().booleanValue() && faVarA.b().booleanValue()) {
                s1 transactionProfiler = b().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.a(r1VarB);
                } else if (iaVar.r()) {
                    transactionProfiler.a(r1VarB);
                }
            }
            r1VarR = r1VarB;
        } else {
            b().getLogger().c(y7.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            r1VarR = u3.R();
        }
        if (iaVar.s()) {
            r1VarR.q0();
        }
        return r1VarR;
    }

    @NotNull
    private Double P(@NotNull ga gaVar) {
        Double dQ;
        d dVarB = gaVar.b();
        return (dVarB == null || (dQ = dVarB.q()) == null) ? N().c0().g() : dQ;
    }

    private void Q(@NotNull io.sentry.protocol.v vVar) {
        N().i0(vVar);
    }

    private static void R(@NotNull n8 n8Var) {
        io.sentry.util.y.c(n8Var, "SentryOptions is required.");
        if (n8Var.getDsn() == null || n8Var.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
    }

    @Override // io.sentry.i1
    public void C0(@NotNull v4 v4Var) {
        if (!isEnabled()) {
            try {
                v4Var.a(g3.w());
                return;
            } catch (Throwable th2) {
                b().getLogger().a(y7.ERROR, "Error in the 'withIsolationScope' callback.", th2);
                return;
            }
        }
        i1 i1VarK1 = k1("withIsolationScope");
        try {
            m1 m1VarQ0 = i1VarK1.q0();
            try {
                v4Var.a(i1VarK1.e1());
                if (m1VarQ0 != null) {
                    m1VarQ0.close();
                }
            } catch (Throwable th3) {
                if (m1VarQ0 != null) {
                    try {
                        m1VarQ0.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            b().getLogger().a(y7.ERROR, "Error in the 'withIsolationScope' callback.", th5);
        }
    }

    @Override // io.sentry.i1
    @NotNull
    public r1 E0(@NotNull ga gaVar, @NotNull ia iaVar) {
        return K(gaVar, iaVar);
    }

    @Override // io.sentry.i1
    @lm.a.c
    @Nullable
    public i1 G0() {
        return this.f305489d;
    }

    @Override // io.sentry.i1
    @Nullable
    public Boolean H0() {
        return d6.a().b(b().getCacheDirPath(), !b().isEnableAutoSessionTracking());
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v I0(@NotNull o7 o7Var, @Nullable n0 n0Var, @NotNull v4 v4Var) {
        return H(o7Var, n0Var, v4Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v J0(@NotNull String str, @NotNull y7 y7Var, @NotNull v4 v4Var) {
        return J(str, y7Var, v4Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v K0(@NotNull h hVar) {
        io.sentry.protocol.v vVarP = io.sentry.protocol.v.f306474b;
        if (isEnabled()) {
            try {
                vVarP = M().p(hVar, N(), null);
            } catch (Throwable th2) {
                b().getLogger().a(y7.ERROR, "Error while capturing check-in for slug", th2);
            }
        } else {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'captureCheckIn' call is a no-op.", new Object[0]);
        }
        Q(vVarP);
        return vVarP;
    }

    @Override // io.sentry.i1
    public boolean L() {
        return M().L();
    }

    @lm.a.c
    @NotNull
    public k1 M() {
        return N().O();
    }

    @Override // io.sentry.i1
    @Nullable
    public e M0() {
        if (isEnabled()) {
            io.sentry.util.o0.c cVarN = io.sentry.util.o0.n(this, null, e());
            if (cVarN != null) {
                return cVarN.a();
            }
        } else {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'getBaggage' call is a no-op.", new Object[0]);
        }
        return null;
    }

    @lm.a.c
    @NotNull
    public g1 N() {
        return this.f305492g;
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public io.sentry.protocol.v N0(@NotNull io.sentry.protocol.c0 c0Var, @Nullable da daVar, @Nullable n0 n0Var, @Nullable k4 k4Var) {
        io.sentry.protocol.c0 c0Var2;
        io.sentry.util.y.c(c0Var, "transaction is required");
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        } else if (!c0Var.B0()) {
            b().getLogger().c(y7.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", c0Var.I());
        } else if (Boolean.TRUE.equals(Boolean.valueOf(c0Var.C0()))) {
            try {
                c0Var2 = c0Var;
                try {
                    return M().l(c0Var2, daVar, N(), n0Var, k4Var);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    b().getLogger().a(y7.ERROR, "Error while capturing transaction with id: " + c0Var2.I(), th3);
                    return vVar;
                }
            } catch (Throwable th4) {
                th = th4;
                c0Var2 = c0Var;
            }
        } else {
            b().getLogger().c(y7.DEBUG, "Transaction %s was dropped due to sampling decision.", c0Var.I());
            if (b().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.h clientReportRecorder = b().getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.BACKPRESSURE;
                clientReportRecorder.a(fVar, o.Transaction);
                b().getClientReportRecorder().b(fVar, o.Span, c0Var.v0().size() + 1);
            } else {
                io.sentry.clientreport.h clientReportRecorder2 = b().getClientReportRecorder();
                io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.SAMPLE_RATE;
                clientReportRecorder2.a(fVar2, o.Transaction);
                b().getClientReportRecorder().b(fVar2, o.Span, c0Var.v0().size() + 1);
            }
        }
        return vVar;
    }

    @NotNull
    public String O() {
        return this.f305490e;
    }

    @Override // io.sentry.i1
    @NotNull
    public i1 O0(@NotNull String str) {
        return t5.N(str);
    }

    @Override // io.sentry.i1
    @Nullable
    public w8 P0() {
        if (isEnabled()) {
            io.sentry.util.o0.c cVarN = io.sentry.util.o0.n(this, null, e());
            if (cVarN != null) {
                return cVarN.b();
            }
        } else {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'getTraceparent' call is a no-op.", new Object[0]);
        }
        return null;
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v R0(@NotNull Throwable th2, @Nullable n0 n0Var, @NotNull v4 v4Var) {
        return I(th2, n0Var, v4Var);
    }

    @Override // io.sentry.i1
    public void T0(@Nullable x4 x4Var, @NotNull v4 v4Var) {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            v4Var.a(this.f305492g.w(x4Var));
        } catch (Throwable th2) {
            b().getLogger().a(y7.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.i1
    public m1 U0() {
        if (isEnabled()) {
            return W0("pushScope").q0();
        }
        b().getLogger().c(y7.WARNING, "Instance is disabled and this 'pushScope' call is a no-op.", new Object[0]);
        return j3.a();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.logger.a V0() {
        return this.f305493h;
    }

    @Override // io.sentry.i1
    @NotNull
    public i1 W0(@NotNull String str) {
        return new g5(this.f305486a.m781clone(), this.f305487b, this.f305488c, this, str);
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public io.sentry.protocol.v Y0(@NotNull g4 g4Var) {
        io.sentry.util.y.c(g4Var, "profilingContinuousData is required");
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
        if (isEnabled()) {
            try {
                return M().e(g4Var, getScope());
            } catch (Throwable th2) {
                b().getLogger().a(y7.ERROR, "Error while capturing profile chunk with id: " + g4Var.n(), th2);
            }
        } else {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        }
        return vVar;
    }

    @Override // io.sentry.i1
    public void a(@Nullable String str, @Nullable String str2) {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            b().getLogger().c(y7.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            N().a(str, str2);
        }
    }

    @Override // io.sentry.i1
    public void a1() {
        if (!b().isContinuousProfilingEnabled()) {
            if (b().isProfilingEnabled()) {
                b().getLogger().c(y7.WARNING, "Continuous Profiling is not enabled. Set profilesSampleRate and profilesSampler to null to enable it.", new Object[0]);
            }
        } else {
            i4 profileLifecycle = b().getProfileLifecycle();
            i4 i4Var = i4.MANUAL;
            if (profileLifecycle != i4Var) {
                b().getLogger().c(y7.WARNING, "Profiling lifecycle is %s. Profiling cannot be started manually.", b().getProfileLifecycle().name());
            } else {
                b().getContinuousProfiler().j(i4Var, b().getInternalTracesSampler());
            }
        }
    }

    @Override // io.sentry.i1
    @NotNull
    public n8 b() {
        return this.f305492g.b();
    }

    @Override // io.sentry.i1
    @lm.a.c
    public boolean b1(@Nullable i1 i1Var) {
        if (i1Var == null) {
            return false;
        }
        if (this == i1Var) {
            return true;
        }
        if (i1Var.G0() != null) {
            return b1(i1Var.G0());
        }
        return false;
    }

    @Override // io.sentry.i1
    public void c(@Nullable String str) {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'removeExtra' call is a no-op.", new Object[0]);
        } else if (str == null) {
            b().getLogger().c(y7.WARNING, "removeExtra called with null parameter.", new Object[0]);
        } else {
            N().c(str);
        }
    }

    @Override // io.sentry.i1
    public void close() {
        i(false);
    }

    @Override // io.sentry.i1
    public void d(@Nullable String str, @Nullable String str2) {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'setExtra' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            b().getLogger().c(y7.WARNING, "setExtra called with null parameter.", new Object[0]);
        } else {
            N().d(str, str2);
        }
    }

    @Override // io.sentry.i1
    public void d1() {
        if (b().isEnableTimeToFullDisplayTracing()) {
            b().getFullyDisplayedReporter().c();
        }
    }

    @Override // io.sentry.i1
    @Nullable
    public p1 e() {
        if (isEnabled()) {
            return N().e();
        }
        b().getLogger().c(y7.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public g1 e1() {
        return this.f305487b;
    }

    @Override // io.sentry.i1
    public void f(@Nullable String str) {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'removeTag' call is a no-op.", new Object[0]);
        } else if (str == null) {
            b().getLogger().c(y7.WARNING, "removeTag called with null parameter.", new Object[0]);
        } else {
            N().f(str);
        }
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public g1 g() {
        return this.f305488c;
    }

    @Override // io.sentry.i1
    public void g1(@NotNull v4 v4Var) {
        if (!isEnabled()) {
            try {
                v4Var.a(g3.w());
                return;
            } catch (Throwable th2) {
                b().getLogger().a(y7.ERROR, "Error in the 'withScope' callback.", th2);
                return;
            }
        }
        i1 i1VarW0 = W0("withScope");
        try {
            m1 m1VarQ0 = i1VarW0.q0();
            try {
                v4Var.a(i1VarW0.getScope());
                if (m1VarQ0 != null) {
                    m1VarQ0.close();
                }
            } catch (Throwable th3) {
                if (m1VarQ0 != null) {
                    try {
                        m1VarQ0.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            b().getLogger().a(y7.ERROR, "Error in the 'withScope' callback.", th5);
        }
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public g1 getScope() {
        return this.f305486a;
    }

    @Override // io.sentry.i1
    public void h(@Nullable y7 y7Var) {
        if (isEnabled()) {
            N().h(y7Var);
        } else {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'setLevel' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.i1
    @Nullable
    public ga h1(@Nullable String str, @Nullable List<String> list) {
        final m4 m4VarC = m4.c(b().getLogger(), str, list);
        v0(new v4() { // from class: io.sentry.f5
            @Override // io.sentry.v4
            public final void a(g1 g1Var) {
                g1Var.g0(new t4.a() { // from class: io.sentry.y4
                    @Override // io.sentry.t4.a
                    public final void a(m4 m4Var) {
                        g1Var.T(m4Var);
                    }
                });
            }
        });
        if (b().isTracingEnabled()) {
            return ga.B(m4VarC);
        }
        return null;
    }

    @Override // io.sentry.i1
    public void i(final boolean z10) {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (x1 x1Var : b().getIntegrations()) {
                if (x1Var instanceof Closeable) {
                    try {
                        ((Closeable) x1Var).close();
                    } catch (Throwable th2) {
                        b().getLogger().c(y7.WARNING, "Failed to close the integration {}.", x1Var, th2);
                    }
                }
            }
            v0(new v4() { // from class: io.sentry.z4
                @Override // io.sentry.v4
                public final void a(g1 g1Var) {
                    g1Var.clear();
                }
            });
            T0(x4.ISOLATION, new v4() { // from class: io.sentry.a5
                @Override // io.sentry.v4
                public final void a(g1 g1Var) {
                    g1Var.clear();
                }
            });
            b().getBackpressureMonitor().close();
            b().getTransactionProfiler().close();
            b().getContinuousProfiler().i(true);
            b().getCompositePerformanceCollector().close();
            b().getConnectionStatusProvider().close();
            final l1 executorService = b().getExecutorService();
            if (z10) {
                try {
                    executorService.submit(new Runnable() { // from class: io.sentry.b5
                        @Override // java.lang.Runnable
                        public final void run() {
                            executorService.c(this.f305128a.b().getShutdownTimeoutMillis());
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    b().getLogger().a(y7.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e10);
                    executorService.c(b().getShutdownTimeoutMillis());
                }
            } else {
                executorService.c(b().getShutdownTimeoutMillis());
            }
            T0(x4.CURRENT, new v4() { // from class: io.sentry.c5
                @Override // io.sentry.v4
                public final void a(g1 g1Var) {
                    g1Var.O().i(z10);
                }
            });
            T0(x4.ISOLATION, new v4() { // from class: io.sentry.d5
                @Override // io.sentry.v4
                public final void a(g1 g1Var) {
                    g1Var.O().i(z10);
                }
            });
            T0(x4.GLOBAL, new v4() { // from class: io.sentry.e5
                @Override // io.sentry.v4
                public final void a(g1 g1Var) {
                    g1Var.O().i(z10);
                }
            });
        } catch (Throwable th3) {
            b().getLogger().a(y7.ERROR, "Error while closing the Scopes.", th3);
        }
    }

    @Override // io.sentry.i1
    @lm.a.c
    @Nullable
    public io.sentry.transport.a0 i0() {
        return M().i0();
    }

    @Override // io.sentry.i1
    public boolean isEnabled() {
        return M().isEnabled();
    }

    @Override // io.sentry.i1
    public void j(@Nullable io.sentry.protocol.g0 g0Var) {
        if (isEnabled()) {
            N().j(g0Var);
        } else {
            int i10 = 4 ^ 0;
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v j0(@NotNull String str, @NotNull y7 y7Var) {
        return J(str, y7Var, null);
    }

    @Override // io.sentry.i1
    public m1 j1() {
        if (isEnabled()) {
            return k1("pushIsolationScope").q0();
        }
        b().getLogger().c(y7.WARNING, "Instance is disabled and this 'pushIsolationScope' call is a no-op.", new Object[0]);
        return j3.a();
    }

    @Override // io.sentry.i1
    public void k(@NotNull f fVar) {
        m(fVar, new n0());
    }

    @Override // io.sentry.i1
    @NotNull
    public i1 k1(@NotNull String str) {
        return new g5(this.f305486a.m781clone(), this.f305487b.m781clone(), this.f305488c, this, str);
    }

    @Override // io.sentry.i1
    public void l(@Nullable String str) {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'setTransaction' call is a no-op.", new Object[0]);
        } else if (str != null) {
            N().l(str);
        } else {
            b().getLogger().c(y7.WARNING, "Transaction cannot be null", new Object[0]);
        }
    }

    @Override // io.sentry.i1
    public void m(@NotNull f fVar, @Nullable n0 n0Var) {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (fVar == null) {
            b().getLogger().c(y7.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            N().m(fVar, n0Var);
        }
    }

    @Override // io.sentry.i1
    @lm.a.c
    public void n(@NotNull Throwable th2, @NotNull p1 p1Var, @NotNull String str) {
        N().n(th2, p1Var, str);
    }

    @Override // io.sentry.i1
    public void o() {
        if (isEnabled()) {
            N().o();
        } else {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'clearBreadcrumbs' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v o0(@NotNull o7 o7Var, @Nullable n0 n0Var) {
        return H(o7Var, n0Var, null);
    }

    @Override // io.sentry.i1
    @lm.a.c
    @Nullable
    public r1 p() {
        if (isEnabled()) {
            return N().p();
        }
        b().getLogger().c(y7.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.i1
    @NotNull
    public m1 q0() {
        return t5.C0(this);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v r0(@NotNull Throwable th2, @Nullable n0 n0Var) {
        return I(th2, n0Var, null);
    }

    @Override // io.sentry.i1
    public void s(@NotNull k1 k1Var) {
        if (k1Var != null) {
            b().getLogger().c(y7.DEBUG, "New client bound to scope.", new Object[0]);
            N().s(k1Var);
        } else {
            b().getLogger().c(y7.DEBUG, "NoOp client bound to scope.", new Object[0]);
            N().s(l3.s());
        }
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public io.sentry.protocol.v s0(@NotNull g6 g6Var, @Nullable n0 n0Var) {
        io.sentry.util.y.c(g6Var, "SentryEnvelope is required.");
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
        if (isEnabled()) {
            try {
                io.sentry.protocol.v vVarS0 = M().s0(g6Var, n0Var);
                if (vVarS0 != null) {
                    return vVarS0;
                }
            } catch (Throwable th2) {
                b().getLogger().a(y7.ERROR, "Error while capturing envelope.", th2);
            }
        } else {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
        }
        return vVar;
    }

    @Override // io.sentry.i1
    public void t0(@NotNull na naVar) {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'captureUserFeedback' call is a no-op.", new Object[0]);
            return;
        }
        try {
            M().t0(naVar);
        } catch (Throwable th2) {
            b().getLogger().a(y7.ERROR, "Error while capturing captureUserFeedback: " + naVar.toString(), th2);
        }
    }

    @Override // io.sentry.i1
    public void u() {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        t4.d dVarU = N().u();
        if (dVarU == null) {
            b().getLogger().c(y7.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (dVarU.b() != null) {
            M().n(dVarU.b(), io.sentry.util.n.e(new io.sentry.hints.m()));
        }
        M().n(dVarU.a(), io.sentry.util.n.e(new io.sentry.hints.o()));
    }

    @Override // io.sentry.i1
    public void u0() {
        if (!b().isContinuousProfilingEnabled()) {
            b().getLogger().c(y7.WARNING, "Continuous Profiling is not enabled. Set profilesSampleRate and profilesSampler to null to enable it.", new Object[0]);
            return;
        }
        i4 profileLifecycle = b().getProfileLifecycle();
        i4 i4Var = i4.MANUAL;
        if (profileLifecycle != i4Var) {
            b().getLogger().c(y7.WARNING, "Profiling lifecycle is %s. Profiling cannot be stopped manually.", b().getProfileLifecycle().name());
        } else {
            b().getLogger().c(y7.DEBUG, "Stopped continuous Profiling.", new Object[0]);
            b().getContinuousProfiler().n(i4Var);
        }
    }

    @Override // io.sentry.i1
    public void v(@NotNull List<String> list) {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'setFingerprint' call is a no-op.", new Object[0]);
        } else if (list == null) {
            b().getLogger().c(y7.WARNING, "setFingerprint called with null parameter.", new Object[0]);
        } else {
            N().v(list);
        }
    }

    @Override // io.sentry.i1
    public void w(long j10) {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            M().w(j10);
        } catch (Throwable th2) {
            b().getLogger().a(y7.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v w0(@NotNull o8 o8Var, @Nullable n0 n0Var) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
        if (isEnabled()) {
            try {
                return M().f(o8Var, N(), n0Var);
            } catch (Throwable th2) {
                b().getLogger().a(y7.ERROR, "Error while capturing replay", th2);
            }
        } else {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
        }
        return vVar;
    }

    @Override // io.sentry.i1
    public void x(@Nullable p1 p1Var) {
        N().x(p1Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v x0(@NotNull io.sentry.protocol.f fVar, @Nullable n0 n0Var, @Nullable v4 v4Var) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'captureFeedback' call is a no-op.", new Object[0]);
        } else if (fVar.i().isEmpty()) {
            b().getLogger().c(y7.WARNING, "captureFeedback called with empty message.", new Object[0]);
        } else {
            try {
                return M().c(fVar, n0Var, G(N(), v4Var));
            } catch (Throwable th2) {
                b().getLogger().a(y7.ERROR, "Error while capturing feedback: " + fVar.i(), th2);
            }
        }
        return vVar;
    }

    @Override // io.sentry.i1
    public void y() {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        k9 k9VarY = N().y();
        if (k9VarY != null) {
            M().n(k9VarY, io.sentry.util.n.e(new io.sentry.hints.m()));
        }
    }

    @Override // io.sentry.i1
    @Deprecated
    public void y0() {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Instance is disabled and this 'popScope' call is a no-op.", new Object[0]);
            return;
        }
        g5 g5Var = this.f305489d;
        if (g5Var != null) {
            g5Var.q0();
        }
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v z() {
        return N().z();
    }

    private g5(@NotNull g1 g1Var, @NotNull g1 g1Var2, @NotNull g1 g1Var3, @Nullable g5 g5Var, @NotNull String str) {
        this.f305492g = new l(g1Var3, g1Var2, g1Var);
        this.f305486a = g1Var;
        this.f305487b = g1Var2;
        this.f305488c = g1Var3;
        this.f305489d = g5Var;
        this.f305490e = str;
        n8 n8VarB = b();
        R(n8VarB);
        this.f305491f = n8VarB.getCompositePerformanceCollector();
        this.f305493h = new io.sentry.logger.c(this);
    }

    @Override // io.sentry.i1
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public z0 m778clone() {
        if (!isEnabled()) {
            b().getLogger().c(y7.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new t0(k1("scopes clone"));
    }
}
