package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.n8;
import io.sentry.y3;
import io.sentry.y7;
import io.sentry.z3;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f306264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f306266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @Nullable
    private String f306267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private g f306268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Map<String, String> f306269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306270h;

    public static final class a implements a2<g0> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g0 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            g0 g0Var = new g0();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "username":
                        g0Var.f306265c = y3Var.n6();
                        break;
                    case "id":
                        g0Var.f306264b = y3Var.n6();
                        break;
                    case "geo":
                        g0Var.f306268f = new g.a().a(y3Var, iLogger);
                        break;
                    case "data":
                        g0Var.f306269g = io.sentry.util.d.f((Map) y3Var.re());
                        break;
                    case "name":
                        g0Var.f306267e = y3Var.n6();
                        break;
                    case "email":
                        g0Var.f306263a = y3Var.n6();
                        break;
                    case "ip_address":
                        g0Var.f306266d = y3Var.n6();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            g0Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return g0Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306271a = "email";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306272b = "id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306273c = "username";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306274d = "ip_address";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306275e = "name";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306276f = "geo";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306277g = "data";
    }

    public g0() {
    }

    public static g0 h(@NotNull Map<String, Object> map, @NotNull n8 n8Var) {
        g0 g0Var = new g0();
        ConcurrentHashMap concurrentHashMap = null;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            switch (key) {
                case "username":
                    g0Var.f306265c = value instanceof String ? (String) value : null;
                    break;
                case "id":
                    g0Var.f306264b = value instanceof String ? (String) value : null;
                    break;
                case "geo":
                    Map map2 = value instanceof Map ? (Map) value : null;
                    if (map2 != null) {
                        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (!(entry2.getKey() instanceof String) || entry2.getValue() == null) {
                                n8Var.getLogger().c(y7.WARNING, "Invalid key type in gep map.", new Object[0]);
                            } else {
                                concurrentHashMap2.put((String) entry2.getKey(), entry2.getValue());
                            }
                        }
                        g0Var.f306268f = g.d(concurrentHashMap2);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "data":
                    Map map3 = value instanceof Map ? (Map) value : null;
                    if (map3 != null) {
                        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                        for (Map.Entry entry3 : map3.entrySet()) {
                            if (!(entry3.getKey() instanceof String) || entry3.getValue() == null) {
                                n8Var.getLogger().c(y7.WARNING, "Invalid key or null value in data map.", new Object[0]);
                            } else {
                                concurrentHashMap3.put((String) entry3.getKey(), entry3.getValue().toString());
                            }
                        }
                        g0Var.f306269g = concurrentHashMap3;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "name":
                    g0Var.f306267e = value instanceof String ? (String) value : null;
                    break;
                case "email":
                    g0Var.f306263a = value instanceof String ? (String) value : null;
                    break;
                case "ip_address":
                    g0Var.f306266d = value instanceof String ? (String) value : null;
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(entry.getKey(), entry.getValue());
                    break;
            }
        }
        g0Var.f306270h = concurrentHashMap;
        return g0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (io.sentry.util.y.a(this.f306263a, g0Var.f306263a) && io.sentry.util.y.a(this.f306264b, g0Var.f306264b) && io.sentry.util.y.a(this.f306265c, g0Var.f306265c) && io.sentry.util.y.a(this.f306266d, g0Var.f306266d)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306270h;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f306263a, this.f306264b, this.f306265c, this.f306266d);
    }

    @Nullable
    public Map<String, String> i() {
        return this.f306269g;
    }

    @Nullable
    public String j() {
        return this.f306263a;
    }

    @Nullable
    public g k() {
        return this.f306268f;
    }

    @Nullable
    public String l() {
        return this.f306264b;
    }

    @Nullable
    public String m() {
        return this.f306266d;
    }

    @Deprecated
    @Nullable
    public String n() {
        return this.f306267e;
    }

    @Nullable
    public String o() {
        return this.f306265c;
    }

    public void p(@Nullable Map<String, String> map) {
        this.f306269g = io.sentry.util.d.f(map);
    }

    public void q(@Nullable String str) {
        this.f306263a = str;
    }

    public void r(@Nullable g gVar) {
        this.f306268f = gVar;
    }

    public void s(@Nullable String str) {
        this.f306264b = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306263a != null) {
            z3Var.f("email").b(this.f306263a);
        }
        if (this.f306264b != null) {
            z3Var.f("id").b(this.f306264b);
        }
        if (this.f306265c != null) {
            z3Var.f("username").b(this.f306265c);
        }
        if (this.f306266d != null) {
            z3Var.f("ip_address").b(this.f306266d);
        }
        if (this.f306267e != null) {
            z3Var.f("name").b(this.f306267e);
        }
        if (this.f306268f != null) {
            z3Var.f(b.f306276f);
            this.f306268f.serialize(z3Var, iLogger);
        }
        if (this.f306269g != null) {
            z3Var.f("data").j(iLogger, this.f306269g);
        }
        Map<String, Object> map = this.f306270h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306270h.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306270h = map;
    }

    public void t(@Nullable String str) {
        this.f306266d = str;
    }

    @Deprecated
    public void u(@Nullable String str) {
        this.f306267e = str;
    }

    public void v(@Nullable String str) {
        this.f306265c = str;
    }

    public g0(@NotNull g0 g0Var) {
        this.f306263a = g0Var.f306263a;
        this.f306265c = g0Var.f306265c;
        this.f306264b = g0Var.f306264b;
        this.f306266d = g0Var.f306266d;
        this.f306267e = g0Var.f306267e;
        this.f306268f = g0Var.f306268f;
        this.f306269g = io.sentry.util.d.f(g0Var.f306269g);
        this.f306270h = io.sentry.util.d.f(g0Var.f306270h);
    }
}
