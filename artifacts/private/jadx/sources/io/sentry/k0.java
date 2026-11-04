package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 {
    private static final String P = "80";

    @Nullable
    private Boolean A;

    @Nullable
    private Boolean B;

    @Nullable
    private String C;

    @Nullable
    private List<String> D;

    @Nullable
    private List<String> E;

    @Nullable
    private Boolean F;

    @Nullable
    private Boolean G;

    @Nullable
    private Boolean H;

    @Nullable
    private Boolean I;

    @Nullable
    private Boolean J;

    @Nullable
    private Boolean K;

    @Nullable
    private Double L;

    @Nullable
    private String M;

    @Nullable
    private i4 N;

    @Nullable
    private n8.g O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f305689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f305690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f305691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f305692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f305693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Boolean f305694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Boolean f305695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Boolean f305696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Double f305697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Double f305698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private n8.m f305699k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private n8.l f305701m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private String f305706r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Long f305707s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    private List<String> f305709u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private Boolean f305710v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private Boolean f305711w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    private Boolean f305713y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    private Boolean f305714z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f305700l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final List<String> f305702n = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final List<String> f305703o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private List<String> f305704p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final List<String> f305705q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final Set<Class<? extends Throwable>> f305708t = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private Set<String> f305712x = new CopyOnWriteArraySet();

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static k0 g(@NotNull io.sentry.config.g gVar, @NotNull ILogger iLogger) {
        k0 k0Var = new k0();
        k0Var.a0(gVar.getProperty("dsn"));
        k0Var.i0(gVar.getProperty("environment"));
        k0Var.x0(gVar.getProperty("release"));
        k0Var.Z(gVar.getProperty(z5.b.f307180k));
        k0Var.B0(gVar.getProperty("servername"));
        k0Var.g0(gVar.c("uncaught.handler.enabled"));
        k0Var.q0(gVar.c("uncaught.handler.print-stacktrace"));
        k0Var.E0(gVar.a("traces-sample-rate"));
        k0Var.t0(gVar.a("profiles-sample-rate"));
        k0Var.Y(gVar.c("debug"));
        k0Var.c0(gVar.c("enable-deduplication"));
        k0Var.y0(gVar.c("send-client-reports"));
        k0Var.j0(gVar.c("force-init"));
        String property = gVar.getProperty("max-request-body-size");
        if (property != null) {
            k0Var.p0(n8.m.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry<String, String> entry : gVar.e("tags").entrySet()) {
            k0Var.D0(entry.getKey(), entry.getValue());
        }
        String property2 = gVar.getProperty("proxy.host");
        String property3 = gVar.getProperty("proxy.user");
        String property4 = gVar.getProperty("proxy.pass");
        String strG = gVar.g("proxy.port", P);
        if (property2 != null) {
            k0Var.w0(new n8.l(property2, strG, property3, property4));
        }
        Iterator<String> it = gVar.b("in-app-includes").iterator();
        while (it.hasNext()) {
            k0Var.e(it.next());
        }
        Iterator<String> it2 = gVar.b("in-app-excludes").iterator();
        while (it2.hasNext()) {
            k0Var.d(it2.next());
        }
        List<String> listB = gVar.getProperty("trace-propagation-targets") != null ? gVar.b("trace-propagation-targets") : null;
        if (listB == null && gVar.getProperty("tracing-origins") != null) {
            listB = gVar.b("tracing-origins");
        }
        if (listB != null) {
            Iterator<String> it3 = listB.iterator();
            while (it3.hasNext()) {
                k0Var.f(it3.next());
            }
        }
        Iterator<String> it4 = gVar.b("context-tags").iterator();
        while (it4.hasNext()) {
            k0Var.b(it4.next());
        }
        k0Var.v0(gVar.getProperty("proguard-uuid"));
        Iterator<String> it5 = gVar.b("bundle-ids").iterator();
        while (it5.hasNext()) {
            k0Var.a(it5.next());
        }
        k0Var.l0(gVar.f("idle-timeout"));
        k0Var.n0(gVar.d("ignored-errors"));
        k0Var.h0(gVar.c("enabled"));
        k0Var.e0(gVar.c("enable-pretty-serialization-output"));
        k0Var.A0(gVar.c("send-modules"));
        k0Var.z0(gVar.c("send-default-pii"));
        k0Var.m0(gVar.d("ignored-checkins"));
        k0Var.o0(gVar.d("ignored-transactions"));
        k0Var.b0(gVar.c("enable-backpressure-handling"));
        k0Var.k0(gVar.c("global-hub-mode"));
        k0Var.W(gVar.c("capture-open-telemetry-events"));
        k0Var.d0(gVar.c("logs.enabled"));
        for (String str : gVar.b("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str);
                if (Throwable.class.isAssignableFrom(cls)) {
                    k0Var.c(cls);
                } else {
                    iLogger.c(y7.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str, str);
                }
            } catch (ClassNotFoundException unused) {
                iLogger.c(y7.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str, str);
            }
        }
        Long lF = gVar.f("cron.default-checkin-margin");
        Long lF2 = gVar.f("cron.default-max-runtime");
        String property5 = gVar.getProperty("cron.default-timezone");
        Long lF3 = gVar.f("cron.default-failure-issue-threshold");
        Long lF4 = gVar.f("cron.default-recovery-threshold");
        if (lF != null || lF2 != null || property5 != null || lF3 != null || lF4 != null) {
            n8.g gVar2 = new n8.g();
            gVar2.f(lF);
            gVar2.h(lF2);
            gVar2.j(property5);
            gVar2.g(lF3);
            gVar2.i(lF4);
            k0Var.X(gVar2);
        }
        k0Var.f0(gVar.c("enable-spotlight"));
        k0Var.C0(gVar.getProperty("spotlight-connection-url"));
        k0Var.s0(gVar.a("profile-session-sample-rate"));
        k0Var.u0(gVar.getProperty("profiling-traces-dir-path"));
        String property6 = gVar.getProperty("profile-lifecycle");
        if (property6 != null && !property6.isEmpty()) {
            k0Var.r0(i4.valueOf(property6.toUpperCase()));
        }
        return k0Var;
    }

    @Nullable
    public Double A() {
        return this.L;
    }

    public void A0(@Nullable Boolean bool) {
        this.F = bool;
    }

    @Nullable
    public Double B() {
        return this.f305698j;
    }

    public void B0(@Nullable String str) {
        this.f305693e = str;
    }

    @Nullable
    public String C() {
        return this.M;
    }

    @lm.a.b
    public void C0(@Nullable String str) {
        this.C = str;
    }

    @Nullable
    public String D() {
        return this.f305706r;
    }

    public void D0(@NotNull String str, @NotNull String str2) {
        this.f305700l.put(str, str2);
    }

    @Nullable
    public n8.l E() {
        return this.f305701m;
    }

    public void E0(@Nullable Double d10) {
        this.f305697i = d10;
    }

    @Nullable
    public String F() {
        return this.f305691c;
    }

    @Nullable
    public Boolean G() {
        return this.f305711w;
    }

    @Nullable
    public String H() {
        return this.f305693e;
    }

    @lm.a.b
    @Nullable
    public String I() {
        return this.C;
    }

    @NotNull
    public Map<String, String> J() {
        return this.f305700l;
    }

    @Nullable
    public List<String> K() {
        return this.f305704p;
    }

    @Nullable
    public Double L() {
        return this.f305697i;
    }

    @lm.a.b
    @Nullable
    public Boolean M() {
        return this.K;
    }

    @lm.a.b
    @Nullable
    public Boolean N() {
        return this.H;
    }

    @Nullable
    public Boolean O() {
        return this.B;
    }

    @Nullable
    public Boolean P() {
        return this.f305714z;
    }

    @lm.a.b
    @Nullable
    public Boolean Q() {
        return this.A;
    }

    @Nullable
    public Boolean R() {
        return this.f305713y;
    }

    @Nullable
    public Boolean S() {
        return this.J;
    }

    @lm.a.b
    @Nullable
    public Boolean T() {
        return this.I;
    }

    @Nullable
    public Boolean U() {
        return this.G;
    }

    @Nullable
    public Boolean V() {
        return this.F;
    }

    @lm.a.b
    public void W(@Nullable Boolean bool) {
        this.K = bool;
    }

    public void X(@Nullable n8.g gVar) {
        this.O = gVar;
    }

    public void Y(@Nullable Boolean bool) {
        this.f305695g = bool;
    }

    public void Z(@Nullable String str) {
        this.f305692d = str;
    }

    public void a(@NotNull String str) {
        this.f305712x.add(str);
    }

    public void a0(@Nullable String str) {
        this.f305689a = str;
    }

    public void b(@NotNull String str) {
        this.f305705q.add(str);
    }

    @lm.a.b
    public void b0(@Nullable Boolean bool) {
        this.H = bool;
    }

    public void c(@NotNull Class<? extends Throwable> cls) {
        this.f305708t.add(cls);
    }

    public void c0(@Nullable Boolean bool) {
        this.f305696h = bool;
    }

    public void d(@NotNull String str) {
        this.f305702n.add(str);
    }

    public void d0(@Nullable Boolean bool) {
        this.B = bool;
    }

    public void e(@NotNull String str) {
        this.f305703o.add(str);
    }

    public void e0(@Nullable Boolean bool) {
        this.f305714z = bool;
    }

    public void f(@NotNull String str) {
        if (this.f305704p == null) {
            this.f305704p = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.f305704p.add(str);
    }

    @lm.a.b
    public void f0(@Nullable Boolean bool) {
        this.A = bool;
    }

    public void g0(@Nullable Boolean bool) {
        this.f305694f = bool;
    }

    @NotNull
    public Set<String> h() {
        return this.f305712x;
    }

    public void h0(@Nullable Boolean bool) {
        this.f305713y = bool;
    }

    @NotNull
    public List<String> i() {
        return this.f305705q;
    }

    public void i0(@Nullable String str) {
        this.f305690b = str;
    }

    @Nullable
    public n8.g j() {
        return this.O;
    }

    public void j0(@Nullable Boolean bool) {
        this.J = bool;
    }

    @Nullable
    public Boolean k() {
        return this.f305695g;
    }

    public void k0(@Nullable Boolean bool) {
        this.I = bool;
    }

    @Nullable
    public String l() {
        return this.f305692d;
    }

    public void l0(@Nullable Long l10) {
        this.f305707s = l10;
    }

    @Nullable
    public String m() {
        return this.f305689a;
    }

    public void m0(@Nullable List<String> list) {
        this.D = list;
    }

    @Nullable
    public Boolean n() {
        return this.f305696h;
    }

    public void n0(@Nullable List<String> list) {
        this.f305709u = list;
    }

    @Nullable
    public Boolean o() {
        return this.f305694f;
    }

    public void o0(@Nullable List<String> list) {
        this.E = list;
    }

    @Nullable
    public String p() {
        return this.f305690b;
    }

    public void p0(@Nullable n8.m mVar) {
        this.f305699k = mVar;
    }

    @Nullable
    public Long q() {
        return this.f305707s;
    }

    public void q0(@Nullable Boolean bool) {
        this.f305710v = bool;
    }

    @Nullable
    public List<String> r() {
        return this.D;
    }

    public void r0(@Nullable i4 i4Var) {
        this.N = i4Var;
    }

    @Nullable
    public List<String> s() {
        return this.f305709u;
    }

    public void s0(@Nullable Double d10) {
        this.L = d10;
    }

    @NotNull
    public Set<Class<? extends Throwable>> t() {
        return this.f305708t;
    }

    public void t0(@Nullable Double d10) {
        this.f305698j = d10;
    }

    @Nullable
    public List<String> u() {
        return this.E;
    }

    public void u0(@Nullable String str) {
        this.M = str;
    }

    @NotNull
    public List<String> v() {
        return this.f305702n;
    }

    public void v0(@Nullable String str) {
        this.f305706r = str;
    }

    @NotNull
    public List<String> w() {
        return this.f305703o;
    }

    public void w0(@Nullable n8.l lVar) {
        this.f305701m = lVar;
    }

    @Nullable
    public n8.m x() {
        return this.f305699k;
    }

    public void x0(@Nullable String str) {
        this.f305691c = str;
    }

    @Nullable
    public Boolean y() {
        return this.f305710v;
    }

    public void y0(@Nullable Boolean bool) {
        this.f305711w = bool;
    }

    @Nullable
    public i4 z() {
        return this.N;
    }

    public void z0(@Nullable Boolean bool) {
        this.G = bool;
    }
}
