package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class h6 implements k2, m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final io.sentry.protocol.v f305530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final io.sentry.protocol.p f305531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final da f305532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Date f305533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305534e;

    public static final class a implements a2<h6> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h6 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            io.sentry.protocol.v vVar = null;
            io.sentry.protocol.p pVar = null;
            da daVar = null;
            Date dateZ3 = null;
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "sdk":
                        pVar = (io.sentry.protocol.p) y3Var.i4(iLogger, new io.sentry.protocol.p.a());
                        break;
                    case "trace":
                        daVar = (da) y3Var.i4(iLogger, new da.a());
                        break;
                    case "event_id":
                        vVar = (io.sentry.protocol.v) y3Var.i4(iLogger, new io.sentry.protocol.v.a());
                        break;
                    case "sent_at":
                        dateZ3 = y3Var.z3(iLogger);
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        y3Var.gd(iLogger, map, strNa);
                        break;
                }
            }
            h6 h6Var = new h6(vVar, pVar, daVar);
            h6Var.e(dateZ3);
            h6Var.setUnknown(map);
            y3Var.F1();
            return h6Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305535a = "event_id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305536b = "sdk";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305537c = "trace";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305538d = "sent_at";
    }

    public h6(@Nullable io.sentry.protocol.v vVar, @Nullable io.sentry.protocol.p pVar) {
        this(vVar, pVar, null);
    }

    @Nullable
    public io.sentry.protocol.v a() {
        return this.f305530a;
    }

    @Nullable
    public io.sentry.protocol.p b() {
        return this.f305531b;
    }

    @Nullable
    public Date c() {
        return this.f305533d;
    }

    @Nullable
    public da d() {
        return this.f305532c;
    }

    public void e(@Nullable Date date) {
        this.f305533d = date;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305534e;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f305530a != null) {
            z3Var.f("event_id").j(iLogger, this.f305530a);
        }
        if (this.f305531b != null) {
            z3Var.f("sdk").j(iLogger, this.f305531b);
        }
        if (this.f305532c != null) {
            z3Var.f("trace").j(iLogger, this.f305532c);
        }
        if (this.f305533d != null) {
            z3Var.f(b.f305538d).j(iLogger, p.h(this.f305533d));
        }
        Map<String, Object> map = this.f305534e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f305534e.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305534e = map;
    }

    public h6(@Nullable io.sentry.protocol.v vVar, @Nullable io.sentry.protocol.p pVar, @Nullable da daVar) {
        this.f305530a = vVar;
        this.f305531b = pVar;
        this.f305532c = daVar;
    }

    public h6(@Nullable io.sentry.protocol.v vVar) {
        this(vVar, null);
    }

    public h6() {
        this(new io.sentry.protocol.v());
    }
}
