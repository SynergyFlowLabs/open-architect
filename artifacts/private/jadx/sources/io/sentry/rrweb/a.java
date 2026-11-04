package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.y7;
import io.sentry.z3;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends io.sentry.rrweb.b implements m2, k2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f306629m = "breadcrumb";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f306630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f306631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f306632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f306633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f306634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private y7 f306635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306639l;

    /* JADX INFO: renamed from: io.sentry.rrweb.a$a, reason: collision with other inner class name */
    public static final class C2231a implements a2<a> {
        private void c(@NotNull a aVar, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("payload")) {
                    d(aVar, y3Var, iLogger);
                } else if (strNa.equals("tag")) {
                    String strN6 = y3Var.n6();
                    if (strN6 == null) {
                        strN6 = "";
                    }
                    aVar.f306630c = strN6;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    y3Var.gd(iLogger, concurrentHashMap, strNa);
                }
            }
            aVar.E(concurrentHashMap);
            y3Var.F1();
        }

        private void d(@NotNull a aVar, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "data":
                        Map mapF = io.sentry.util.d.f((Map) y3Var.re());
                        if (mapF == null) {
                            break;
                        } else {
                            aVar.f306636i = mapF;
                            break;
                        }
                        break;
                    case "type":
                        aVar.f306632e = y3Var.n6();
                        break;
                    case "category":
                        aVar.f306633f = y3Var.n6();
                        break;
                    case "timestamp":
                        aVar.f306631d = y3Var.nextDouble();
                        break;
                    case "level":
                        try {
                            aVar.f306635h = new y7.a().a(y3Var, iLogger);
                            break;
                        } catch (Exception e10) {
                            iLogger.b(y7.DEBUG, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        aVar.f306634g = y3Var.n6();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            aVar.H(concurrentHashMap);
            y3Var.F1();
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            a aVar = new a();
            io.sentry.rrweb.b.a aVar2 = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("data")) {
                    c(aVar, y3Var, iLogger);
                } else if (!aVar2.a(aVar, strNa, y3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            aVar.setUnknown(map);
            y3Var.F1();
            return aVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306640a = "data";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306641b = "payload";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306642c = "timestamp";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306643d = "type";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306644e = "category";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306645f = "message";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306646g = "level";
    }

    public a() {
        super(c.Custom);
        this.f306630c = f306629m;
    }

    private void y(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("tag").b(this.f306630c);
        z3Var.f("payload");
        z(z3Var, iLogger);
        Map<String, Object> map = this.f306639l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306639l.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    private void z(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306632e != null) {
            z3Var.f("type").b(this.f306632e);
        }
        z3Var.f("timestamp").j(iLogger, BigDecimal.valueOf(this.f306631d));
        if (this.f306633f != null) {
            z3Var.f("category").b(this.f306633f);
        }
        if (this.f306634g != null) {
            z3Var.f("message").b(this.f306634g);
        }
        if (this.f306635h != null) {
            z3Var.f("level").j(iLogger, this.f306635h);
        }
        if (this.f306636i != null) {
            z3Var.f("data").j(iLogger, this.f306636i);
        }
        Map<String, Object> map = this.f306638k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306638k.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    public void A(double d10) {
        this.f306631d = d10;
    }

    public void B(@Nullable String str) {
        this.f306632e = str;
    }

    public void C(@Nullable String str) {
        this.f306633f = str;
    }

    public void D(@Nullable Map<String, Object> map) {
        this.f306636i = map == null ? null : new ConcurrentHashMap(map);
    }

    public void E(@Nullable Map<String, Object> map) {
        this.f306639l = map;
    }

    public void F(@Nullable y7 y7Var) {
        this.f306635h = y7Var;
    }

    public void G(@Nullable String str) {
        this.f306634g = str;
    }

    public void H(@Nullable Map<String, Object> map) {
        this.f306638k = map;
    }

    public void I(@NotNull String str) {
        this.f306630c = str;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306637j;
    }

    public double p() {
        return this.f306631d;
    }

    @Nullable
    public String q() {
        return this.f306632e;
    }

    @Nullable
    public String r() {
        return this.f306633f;
    }

    @Nullable
    public Map<String, Object> s() {
        return this.f306636i;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        new io.sentry.rrweb.b.c().a(this, z3Var, iLogger);
        z3Var.f("data");
        y(z3Var, iLogger);
        Map<String, Object> map = this.f306637j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306637j.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306637j = map;
    }

    @Nullable
    public Map<String, Object> t() {
        return this.f306639l;
    }

    @Nullable
    public y7 u() {
        return this.f306635h;
    }

    @Nullable
    public String v() {
        return this.f306634g;
    }

    @Nullable
    public Map<String, Object> w() {
        return this.f306638k;
    }

    @NotNull
    public String x() {
        return this.f306630c;
    }
}
