package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class b implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f306444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f306445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306447d;

    public static final class a implements a2<b> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            b bVar = new b();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "thread_id":
                        bVar.f306446c = y3Var.n6();
                        break;
                    case "timestamp":
                        bVar.f306444a = y3Var.nextDouble();
                        break;
                    case "stack_id":
                        bVar.f306445b = y3Var.nextInt();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        y3Var.gd(iLogger, map, strNa);
                        break;
                }
            }
            bVar.setUnknown(map);
            y3Var.F1();
            return bVar;
        }
    }

    /* JADX INFO: renamed from: io.sentry.protocol.profiling.b$b, reason: collision with other inner class name */
    public static final class C2230b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306448a = "timestamp";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306449b = "stack_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306450c = "thread_id";
    }

    @NotNull
    private BigDecimal d(@NotNull Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public int e() {
        return this.f306445b;
    }

    @Nullable
    public String f() {
        return this.f306446c;
    }

    public double g() {
        return this.f306444a;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306447d;
    }

    public void h(int i10) {
        this.f306445b = i10;
    }

    public void i(@Nullable String str) {
        this.f306446c = str;
    }

    public void j(double d10) {
        this.f306444a = d10;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("timestamp").j(iLogger, d(Double.valueOf(this.f306444a)));
        z3Var.f(C2230b.f306449b).j(iLogger, Integer.valueOf(this.f306445b));
        if (this.f306446c != null) {
            z3Var.f("thread_id").j(iLogger, this.f306446c);
        }
        Map<String, Object> map = this.f306447d;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306447d.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306447d = map;
    }
}
