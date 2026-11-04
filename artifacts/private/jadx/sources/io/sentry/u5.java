package io.sentry;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class u5 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f306908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    Double f306909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f306910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    Double f306911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    String f306912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f306913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f306914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f306915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f306916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f306917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f306918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    i4 f306919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306920m;

    public static final class a implements a2<u5> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u5 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            u5 u5Var = new u5();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "is_enable_app_start_profiling":
                        Boolean boolJ3 = y3Var.J3();
                        if (boolJ3 != null) {
                            u5Var.f306917j = boolJ3.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "trace_sampled":
                        Boolean boolJ4 = y3Var.J3();
                        if (boolJ4 != null) {
                            u5Var.f306910c = boolJ4.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profiling_traces_dir_path":
                        String strN6 = y3Var.n6();
                        if (strN6 != null) {
                            u5Var.f306912e = strN6;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_continuous_profiling_enabled":
                        Boolean boolJ5 = y3Var.J3();
                        if (boolJ5 != null) {
                            u5Var.f306914g = boolJ5.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_profiling_enabled":
                        Boolean boolJ6 = y3Var.J3();
                        if (boolJ6 != null) {
                            u5Var.f306913f = boolJ6.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_start_profiler_on_app_start":
                        Boolean boolJ7 = y3Var.J3();
                        if (boolJ7 != null) {
                            u5Var.f306918k = boolJ7.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_sampled":
                        Boolean boolJ8 = y3Var.J3();
                        if (boolJ8 != null) {
                            u5Var.f306908a = boolJ8.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_lifecycle":
                        String strN7 = y3Var.n6();
                        if (strN7 != null) {
                            try {
                                u5Var.f306919l = i4.valueOf(strN7);
                            } catch (IllegalArgumentException unused) {
                                iLogger.c(y7.ERROR, "Error when deserializing ProfileLifecycle: " + strN7, new Object[0]);
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "continuous_profile_sampled":
                        Boolean boolJ9 = y3Var.J3();
                        if (boolJ9 != null) {
                            u5Var.f306916i = boolJ9.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profiling_traces_hz":
                        Integer numRc = y3Var.rc();
                        if (numRc != null) {
                            u5Var.f306915h = numRc.intValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "trace_sample_rate":
                        Double dIa = y3Var.ia();
                        if (dIa != null) {
                            u5Var.f306911d = dIa;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_sample_rate":
                        Double dIa2 = y3Var.ia();
                        if (dIa2 != null) {
                            u5Var.f306909b = dIa2;
                            break;
                        } else {
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            u5Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return u5Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306921a = "profile_sampled";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306922b = "profile_sample_rate";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306923c = "continuous_profile_sampled";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306924d = "trace_sampled";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306925e = "trace_sample_rate";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306926f = "profiling_traces_dir_path";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306927g = "is_profiling_enabled";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306928h = "is_continuous_profiling_enabled";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306929i = "profile_lifecycle";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f306930j = "profiling_traces_hz";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f306931k = "is_enable_app_start_profiling";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f306932l = "is_start_profiler_on_app_start";
    }

    @lm.r
    public u5() {
        this.f306910c = false;
        this.f306911d = null;
        this.f306908a = false;
        this.f306909b = null;
        this.f306916i = false;
        this.f306912e = null;
        this.f306913f = false;
        this.f306914g = false;
        this.f306919l = i4.MANUAL;
        this.f306915h = 0;
        this.f306917j = true;
        this.f306918k = false;
    }

    @NotNull
    public i4 a() {
        return this.f306919l;
    }

    @Nullable
    public Double b() {
        return this.f306909b;
    }

    @Nullable
    public String c() {
        return this.f306912e;
    }

    public int d() {
        return this.f306915h;
    }

    @Nullable
    public Double e() {
        return this.f306911d;
    }

    public boolean f() {
        return this.f306916i;
    }

    public boolean g() {
        return this.f306914g;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306920m;
    }

    public boolean h() {
        return this.f306917j;
    }

    public boolean i() {
        return this.f306908a;
    }

    public boolean j() {
        return this.f306913f;
    }

    public boolean k() {
        return this.f306918k;
    }

    public boolean l() {
        return this.f306910c;
    }

    public void m(boolean z10) {
        this.f306916i = z10;
    }

    public void n(boolean z10) {
        this.f306914g = z10;
    }

    public void o(boolean z10) {
        this.f306917j = z10;
    }

    public void p(@NotNull i4 i4Var) {
        this.f306919l = i4Var;
    }

    public void q(@Nullable Double d10) {
        this.f306909b = d10;
    }

    public void r(boolean z10) {
        this.f306908a = z10;
    }

    public void s(boolean z10) {
        this.f306913f = z10;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f(b.f306921a).j(iLogger, Boolean.valueOf(this.f306908a));
        z3Var.f(b.f306922b).j(iLogger, this.f306909b);
        z3Var.f(b.f306923c).j(iLogger, Boolean.valueOf(this.f306916i));
        z3Var.f(b.f306924d).j(iLogger, Boolean.valueOf(this.f306910c));
        z3Var.f(b.f306925e).j(iLogger, this.f306911d);
        z3Var.f(b.f306926f).j(iLogger, this.f306912e);
        z3Var.f(b.f306927g).j(iLogger, Boolean.valueOf(this.f306913f));
        z3Var.f(b.f306928h).j(iLogger, Boolean.valueOf(this.f306914g));
        z3Var.f(b.f306929i).j(iLogger, this.f306919l.name());
        z3Var.f(b.f306930j).j(iLogger, Integer.valueOf(this.f306915h));
        z3Var.f(b.f306931k).j(iLogger, Boolean.valueOf(this.f306917j));
        z3Var.f(b.f306932l).j(iLogger, Boolean.valueOf(this.f306918k));
        Map<String, Object> map = this.f306920m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306920m.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306920m = map;
    }

    public void t(@Nullable String str) {
        this.f306912e = str;
    }

    public void u(int i10) {
        this.f306915h = i10;
    }

    public void v(boolean z10) {
        this.f306918k = z10;
    }

    public void w(@Nullable Double d10) {
        this.f306911d = d10;
    }

    public void x(boolean z10) {
        this.f306910c = z10;
    }

    u5(@NotNull n8 n8Var, @NotNull fa faVar) {
        this.f306910c = faVar.e().booleanValue();
        this.f306911d = faVar.d();
        this.f306908a = faVar.b().booleanValue();
        this.f306909b = faVar.a();
        this.f306916i = n8Var.getInternalTracesSampler().c(io.sentry.util.f0.a().g());
        this.f306912e = n8Var.getProfilingTracesDirPath();
        this.f306913f = n8Var.isProfilingEnabled();
        this.f306914g = n8Var.isContinuousProfilingEnabled();
        this.f306919l = n8Var.getProfileLifecycle();
        this.f306915h = n8Var.getProfilingTracesHz();
        this.f306917j = n8Var.isEnableAppStartProfiling();
        this.f306918k = n8Var.isStartProfilerOnAppStart();
    }
}
