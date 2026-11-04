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
@lm.a.c
public final class e0 implements k2, m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f306239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306240b;

    public static final class a implements a2<e0> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e0 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            String strN6 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("source")) {
                    strN6 = y3Var.n6();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    y3Var.gd(iLogger, concurrentHashMap, strNa);
                }
            }
            e0 e0Var = new e0(strN6);
            e0Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return e0Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306241a = "source";
    }

    public e0(@Nullable String str) {
        this.f306239a = str;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306240b;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306239a != null) {
            z3Var.f("source").j(iLogger, this.f306239a);
        }
        Map<String, Object> map = this.f306240b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306240b.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306240b = map;
    }
}
