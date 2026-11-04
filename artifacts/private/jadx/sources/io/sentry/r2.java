package io.sentry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class r2 extends ConcurrentHashMap<String, Object> implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f306614a = 3987329379811822556L;

    public static final class a implements a2<r2> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r2 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            r2 r2Var = new r2();
            y3Var.m1();
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("trace")) {
                    r2Var.b(new p9.a().a(y3Var, iLogger));
                } else {
                    Object objRe = y3Var.re();
                    if (objRe != null) {
                        r2Var.put(strNa, objRe);
                    }
                }
            }
            y3Var.F1();
            return r2Var;
        }
    }

    public r2() {
    }

    @Nullable
    private <T> T c(@NotNull String str, @NotNull Class<T> cls) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    @Nullable
    public p9 a() {
        return (p9) c("trace", p9.class);
    }

    public void b(@NotNull p9 p9Var) {
        io.sentry.util.y.c(p9Var, "traceContext is required");
        put("trace", p9Var);
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                z3Var.f(str).j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    public r2(@NotNull r2 r2Var) {
        for (Map.Entry<String, Object> entry : r2Var.entrySet()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("trace".equals(entry.getKey()) && (value instanceof p9)) {
                    b(new p9((p9) value));
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }
}
