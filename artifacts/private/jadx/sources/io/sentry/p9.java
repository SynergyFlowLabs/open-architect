package io.sentry;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class p9 implements m2, k2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f306036o = "trace";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f306037s = "manual";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.v f306038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v9 f306039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private v9 f306040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private transient fa f306041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    protected String f306042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    protected String f306043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    protected x9 f306044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    protected Map<String, String> f306045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    protected String f306046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    protected Map<String, Object> f306047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private w1 f306049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    protected d f306050m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.v f306051n;

    public static final class a implements a2<p9> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p9 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            String strJc = null;
            io.sentry.protocol.v vVarA = null;
            v9 v9VarB = null;
            v9 v9Var = null;
            ConcurrentHashMap concurrentHashMap = null;
            String strJc2 = null;
            x9 x9Var = null;
            String strJc3 = null;
            Map<String, String> mapF = null;
            Map<String, Object> map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "span_id":
                        v9VarB = new v9.a().a(y3Var, iLogger);
                        break;
                    case "parent_span_id":
                        v9Var = (v9) y3Var.i4(iLogger, new v9.a());
                        break;
                    case "description":
                        strJc2 = y3Var.jc();
                        break;
                    case "origin":
                        strJc3 = y3Var.jc();
                        break;
                    case "status":
                        x9Var = (x9) y3Var.i4(iLogger, new x9.a());
                        break;
                    case "op":
                        strJc = y3Var.jc();
                        break;
                    case "data":
                        map = (Map) y3Var.re();
                        break;
                    case "tags":
                        mapF = io.sentry.util.d.f((Map) y3Var.re());
                        break;
                    case "trace_id":
                        vVarA = new io.sentry.protocol.v.a().a(y3Var, iLogger);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            if (vVarA == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.a(y7.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (v9VarB == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                iLogger.a(y7.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strJc == null) {
                strJc = "";
            }
            p9 p9Var = new p9(vVarA, v9VarB, strJc, v9Var, null);
            p9Var.r(strJc2);
            p9Var.z(x9Var);
            p9Var.u(strJc3);
            if (mapF != null) {
                p9Var.f306045h = mapF;
            }
            if (map != null) {
                p9Var.f306047j = map;
            }
            p9Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return p9Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306052a = "trace_id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306053b = "span_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306054c = "parent_span_id";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306055d = "op";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306056e = "description";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306057f = "status";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306058g = "tags";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306059h = "origin";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306060i = "data";
    }

    public p9(@NotNull String str, @Nullable fa faVar) {
        this(new io.sentry.protocol.v(), new v9(), str, null, faVar);
    }

    public void A(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.f306045h.remove(str);
        } else {
            this.f306045h.put(str, str2);
        }
    }

    @lm.a.c
    public p9 a(@NotNull String str, @Nullable v9 v9Var, @Nullable v9 v9Var2) {
        io.sentry.protocol.v vVar = this.f306038a;
        if (v9Var2 == null) {
            v9Var2 = new v9();
        }
        int i10 = 5 | 0;
        return new p9(vVar, v9Var2, v9Var, str, null, this.f306041d, null, f306037s);
    }

    @Nullable
    public d b() {
        return this.f306050m;
    }

    @NotNull
    public Map<String, Object> c() {
        return this.f306047j;
    }

    @Nullable
    public String d() {
        return this.f306043f;
    }

    @NotNull
    public w1 e() {
        return this.f306049l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9)) {
            return false;
        }
        p9 p9Var = (p9) obj;
        return this.f306038a.equals(p9Var.f306038a) && this.f306039b.equals(p9Var.f306039b) && io.sentry.util.y.a(this.f306040c, p9Var.f306040c) && this.f306042e.equals(p9Var.f306042e) && io.sentry.util.y.a(this.f306043f, p9Var.f306043f) && n() == p9Var.n();
    }

    @NotNull
    public String f() {
        return this.f306042e;
    }

    @Nullable
    public String g() {
        return this.f306046i;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306048k;
    }

    @lm.n
    @Nullable
    public v9 h() {
        return this.f306040c;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f306038a, this.f306039b, this.f306040c, this.f306042e, this.f306043f, n());
    }

    @Nullable
    public Boolean i() {
        fa faVar = this.f306041d;
        if (faVar == null) {
            return null;
        }
        return faVar.b();
    }

    @lm.a.c
    @NotNull
    public io.sentry.protocol.v j() {
        return this.f306051n;
    }

    @Nullable
    public Boolean k() {
        fa faVar = this.f306041d;
        if (faVar == null) {
            return null;
        }
        return faVar.e();
    }

    @Nullable
    public fa l() {
        return this.f306041d;
    }

    @NotNull
    public v9 m() {
        return this.f306039b;
    }

    @Nullable
    public x9 n() {
        return this.f306044g;
    }

    @NotNull
    public Map<String, String> o() {
        return this.f306045h;
    }

    @NotNull
    public io.sentry.protocol.v p() {
        return this.f306038a;
    }

    public void q(@Nullable String str, @Nullable Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f306047j.remove(str);
        } else {
            this.f306047j.put(str, obj);
        }
    }

    public void r(@Nullable String str) {
        this.f306043f = str;
    }

    public void s(@NotNull w1 w1Var) {
        this.f306049l = w1Var;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("trace_id");
        this.f306038a.serialize(z3Var, iLogger);
        z3Var.f("span_id");
        this.f306039b.serialize(z3Var, iLogger);
        if (this.f306040c != null) {
            z3Var.f("parent_span_id");
            this.f306040c.serialize(z3Var, iLogger);
        }
        z3Var.f("op").b(this.f306042e);
        if (this.f306043f != null) {
            z3Var.f("description").b(this.f306043f);
        }
        if (n() != null) {
            z3Var.f("status").j(iLogger, n());
        }
        if (this.f306046i != null) {
            z3Var.f("origin").j(iLogger, this.f306046i);
        }
        if (!this.f306045h.isEmpty()) {
            z3Var.f("tags").j(iLogger, this.f306045h);
        }
        if (!this.f306047j.isEmpty()) {
            z3Var.f("data").j(iLogger, this.f306047j);
        }
        Map<String, Object> map = this.f306048k;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306048k.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306048k = map;
    }

    public void t(@NotNull String str) {
        this.f306042e = (String) io.sentry.util.y.c(str, "operation is required");
    }

    public void u(@Nullable String str) {
        this.f306046i = str;
    }

    @lm.a.c
    public void v(@NotNull io.sentry.protocol.v vVar) {
        this.f306051n = vVar;
    }

    @lm.a.c
    public void w(@Nullable Boolean bool) {
        if (bool == null) {
            y(null);
        } else {
            y(new fa(bool));
        }
    }

    @lm.a.c
    public void x(@Nullable Boolean bool, @Nullable Boolean bool2) {
        if (bool == null) {
            y(null);
        } else if (bool2 == null) {
            y(new fa(bool));
        } else {
            y(new fa(bool, null, bool2, null));
        }
    }

    @lm.a.c
    public void y(@Nullable fa faVar) {
        this.f306041d = faVar;
        d dVar = this.f306050m;
        if (dVar != null) {
            dVar.Q(faVar);
        }
    }

    public void z(@Nullable x9 x9Var) {
        this.f306044g = x9Var;
    }

    public p9(@NotNull String str) {
        this(new io.sentry.protocol.v(), new v9(), str, null, null);
    }

    public p9(@NotNull io.sentry.protocol.v vVar, @NotNull v9 v9Var, @NotNull String str, @Nullable v9 v9Var2, @Nullable fa faVar) {
        this(vVar, v9Var, v9Var2, str, null, faVar, null, f306037s);
    }

    @lm.a.c
    public p9(@NotNull io.sentry.protocol.v vVar, @NotNull v9 v9Var, @Nullable v9 v9Var2, @NotNull String str, @Nullable String str2, @Nullable fa faVar, @Nullable x9 x9Var, @Nullable String str3) {
        this.f306045h = new ConcurrentHashMap();
        this.f306046i = f306037s;
        this.f306047j = new ConcurrentHashMap();
        this.f306049l = w1.SENTRY;
        this.f306051n = io.sentry.protocol.v.f306474b;
        this.f306038a = (io.sentry.protocol.v) io.sentry.util.y.c(vVar, "traceId is required");
        this.f306039b = (v9) io.sentry.util.y.c(v9Var, "spanId is required");
        this.f306042e = (String) io.sentry.util.y.c(str, "operation is required");
        this.f306040c = v9Var2;
        this.f306043f = str2;
        this.f306044g = x9Var;
        this.f306046i = str3;
        y(faVar);
        io.sentry.util.thread.a threadChecker = h5.q().b().getThreadChecker();
        this.f306047j.put(q9.f306597j, String.valueOf(threadChecker.c()));
        this.f306047j.put(q9.f306598k, threadChecker.b());
    }

    public p9(@NotNull p9 p9Var) {
        this.f306045h = new ConcurrentHashMap();
        this.f306046i = f306037s;
        this.f306047j = new ConcurrentHashMap();
        this.f306049l = w1.SENTRY;
        this.f306051n = io.sentry.protocol.v.f306474b;
        this.f306038a = p9Var.f306038a;
        this.f306039b = p9Var.f306039b;
        this.f306040c = p9Var.f306040c;
        y(p9Var.f306041d);
        this.f306042e = p9Var.f306042e;
        this.f306043f = p9Var.f306043f;
        this.f306044g = p9Var.f306044g;
        Map<String, String> mapF = io.sentry.util.d.f(p9Var.f306045h);
        if (mapF != null) {
            this.f306045h = mapF;
        }
        Map<String, Object> mapF2 = io.sentry.util.d.f(p9Var.f306048k);
        if (mapF2 != null) {
            this.f306048k = mapF2;
        }
        this.f306050m = p9Var.f306050m;
        Map<String, Object> mapF3 = io.sentry.util.d.f(p9Var.f306047j);
        if (mapF3 != null) {
            this.f306047j = mapF3;
        }
    }
}
