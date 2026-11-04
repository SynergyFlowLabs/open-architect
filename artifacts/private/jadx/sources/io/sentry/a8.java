package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a8 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.v f303893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private Double f303894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f303895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private d8 f303896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Integer f303897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Map<String, b8> f303898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f303899g;

    public static final class a implements a2<a8> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a8 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            io.sentry.protocol.v vVar = null;
            Double dIa = null;
            String strN6 = null;
            HashMap map = null;
            d8 d8Var = null;
            Map<String, b8> mapFd = null;
            Integer numRc = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "severity_number":
                        numRc = y3Var.rc();
                        break;
                    case "body":
                        strN6 = y3Var.n6();
                        break;
                    case "timestamp":
                        dIa = y3Var.ia();
                        break;
                    case "level":
                        d8Var = (d8) y3Var.i4(iLogger, new d8.a());
                        break;
                    case "attributes":
                        mapFd = y3Var.fd(iLogger, new b8.a());
                        break;
                    case "trace_id":
                        vVar = (io.sentry.protocol.v) y3Var.i4(iLogger, new io.sentry.protocol.v.a());
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
            if (vVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.a(y7.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (dIa == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"timestamp\"");
                iLogger.a(y7.ERROR, "Missing required field \"timestamp\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strN6 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                iLogger.a(y7.ERROR, "Missing required field \"body\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (d8Var == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                iLogger.a(y7.ERROR, "Missing required field \"level\"", illegalStateException4);
                throw illegalStateException4;
            }
            a8 a8Var = new a8(vVar, dIa, strN6, d8Var);
            a8Var.g(mapFd);
            a8Var.j(numRc);
            a8Var.setUnknown(map);
            return a8Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f303900a = "timestamp";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f303901b = "trace_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f303902c = "level";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f303903d = "severity_number";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f303904e = "body";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f303905f = "attributes";
    }

    public a8(@NotNull io.sentry.protocol.v vVar, @NotNull e6 e6Var, @NotNull String str, @NotNull d8 d8Var) {
        this(vVar, Double.valueOf(p.m(e6Var.k())), str, d8Var);
    }

    @Nullable
    public Map<String, b8> a() {
        return this.f303898f;
    }

    @NotNull
    public String b() {
        return this.f303895c;
    }

    @NotNull
    public d8 c() {
        return this.f303896d;
    }

    @Nullable
    public Integer d() {
        return this.f303897e;
    }

    @NotNull
    public Double e() {
        return this.f303894b;
    }

    public void f(@Nullable String str, @Nullable b8 b8Var) {
        if (str == null) {
            return;
        }
        if (this.f303898f == null) {
            this.f303898f = new HashMap();
        }
        this.f303898f.put(str, b8Var);
    }

    public void g(@Nullable Map<String, b8> map) {
        this.f303898f = map;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f303899g;
    }

    public void h(@NotNull String str) {
        this.f303895c = str;
    }

    public void i(@NotNull d8 d8Var) {
        this.f303896d = d8Var;
    }

    public void j(@Nullable Integer num) {
        this.f303897e = num;
    }

    public void k(@NotNull Double d10) {
        this.f303894b = d10;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("timestamp").j(iLogger, p.c(this.f303894b));
        z3Var.f("trace_id").j(iLogger, this.f303893a);
        z3Var.f("body").b(this.f303895c);
        z3Var.f("level").j(iLogger, this.f303896d);
        if (this.f303897e != null) {
            z3Var.f(b.f303903d).j(iLogger, this.f303897e);
        }
        if (this.f303898f != null) {
            z3Var.f(b.f303905f).j(iLogger, this.f303898f);
        }
        Map<String, Object> map = this.f303899g;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f303899g.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f303899g = map;
    }

    public a8(@NotNull io.sentry.protocol.v vVar, @NotNull Double d10, @NotNull String str, @NotNull d8 d8Var) {
        this.f303893a = vVar;
        this.f303894b = d10;
        this.f303895c = str;
        this.f303896d = d8Var;
    }
}
