package io.sentry;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class g4 implements m2, k2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f305452o = "android";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f305453s = "java";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.d f305454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.v f305455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.v f305456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.p f305457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, io.sentry.profilemeasurements.a> f305458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private String f305459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private String f305460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private String f305461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private String f305462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f305463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final File f305464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private String f305465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.profiling.a f305466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305467n;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final io.sentry.protocol.v f305468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final io.sentry.protocol.v f305469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Map<String, io.sentry.profilemeasurements.a> f305470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final File f305471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final double f305472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final String f305473f;

        public a(@NotNull io.sentry.protocol.v vVar, @NotNull io.sentry.protocol.v vVar2, @NotNull Map<String, io.sentry.profilemeasurements.a> map, @NotNull File file, @NotNull e6 e6Var, @NotNull String str) {
            this.f305468a = vVar;
            this.f305469b = vVar2;
            this.f305470c = new ConcurrentHashMap(map);
            this.f305471d = file;
            this.f305472e = p.m(e6Var.k());
            this.f305473f = str;
        }

        public g4 a(n8 n8Var) {
            return new g4(this.f305468a, this.f305469b, this.f305471d, this.f305470c, Double.valueOf(this.f305472e), this.f305473f, n8Var);
        }
    }

    public static final class b implements a2<g4> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g4 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            g4 g4Var = new g4();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "debug_meta":
                        io.sentry.protocol.d dVar = (io.sentry.protocol.d) y3Var.i4(iLogger, new io.sentry.protocol.d.a());
                        if (dVar == null) {
                            break;
                        } else {
                            g4Var.f305454a = dVar;
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapFd = y3Var.fd(iLogger, new io.sentry.profilemeasurements.a.C2225a());
                        if (mapFd == null) {
                            break;
                        } else {
                            g4Var.f305458e.putAll(mapFd);
                            break;
                        }
                        break;
                    case "profile":
                        io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) y3Var.i4(iLogger, new io.sentry.protocol.profiling.a.b());
                        if (aVar == null) {
                            break;
                        } else {
                            g4Var.f305466m = aVar;
                            break;
                        }
                        break;
                    case "environment":
                        String strN6 = y3Var.n6();
                        if (strN6 == null) {
                            break;
                        } else {
                            g4Var.f305461h = strN6;
                            break;
                        }
                        break;
                    case "timestamp":
                        Double dIa = y3Var.ia();
                        if (dIa == null) {
                            break;
                        } else {
                            g4Var.f305463j = dIa.doubleValue();
                            break;
                        }
                        break;
                    case "profiler_id":
                        io.sentry.protocol.v vVar = (io.sentry.protocol.v) y3Var.i4(iLogger, new io.sentry.protocol.v.a());
                        if (vVar == null) {
                            break;
                        } else {
                            g4Var.f305455b = vVar;
                            break;
                        }
                        break;
                    case "version":
                        String strN7 = y3Var.n6();
                        if (strN7 == null) {
                            break;
                        } else {
                            g4Var.f305462i = strN7;
                            break;
                        }
                        break;
                    case "release":
                        String strN8 = y3Var.n6();
                        if (strN8 == null) {
                            break;
                        } else {
                            g4Var.f305460g = strN8;
                            break;
                        }
                        break;
                    case "client_sdk":
                        io.sentry.protocol.p pVar = (io.sentry.protocol.p) y3Var.i4(iLogger, new io.sentry.protocol.p.a());
                        if (pVar == null) {
                            break;
                        } else {
                            g4Var.f305457d = pVar;
                            break;
                        }
                        break;
                    case "platform":
                        String strN9 = y3Var.n6();
                        if (strN9 == null) {
                            break;
                        } else {
                            g4Var.f305459f = strN9;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        String strN10 = y3Var.n6();
                        if (strN10 == null) {
                            break;
                        } else {
                            g4Var.f305465l = strN10;
                            break;
                        }
                        break;
                    case "chunk_id":
                        io.sentry.protocol.v vVar2 = (io.sentry.protocol.v) y3Var.i4(iLogger, new io.sentry.protocol.v.a());
                        if (vVar2 == null) {
                            break;
                        } else {
                            g4Var.f305456c = vVar2;
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
            g4Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return g4Var;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305474a = "debug_meta";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305475b = "profiler_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305476c = "chunk_id";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305477d = "client_sdk";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f305478e = "measurements";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f305479f = "platform";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f305480g = "release";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f305481h = "environment";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f305482i = "version";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f305483j = "sampled_profile";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f305484k = "timestamp";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f305485l = "profile";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g4() {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
        this(vVar, vVar, new File("dummy"), new HashMap(), Double.valueOf(0.0d), "android", n8.empty());
    }

    @NotNull
    private BigDecimal m(@NotNull Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public void A(@Nullable io.sentry.protocol.d dVar) {
        this.f305454a = dVar;
    }

    public void B(@Nullable String str) {
        this.f305465l = str;
    }

    public void C(@Nullable io.sentry.protocol.profiling.a aVar) {
        this.f305466m = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return Objects.equals(this.f305454a, g4Var.f305454a) && Objects.equals(this.f305455b, g4Var.f305455b) && Objects.equals(this.f305456c, g4Var.f305456c) && Objects.equals(this.f305457d, g4Var.f305457d) && Objects.equals(this.f305458e, g4Var.f305458e) && Objects.equals(this.f305459f, g4Var.f305459f) && Objects.equals(this.f305460g, g4Var.f305460g) && Objects.equals(this.f305461h, g4Var.f305461h) && Objects.equals(this.f305462i, g4Var.f305462i) && Objects.equals(this.f305465l, g4Var.f305465l) && Objects.equals(this.f305467n, g4Var.f305467n) && Objects.equals(this.f305466m, g4Var.f305466m);
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305467n;
    }

    public int hashCode() {
        return Objects.hash(this.f305454a, this.f305455b, this.f305456c, this.f305457d, this.f305458e, this.f305459f, this.f305460g, this.f305461h, this.f305462i, this.f305465l, this.f305466m, this.f305467n);
    }

    @NotNull
    public io.sentry.protocol.v n() {
        return this.f305456c;
    }

    @Nullable
    public io.sentry.protocol.p o() {
        return this.f305457d;
    }

    @Nullable
    public io.sentry.protocol.d p() {
        return this.f305454a;
    }

    @Nullable
    public String q() {
        return this.f305461h;
    }

    @NotNull
    public Map<String, io.sentry.profilemeasurements.a> r() {
        return this.f305458e;
    }

    @NotNull
    public String s() {
        return this.f305459f;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f305454a != null) {
            z3Var.f("debug_meta").j(iLogger, this.f305454a);
        }
        z3Var.f("profiler_id").j(iLogger, this.f305455b);
        z3Var.f(c.f305476c).j(iLogger, this.f305456c);
        if (this.f305457d != null) {
            z3Var.f(c.f305477d).j(iLogger, this.f305457d);
        }
        if (!this.f305458e.isEmpty()) {
            String strA = z3Var.a();
            z3Var.h("");
            z3Var.f("measurements").j(iLogger, this.f305458e);
            z3Var.h(strA);
        }
        z3Var.f("platform").j(iLogger, this.f305459f);
        z3Var.f("release").j(iLogger, this.f305460g);
        if (this.f305461h != null) {
            z3Var.f("environment").j(iLogger, this.f305461h);
        }
        z3Var.f("version").j(iLogger, this.f305462i);
        if (this.f305465l != null) {
            z3Var.f("sampled_profile").j(iLogger, this.f305465l);
        }
        z3Var.f("timestamp").j(iLogger, m(Double.valueOf(this.f305463j)));
        if (this.f305466m != null) {
            z3Var.f("profile").j(iLogger, this.f305466m);
        }
        Map<String, Object> map = this.f305467n;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f305467n.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305467n = map;
    }

    @NotNull
    public io.sentry.protocol.v t() {
        return this.f305455b;
    }

    @NotNull
    public String u() {
        return this.f305460g;
    }

    @Nullable
    public String v() {
        return this.f305465l;
    }

    @Nullable
    public io.sentry.protocol.profiling.a w() {
        return this.f305466m;
    }

    public double x() {
        return this.f305463j;
    }

    @NotNull
    public File y() {
        return this.f305464k;
    }

    @NotNull
    public String z() {
        return this.f305462i;
    }

    public g4(@NotNull io.sentry.protocol.v vVar, @NotNull io.sentry.protocol.v vVar2, @NotNull File file, @NotNull Map<String, io.sentry.profilemeasurements.a> map, @NotNull Double d10, @NotNull String str, @NotNull n8 n8Var) {
        this.f305465l = null;
        this.f305455b = vVar;
        this.f305456c = vVar2;
        this.f305464k = file;
        this.f305458e = map;
        this.f305454a = null;
        this.f305457d = n8Var.getSdkVersion();
        this.f305460g = n8Var.getRelease() != null ? n8Var.getRelease() : "";
        this.f305461h = n8Var.getEnvironment();
        this.f305459f = str;
        this.f305462i = "2";
        this.f305463j = d10.doubleValue();
    }
}
