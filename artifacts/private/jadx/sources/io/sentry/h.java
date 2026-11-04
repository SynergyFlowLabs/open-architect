package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.v f305503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f305504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f305505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Double f305506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f305507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f305508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final r2 f305509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private q2 f305510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305511i;

    public static final class a implements a2<h> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            io.sentry.protocol.v vVarA = null;
            String strN6 = null;
            String strN7 = null;
            HashMap map = null;
            Double dIa = null;
            String strN8 = null;
            String strN9 = null;
            q2 q2VarB = null;
            r2 r2VarB = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "monitor_config":
                        q2VarB = new q2.a().a(y3Var, iLogger);
                        break;
                    case "duration":
                        dIa = y3Var.ia();
                        break;
                    case "status":
                        strN7 = y3Var.n6();
                        break;
                    case "contexts":
                        r2VarB = new r2.a().a(y3Var, iLogger);
                        break;
                    case "environment":
                        strN9 = y3Var.n6();
                        break;
                    case "release":
                        strN8 = y3Var.n6();
                        break;
                    case "check_in_id":
                        vVarA = new io.sentry.protocol.v.a().a(y3Var, iLogger);
                        break;
                    case "monitor_slug":
                        strN6 = y3Var.n6();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        y3Var.gd(iLogger, map, strNa);
                        break;
                }
            }
            y3Var.F1();
            if (vVarA == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"check_in_id\"");
                iLogger.a(y7.ERROR, "Missing required field \"check_in_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (strN6 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"monitor_slug\"");
                iLogger.a(y7.ERROR, "Missing required field \"monitor_slug\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strN7 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"status\"");
                iLogger.a(y7.ERROR, "Missing required field \"status\"", illegalStateException3);
                throw illegalStateException3;
            }
            h hVar = new h(vVarA, strN6, strN7);
            hVar.i(dIa);
            hVar.m(strN8);
            hVar.j(strN9);
            hVar.k(q2VarB);
            hVar.b().putAll(r2VarB);
            hVar.setUnknown(map);
            return hVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305512a = "check_in_id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305513b = "monitor_slug";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305514c = "status";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305515d = "duration";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f305516e = "release";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f305517f = "environment";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f305518g = "contexts";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f305519h = "monitor_config";
    }

    public h(@NotNull String str, @NotNull i iVar) {
        this((io.sentry.protocol.v) null, str, iVar.apiName());
    }

    @NotNull
    public io.sentry.protocol.v a() {
        return this.f305503a;
    }

    @NotNull
    public r2 b() {
        return this.f305509g;
    }

    @Nullable
    public Double c() {
        return this.f305506d;
    }

    @Nullable
    public String d() {
        return this.f305508f;
    }

    @Nullable
    public q2 e() {
        return this.f305510h;
    }

    @NotNull
    public String f() {
        return this.f305504b;
    }

    @Nullable
    public String g() {
        return this.f305507e;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305511i;
    }

    @NotNull
    public String h() {
        return this.f305505c;
    }

    public void i(@Nullable Double d10) {
        this.f305506d = d10;
    }

    public void j(@Nullable String str) {
        this.f305508f = str;
    }

    public void k(@Nullable q2 q2Var) {
        this.f305510h = q2Var;
    }

    public void l(@NotNull String str) {
        this.f305504b = str;
    }

    public void m(@Nullable String str) {
        this.f305507e = str;
    }

    public void n(@NotNull i iVar) {
        this.f305505c = iVar.apiName();
    }

    public void o(@NotNull String str) {
        this.f305505c = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f(b.f305512a);
        this.f305503a.serialize(z3Var, iLogger);
        z3Var.f(b.f305513b).b(this.f305504b);
        z3Var.f("status").b(this.f305505c);
        if (this.f305506d != null) {
            z3Var.f("duration").i(this.f305506d);
        }
        if (this.f305507e != null) {
            z3Var.f("release").b(this.f305507e);
        }
        if (this.f305508f != null) {
            z3Var.f("environment").b(this.f305508f);
        }
        if (this.f305510h != null) {
            z3Var.f(b.f305519h);
            this.f305510h.serialize(z3Var, iLogger);
        }
        if (this.f305509g != null) {
            z3Var.f("contexts");
            this.f305509g.serialize(z3Var, iLogger);
        }
        Map<String, Object> map = this.f305511i;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f305511i.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305511i = map;
    }

    public h(@Nullable io.sentry.protocol.v vVar, @NotNull String str, @NotNull i iVar) {
        this(vVar, str, iVar.apiName());
    }

    @lm.a.c
    public h(@Nullable io.sentry.protocol.v vVar, @NotNull String str, @NotNull String str2) {
        this.f305509g = new r2();
        this.f305503a = vVar == null ? new io.sentry.protocol.v() : vVar;
        this.f305504b = str;
        this.f305505c = str2;
    }
}
