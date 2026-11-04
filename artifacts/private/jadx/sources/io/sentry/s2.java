package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class s2 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f306764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f306765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306767d;

    public static final class a implements a2<s2> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s2 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            String strN6 = null;
            int i10 = 5 ^ 0;
            String strN7 = null;
            String strN8 = null;
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "type":
                        strN6 = y3Var.n6();
                        break;
                    case "unit":
                        strN8 = y3Var.n6();
                        break;
                    case "value":
                        strN7 = y3Var.n6();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        y3Var.gd(iLogger, map, strNa);
                        break;
                }
            }
            y3Var.F1();
            if (strN6 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                iLogger.a(y7.ERROR, "Missing required field \"type\"", illegalStateException);
                throw illegalStateException;
            }
            if (strN7 != null) {
                s2 s2Var = new s2(strN6, strN7, strN8);
                s2Var.setUnknown(map);
                return s2Var;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"value\"");
            iLogger.a(y7.ERROR, "Missing required field \"value\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306768a = "type";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306769b = "value";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306770c = "unit";
    }

    @lm.a.c
    public s2(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        this.f306764a = str;
        this.f306765b = str2;
        this.f306766c = str3;
    }

    @NotNull
    public static s2 a(@NotNull String str) {
        return new s2(t2.CRONTAB.apiName(), str, null);
    }

    @NotNull
    public static s2 e(@NotNull Integer num, @NotNull u2 u2Var) {
        return new s2(t2.INTERVAL.apiName(), num.toString(), u2Var.apiName());
    }

    @NotNull
    public String b() {
        return this.f306764a;
    }

    @Nullable
    public String c() {
        return this.f306766c;
    }

    @NotNull
    public String d() {
        return this.f306765b;
    }

    public void f(@NotNull String str) {
        this.f306764a = str;
    }

    public void g(@Nullable u2 u2Var) {
        this.f306766c = u2Var == null ? null : u2Var.apiName();
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306767d;
    }

    public void h(@Nullable String str) {
        this.f306766c = str;
    }

    public void i(@NotNull Integer num) {
        this.f306765b = num.toString();
    }

    public void j(@NotNull String str) {
        this.f306765b = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("type").b(this.f306764a);
        if (t2.INTERVAL.apiName().equalsIgnoreCase(this.f306764a)) {
            try {
                z3Var.f("value").i(Integer.valueOf(this.f306765b));
            } catch (Throwable unused) {
                iLogger.c(y7.ERROR, "Unable to serialize monitor schedule value: %s", this.f306765b);
            }
        } else {
            z3Var.f("value").b(this.f306765b);
        }
        if (this.f306766c != null) {
            z3Var.f("unit").b(this.f306766c);
        }
        Map<String, Object> map = this.f306767d;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306767d.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306767d = map;
    }
}
