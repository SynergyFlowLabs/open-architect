package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.y7;
import io.sentry.z3;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class i implements m2, k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f306303d = "app_start_cold";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f306304e = "app_start_warm";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f306305f = "frames_total";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f306306g = "frames_slow";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f306307h = "frames_frozen";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f306308i = "frames_delay";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f306309j = "time_to_initial_display";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f306310k = "time_to_full_display";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Number f306311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f306312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306313c;

    public static final class a implements a2<i> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            Number number = null;
            String strN6 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("unit")) {
                    strN6 = y3Var.n6();
                } else if (strNa.equals("value")) {
                    number = (Number) y3Var.re();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    y3Var.gd(iLogger, concurrentHashMap, strNa);
                }
            }
            y3Var.F1();
            if (number != null) {
                i iVar = new i(number, strN6);
                iVar.setUnknown(concurrentHashMap);
                return iVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.a(y7.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306314a = "value";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306315b = "unit";
    }

    public i(@NotNull Number number, @Nullable String str) {
        this.f306311a = number;
        this.f306312b = str;
    }

    @Nullable
    public String a() {
        return this.f306312b;
    }

    @lm.n
    @NotNull
    public Number b() {
        return this.f306311a;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306313c;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("value").i(this.f306311a);
        if (this.f306312b != null) {
            z3Var.f("unit").b(this.f306312b);
        }
        Map<String, Object> map = this.f306313c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306313c.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306313c = map;
    }

    @lm.n
    public i(@NotNull Number number, @Nullable String str, @Nullable Map<String, Object> map) {
        this.f306311a = number;
        this.f306312b = str;
        this.f306313c = map;
    }
}
