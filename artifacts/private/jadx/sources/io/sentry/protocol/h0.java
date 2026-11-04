package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f306298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final List<i0> f306299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306300c;

    public static final class a implements a2<h0> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h0 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            String strN6 = null;
            List listP8 = null;
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("rendering_system")) {
                    strN6 = y3Var.n6();
                } else if (strNa.equals(b.f306302b)) {
                    listP8 = y3Var.p8(iLogger, new i0.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            y3Var.F1();
            h0 h0Var = new h0(strN6, listP8);
            h0Var.setUnknown(map);
            return h0Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306301a = "rendering_system";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306302b = "windows";
    }

    public h0(@Nullable String str, @Nullable List<i0> list) {
        this.f306298a = str;
        this.f306299b = list;
    }

    @Nullable
    public String a() {
        return this.f306298a;
    }

    @Nullable
    public List<i0> b() {
        return this.f306299b;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306300c;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306298a != null) {
            z3Var.f("rendering_system").b(this.f306298a);
        }
        if (this.f306299b != null) {
            z3Var.f(b.f306302b).j(iLogger, this.f306299b);
        }
        Map<String, Object> map = this.f306300c;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306300c.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306300c = map;
    }
}
