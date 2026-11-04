package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.o9;
import io.sentry.v9;
import io.sentry.x9;
import io.sentry.y3;
import io.sentry.y7;
import io.sentry.z3;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class y implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Double f306489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Double f306490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v f306491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v9 f306492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final v9 f306493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f306494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f306495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final x9 f306496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f306497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f306498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Map<String, i> f306500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306501m;

    public static final class a implements a2<y> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(y7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            Double dValueOf = null;
            Map map = null;
            v vVarA = null;
            v9 v9VarA = null;
            Map map2 = null;
            String strN6 = null;
            Double dValueOf2 = null;
            v9 v9Var = null;
            String strN7 = null;
            x9 x9Var = null;
            String strN8 = null;
            Map map3 = null;
            while (true) {
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                Double d10 = dValueOf;
                Map map4 = map;
                v vVar = vVarA;
                v9 v9Var2 = v9VarA;
                if (y3Var.peek() != io.sentry.vendor.gson.stream.c.NAME) {
                    if (d10 == null) {
                        throw c("start_timestamp", iLogger);
                    }
                    if (vVar == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (v9Var2 == null) {
                        throw c("span_id", iLogger);
                    }
                    if (strN6 == null) {
                        throw c("op", iLogger);
                    }
                    Map map5 = map4 == null ? new HashMap() : map4;
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    y yVar = new y(d10, dValueOf2, vVar, v9Var2, v9Var, strN6, strN7, x9Var, strN8, map5, map2, map3);
                    yVar.setUnknown(concurrentHashMap2);
                    y3Var.F1();
                    return yVar;
                }
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "span_id":
                        v9VarA = new v9.a().a(y3Var, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        vVarA = vVar;
                        break;
                    case "parent_span_id":
                        v9Var = (v9) y3Var.i4(iLogger, new v9.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        vVarA = vVar;
                        v9VarA = v9Var2;
                        break;
                    case "description":
                        strN7 = y3Var.n6();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        vVarA = vVar;
                        v9VarA = v9Var2;
                        break;
                    case "start_timestamp":
                        try {
                            dValueOf = y3Var.ia();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateZ3 = y3Var.z3(iLogger);
                            dValueOf = dateZ3 != null ? Double.valueOf(io.sentry.p.b(dateZ3)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        map = map4;
                        vVarA = vVar;
                        v9VarA = v9Var2;
                        break;
                    case "origin":
                        strN8 = y3Var.n6();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        vVarA = vVar;
                        v9VarA = v9Var2;
                        break;
                    case "status":
                        x9Var = (x9) y3Var.i4(iLogger, new x9.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        vVarA = vVar;
                        v9VarA = v9Var2;
                        break;
                    case "measurements":
                        map2 = y3Var.fd(iLogger, new i.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        vVarA = vVar;
                        v9VarA = v9Var2;
                        break;
                    case "op":
                        strN6 = y3Var.n6();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        vVarA = vVar;
                        v9VarA = v9Var2;
                        break;
                    case "data":
                        map3 = (Map) y3Var.re();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        vVarA = vVar;
                        v9VarA = v9Var2;
                        break;
                    case "tags":
                        map = (Map) y3Var.re();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        vVarA = vVar;
                        v9VarA = v9Var2;
                        break;
                    case "timestamp":
                        try {
                            dValueOf2 = y3Var.ia();
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateZ4 = y3Var.z3(iLogger);
                            dValueOf2 = dateZ4 != null ? Double.valueOf(io.sentry.p.b(dateZ4)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        vVarA = vVar;
                        v9VarA = v9Var2;
                        break;
                    case "trace_id":
                        vVarA = new v.a().a(y3Var, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        v9VarA = v9Var2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        dValueOf = d10;
                        map = map4;
                        vVarA = vVar;
                        v9VarA = v9Var2;
                        break;
                }
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306502a = "start_timestamp";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306503b = "timestamp";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306504c = "trace_id";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306505d = "span_id";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306506e = "parent_span_id";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306507f = "op";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306508g = "description";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306509h = "status";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306510i = "origin";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f306511j = "tags";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f306512k = "measurements";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f306513l = "data";
    }

    public y(@NotNull o9 o9Var) {
        this(o9Var, o9Var.R());
    }

    @NotNull
    private BigDecimal a(@NotNull Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    @Nullable
    public Map<String, Object> b() {
        return this.f306499k;
    }

    @Nullable
    public String c() {
        return this.f306495g;
    }

    @NotNull
    public Map<String, i> d() {
        return this.f306500l;
    }

    @NotNull
    public String e() {
        return this.f306494f;
    }

    @Nullable
    public String f() {
        return this.f306497i;
    }

    @Nullable
    public v9 g() {
        return this.f306493e;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306501m;
    }

    @NotNull
    public v9 h() {
        return this.f306492d;
    }

    @NotNull
    public Double i() {
        return this.f306489a;
    }

    @Nullable
    public x9 j() {
        return this.f306496h;
    }

    @NotNull
    public Map<String, String> k() {
        return this.f306498j;
    }

    @Nullable
    public Double l() {
        return this.f306490b;
    }

    @NotNull
    public v m() {
        return this.f306491c;
    }

    public boolean n() {
        return this.f306490b != null;
    }

    public void o(@Nullable Map<String, Object> map) {
        this.f306499k = map;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("start_timestamp").j(iLogger, a(this.f306489a));
        if (this.f306490b != null) {
            z3Var.f("timestamp").j(iLogger, a(this.f306490b));
        }
        z3Var.f("trace_id").j(iLogger, this.f306491c);
        z3Var.f("span_id").j(iLogger, this.f306492d);
        if (this.f306493e != null) {
            z3Var.f("parent_span_id").j(iLogger, this.f306493e);
        }
        z3Var.f("op").b(this.f306494f);
        if (this.f306495g != null) {
            z3Var.f("description").b(this.f306495g);
        }
        if (this.f306496h != null) {
            z3Var.f("status").j(iLogger, this.f306496h);
        }
        if (this.f306497i != null) {
            z3Var.f("origin").j(iLogger, this.f306497i);
        }
        if (!this.f306498j.isEmpty()) {
            z3Var.f("tags").j(iLogger, this.f306498j);
        }
        if (this.f306499k != null) {
            z3Var.f("data").j(iLogger, this.f306499k);
        }
        if (!this.f306500l.isEmpty()) {
            z3Var.f("measurements").j(iLogger, this.f306500l);
        }
        Map<String, Object> map = this.f306501m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306501m.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306501m = map;
    }

    @lm.a.c
    public y(@NotNull o9 o9Var, @Nullable Map<String, Object> map) {
        io.sentry.util.y.c(o9Var, "span is required");
        this.f306495g = o9Var.getDescription();
        this.f306494f = o9Var.E6();
        this.f306492d = o9Var.X();
        this.f306493e = o9Var.V();
        this.f306491c = o9Var.Z();
        this.f306496h = o9Var.t();
        this.f306497i = o9Var.m().g();
        Map<String, String> mapF = io.sentry.util.d.f(o9Var.Y());
        if (mapF == null) {
            mapF = new ConcurrentHashMap<>();
        }
        this.f306498j = mapF;
        Map<String, i> mapF2 = io.sentry.util.d.f(o9Var.T());
        this.f306500l = mapF2 == null ? new ConcurrentHashMap<>() : mapF2;
        this.f306490b = o9Var.N() == null ? null : Double.valueOf(io.sentry.p.m(o9Var.Q().f(o9Var.N())));
        this.f306489a = Double.valueOf(io.sentry.p.m(o9Var.Q().k()));
        this.f306499k = map;
    }

    @lm.a.c
    public y(@NotNull Double d10, @Nullable Double d11, @NotNull v vVar, @NotNull v9 v9Var, @Nullable v9 v9Var2, @NotNull String str, @Nullable String str2, @Nullable x9 x9Var, @Nullable String str3, @NotNull Map<String, String> map, @NotNull Map<String, i> map2, @Nullable Map<String, Object> map3) {
        this.f306489a = d10;
        this.f306490b = d11;
        this.f306491c = vVar;
        this.f306492d = v9Var;
        this.f306493e = v9Var2;
        this.f306494f = str;
        this.f306495g = str2;
        this.f306496h = x9Var;
        this.f306497i = str3;
        this.f306498j = map;
        this.f306500l = map2;
        this.f306499k = map3;
    }
}
