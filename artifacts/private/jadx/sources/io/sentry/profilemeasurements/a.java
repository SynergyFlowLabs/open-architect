package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.util.y;
import io.sentry.vendor.gson.stream.c;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class a implements m2, k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f306061d = "frozen_frame_renders";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f306062e = "slow_frame_renders";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f306063f = "screen_frame_rates";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f306064g = "cpu_usage";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f306065h = "memory_footprint";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f306066i = "memory_native_footprint";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f306067j = "unknown";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f306068k = "hz";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f306069l = "nanosecond";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f306070m = "byte";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f306071n = "percent";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f306072o = "unknown";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f306074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Collection<io.sentry.profilemeasurements.b> f306075c;

    /* JADX INFO: renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    public static final class C2225a implements a2<a> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("values")) {
                    List listP8 = y3Var.p8(iLogger, new io.sentry.profilemeasurements.b.a());
                    if (listP8 != null) {
                        aVar.f306075c = listP8;
                    }
                } else if (strNa.equals("unit")) {
                    String strN6 = y3Var.n6();
                    if (strN6 != null) {
                        aVar.f306074b = strN6;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    y3Var.gd(iLogger, concurrentHashMap, strNa);
                }
            }
            aVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return aVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306076a = "unit";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306077b = "values";
    }

    public a() {
        this("unknown", new ArrayList());
    }

    @NotNull
    public String c() {
        return this.f306074b;
    }

    @NotNull
    public Collection<io.sentry.profilemeasurements.b> d() {
        return this.f306075c;
    }

    public void e(@NotNull String str) {
        this.f306074b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (y.a(this.f306073a, aVar.f306073a) && this.f306074b.equals(aVar.f306074b) && new ArrayList(this.f306075c).equals(new ArrayList(aVar.f306075c))) {
                return true;
            }
        }
        return false;
    }

    public void f(@NotNull Collection<io.sentry.profilemeasurements.b> collection) {
        this.f306075c = collection;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306073a;
    }

    public int hashCode() {
        return y.b(this.f306073a, this.f306074b, this.f306075c);
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("unit").j(iLogger, this.f306074b);
        z3Var.f("values").j(iLogger, this.f306075c);
        Map<String, Object> map = this.f306073a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306073a.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306073a = map;
    }

    public a(@NotNull String str, @NotNull Collection<io.sentry.profilemeasurements.b> collection) {
        this.f306074b = str;
        this.f306075c = collection;
    }
}
