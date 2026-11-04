package io.sentry;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class h4 implements m2, k2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f305525c = "profile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.v f305526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305527b;

    public static final class a implements a2<h4> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h4 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            h4 h4Var = new h4();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("profiler_id")) {
                    io.sentry.protocol.v vVar = (io.sentry.protocol.v) y3Var.i4(iLogger, new io.sentry.protocol.v.a());
                    if (vVar != null) {
                        h4Var.f305526a = vVar;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    y3Var.gd(iLogger, concurrentHashMap, strNa);
                }
            }
            h4Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return h4Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305528a = "profiler_id";
    }

    public h4() {
        this(io.sentry.protocol.v.f306474b);
    }

    @NotNull
    public io.sentry.protocol.v b() {
        return this.f305526a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h4) {
            return this.f305526a.equals(((h4) obj).f305526a);
        }
        return false;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305527b;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f305526a);
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("profiler_id").j(iLogger, this.f305526a);
        Map<String, Object> map = this.f305527b;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f305527b.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305527b = map;
    }

    public h4(@NotNull io.sentry.protocol.v vVar) {
        this.f305526a = vVar;
    }

    public h4(@NotNull h4 h4Var) {
        this.f305526a = h4Var.f305526a;
        Map<String, Object> mapF = io.sentry.util.d.f(h4Var.f305527b);
        if (mapF != null) {
            this.f305527b = mapF;
        }
    }
}
