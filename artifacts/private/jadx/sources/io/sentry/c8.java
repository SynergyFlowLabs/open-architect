package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class c8 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private List<a8> f305166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305167b;

    public static final class a implements a2<c8> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c8 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            List listP8 = null;
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("items")) {
                    listP8 = y3Var.p8(iLogger, new a8.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            y3Var.F1();
            if (listP8 != null) {
                c8 c8Var = new c8(listP8);
                c8Var.setUnknown(map);
                return c8Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"items\"");
            iLogger.a(y7.ERROR, "Missing required field \"items\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305168a = "items";
    }

    public c8(@NotNull List<a8> list) {
        this.f305166a = list;
    }

    @NotNull
    public List<a8> a() {
        return this.f305166a;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305167b;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("items").j(iLogger, this.f305166a);
        Map<String, Object> map = this.f305167b;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f305167b.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305167b = map;
    }
}
