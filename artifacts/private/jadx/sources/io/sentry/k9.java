package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class k9 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Date f305778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Date f305779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f305780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f305781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f305782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Boolean f305783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private c f305784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Long f305785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Double f305786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final String f305787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private String f305788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final String f305789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final String f305790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private String f305791n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f305792o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305793s;

    public static final class a implements a2<k9> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(y7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:69:0x011e  */
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k9 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            Integer numRc = null;
            ConcurrentHashMap concurrentHashMap = null;
            c cVarValueOf = null;
            Date dateZ3 = null;
            Date dateZ4 = null;
            String strN6 = null;
            String str = null;
            Boolean boolJ3 = null;
            Long lGc = null;
            Double dIa = null;
            String strN7 = null;
            String strN8 = null;
            String strN9 = null;
            String strN10 = null;
            String strN11 = null;
            while (true) {
                Integer num = numRc;
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                c cVar = cVarValueOf;
                Date date = dateZ3;
                Date date2 = dateZ4;
                if (y3Var.peek() != io.sentry.vendor.gson.stream.c.NAME) {
                    if (cVar == null) {
                        throw c("status", iLogger);
                    }
                    if (date == null) {
                        throw c("started", iLogger);
                    }
                    if (num == null) {
                        throw c(b.f305800g, iLogger);
                    }
                    if (strN10 == null) {
                        throw c("release", iLogger);
                    }
                    k9 k9Var = new k9(cVar, date, date2, num.intValue(), strN6, str, boolJ3, lGc, dIa, strN7, strN8, strN9, strN10, strN11);
                    k9Var.setUnknown(concurrentHashMap2);
                    y3Var.F1();
                    return k9Var;
                }
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "duration":
                        dIa = y3Var.ia();
                        numRc = num;
                        concurrentHashMap = concurrentHashMap2;
                        cVarValueOf = cVar;
                        dateZ3 = date;
                        dateZ4 = date2;
                        break;
                    case "started":
                        dateZ3 = y3Var.z3(iLogger);
                        numRc = num;
                        concurrentHashMap = concurrentHashMap2;
                        cVarValueOf = cVar;
                        dateZ4 = date2;
                        break;
                    case "errors":
                        numRc = y3Var.rc();
                        concurrentHashMap = concurrentHashMap2;
                        cVarValueOf = cVar;
                        dateZ3 = date;
                        dateZ4 = date2;
                        break;
                    case "status":
                        String strD = io.sentry.util.h0.d(y3Var.n6());
                        if (strD != null) {
                            cVarValueOf = c.valueOf(strD);
                            numRc = num;
                            concurrentHashMap = concurrentHashMap2;
                        } else {
                            numRc = num;
                            concurrentHashMap = concurrentHashMap2;
                            cVarValueOf = cVar;
                        }
                        dateZ3 = date;
                        dateZ4 = date2;
                        break;
                    case "did":
                        strN6 = y3Var.n6();
                        numRc = num;
                        concurrentHashMap = concurrentHashMap2;
                        cVarValueOf = cVar;
                        dateZ3 = date;
                        dateZ4 = date2;
                        break;
                    case "seq":
                        lGc = y3Var.Gc();
                        numRc = num;
                        concurrentHashMap = concurrentHashMap2;
                        cVarValueOf = cVar;
                        dateZ3 = date;
                        dateZ4 = date2;
                        break;
                    case "sid":
                        String strN12 = y3Var.n6();
                        if (strN12 == null || !(strN12.length() == 36 || strN12.length() == 32)) {
                            iLogger.c(y7.ERROR, "%s sid is not valid.", strN12);
                        } else {
                            str = strN12;
                        }
                        numRc = num;
                        concurrentHashMap = concurrentHashMap2;
                        cVarValueOf = cVar;
                        dateZ3 = date;
                        dateZ4 = date2;
                        break;
                    case "init":
                        boolJ3 = y3Var.J3();
                        numRc = num;
                        concurrentHashMap = concurrentHashMap2;
                        cVarValueOf = cVar;
                        dateZ3 = date;
                        dateZ4 = date2;
                        break;
                    case "timestamp":
                        dateZ4 = y3Var.z3(iLogger);
                        numRc = num;
                        concurrentHashMap = concurrentHashMap2;
                        cVarValueOf = cVar;
                        dateZ3 = date;
                        break;
                    case "attrs":
                        y3Var.m1();
                        while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                            String strNa2 = y3Var.na();
                            strNa2.getClass();
                            switch (strNa2) {
                                case "environment":
                                    strN9 = y3Var.n6();
                                    break;
                                case "release":
                                    strN10 = y3Var.n6();
                                    break;
                                case "ip_address":
                                    strN7 = y3Var.n6();
                                    break;
                                case "user_agent":
                                    strN8 = y3Var.n6();
                                    break;
                                default:
                                    y3Var.a9();
                                    break;
                            }
                        }
                        y3Var.F1();
                        numRc = num;
                        concurrentHashMap = concurrentHashMap2;
                        cVarValueOf = cVar;
                        dateZ3 = date;
                        dateZ4 = date2;
                        break;
                    case "abnormal_mechanism":
                        strN11 = y3Var.n6();
                        numRc = num;
                        concurrentHashMap = concurrentHashMap2;
                        cVarValueOf = cVar;
                        dateZ3 = date;
                        dateZ4 = date2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        numRc = num;
                        cVarValueOf = cVar;
                        dateZ3 = date;
                        dateZ4 = date2;
                        break;
                }
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305794a = "sid";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305795b = "did";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305796c = "init";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305797d = "started";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f305798e = "status";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f305799f = "seq";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f305800g = "errors";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f305801h = "duration";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f305802i = "timestamp";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f305803j = "attrs";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f305804k = "release";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f305805l = "environment";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f305806m = "ip_address";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f305807n = "user_agent";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f305808o = "abnormal_mechanism";
    }

    public enum c {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public k9(@NotNull c cVar, @NotNull Date date, @Nullable Date date2, int i10, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Long l10, @Nullable Double d10, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull String str6, @Nullable String str7) {
        this.f305792o = new io.sentry.util.a();
        this.f305784g = cVar;
        this.f305778a = date;
        this.f305779b = date2;
        this.f305780c = new AtomicInteger(i10);
        this.f305781d = str;
        this.f305782e = str2;
        this.f305783f = bool;
        this.f305785h = l10;
        this.f305786i = d10;
        this.f305787j = str3;
        this.f305788k = str4;
        this.f305789l = str5;
        this.f305790m = str6;
        this.f305791n = str7;
    }

    private double a(@NotNull Date date) {
        return Math.abs(date.getTime() - this.f305778a.getTime()) / 1000.0d;
    }

    private long n(@NotNull Date date) {
        long time = date.getTime();
        if (time < 0) {
            time = Math.abs(time);
        }
        return time;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k9 clone() {
        return new k9(this.f305784g, this.f305778a, this.f305779b, this.f305780c.get(), this.f305781d, this.f305782e, this.f305783f, this.f305785h, this.f305786i, this.f305787j, this.f305788k, this.f305789l, this.f305790m, this.f305791n);
    }

    public void c() {
        d(p.d());
    }

    public void d(@Nullable Date date) {
        m1 m1VarA = this.f305792o.a();
        try {
            this.f305783f = null;
            if (this.f305784g == c.Ok) {
                this.f305784g = c.Exited;
            }
            if (date != null) {
                this.f305779b = date;
            } else {
                this.f305779b = p.d();
            }
            Date date2 = this.f305779b;
            if (date2 != null) {
                this.f305786i = Double.valueOf(a(date2));
                this.f305785h = Long.valueOf(n(this.f305779b));
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public int e() {
        return this.f305780c.get();
    }

    @Nullable
    public String f() {
        return this.f305791n;
    }

    @Nullable
    public String g() {
        return this.f305781d;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305793s;
    }

    @Nullable
    public Double h() {
        return this.f305786i;
    }

    @Nullable
    public String i() {
        return this.f305789l;
    }

    @Nullable
    public Boolean j() {
        return this.f305783f;
    }

    @Nullable
    public String k() {
        return this.f305787j;
    }

    @NotNull
    public String l() {
        return this.f305790m;
    }

    @Nullable
    public Long m() {
        return this.f305785h;
    }

    @Nullable
    public String o() {
        return this.f305782e;
    }

    @Nullable
    public Date p() {
        Date date = this.f305778a;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    @NotNull
    public c q() {
        return this.f305784g;
    }

    @Nullable
    public Date r() {
        Date date = this.f305779b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Nullable
    public String s() {
        return this.f305788k;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f305782e != null) {
            z3Var.f("sid").b(this.f305782e);
        }
        if (this.f305781d != null) {
            z3Var.f(b.f305795b).b(this.f305781d);
        }
        if (this.f305783f != null) {
            z3Var.f(b.f305796c).k(this.f305783f);
        }
        z3Var.f("started").j(iLogger, this.f305778a);
        z3Var.f("status").j(iLogger, this.f305784g.name().toLowerCase(Locale.ROOT));
        if (this.f305785h != null) {
            z3Var.f(b.f305799f).i(this.f305785h);
        }
        z3Var.f(b.f305800g).c(this.f305780c.intValue());
        if (this.f305786i != null) {
            z3Var.f("duration").i(this.f305786i);
        }
        if (this.f305779b != null) {
            z3Var.f("timestamp").j(iLogger, this.f305779b);
        }
        if (this.f305791n != null) {
            z3Var.f(b.f305808o).j(iLogger, this.f305791n);
        }
        z3Var.f(b.f305803j);
        z3Var.m1();
        z3Var.f("release").j(iLogger, this.f305790m);
        if (this.f305789l != null) {
            z3Var.f("environment").j(iLogger, this.f305789l);
        }
        if (this.f305787j != null) {
            z3Var.f("ip_address").j(iLogger, this.f305787j);
        }
        if (this.f305788k != null) {
            z3Var.f(b.f305807n).j(iLogger, this.f305788k);
        }
        z3Var.F1();
        Map<String, Object> map = this.f305793s;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f305793s.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305793s = map;
    }

    public boolean t() {
        return this.f305784g != c.Ok;
    }

    @lm.a.c
    public void u() {
        this.f305783f = Boolean.TRUE;
    }

    public boolean v(@Nullable c cVar, @Nullable String str, boolean z10) {
        return w(cVar, str, z10, null);
    }

    public boolean w(@Nullable c cVar, @Nullable String str, boolean z10, @Nullable String str2) {
        boolean z11;
        m1 m1VarA = this.f305792o.a();
        boolean z12 = true;
        if (cVar != null) {
            try {
                this.f305784g = cVar;
                z11 = true;
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } else {
            z11 = false;
        }
        if (str != null) {
            this.f305788k = str;
            z11 = true;
        }
        if (z10) {
            this.f305780c.addAndGet(1);
            z11 = true;
        }
        if (str2 != null) {
            this.f305791n = str2;
        } else {
            z12 = z11;
        }
        if (z12) {
            this.f305783f = null;
            Date dateD = p.d();
            this.f305779b = dateD;
            if (dateD != null) {
                this.f305785h = Long.valueOf(n(dateD));
            }
        }
        if (m1VarA != null) {
            m1VarA.close();
        }
        return z12;
    }

    public k9(@Nullable String str, @Nullable io.sentry.protocol.g0 g0Var, @Nullable String str2, @NotNull String str3) {
        this(c.Ok, p.d(), p.d(), 0, str, e9.a(), Boolean.TRUE, null, null, g0Var != null ? g0Var.m() : null, null, str2, str3, null);
    }
}
