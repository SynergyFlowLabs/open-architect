package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class q2 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private s2 f306568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Long f306569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Long f306570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f306571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Long f306572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Long f306573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306574g;

    public static final class a implements a2<q2> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q2 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            s2 s2VarA = null;
            Long lGc = null;
            Long lGc2 = null;
            String strN6 = null;
            Long lGc3 = null;
            Long lGc4 = null;
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "timezone":
                        strN6 = y3Var.n6();
                        break;
                    case "checkin_margin":
                        lGc = y3Var.Gc();
                        break;
                    case "schedule":
                        s2VarA = new s2.a().a(y3Var, iLogger);
                        break;
                    case "recovery_threshold":
                        lGc4 = y3Var.Gc();
                        break;
                    case "max_runtime":
                        lGc2 = y3Var.Gc();
                        break;
                    case "failure_issue_threshold":
                        lGc3 = y3Var.Gc();
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
            if (s2VarA == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"schedule\"");
                iLogger.a(y7.ERROR, "Missing required field \"schedule\"", illegalStateException);
                throw illegalStateException;
            }
            q2 q2Var = new q2(s2VarA);
            q2Var.g(lGc);
            q2Var.i(lGc2);
            q2Var.l(strN6);
            q2Var.h(lGc3);
            q2Var.j(lGc4);
            q2Var.setUnknown(map);
            return q2Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306575a = "schedule";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306576b = "checkin_margin";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306577c = "max_runtime";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306578d = "timezone";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306579e = "failure_issue_threshold";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306580f = "recovery_threshold";
    }

    public q2(@NotNull s2 s2Var) {
        this.f306568a = s2Var;
        n8.g cron = h5.q().b().getCron();
        if (cron != null) {
            this.f306569b = cron.a();
            this.f306570c = cron.c();
            this.f306571d = cron.e();
            this.f306572e = cron.b();
            this.f306573f = cron.d();
        }
    }

    @Nullable
    public Long a() {
        return this.f306569b;
    }

    @Nullable
    public Long b() {
        return this.f306572e;
    }

    @Nullable
    public Long c() {
        return this.f306570c;
    }

    @Nullable
    public Long d() {
        return this.f306573f;
    }

    @NotNull
    public s2 e() {
        return this.f306568a;
    }

    @Nullable
    public String f() {
        return this.f306571d;
    }

    public void g(@Nullable Long l10) {
        this.f306569b = l10;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306574g;
    }

    public void h(@Nullable Long l10) {
        this.f306572e = l10;
    }

    public void i(@Nullable Long l10) {
        this.f306570c = l10;
    }

    public void j(@Nullable Long l10) {
        this.f306573f = l10;
    }

    public void k(@NotNull s2 s2Var) {
        this.f306568a = s2Var;
    }

    public void l(@Nullable String str) {
        this.f306571d = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f(b.f306575a);
        this.f306568a.serialize(z3Var, iLogger);
        if (this.f306569b != null) {
            z3Var.f(b.f306576b).i(this.f306569b);
        }
        if (this.f306570c != null) {
            z3Var.f(b.f306577c).i(this.f306570c);
        }
        if (this.f306571d != null) {
            z3Var.f("timezone").b(this.f306571d);
        }
        if (this.f306572e != null) {
            z3Var.f(b.f306579e).i(this.f306572e);
        }
        if (this.f306573f != null) {
            z3Var.f(b.f306580f).i(this.f306573f);
        }
        Map<String, Object> map = this.f306574g;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306574g.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306574g = map;
    }
}
