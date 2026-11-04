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
public final class b implements m2, k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f306129d = "browser";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f306131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306132c;

    public static final class a implements a2<b> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            int i10 = 4 ^ 0;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("name")) {
                    bVar.f306130a = y3Var.n6();
                } else if (strNa.equals("version")) {
                    bVar.f306131b = y3Var.n6();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    y3Var.gd(iLogger, concurrentHashMap, strNa);
                }
            }
            bVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return bVar;
        }
    }

    /* JADX INFO: renamed from: io.sentry.protocol.b$b, reason: collision with other inner class name */
    public static final class C2228b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306133a = "name";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306134b = "version";
    }

    public b() {
    }

    @Nullable
    public String c() {
        return this.f306130a;
    }

    @Nullable
    public String d() {
        return this.f306131b;
    }

    public void e(@Nullable String str) {
        this.f306130a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (io.sentry.util.y.a(this.f306130a, bVar.f306130a) && io.sentry.util.y.a(this.f306131b, bVar.f306131b)) {
                return true;
            }
        }
        return false;
    }

    public void f(@Nullable String str) {
        this.f306131b = str;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306132c;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f306130a, this.f306131b);
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306130a != null) {
            z3Var.f("name").b(this.f306130a);
        }
        if (this.f306131b != null) {
            z3Var.f("version").b(this.f306131b);
        }
        Map<String, Object> map = this.f306132c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306132c.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306132c = map;
    }

    b(@NotNull b bVar) {
        this.f306130a = bVar.f306130a;
        this.f306131b = bVar.f306131b;
        this.f306132c = io.sentry.util.d.f(bVar.f306132c);
    }
}
