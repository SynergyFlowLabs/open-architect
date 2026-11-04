package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements m2, k2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f306177c = "spring";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String[] f306178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306179b;

    public static final class a implements a2<d0> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d0 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            d0 d0Var = new d0();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals(b.f306180a)) {
                    List list = (List) y3Var.re();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        d0Var.f306178a = strArr;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    y3Var.gd(iLogger, concurrentHashMap, strNa);
                }
            }
            d0Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return d0Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306180a = "active_profiles";
    }

    public d0() {
    }

    @Nullable
    public String[] b() {
        return this.f306178a;
    }

    public void c(@Nullable String[] strArr) {
        this.f306178a = strArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f306178a, ((d0) obj).f306178a);
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306179b;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f306178a);
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306178a != null) {
            z3Var.f(b.f306180a).j(iLogger, this.f306178a);
        }
        Map<String, Object> map = this.f306179b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306179b.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306179b = map;
    }

    public d0(@NotNull d0 d0Var) {
        this.f306178a = d0Var.f306178a;
        this.f306179b = io.sentry.util.d.f(d0Var.f306179b);
    }
}
