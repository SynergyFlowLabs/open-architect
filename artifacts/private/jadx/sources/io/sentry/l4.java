package io.sentry;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class l4 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f305820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f305821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f305822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Long f305823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Long f305824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Long f305825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Long f305826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305827h;

    public static final class a implements a2<l4> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l4 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            l4 l4Var = new l4();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "relative_start_ns":
                        Long lGc = y3Var.Gc();
                        if (lGc == null) {
                            break;
                        } else {
                            l4Var.f305823d = lGc;
                            break;
                        }
                        break;
                    case "relative_end_ns":
                        Long lGc2 = y3Var.Gc();
                        if (lGc2 == null) {
                            break;
                        } else {
                            l4Var.f305824e = lGc2;
                            break;
                        }
                        break;
                    case "id":
                        String strN6 = y3Var.n6();
                        if (strN6 == null) {
                            break;
                        } else {
                            l4Var.f305820a = strN6;
                            break;
                        }
                        break;
                    case "name":
                        String strN7 = y3Var.n6();
                        if (strN7 == null) {
                            break;
                        } else {
                            l4Var.f305822c = strN7;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strN8 = y3Var.n6();
                        if (strN8 == null) {
                            break;
                        } else {
                            l4Var.f305821b = strN8;
                            break;
                        }
                        break;
                    case "relative_cpu_end_ms":
                        Long lGc3 = y3Var.Gc();
                        if (lGc3 == null) {
                            break;
                        } else {
                            l4Var.f305826g = lGc3;
                            break;
                        }
                        break;
                    case "relative_cpu_start_ms":
                        Long lGc4 = y3Var.Gc();
                        if (lGc4 == null) {
                            break;
                        } else {
                            l4Var.f305825f = lGc4;
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
            l4Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return l4Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305828a = "id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305829b = "trace_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305830c = "name";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305831d = "relative_start_ns";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f305832e = "relative_end_ns";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f305833f = "relative_cpu_start_ms";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f305834g = "relative_cpu_end_ms";
    }

    public l4() {
        this(u3.R(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l4.class == obj.getClass()) {
            l4 l4Var = (l4) obj;
            if (this.f305820a.equals(l4Var.f305820a) && this.f305821b.equals(l4Var.f305821b) && this.f305822c.equals(l4Var.f305822c) && this.f305823d.equals(l4Var.f305823d) && this.f305825f.equals(l4Var.f305825f) && io.sentry.util.y.a(this.f305826g, l4Var.f305826g) && io.sentry.util.y.a(this.f305824e, l4Var.f305824e) && io.sentry.util.y.a(this.f305827h, l4Var.f305827h)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305827h;
    }

    @NotNull
    public String h() {
        return this.f305820a;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f305820a, this.f305821b, this.f305822c, this.f305823d, this.f305824e, this.f305825f, this.f305826g, this.f305827h);
    }

    @NotNull
    public String i() {
        return this.f305822c;
    }

    @Nullable
    public Long j() {
        return this.f305826g;
    }

    @Nullable
    public Long k() {
        return this.f305824e;
    }

    @NotNull
    public Long l() {
        return this.f305825f;
    }

    @NotNull
    public Long m() {
        return this.f305823d;
    }

    @NotNull
    public String n() {
        return this.f305821b;
    }

    public void o(@NotNull Long l10, @NotNull Long l11, @NotNull Long l12, @NotNull Long l13) {
        if (this.f305824e == null) {
            this.f305824e = Long.valueOf(l10.longValue() - l11.longValue());
            this.f305823d = Long.valueOf(this.f305823d.longValue() - l11.longValue());
            this.f305826g = Long.valueOf(l12.longValue() - l13.longValue());
            this.f305825f = Long.valueOf(this.f305825f.longValue() - l13.longValue());
        }
    }

    public void p(@NotNull String str) {
        this.f305820a = str;
    }

    public void q(@NotNull String str) {
        this.f305822c = str;
    }

    public void r(@Nullable Long l10) {
        this.f305824e = l10;
    }

    public void s(@NotNull Long l10) {
        this.f305823d = l10;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("id").j(iLogger, this.f305820a);
        z3Var.f("trace_id").j(iLogger, this.f305821b);
        z3Var.f("name").j(iLogger, this.f305822c);
        z3Var.f(b.f305831d).j(iLogger, this.f305823d);
        z3Var.f(b.f305832e).j(iLogger, this.f305824e);
        z3Var.f(b.f305833f).j(iLogger, this.f305825f);
        z3Var.f(b.f305834g).j(iLogger, this.f305826g);
        Map<String, Object> map = this.f305827h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f305827h.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305827h = map;
    }

    public void t(@NotNull String str) {
        this.f305821b = str;
    }

    public l4(@NotNull r1 r1Var, @NotNull Long l10, @NotNull Long l11) {
        this.f305820a = r1Var.x().toString();
        this.f305821b = r1Var.m().p().toString();
        this.f305822c = r1Var.getName().isEmpty() ? "unknown" : r1Var.getName();
        this.f305823d = l10;
        this.f305825f = l11;
    }
}
