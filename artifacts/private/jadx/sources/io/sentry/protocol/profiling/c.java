package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class c implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f306452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306453c;

    public static final class a implements a2<c> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            c cVar = new c();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("priority")) {
                    cVar.f306452b = y3Var.nextInt();
                } else if (strNa.equals("name")) {
                    cVar.f306451a = y3Var.n6();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            cVar.setUnknown(map);
            y3Var.F1();
            return cVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306454a = "name";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306455b = "priority";
    }

    @Nullable
    public String c() {
        return this.f306451a;
    }

    public int d() {
        return this.f306452b;
    }

    public void e(@Nullable String str) {
        this.f306451a = str;
    }

    public void f(int i10) {
        this.f306452b = i10;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306453c;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306451a != null) {
            z3Var.f("name").j(iLogger, this.f306451a);
        }
        z3Var.f("priority").j(iLogger, Integer.valueOf(this.f306452b));
        Map<String, Object> map = this.f306453c;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306453c.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306453c = map;
    }
}
