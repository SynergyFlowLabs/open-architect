package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.p;
import io.sentry.util.y;
import io.sentry.vendor.gson.stream.c;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class b implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f306079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f306080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f306081d;

    public static final class a implements a2<b> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            Double dValueOf;
            y3Var.m1();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "elapsed_since_start_ns":
                        String strN6 = y3Var.n6();
                        if (strN6 == null) {
                            break;
                        } else {
                            bVar.f306080c = strN6;
                            break;
                        }
                        break;
                    case "timestamp":
                        try {
                            dValueOf = y3Var.ia();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateZ3 = y3Var.z3(iLogger);
                            dValueOf = dateZ3 != null ? Double.valueOf(p.b(dateZ3)) : null;
                        }
                        if (dValueOf == null) {
                            break;
                        } else {
                            bVar.f306079b = dValueOf.doubleValue();
                            break;
                        }
                        break;
                    case "value":
                        Double dIa = y3Var.ia();
                        if (dIa == null) {
                            break;
                        } else {
                            bVar.f306081d = dIa.doubleValue();
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            bVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return bVar;
        }
    }

    /* JADX INFO: renamed from: io.sentry.profilemeasurements.b$b, reason: collision with other inner class name */
    public static final class C2226b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306082a = "value";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306083b = "elapsed_since_start_ns";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306084c = "timestamp";
    }

    public b() {
        this(0L, 0, 0L);
    }

    @NotNull
    private BigDecimal d(@NotNull Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    @NotNull
    public String e() {
        return this.f306080c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (y.a(this.f306078a, bVar.f306078a) && this.f306080c.equals(bVar.f306080c) && this.f306081d == bVar.f306081d && this.f306079b == bVar.f306079b) {
                return true;
            }
        }
        return false;
    }

    public double f() {
        return this.f306079b;
    }

    public double g() {
        return this.f306081d;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306078a;
    }

    public int hashCode() {
        return y.b(this.f306078a, this.f306080c, Double.valueOf(this.f306081d));
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("value").j(iLogger, Double.valueOf(this.f306081d));
        z3Var.f(C2226b.f306083b).j(iLogger, this.f306080c);
        z3Var.f("timestamp").j(iLogger, d(Double.valueOf(this.f306079b)));
        Map<String, Object> map = this.f306078a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306078a.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306078a = map;
    }

    public b(@NotNull Long l10, @NotNull Number number, long j10) {
        this.f306080c = l10.toString();
        this.f306081d = number.doubleValue();
        this.f306079b = p.m(j10);
    }
}
