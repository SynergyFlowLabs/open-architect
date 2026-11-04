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
public final class n implements m2, k2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f306405g = "response";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Map<String, String> f306407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Integer f306408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Long f306409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Object f306410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306411f;

    public static final class a implements a2<n> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            n nVar = new n();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "status_code":
                        nVar.f306408c = y3Var.rc();
                        break;
                    case "data":
                        nVar.f306410e = y3Var.re();
                        break;
                    case "headers":
                        Map map = (Map) y3Var.re();
                        if (map == null) {
                            break;
                        } else {
                            nVar.f306407b = io.sentry.util.d.f(map);
                            break;
                        }
                        break;
                    case "cookies":
                        nVar.f306406a = y3Var.n6();
                        break;
                    case "body_size":
                        nVar.f306409d = y3Var.Gc();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            nVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return nVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306412a = "cookies";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306413b = "headers";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306414c = "status_code";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306415d = "body_size";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306416e = "data";
    }

    public n() {
    }

    @Nullable
    public Long f() {
        return this.f306409d;
    }

    @Nullable
    public String g() {
        return this.f306406a;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306411f;
    }

    @Nullable
    public Object h() {
        return this.f306410e;
    }

    @Nullable
    public Map<String, String> i() {
        return this.f306407b;
    }

    @Nullable
    public Integer j() {
        return this.f306408c;
    }

    public void k(@Nullable Long l10) {
        this.f306409d = l10;
    }

    public void l(@Nullable String str) {
        this.f306406a = str;
    }

    public void m(@Nullable Object obj) {
        this.f306410e = obj;
    }

    public void n(@Nullable Map<String, String> map) {
        this.f306407b = io.sentry.util.d.f(map);
    }

    public void o(@Nullable Integer num) {
        this.f306408c = num;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306406a != null) {
            z3Var.f("cookies").b(this.f306406a);
        }
        if (this.f306407b != null) {
            z3Var.f("headers").j(iLogger, this.f306407b);
        }
        if (this.f306408c != null) {
            z3Var.f(b.f306414c).j(iLogger, this.f306408c);
        }
        if (this.f306409d != null) {
            z3Var.f("body_size").j(iLogger, this.f306409d);
        }
        if (this.f306410e != null) {
            z3Var.f("data").j(iLogger, this.f306410e);
        }
        Map<String, Object> map = this.f306411f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306411f.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306411f = map;
    }

    public n(@NotNull n nVar) {
        this.f306406a = nVar.f306406a;
        this.f306407b = io.sentry.util.d.f(nVar.f306407b);
        this.f306411f = io.sentry.util.d.f(nVar.f306411f);
        this.f306408c = nVar.f306408c;
        this.f306409d = nVar.f306409d;
        this.f306410e = nVar.f306410e;
    }
}
