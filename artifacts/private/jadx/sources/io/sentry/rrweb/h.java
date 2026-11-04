package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.n8;
import io.sentry.p8;
import io.sentry.protocol.p;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends io.sentry.rrweb.b implements k2, m2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f306695g = "options";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f306696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Map<String, Object> f306697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306699f;

    public static final class a implements a2<h> {
        private void c(@NotNull h hVar, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("payload")) {
                    d(hVar, y3Var, iLogger);
                } else if (strNa.equals("tag")) {
                    String strN6 = y3Var.n6();
                    if (strN6 == null) {
                        strN6 = "";
                    }
                    hVar.f306696c = strN6;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    y3Var.gd(iLogger, concurrentHashMap, strNa);
                }
            }
            hVar.o(concurrentHashMap);
            y3Var.F1();
        }

        private void d(@NotNull h hVar, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                if (map == null) {
                    map = new HashMap();
                }
                y3Var.gd(iLogger, map, strNa);
            }
            if (map != null) {
                hVar.p(map);
            }
            y3Var.F1();
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            h hVar = new h();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("data")) {
                    c(hVar, y3Var, iLogger);
                } else if (!aVar.a(hVar, strNa, y3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            hVar.setUnknown(map);
            y3Var.F1();
            return hVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306700a = "data";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306701b = "payload";
    }

    public h() {
        super(c.Custom);
        this.f306697d = new HashMap();
        this.f306696c = f306695g;
    }

    private void m(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("tag").b(this.f306696c);
        z3Var.f("payload");
        n(z3Var, iLogger);
        Map<String, Object> map = this.f306699f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306699f.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    private void n(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        Map<String, Object> map = this.f306697d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306697d.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306698e;
    }

    @Nullable
    public Map<String, Object> j() {
        return this.f306699f;
    }

    @NotNull
    public Map<String, Object> k() {
        return this.f306697d;
    }

    @NotNull
    public String l() {
        return this.f306696c;
    }

    public void o(@Nullable Map<String, Object> map) {
        this.f306699f = map;
    }

    public void p(@NotNull Map<String, Object> map) {
        this.f306697d = map;
    }

    public void q(@NotNull String str) {
        this.f306696c = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        new io.sentry.rrweb.b.c().a(this, z3Var, iLogger);
        z3Var.f("data");
        m(z3Var, iLogger);
        Map<String, Object> map = this.f306698e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306698e.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306698e = map;
    }

    public h(@NotNull n8 n8Var) {
        this();
        p sdkVersion = n8Var.getSdkVersion();
        if (sdkVersion != null) {
            this.f306697d.put("nativeSdkName", sdkVersion.f());
            this.f306697d.put("nativeSdkVersion", sdkVersion.h());
        }
        p8 sessionReplay = n8Var.getSessionReplay();
        this.f306697d.put("errorSampleRate", sessionReplay.g());
        this.f306697d.put("sessionSampleRate", sessionReplay.k());
        this.f306697d.put("maskAllImages", Boolean.valueOf(sessionReplay.e().contains(p8.f306016p)));
        this.f306697d.put("maskAllText", Boolean.valueOf(sessionReplay.e().contains("android.widget.TextView")));
        this.f306697d.put("quality", sessionReplay.h().serializedName());
        this.f306697d.put("maskedViewClasses", sessionReplay.e());
        this.f306697d.put("unmaskedViewClasses", sessionReplay.m());
    }
}
