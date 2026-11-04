package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class b8 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f305135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Object f305136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305137c;

    public static final class a implements a2<b8> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b8 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            String strN6 = null;
            Object objRe = null;
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("type")) {
                    strN6 = y3Var.n6();
                } else if (strNa.equals("value")) {
                    objRe = y3Var.re();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            y3Var.F1();
            if (strN6 != null) {
                b8 b8Var = new b8(strN6, objRe);
                b8Var.setUnknown(map);
                return b8Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
            iLogger.a(y7.ERROR, "Missing required field \"type\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305138a = "type";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305139b = "value";
    }

    public b8(@NotNull String str, @Nullable Object obj) {
        this.f305135a = str;
        if (obj == null || !str.equals(androidx.constraintlayout.core.motion.utils.v.b.f43988e)) {
            this.f305136b = obj;
        } else {
            this.f305136b = obj.toString();
        }
    }

    @NotNull
    public String a() {
        return this.f305135a;
    }

    @Nullable
    public Object b() {
        return this.f305136b;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305137c;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("type").j(iLogger, this.f305135a);
        z3Var.f("value").j(iLogger, this.f305136b);
        Map<String, Object> map = this.f305137c;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f305137c.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305137c = map;
    }

    public b8(@NotNull w5 w5Var, @Nullable Object obj) {
        this(w5Var.apiName(), obj);
    }
}
