package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import io.sentry.z7;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Long f306135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Integer f306136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f306138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Boolean f306139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Boolean f306140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Boolean f306141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Boolean f306142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private a0 f306143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Map<String, z7> f306144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306145k;

    public static final class a implements a2<b0> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            b0 b0Var = new b0();
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "daemon":
                        b0Var.f306141g = y3Var.J3();
                        break;
                    case "priority":
                        b0Var.f306136b = y3Var.rc();
                        break;
                    case "held_locks":
                        Map mapFd = y3Var.fd(iLogger, new z7.a());
                        if (mapFd == null) {
                            break;
                        } else {
                            b0Var.f306144j = new HashMap(mapFd);
                            break;
                        }
                        break;
                    case "id":
                        b0Var.f306135a = y3Var.Gc();
                        break;
                    case "main":
                        b0Var.f306142h = y3Var.J3();
                        break;
                    case "name":
                        b0Var.f306137c = y3Var.n6();
                        break;
                    case "state":
                        b0Var.f306138d = y3Var.n6();
                        break;
                    case "crashed":
                        b0Var.f306139e = y3Var.J3();
                        break;
                    case "current":
                        b0Var.f306140f = y3Var.J3();
                        break;
                    case "stacktrace":
                        b0Var.f306143i = (a0) y3Var.i4(iLogger, new a0.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            b0Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return b0Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306146a = "id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306147b = "priority";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306148c = "name";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306149d = "state";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306150e = "crashed";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306151f = "current";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306152g = "daemon";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306153h = "main";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306154i = "stacktrace";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f306155j = "held_locks";
    }

    public void A(@Nullable String str) {
        this.f306137c = str;
    }

    public void B(@Nullable Integer num) {
        this.f306136b = num;
    }

    public void C(@Nullable a0 a0Var) {
        this.f306143i = a0Var;
    }

    public void D(@Nullable String str) {
        this.f306138d = str;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306145k;
    }

    @Nullable
    public Map<String, z7> k() {
        return this.f306144j;
    }

    @Nullable
    public Long l() {
        return this.f306135a;
    }

    @Nullable
    public String m() {
        return this.f306137c;
    }

    @Nullable
    public Integer n() {
        return this.f306136b;
    }

    @Nullable
    public a0 o() {
        return this.f306143i;
    }

    @Nullable
    public String p() {
        return this.f306138d;
    }

    @Nullable
    public Boolean q() {
        return this.f306139e;
    }

    @Nullable
    public Boolean r() {
        return this.f306140f;
    }

    @Nullable
    public Boolean s() {
        return this.f306141g;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306135a != null) {
            z3Var.f("id").i(this.f306135a);
        }
        if (this.f306136b != null) {
            z3Var.f("priority").i(this.f306136b);
        }
        if (this.f306137c != null) {
            z3Var.f("name").b(this.f306137c);
        }
        if (this.f306138d != null) {
            z3Var.f("state").b(this.f306138d);
        }
        if (this.f306139e != null) {
            z3Var.f(b.f306150e).k(this.f306139e);
        }
        if (this.f306140f != null) {
            z3Var.f(b.f306151f).k(this.f306140f);
        }
        if (this.f306141g != null) {
            z3Var.f(b.f306152g).k(this.f306141g);
        }
        if (this.f306142h != null) {
            z3Var.f(b.f306153h).k(this.f306142h);
        }
        if (this.f306143i != null) {
            z3Var.f("stacktrace").j(iLogger, this.f306143i);
        }
        if (this.f306144j != null) {
            z3Var.f(b.f306155j).j(iLogger, this.f306144j);
        }
        Map<String, Object> map = this.f306145k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306145k.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306145k = map;
    }

    @Nullable
    public Boolean t() {
        return this.f306142h;
    }

    public void u(@Nullable Boolean bool) {
        this.f306139e = bool;
    }

    public void v(@Nullable Boolean bool) {
        this.f306140f = bool;
    }

    public void w(@Nullable Boolean bool) {
        this.f306141g = bool;
    }

    public void x(@Nullable Map<String, z7> map) {
        this.f306144j = map;
    }

    public void y(@Nullable Long l10) {
        this.f306135a = l10;
    }

    public void z(@Nullable Boolean bool) {
        this.f306142h = bool;
    }
}
