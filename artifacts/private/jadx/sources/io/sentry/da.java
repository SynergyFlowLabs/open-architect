package io.sentry;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.b
public final class da implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.v f305360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f305361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f305362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f305363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f305364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f305365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f305366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f305367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f305368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final io.sentry.protocol.v f305369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305370k;

    public static final class a implements a2<da> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(y7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public da a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.v vVarA = null;
            String strJc = null;
            String strN6 = null;
            String strN7 = null;
            String strN8 = null;
            String strN9 = null;
            String strN10 = null;
            String strN11 = null;
            io.sentry.protocol.v vVarA2 = null;
            String strN12 = null;
            while (true) {
                io.sentry.protocol.v vVar = vVarA;
                String str = strJc;
                if (y3Var.peek() != io.sentry.vendor.gson.stream.c.NAME) {
                    if (vVar == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (str == null) {
                        throw c(b.f305372b, iLogger);
                    }
                    da daVar = new da(vVar, str, strN6, strN7, strN8, strN9, strN10, strN11, vVarA2, strN12);
                    daVar.setUnknown(concurrentHashMap);
                    y3Var.F1();
                    return daVar;
                }
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "replay_id":
                        vVarA2 = new io.sentry.protocol.v.a().a(y3Var, iLogger);
                        vVarA = vVar;
                        strJc = str;
                        break;
                    case "user_id":
                        strN8 = y3Var.n6();
                        vVarA = vVar;
                        strJc = str;
                        break;
                    case "environment":
                        strN7 = y3Var.n6();
                        vVarA = vVar;
                        strJc = str;
                        break;
                    case "sample_rand":
                        strN12 = y3Var.n6();
                        vVarA = vVar;
                        strJc = str;
                        break;
                    case "sample_rate":
                        strN10 = y3Var.n6();
                        vVarA = vVar;
                        strJc = str;
                        break;
                    case "release":
                        strN6 = y3Var.n6();
                        vVarA = vVar;
                        strJc = str;
                        break;
                    case "trace_id":
                        vVarA = new io.sentry.protocol.v.a().a(y3Var, iLogger);
                        strJc = str;
                        break;
                    case "sampled":
                        strN11 = y3Var.n6();
                        vVarA = vVar;
                        strJc = str;
                        break;
                    case "public_key":
                        strJc = y3Var.jc();
                        vVarA = vVar;
                        break;
                    case "transaction":
                        strN9 = y3Var.n6();
                        vVarA = vVar;
                        strJc = str;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        vVarA = vVar;
                        strJc = str;
                        break;
                }
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305371a = "trace_id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305372b = "public_key";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305373c = "release";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305374d = "environment";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f305375e = "user_id";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f305376f = "transaction";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f305377g = "sample_rate";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f305378h = "sample_rand";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f305379i = "sampled";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f305380j = "replay_id";
    }

    da(@NotNull io.sentry.protocol.v vVar, @NotNull String str) {
        this(vVar, str, null, null, null, null, null, null, null);
    }

    @Nullable
    private static String k(@NotNull n8 n8Var, @Nullable io.sentry.protocol.g0 g0Var) {
        if (!n8Var.isSendDefaultPii() || g0Var == null) {
            return null;
        }
        return g0Var.l();
    }

    @Nullable
    public String a() {
        return this.f305363d;
    }

    @NotNull
    public String b() {
        return this.f305361b;
    }

    @Nullable
    public String c() {
        return this.f305362c;
    }

    @Nullable
    public io.sentry.protocol.v d() {
        return this.f305369j;
    }

    @Nullable
    public String e() {
        return this.f305367h;
    }

    @Nullable
    public String f() {
        return this.f305366g;
    }

    @Nullable
    public String g() {
        return this.f305368i;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305370k;
    }

    @NotNull
    public io.sentry.protocol.v h() {
        return this.f305360a;
    }

    @Nullable
    public String i() {
        return this.f305365f;
    }

    @Nullable
    public String j() {
        return this.f305364e;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("trace_id").j(iLogger, this.f305360a);
        z3Var.f(b.f305372b).b(this.f305361b);
        if (this.f305362c != null) {
            z3Var.f("release").b(this.f305362c);
        }
        if (this.f305363d != null) {
            z3Var.f("environment").b(this.f305363d);
        }
        if (this.f305364e != null) {
            z3Var.f("user_id").b(this.f305364e);
        }
        if (this.f305365f != null) {
            z3Var.f("transaction").b(this.f305365f);
        }
        if (this.f305366g != null) {
            z3Var.f(b.f305377g).b(this.f305366g);
        }
        if (this.f305367h != null) {
            z3Var.f(b.f305378h).b(this.f305367h);
        }
        if (this.f305368i != null) {
            z3Var.f(b.f305379i).b(this.f305368i);
        }
        if (this.f305369j != null) {
            z3Var.f("replay_id").j(iLogger, this.f305369j);
        }
        Map<String, Object> map = this.f305370k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f305370k.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305370k = map;
    }

    @Deprecated
    da(@NotNull io.sentry.protocol.v vVar, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable io.sentry.protocol.v vVar2) {
        this(vVar, str, str2, str3, str4, str5, str6, str7, vVar2, null);
    }

    da(@NotNull io.sentry.protocol.v vVar, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable io.sentry.protocol.v vVar2, @Nullable String str8) {
        this.f305360a = vVar;
        this.f305361b = str;
        this.f305362c = str2;
        this.f305363d = str3;
        this.f305364e = str4;
        this.f305365f = str5;
        this.f305366g = str6;
        this.f305368i = str7;
        this.f305369j = vVar2;
        this.f305367h = str8;
    }
}
