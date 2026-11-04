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
public final class x implements m2, k2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f306481e = "runtime";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f306483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306485d;

    public static final class a implements a2<x> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            x xVar = new x();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "raw_description":
                        xVar.f306484c = y3Var.n6();
                        break;
                    case "name":
                        xVar.f306482a = y3Var.n6();
                        break;
                    case "version":
                        xVar.f306483b = y3Var.n6();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            xVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return xVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306486a = "name";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306487b = "version";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306488c = "raw_description";
    }

    public x() {
    }

    @Nullable
    public String d() {
        return this.f306482a;
    }

    @Nullable
    public String e() {
        return this.f306484c;
    }

    @Nullable
    public String f() {
        return this.f306483b;
    }

    public void g(@Nullable String str) {
        this.f306482a = str;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306485d;
    }

    public void h(@Nullable String str) {
        this.f306484c = str;
    }

    public void i(@Nullable String str) {
        this.f306483b = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306482a != null) {
            z3Var.f("name").b(this.f306482a);
        }
        if (this.f306483b != null) {
            z3Var.f("version").b(this.f306483b);
        }
        if (this.f306484c != null) {
            z3Var.f("raw_description").b(this.f306484c);
        }
        Map<String, Object> map = this.f306485d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306485d.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306485d = map;
    }

    x(@NotNull x xVar) {
        this.f306482a = xVar.f306482a;
        this.f306483b = xVar.f306483b;
        this.f306484c = xVar.f306484c;
        this.f306485d = io.sentry.util.d.f(xVar.f306485d);
    }
}
