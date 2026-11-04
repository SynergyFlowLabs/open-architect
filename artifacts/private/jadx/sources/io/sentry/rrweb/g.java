package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.util.y;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends io.sentry.rrweb.b implements m2, k2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f306686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f306687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f306688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306690g;

    public static final class a implements a2<g> {
        private void c(@NotNull g gVar, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                int iIntValue = 0;
                switch (strNa) {
                    case "height":
                        Integer numRc = y3Var.rc();
                        if (numRc != null) {
                            iIntValue = numRc.intValue();
                        }
                        gVar.f306687d = iIntValue;
                        break;
                    case "href":
                        String strN6 = y3Var.n6();
                        if (strN6 == null) {
                            strN6 = "";
                        }
                        gVar.f306686c = strN6;
                        break;
                    case "width":
                        Integer numRc2 = y3Var.rc();
                        gVar.f306688e = numRc2 != null ? numRc2.intValue() : 0;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            gVar.q(concurrentHashMap);
            y3Var.F1();
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            g gVar = new g();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("data")) {
                    c(gVar, y3Var, iLogger);
                } else if (!aVar.a(gVar, strNa, y3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            gVar.setUnknown(map);
            y3Var.F1();
            return gVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306691a = "data";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306692b = "href";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306693c = "height";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306694d = "width";
    }

    public g() {
        super(c.Meta);
        this.f306686c = "";
    }

    private void p(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("href").b(this.f306686c);
        z3Var.f("height").c(this.f306687d);
        z3Var.f("width").c(this.f306688e);
        Map<String, Object> map = this.f306689f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306689f.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f306687d == gVar.f306687d && this.f306688e == gVar.f306688e && y.a(this.f306686c, gVar.f306686c)) {
            return true;
        }
        return false;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306689f;
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return y.b(Integer.valueOf(super.hashCode()), this.f306686c, Integer.valueOf(this.f306687d), Integer.valueOf(this.f306688e));
    }

    @Nullable
    public Map<String, Object> l() {
        return this.f306690g;
    }

    public int m() {
        return this.f306687d;
    }

    @NotNull
    public String n() {
        return this.f306686c;
    }

    public int o() {
        return this.f306688e;
    }

    public void q(@Nullable Map<String, Object> map) {
        this.f306690g = map;
    }

    public void r(int i10) {
        this.f306687d = i10;
    }

    public void s(@NotNull String str) {
        this.f306686c = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        new io.sentry.rrweb.b.c().a(this, z3Var, iLogger);
        z3Var.f("data");
        p(z3Var, iLogger);
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306689f = map;
    }

    public void t(int i10) {
        this.f306688e = i10;
    }
}
