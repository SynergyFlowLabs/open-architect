package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements m2, k2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f306368h = "os";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f306370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f306372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f306373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Boolean f306374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306375g;

    public static final class a implements a2<l> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            l lVar = new l();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "rooted":
                        lVar.f306374f = y3Var.J3();
                        break;
                    case "raw_description":
                        lVar.f306371c = y3Var.n6();
                        break;
                    case "name":
                        lVar.f306369a = y3Var.n6();
                        break;
                    case "build":
                        lVar.f306372d = y3Var.n6();
                        break;
                    case "version":
                        lVar.f306370b = y3Var.n6();
                        break;
                    case "kernel_version":
                        lVar.f306373e = y3Var.n6();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            lVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return lVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306376a = "name";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306377b = "version";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306378c = "raw_description";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306379d = "build";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306380e = "kernel_version";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306381f = "rooted";
    }

    public l() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (io.sentry.util.y.a(this.f306369a, lVar.f306369a) && io.sentry.util.y.a(this.f306370b, lVar.f306370b) && io.sentry.util.y.a(this.f306371c, lVar.f306371c) && io.sentry.util.y.a(this.f306372d, lVar.f306372d) && io.sentry.util.y.a(this.f306373e, lVar.f306373e) && io.sentry.util.y.a(this.f306374f, lVar.f306374f)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String g() {
        return this.f306372d;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306375g;
    }

    @Nullable
    public String h() {
        return this.f306373e;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f306369a, this.f306370b, this.f306371c, this.f306372d, this.f306373e, this.f306374f);
    }

    @Nullable
    public String i() {
        return this.f306369a;
    }

    @Nullable
    public String j() {
        return this.f306371c;
    }

    @Nullable
    public String k() {
        return this.f306370b;
    }

    @Nullable
    public Boolean l() {
        return this.f306374f;
    }

    public void m(@Nullable String str) {
        this.f306372d = str;
    }

    public void n(@Nullable String str) {
        this.f306373e = str;
    }

    public void o(@Nullable String str) {
        this.f306369a = str;
    }

    public void p(@Nullable String str) {
        this.f306371c = str;
    }

    public void q(@Nullable Boolean bool) {
        this.f306374f = bool;
    }

    public void r(@Nullable String str) {
        this.f306370b = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306369a != null) {
            z3Var.f("name").b(this.f306369a);
        }
        if (this.f306370b != null) {
            z3Var.f("version").b(this.f306370b);
        }
        if (this.f306371c != null) {
            z3Var.f("raw_description").b(this.f306371c);
        }
        if (this.f306372d != null) {
            z3Var.f("build").b(this.f306372d);
        }
        if (this.f306373e != null) {
            z3Var.f(b.f306380e).b(this.f306373e);
        }
        if (this.f306374f != null) {
            z3Var.f(b.f306381f).k(this.f306374f);
        }
        Map<String, Object> map = this.f306375g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306375g.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306375g = map;
    }

    l(@NotNull l lVar) {
        this.f306369a = lVar.f306369a;
        this.f306370b = lVar.f306370b;
        this.f306371c = lVar.f306371c;
        this.f306372d = lVar.f306372d;
        this.f306373e = lVar.f306373e;
        this.f306374f = lVar.f306374f;
        this.f306375g = io.sentry.util.d.f(lVar.f306375g);
    }
}
