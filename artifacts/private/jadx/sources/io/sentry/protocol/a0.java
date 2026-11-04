package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private List<z> f306122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Map<String, String> f306123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Boolean f306124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306125d;

    public static final class a implements a2<a0> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            a0 a0Var = new a0();
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "frames":
                        a0Var.f306122a = y3Var.p8(iLogger, new z.a());
                        break;
                    case "registers":
                        a0Var.f306123b = io.sentry.util.d.f((Map) y3Var.re());
                        break;
                    case "snapshot":
                        a0Var.f306124c = y3Var.J3();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            a0Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return a0Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306126a = "frames";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306127b = "registers";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306128c = "snapshot";
    }

    public a0() {
    }

    @Nullable
    public List<z> d() {
        return this.f306122a;
    }

    @Nullable
    public Map<String, String> e() {
        return this.f306123b;
    }

    @Nullable
    public Boolean f() {
        return this.f306124c;
    }

    public void g(@Nullable List<z> list) {
        this.f306122a = list;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306125d;
    }

    public void h(@Nullable Map<String, String> map) {
        this.f306123b = map;
    }

    public void i(@Nullable Boolean bool) {
        this.f306124c = bool;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306122a != null) {
            z3Var.f("frames").j(iLogger, this.f306122a);
        }
        if (this.f306123b != null) {
            z3Var.f(b.f306127b).j(iLogger, this.f306123b);
        }
        if (this.f306124c != null) {
            z3Var.f(b.f306128c).k(this.f306124c);
        }
        Map<String, Object> map = this.f306125d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306125d.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306125d = map;
    }

    public a0(@Nullable List<z> list) {
        this.f306122a = list;
    }
}
