package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends io.sentry.rrweb.b implements k2, m2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f306702l = "performanceSpan";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f306703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f306704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f306705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f306706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f306707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306711k;

    public static final class a implements a2<i> {
        private void c(@NotNull i iVar, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("payload")) {
                    d(iVar, y3Var, iLogger);
                } else if (strNa.equals("tag")) {
                    String strN6 = y3Var.n6();
                    if (strN6 == null) {
                        strN6 = "";
                    }
                    iVar.f306703c = strN6;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    y3Var.gd(iLogger, concurrentHashMap, strNa);
                }
            }
            iVar.z(concurrentHashMap);
            y3Var.F1();
        }

        private void d(@NotNull i iVar, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "description":
                        iVar.f306705e = y3Var.n6();
                        break;
                    case "endTimestamp":
                        iVar.f306707g = y3Var.nextDouble();
                        break;
                    case "startTimestamp":
                        iVar.f306706f = y3Var.nextDouble();
                        break;
                    case "op":
                        iVar.f306704d = y3Var.n6();
                        break;
                    case "data":
                        Map mapF = io.sentry.util.d.f((Map) y3Var.re());
                        if (mapF == null) {
                            break;
                        } else {
                            iVar.f306708h = mapF;
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
            iVar.D(concurrentHashMap);
            y3Var.F1();
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            i iVar = new i();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("data")) {
                    c(iVar, y3Var, iLogger);
                } else if (!aVar.a(iVar, strNa, y3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            iVar.setUnknown(map);
            y3Var.F1();
            return iVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306712a = "data";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306713b = "payload";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306714c = "op";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306715d = "description";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306716e = "startTimestamp";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306717f = "endTimestamp";
    }

    public i() {
        super(c.Custom);
        this.f306703c = f306702l;
    }

    private void w(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("tag").b(this.f306703c);
        z3Var.f("payload");
        x(z3Var, iLogger);
        Map<String, Object> map = this.f306711k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306711k.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    private void x(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306704d != null) {
            z3Var.f("op").b(this.f306704d);
        }
        if (this.f306705e != null) {
            z3Var.f("description").b(this.f306705e);
        }
        z3Var.f(b.f306716e).j(iLogger, BigDecimal.valueOf(this.f306706f));
        z3Var.f(b.f306717f).j(iLogger, BigDecimal.valueOf(this.f306707g));
        if (this.f306708h != null) {
            z3Var.f("data").j(iLogger, this.f306708h);
        }
        Map<String, Object> map = this.f306710j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306710j.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    public void A(@Nullable String str) {
        this.f306705e = str;
    }

    public void B(double d10) {
        this.f306707g = d10;
    }

    public void C(@Nullable String str) {
        this.f306704d = str;
    }

    public void D(@Nullable Map<String, Object> map) {
        this.f306710j = map;
    }

    public void E(double d10) {
        this.f306706f = d10;
    }

    public void F(@NotNull String str) {
        this.f306703c = str;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306709i;
    }

    @Nullable
    public Map<String, Object> o() {
        return this.f306708h;
    }

    @Nullable
    public Map<String, Object> p() {
        return this.f306711k;
    }

    @Nullable
    public String q() {
        return this.f306705e;
    }

    public double r() {
        return this.f306707g;
    }

    @Nullable
    public String s() {
        return this.f306704d;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        new io.sentry.rrweb.b.c().a(this, z3Var, iLogger);
        z3Var.f("data");
        w(z3Var, iLogger);
        Map<String, Object> map = this.f306709i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306709i.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306709i = map;
    }

    @Nullable
    public Map<String, Object> t() {
        return this.f306710j;
    }

    public double u() {
        return this.f306706f;
    }

    @NotNull
    public String v() {
        return this.f306703c;
    }

    public void y(@Nullable Map<String, Object> map) {
        this.f306708h = map == null ? null : new ConcurrentHashMap(map);
    }

    public void z(@Nullable Map<String, Object> map) {
        this.f306711k = map;
    }
}
