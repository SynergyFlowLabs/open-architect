package io.sentry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class o7 extends z5 implements m2, k2 {

    @Nullable
    private Map<String, Object> H1;

    @Nullable
    private f9<io.sentry.protocol.b0> X;

    @Nullable
    private f9<io.sentry.protocol.q> Y;

    @Nullable
    private y7 Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private String f305954p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private List<String> f305955p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private Map<String, String> f305956p2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private Date f305957t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.k f305958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private String f305959w;

    public static final class a implements a2<o7> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o7 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            o7 o7Var = new o7();
            z5.a aVar = new z5.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "fingerprint":
                        List list = (List) y3Var.re();
                        if (list == null) {
                            break;
                        } else {
                            o7Var.f305955p1 = list;
                            break;
                        }
                        break;
                    case "threads":
                        y3Var.m1();
                        y3Var.na();
                        o7Var.X = new f9(y3Var.p8(iLogger, new io.sentry.protocol.b0.a()));
                        y3Var.F1();
                        break;
                    case "logger":
                        o7Var.f305959w = y3Var.n6();
                        break;
                    case "timestamp":
                        Date dateZ3 = y3Var.z3(iLogger);
                        if (dateZ3 == null) {
                            break;
                        } else {
                            o7Var.f305957t = dateZ3;
                            break;
                        }
                        break;
                    case "level":
                        o7Var.Z = (y7) y3Var.i4(iLogger, new y7.a());
                        break;
                    case "message":
                        o7Var.f305958v = (io.sentry.protocol.k) y3Var.i4(iLogger, new io.sentry.protocol.k.a());
                        break;
                    case "modules":
                        o7Var.f305956p2 = io.sentry.util.d.f((Map) y3Var.re());
                        break;
                    case "exception":
                        y3Var.m1();
                        y3Var.na();
                        o7Var.Y = new f9(y3Var.p8(iLogger, new io.sentry.protocol.q.a()));
                        y3Var.F1();
                        break;
                    case "transaction":
                        o7Var.f305954p0 = y3Var.n6();
                        break;
                    default:
                        if (!aVar.a(o7Var, strNa, y3Var, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            y3Var.gd(iLogger, concurrentHashMap, strNa);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            o7Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return o7Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305960a = "timestamp";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305961b = "message";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305962c = "logger";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305963d = "threads";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f305964e = "exception";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f305965f = "level";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f305966g = "transaction";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f305967h = "fingerprint";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f305968i = "modules";
    }

    o7(@NotNull io.sentry.protocol.v vVar, @NotNull Date date) {
        super(vVar);
        this.f305957t = date;
    }

    @Nullable
    public io.sentry.protocol.k A0() {
        return this.f305958v;
    }

    @Nullable
    public String B0(@NotNull String str) {
        Map<String, String> map = this.f305956p2;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    @Nullable
    Map<String, String> C0() {
        return this.f305956p2;
    }

    @Nullable
    public List<io.sentry.protocol.b0> D0() {
        f9<io.sentry.protocol.b0> f9Var = this.X;
        if (f9Var != null) {
            return f9Var.a();
        }
        return null;
    }

    public Date E0() {
        return (Date) this.f305957t.clone();
    }

    @Nullable
    public String F0() {
        return this.f305954p0;
    }

    @Nullable
    public io.sentry.protocol.q G0() {
        f9<io.sentry.protocol.q> f9Var = this.Y;
        if (f9Var == null) {
            return null;
        }
        for (io.sentry.protocol.q qVar : f9Var.a()) {
            if (qVar.g() != null && qVar.g().u() != null && !qVar.g().u().booleanValue()) {
                return qVar;
            }
        }
        return null;
    }

    public boolean H0() {
        return G0() != null;
    }

    public boolean I0() {
        f9<io.sentry.protocol.q> f9Var = this.Y;
        return (f9Var == null || f9Var.a().isEmpty()) ? false : true;
    }

    public void J0(@NotNull String str) {
        Map<String, String> map = this.f305956p2;
        if (map != null) {
            map.remove(str);
        }
    }

    public void K0(@Nullable List<io.sentry.protocol.q> list) {
        this.Y = new f9<>(list);
    }

    public void L0(@Nullable List<String> list) {
        this.f305955p1 = list != null ? new ArrayList(list) : null;
    }

    public void M0(@Nullable y7 y7Var) {
        this.Z = y7Var;
    }

    public void N0(@Nullable String str) {
        this.f305959w = str;
    }

    public void O0(@Nullable io.sentry.protocol.k kVar) {
        this.f305958v = kVar;
    }

    public void P0(@NotNull String str, @NotNull String str2) {
        if (this.f305956p2 == null) {
            this.f305956p2 = new HashMap();
        }
        this.f305956p2.put(str, str2);
    }

    public void Q0(@Nullable Map<String, String> map) {
        this.f305956p2 = io.sentry.util.d.g(map);
    }

    public void R0(@Nullable List<io.sentry.protocol.b0> list) {
        this.X = new f9<>(list);
    }

    public void S0(@NotNull Date date) {
        this.f305957t = date;
    }

    public void T0(@Nullable String str) {
        this.f305954p0 = str;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.H1;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("timestamp").j(iLogger, this.f305957t);
        if (this.f305958v != null) {
            z3Var.f("message").j(iLogger, this.f305958v);
        }
        if (this.f305959w != null) {
            z3Var.f(b.f305962c).b(this.f305959w);
        }
        f9<io.sentry.protocol.b0> f9Var = this.X;
        if (f9Var != null && !f9Var.a().isEmpty()) {
            z3Var.f(b.f305963d);
            z3Var.m1();
            z3Var.f("values").j(iLogger, this.X.a());
            z3Var.F1();
        }
        f9<io.sentry.protocol.q> f9Var2 = this.Y;
        if (f9Var2 != null && !f9Var2.a().isEmpty()) {
            z3Var.f(b.f305964e);
            z3Var.m1();
            z3Var.f("values").j(iLogger, this.Y.a());
            z3Var.F1();
        }
        if (this.Z != null) {
            z3Var.f("level").j(iLogger, this.Z);
        }
        if (this.f305954p0 != null) {
            z3Var.f("transaction").b(this.f305954p0);
        }
        if (this.f305955p1 != null) {
            z3Var.f(b.f305967h).j(iLogger, this.f305955p1);
        }
        if (this.f305956p2 != null) {
            z3Var.f(b.f305968i).j(iLogger, this.f305956p2);
        }
        new z5.c().a(this, z3Var, iLogger);
        Map<String, Object> map = this.H1;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.H1.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.H1 = map;
    }

    @Nullable
    public List<io.sentry.protocol.q> w0() {
        f9<io.sentry.protocol.q> f9Var = this.Y;
        if (f9Var == null) {
            return null;
        }
        return f9Var.a();
    }

    @Nullable
    public List<String> x0() {
        return this.f305955p1;
    }

    @Nullable
    public y7 y0() {
        return this.Z;
    }

    @Nullable
    public String z0() {
        return this.f305959w;
    }

    public o7(@Nullable Throwable th2) {
        this();
        this.f307164j = th2;
    }

    public o7() {
        this(new io.sentry.protocol.v(), p.d());
    }

    @lm.n
    public o7(@NotNull Date date) {
        this(new io.sentry.protocol.v(), date);
    }
}
